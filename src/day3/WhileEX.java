package day3;

import java.util.Scanner;

public class WhileEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;//초기화
		while(i<=5){//조건식
			System.out.println("hello world");//실행문
			i++;//증감연산
		}
		for(i=1;i<=5;i++){//while문을 for문으로 바꿈
						  //초기화와 증감연산을 조건식 앞뒤로 ;을 붙여서 넣어주면된다
			  			  //반대로 생각하면 for문을 while문으로 바꿀수도 있다.
			System.out.println("hello world");
		}
		//표준 입력받는 방법
		/*Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("num = "+num);
		double num2 = scan.nextDouble();
		System.out.println("num2 = "+num2);
		char ch = scan.next().charAt(0);//문자일경우는 charAt이 된다.
		System.out.println("ch = "+ch);
		scan.close();//스캐너 종료하는 문장.
		*/
		Scanner scan = new Scanner(System.in);
		char mode = 'a';
		while(! (mode == 'q' || mode == 'Q')){
			System.out.println("프로그램을 종료하려면 q 또는 Q를 눌러주세요.");
			mode = scan.next().charAt(0);
		}
		System.out.println("프로그램을 종료합니다.");
		scan.close();
		//보통 while문은 증감연산이 안들어갈때 많이쓴다.
	}

}
