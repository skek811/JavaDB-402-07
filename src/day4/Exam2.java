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
			//arr[cnt++]로 바꾸고 밑의 증감연산자를 빼버려도 결과는 같다.
			//하지만 ++cnt로 전위형으로 바꾸면 계산후 동작으로 바뀌게 되기때문에 결과가 바뀐다.
			//그러면 0번지에 저장이 되지 않고 1번지부터 저장이되며
			// 밑에서 i<cnt이기 때문에 앞에 0이 추가가되고 맨 뒷자리가 잘리게된다.
		}
		int i=0;
		while(i<cnt){
			System.out.print(arr[i]+" ");
			i++;
			//여기도 마찬가지로 arr[i++]로 바꾸고 밑의 증감연산자를 빼도 된다.
			//또한 전위형으로 바뀌면 결과가 바뀐다.
		}
		System.out.println();
		
		
	}

}
