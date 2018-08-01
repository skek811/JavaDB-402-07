package day6;

import java.util.Scanner;

public class BaseBallGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 컴퓨터 vs 사용자
		 * 컴퓨터는 문제를 출제 : 랜덤으로 1~9사이의 중복되지 않는 숫자 3개를 선택
		 * 사용자 : 컴퓨터가 선택한 숫자 3개를 순서와 함께 맞춰야 한다.
		 * 만약
		 * 컴퓨터 : 1 3 5
		 * 사용자 : 1 2 3
		 * 컴퓨터 : 1S1B
		 * 사용자 : 2 4 8
		 * 컴퓨터 : 3O -> 맞는숫자가 하나도 없을경우
		 * 사용자 : 1 3 5
		 * 컴퓨터 : 3S
		 * 정답입니다.
		 * 프로그램을 종료하겠습니다.
		 * S : 해당 숫자가 있고, 해당 순서가 일치할 때
		 * B : 해당 숫자가 있고, 해당 순서가 일치하지 않을 때  
		 */
		int com[] = createRandomArray(1,9,3);
		int user[] = new int[3];
		int ball = 0;
		int strike = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("게임을 시작합니다.");
		while(strike!=3){
			System.out.print("숫자 3개를 입력하세요 : ");
			user[0]=scan.nextInt();
			user[1]=scan.nextInt();
			user[2]=scan.nextInt();
			
			strike = getStrike(com, user);
			ball = getBall(com, user);
			
			printResult(strike, ball);
		}
		scan.close();
		System.out.println("정답입니다.");
		System.out.println("프로그램을 종료합니다.");
	}
	public static int isDuplicate(int arr[], int num, int cnt){
		if(cnt>arr.length){
			cnt = arr.length;
		}
		for(int i=0; i<cnt; i++){
			if(arr[i]==num){
				return i;
			}
		}
		return -1;
	}
	public static int randomInt(int min, int max){
		if(min > max){
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max-min+1)+min);
	}
	public static int[] createRandomArray(int min, int max, int size){
		if(min > max){
			return null;
		}
		if(max-min+1 < size){
			return null;
		}
		if(size<0){
			return null;
		}
		int arr[] = new int[size];
		
		int cnt = 0;
		for( ; cnt< size; ){
			int tmp = randomInt(min, max);
			if(isDuplicate(arr, tmp, cnt) ==-1){
				arr[cnt] = tmp;
				cnt++;
			}
		}
		return arr;
	}
	public static void output(int arr[]){
		for(int tmp:arr){
			System.out.printf("%2d ", tmp);
		}
		System.out.println();
	}
	/* 스트라이크 갯수 확인 메소드
	 * 매소드명 : getStrike
	 * 리턴타입 : int
	 * 매개변수 : com[], user[]
	 */
	public static int getStrike(int com[], int user[]){
		int i=0, cnt=0;
		for(i=0; i<com.length; i++){
			if(isDuplicate(com,user[i], com.length)==i){
				cnt++;
			}
		}
		return cnt;
	}
	public static int getBall(int com[], int user[]){
		int cnt = 0;
		for(int i=0; i<com.length; i++){
			int tmp = isDuplicate(com, user[i], com.length);
			if(tmp != -1 && tmp != i){
				cnt++;
			}
		}
		return cnt;
	}
	public static void printResult(int strike, int ball){
		if(strike!=0){
			System.out.print(strike+"S");
		}
		if(ball!=0){
			System.out.print(ball+"B");
		}
		if(strike==0&&ball==0){
			System.out.print("3O");
		}
		System.out.println();
	}
}
