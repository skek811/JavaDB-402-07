package day6;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10, num2 = 20;
		int arr[] = new int[3];
		System.out.println("num1 : "+num1+ ", num2 : "+num2);
		swap(num1, num2);
		System.out.println("num1 : "+num1+ ", num2 : "+num2);
		
		for(int tmp:arr){
			System.out.print(tmp + " ");
		}
		System.out.println();
		swap(arr);
		for(int tmp:arr){
			System.out.print(tmp + " ");
		}
	}
	public static void swap(int num1, int num2){
		int tmp = num1;
		num1 = num2;
		num2 = tmp;
	}
	public static void swap(int arr[]){
		for(int i=0; i<arr.length; i++){
			arr[i] = i;
		}
	}  /* 메소드 오버로딩 : 동일한 이름의 메소드가 여러 개 있는 상황
	    * 1. 매개변수의 갯수가 다를 경우
	    * 2. 매개변수의 갯수가 같지만 자료형이 다를 경우
	    * 메소드 오버라이딩에서 중요한건 매개변수이다.
	    * 리턴타입은 아무런 영향이 없다.
	    * */
}
