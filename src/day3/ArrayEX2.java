package day3;

import java.util.Scanner;

public class ArrayEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* �迭�� �̿��Ͽ� �л� 5���� ������ Ű���带 ���� �Է¹ް� 
		 * ���� ������ ����ϴ� �ڵ带 �ۼ��Ͽ� ����.*/
		int score[]=new int[5];
		Scanner scan = new Scanner(System.in);
		for(int i=0; i< score.length; i++){
			System.out.print("�л�"+(i+1)+" �� ������ �Է��ϼ��� : ");
			score[i] = scan.nextInt();
		}
		for(int i=0; i<score.length; i++){
			System.out.println("�л�"+(i+1)+" �� ���� : "+score[i]);
		}
		/* �л����� ����� ���ϴ� �ڵ带 �ۼ��ϼ���.*/
		double all = 0.0;
		for(int i=0; i<score.length; i++){
			all+=score[i];
		}
		System.out.println("�������� "+all);
		System.out.println("����� "+all/score.length);

	}

}
