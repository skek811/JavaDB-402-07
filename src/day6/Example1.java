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
	}  /* �޼ҵ� �����ε� : ������ �̸��� �޼ҵ尡 ���� �� �ִ� ��Ȳ
	    * 1. �Ű������� ������ �ٸ� ���
	    * 2. �Ű������� ������ ������ �ڷ����� �ٸ� ���
	    * �޼ҵ� �������̵����� �߿��Ѱ� �Ű������̴�.
	    * ����Ÿ���� �ƹ��� ������ ����.
	    * */
}
