package day2;

public class ForEX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ������ ����� ���ϴ� �ڵ带 �ۼ��ϼ���
		 * ������ 1���� �ڱ� �ڽű��� ����� �������� 0�̵Ǹ� �� ���� ������ ����̴�.
		 */
		
		int num1 = 100;
		int i = 1;
		// = int num = 10, i = 1;
		for(i = 1; i <=num1; i++){
			if(num1%i==0){
				System.out.println(i +"�� "+num1+"�� ����Դϴ�.");
			}
			
		}
	
		/* �� ���� �ִ� ������� ���ϴ� �ڵ带 �ۼ��ϼ���.
		 * �ִ� ����� : �� ���� ����� �� ���� ū ��
		 * ����� : �μ��� ����� ������ ���
		 * ��� : ������ �������� ���� 4�� ����� 1,2,4�� �ִ�.
		 * 8�� 12�� ������� 1,2,4 �ִ������� 4
		 */
		int num2 = 50;
		for(i = 1; i <=num2; i++){
			if(num2%i==0){
				System.out.println(i+"��"+num2+"�� ����Դϴ�.");
			}
			
		}
		System.out.println();
		System.out.print(num1+"�� "+num2+"�� �ִ����� : ");
		int gcd = 1; //�ִ� ������� �����Ǿ��� ������ �ϳ� �����Ѵ�.
		for(i=1; i<=num2; i++){
			if(num1%i==0 && num2%i==0){
			gcd = i; //num1�� i�� �������� 0�̰� num2�� i�� �������� 0�϶� i�� �ִ������� ����Ѵ�.
			}
		}
		System.out.println(gcd);
		
	}

}
