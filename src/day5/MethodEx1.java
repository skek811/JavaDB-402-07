package day5;

import java.util.Scanner;

public class MethodEx1 {
	/* �޼ҵ� : Ư�� ����� �ϵ��� ��Ƴ��� �ڵ�
	 * �޼ҵ�� �Է�(�Ű�����)�� ���(����Ÿ��)�� �ʿ��ϴ�.
	 * ex) System.out.println("hello world");
	 * ���� ��쿣 println�� �޼ҵ�, "hello world" �� �Է�, ����� ���»���.
	 * �׷��� ��Ȳ�� ���� �Է°� ����� �ʿ� ���� ���� �ִ�.
	 * �׸��� �޼ҵ�� �ϳ��� �ϳ��� ����� �Ѵ�.
	 * �⺻����
	 * ����������(public) ���(void) �޼ҵ��̸�(�Ű�������->String[] args)(main){
	 *    ����;
	 * }
	 * ���� ���� ���ܸ�
	 * �Է� : �ܺο��� ������ ����
	 * ��� : �ܺο��� ���� ������ �������� ���� �����
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("num�� ���� �������ּ���.");
		int num = scan.nextInt();
		System.out.println("num2�� ���� �������ּ���.");
		int num2 = scan.nextInt();
		System.out.println("�����ڸ� �������ּ���.");
		char op = scan.next().charAt(0);
		// TODO Auto-generated method stub
		// �μ��� �����ڰ� �־����� �� ��������� �ϴ� �ڵ带 �ۼ��غ���.
		double res = calculate(num, num2, op);
		System.out.println(""+ num + op + num2 + "=" + res);
		// �տ� ""�� ������ op�� �ƽ�Ű�ڵ忡�� ������ ���ڷ� ��ȯ�ؼ� num�� num2�� ���� ���ع�����.
		// �� ���ó���� �ع�����. �׷��Ƿ� ���ڿ��� ǥ���ϱ����� �տ� ""�� �ٿ� ���ڿ����� ǥ�����ش�.
		/* �޼ҵ带 ����� ���ؼ�
		 * num1, num2, op�� �Ű�����
		 * res�� ����Ÿ��
		 * Ŭ���� ���ο��� �����ϸ�Ǳ⶧���� �����ֵ� �ؿ��ֵ� �������
		 * ��ºκ��� res�� ���������� ���°� �ƴ϶� res�� �ڷ����� ����.
		 * �Ű������� ��쿡�� �� �Ű��������� �ڷ����� �Է����־���Ѵ�.
		 */
	}
	public static double calculate(int num, int num2, char op){
		double res = 0.0;
		if(op =='+'){
			res = num + num2;
		}
		else if(op =='-' ){
			res = num - num2;
		}
		else if(op =='*'){
			res = num * num2;
		}
		else if(op =='%'){
			res = num % num2;
		}
		else if(op == '/'){
			res = (double)num / num2;
		}
		else{
			System.out.println("�߸��� �����ڸ� �Է��ϼ˽��ϴ�.");
		}
		return 0.0;
	}

}
