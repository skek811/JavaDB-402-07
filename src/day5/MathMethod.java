package day5;

import java.util.Scanner;

public class MathMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i;
		int num1, num2;
		int gcd=1;
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		// TODO Auto-generated method stub
		// �ִ������� ���ϴ� �ڵ带 �ۼ��ϼ���.
		/* �ִ� ������� �μ��� ������� ���� ū �����
		 * ��1�� ��2�� ���� ���ڷ� ���������� �������� 0�̶�� �׼��� �����
		 * */
	/*	int num1, num2;
		int gcd=1;
		int i;
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		for(i=1; i<=num1; i++){
			if(num1%i==0 && num2%i==0){
				gcd=i;
			}
		}
		System.out.println(gcd);*/
		gcd = GCD(num1, num2);
		System.out.println(gcd);
		int lcm = LCM2(num1, num2);
		System.out.println(lcm);
	}//�Ű������� num1, num2 ����� gcd
	public static int GCD(int num1, int num2){

		int gcd=1;
		int i;
		for(i=1; i<=num1; i++){
			if(num1%i==0 && num2%i==0){
				gcd=i;
			}
		}
		return gcd;
	}
	public static int LCM(int num1, int num2){
		int i;
		for(i=num1;i<=num1*num2;i+=num1){
			if(i%num2==0){
				return i;
			}
		}
		
		
		return 1;
	}
	public static int LCM2(int num1, int num2){
		return num1*num2/GCD(num1,num2);
	}
	

}
