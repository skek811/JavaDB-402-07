package day3;

import java.util.Scanner;

public class ArrayEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* �迭�� �ڷ����� ���� ������ �ϳ��� ���°�����,
		 * ������ ������ �����̾�� �Ѵ�.
		 * 1. �迭�� ���� �ݺ����� �̿��ϱ� ���ϴ�.
		 * 2. �迭�� ���� �������� ���ؼ��� �迭�� �ε����� �����ؾ��ϴµ�, �ε����� ���۹����� 0�����̴�.
		 * 3. �迪�� ������ �ε���(����)�� '�迭�� ũ��-1' �̴�.
		 */
		//�⺻�� �׳� �����¸� �������.
		int num[]=new int [5];//new��� Ű����� ���� 5���� ������ ���Ѵ�.
		                       //������ ���� ���ϸ� ���� �ٸ� ������ ����������
							   //�迭�� ����ϸ� ���ӵ� ������ �����ϰ� �ȴ�.
							   //�� ���� Ű���带 �ؼ��غ��� new int�� ���� 5���� ������ ���� num���� �ִ�����.
		System.out.println("�迭 �⺻ ����");
		for(int i=0; i<num.length; i++){
			num[i]=i+1;
		}
		for(int i=0; i<num.length; i++){
			System.out.println("num["+i+"] :" + num[i]);
		}
		int []num1,num3;//int�� []�� �迭 �����̴�.
		//int[]�� �������� �ȴ�.
		int num2[],num4;//int�� num2�� []���� �迭�����̰� �� �ڿ� num4�� �Ϲ� ������ �ȴ�.
		//int�� �������� �Ǿ� num2�� �迭, num4�� �Ϲ� ����.
		num1 = new int[3];//������ �ٷ� �Ҵ����� �ʾƵ� ��.
		/* num1 : �迭
		 * num2 : �迭
		 * num3 : �迭
		 * num4 : ����
		 * */
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		if(size >= 0)
			num1 = new int[size];
		scan.close();
		int num5[] = {1,2,3,4,5};//�̷������� �ʱ�ȭ �Ҽ��ִ�.
		System.out.println("�ʱ�ȭ ����");
		for(int i=0; i<num5.length;i++){
			System.out.println("num["+i+"] : "+num5[i]);
		}
		int num6[];//num6 = {1,2,3,4,5}; -> �ʱ�ȭ�� �迭�� �����Ҷ����� ����
	}

}
