package day3;

import java.util.Scanner;

public class WhileEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;//�ʱ�ȭ
		while(i<=5){//���ǽ�
			System.out.println("hello world");//���๮
			i++;//��������
		}
		for(i=1;i<=5;i++){//while���� for������ �ٲ�
						  //�ʱ�ȭ�� ���������� ���ǽ� �յڷ� ;�� �ٿ��� �־��ָ�ȴ�
			  			  //�ݴ�� �����ϸ� for���� while������ �ٲܼ��� �ִ�.
			System.out.println("hello world");
		}
		//ǥ�� �Է¹޴� ���
		/*Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("num = "+num);
		double num2 = scan.nextDouble();
		System.out.println("num2 = "+num2);
		char ch = scan.next().charAt(0);//�����ϰ��� charAt�� �ȴ�.
		System.out.println("ch = "+ch);
		scan.close();//��ĳ�� �����ϴ� ����.
		*/
		Scanner scan = new Scanner(System.in);
		char mode = 'a';
		while(! (mode == 'q' || mode == 'Q')){
			System.out.println("���α׷��� �����Ϸ��� q �Ǵ� Q�� �����ּ���.");
			mode = scan.next().charAt(0);
		}
		System.out.println("���α׷��� �����մϴ�.");
		scan.close();
		//���� while���� ���������� �ȵ��� ���̾���.
	}

}
