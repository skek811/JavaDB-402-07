package day2;

public class SwitchEX1 {

	public static void main(String[] args) {
		
		
		/*swith문일때 ()안에 조건식을 줄수있지만 보통 변수를 많이 준다.
		 * 즉 switch(변수 or 조건식){
		 * case 값1: -> if(변수 == 값1)
		 *    실행문1:;
		 *    break; -> 변수값이 값1일때 실행문 1만 실행한다.
		 *           -> break가 없으면 변수값이 값1일때 실행문1과 실행문2가 같이 실행된다.
		 * case 값2: -> else if(변수 == 값2)
		 *    실행문2:;
		 *    break;
		 * default: -> else
		 *    실행문3;
		 * }
		 * 이 형태를 가진다.
		 * 예제로 num의 값이 0이면 콘솔에 0입니다. 라고 출력
		 * num의 값이 1이면 콘솔에 1입니다. 라고 출력
		 * num의 값이 0과 1이 아니면 콘솔에 0과 1이 아닙니다. 라고 출력하는 switch문을 작성해보자
		 */
		int num = 2;
		switch(num){
		case 0:// if(num == 0)
			System.out.println("0입니다.");
			break;
		case 1:// else if(num == 1)
			System.out.println("1입니다.");
			break;
		default://else
			System.out.println(num+"는 0과 1이 아닙니다.");
		}
		
		
		
		

	}

}
