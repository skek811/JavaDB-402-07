package day3;

import java.util.Scanner;

public class ArrayEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 배열을 이용하여 학생 5명의 성적을 키보드를 통해 입력받고 
		 * 받은 점수를 출력하는 코드를 작성하여 보자.*/
		int score[]=new int[5];
		Scanner scan = new Scanner(System.in);
		for(int i=0; i< score.length; i++){
			System.out.print("학생"+(i+1)+" 의 점수를 입력하세요 : ");
			score[i] = scan.nextInt();
		}
		for(int i=0; i<score.length; i++){
			System.out.println("학생"+(i+1)+" 의 점수 : "+score[i]);
		}
		/* 학생들의 평균을 구하는 코드를 작성하세요.*/
		double all = 0.0;
		for(int i=0; i<score.length; i++){
			all+=score[i];
		}
		System.out.println("총점수는 "+all);
		System.out.println("평균은 "+all/score.length);

	}

}
