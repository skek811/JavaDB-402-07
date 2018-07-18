package day4;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		for(int i=0; i<5; i++){
			arr[i] = i;//0~4까지 배열i에 저장한다.
		}
		/* 향상된 for문의 제약점
		 * 배열의 모든 데이터를 가져올때 사용
		 * 배열의 값을 수정하지 않을때 사용
		 * 모든 배열에 한번씩 접근이 필요할 때
		 */
		for(int tmp:arr){
			System.out.println(tmp);
		}// arr에 저장된 값을 tmp로 적용하여 전부 출력해라.
		
		//정수 num의 각 자리를 잘라서 역순으로 배열에 저장하는 코드를 작성해보자.
		//단 반복문을 사용해야 한다.
		System.out.println();
		
		
		arr = new int[11];
		int num=1234;
		int cnt = 0;
		while(num !=0){
			arr[cnt]=num%10;
			num/=10;
			cnt++;
		}
		int i=0;
		while(i<cnt){
			System.out.print(arr[i]+" ");
			i++;
		}
		System.out.println();
		
		
	}

}
