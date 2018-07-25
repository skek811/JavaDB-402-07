package day5;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[6];
		int min = 1, max = 45;
		arr = createRandomArray(min, max, 6);
		if(arr==null){
			System.out.println("번호 생성 실패");
		}
		else{
			output(arr);
		}
	}
	public static boolean isDuplicate(int arr[], int num, int cnt){
		for(int i=0; i<cnt; i++){
			if(arr[i]==num){
				return true;
			}
		}
		return false;
	}
	 // 저장하는 코드와 찾는 코드를 따로두는 이유는
	 // 배열은 0~5까지인데 num이 3인상태면 3을 찾고서 브레이크해버리기때문에
	 // 뒤에 배열 4와 5에는 아무것도 저장되어 있지 않는 상태가 된다.
	 // 그러므로 저장코드와 검색코드는 따로두었다.
	
	/* 최소값과 최댓값을 입력받아 최소값과 최대값 사이에 있는
	 * 램덤한 수를 생성하는 메소드
	 * 1. 메소드명 : randomInt
	 * 2. 매개변수 : 최소값, 최대값
	 * 3. 리턴타입 : 랜덤한 정수 -> int
	 */
	public static int randomInt(int min, int max){
		if(min > max){
			int tmp = min;
			min = max;
			max = tmp;
		}// 만약 min가 max보다 커졌을때를 대비한 안전장치. min과 max를 바꾼다.
		return (int)(Math.random()*(max-min+1)+min);
	}
	public static int[] createRandomArray(int min, int max, int size){
		if(min > max){
/*			int tmp = min;
			min = max;
			max = tmp;*/
			return null;
		}
		if(max-min+1 < size){
			return null;
		}
		int arr[] = new int[size];
		
		int cnt = 0;
		for( ; cnt< arr.length; ){
			int tmp = randomInt(min, max);
			if(!isDuplicate(arr, tmp, cnt)){
				arr[cnt] = tmp;
				cnt++;
			}
		}
		return arr;
	}
	public static void output(int arr[]){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
}
