package day5;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = null;
		int arr2[] = null;
		int min = 1, max = 45;
		int size = 6;
		arr = createRandomArray(min, max, size);
		if(arr==null){
			System.out.println("번호 생성 실패");
		}
		else{
			sort(arr,size);
			output(arr);
		}
		arr2 = createRandomArray(min, max, size+1);
		if(arr2==null){
			System.out.println("당첨번호 생성 실패");
		}
		else{
			sort(arr2,size);
			output(arr2);
		}
		System.out.println(countCheck(arr,arr2));
		printRank(arr,arr2);
	}
	public static boolean isDuplicate(int arr[], int num, int cnt){
		if(cnt>arr.length){
			cnt = arr.length;
		}//예외처리. 배열수보다 cnt가 클경우 cnt를 배열수만큼으로 강제한다.
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
	}//Math.random 은 0~1사이에서 지정된다.
	public static int[] createRandomArray(int min, int max, int size){
		if(min > max){
/*			int tmp = min;
			min = max;
			max = tmp;*/
			return null;
		}//이방법은 잘못입력시에 작동이 안하게 된다. 주석처리된부분을 살리고 null부분을 주석처리하면
		 //잘못 입력되어도 동작되게 할수있다.
		if(max-min+1 < size){
			return null;
		}//배열의 갯수가 생성된 랜덤한 숫자의 갯수보다 많을경우 동작하지 못하게 막는 코드.
		if(size<0){
			return null;
		}//배열이 0까지는 되지만 음수는 되지않기때문에 음수일경우 동작을 막는 코드.
		int arr[] = new int[size];
		
		int cnt = 0;
		for( ; cnt< size; ){// arr.length = size
			int tmp = randomInt(min, max);
			if(!isDuplicate(arr, tmp, cnt)){
				arr[cnt] = tmp;
				cnt++;
			}
		}
		return arr;//참조변수
	}
	public static void output(int arr[]){
		/*for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+ " ");
		}*/ //일반 for문
		for(int tmp:arr){
			//System.out.print(tmp + " ");
			System.out.printf("%2d ", tmp);//서식문자를 이용한 출력
		}// 향상된for문 -> 읽기는 되지만 쓰기는 안된다.
		System.out.println();
	}
	/* 두 배열이 주어졌을때 같은 번호가 몇개 있는지 반환하는 메소드를 만드세요
	 * 메소드명 : countCheck
	 * 매개변수 : int arr[], int arr2[]
	 * 리턴타입 : int
	 * arr와 arr2가 같으면 cnt를 증가시킨다. 
	 */
	public static int countCheck(int arr[], int arr2[]){
		int i=0, size=0, cnt=0;
		if(arr.length>arr2.length){
			size=arr2.length;
		}
		else{
			size=arr.length;
		}
		/*for(i=0; i<size;i++){
			for(j=0; j<size; j++){
				if(arr[i]==arr[j]){
					cnt++;
				}
			}
		}*/
		for(i=0; i<size; i++){
			if(isDuplicate(arr,arr2[i],size)){
				cnt++;
			}
		}
		return cnt;
	}
	/* 두 배열을 비교하여 맞은 갯수에 따라 등수를 출력하는 메소드
	 * 1등 : 6, 2등 : 5+보너스번호, 3등 : 5, 4등 : 4, 5등: 3, 나머지 꽝
	 */
	public static void printRank(int arr[], int arr2[]){
		int cnt= countCheck(arr, arr2);
		boolean isBonus = false;
		if(arr.length > arr2.length){
			isBonus=isDuplicate(arr2, arr[arr.length-1], arr2.length);
		}
		else{
			isBonus=isDuplicate(arr, arr2[arr2.length-1], arr.length);
		}
		if(cnt==6){
			System.out.println("1등");
		}
		else if(cnt==5){
			if(isBonus){
				System.out.println("2등");
			}
			else{
				System.out.println("3등");
			}
		}
		else if(cnt==4){
			System.out.println("4등");
		}
		else if(cnt==3){
			System.out.println("5등");
		}
		else{
			System.out.println("꽝");
		}
	}
	public static void sort(int arr[], int size){
		// 버블정렬 : 첫번재 숫자부터 옆의 숫자와 비교, 큰숫자를 뒤로 넘기면서 정렬
		//       : j가 반복될때마다 큰 숫자가 뒤로 맨끝으로간다.
		//       : i를 반복하여 정렬이 끝난숫자 이외에 남은 숫자중에서 다시 정렬한다.
		for(int i=0; i<size-1; i++){
			for(int j=0; j<size-1-i; j++){//반복횟수를 줄이기위해 j의 반복횟수에 -i를 추가
				if(arr[j]>arr[j+1]){
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}//앞에 있는 수가 뒤의 수보다 크면 서로 교환
			}
		}
	}
}
