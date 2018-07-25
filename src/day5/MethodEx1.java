package day5;

import java.util.Scanner;

public class MethodEx1 {
	/* 메소드 : 특정 기능을 하도록 모아놓은 코드
	 * 메소드는 입력(매개변수)과 출력(리턴타입)이 필요하다.
	 * ex) System.out.println("hello world");
	 * 위의 경우엔 println이 메소드, "hello world" 가 입력, 출력은 없는상태.
	 * 그런데 상황에 따라서 입력과 출력이 필요 없을 수도 있다.
	 * 그리고 메소드는 하나당 하나의 기능을 한다.
	 * 기본형태
	 * 접근제한자(public) 출력(void) 메소드이름(매개변수들->String[] args)(main){
	 *    구현;
	 * }
	 * 쉽게 설명 하잔면
	 * 입력 : 외부에서 들어오는 정보
	 * 출력 : 외부에서 들어온 정보를 바탕으로 나온 결과물
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("num의 값을 지정해주세요.");
		int num = scan.nextInt();
		System.out.println("num2의 값을 지정해주세요.");
		int num2 = scan.nextInt();
		System.out.println("연산자를 지정해주세요.");
		char op = scan.next().charAt(0);
		// TODO Auto-generated method stub
		// 두수와 연산자가 주어졌을 때 산술연산을 하는 코드를 작성해보자.
		double res = calculate(num, num2, op);
		System.out.println(""+ num + op + num2 + "=" + res);
		// 앞에 ""가 없으면 op를 아스키코드에서 나오는 숫자로 변환해서 num과 num2를 같이 더해버린다.
		// 즉 계산처리를 해버린다. 그러므로 문자열로 표시하기위해 앞에 ""를 붙여 문자열임을 표시해준다.
		/* 메소드를 만들기 위해서
		 * num1, num2, op가 매개변수
		 * res가 리턴타입
		 * 클래스 내부에만 존재하면되기때문에 위에있든 밑에있든 상관없음
		 * 출력부분은 res가 직접적으로 들어가는게 아니라 res의 자료형이 들어간다.
		 * 매개변수의 경우에는 각 매개변수마다 자료형을 입력해주어야한다.
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
			System.out.println("잘못된 연산자를 입력하셧습니다.");
		}
		return 0.0;
	}

}
