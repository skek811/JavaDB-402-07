package day2;

public class SwitchEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 문자 ch가 a 또는 A이면 A입니다. 라고 콘솔에 출력
		 * 문자 ch가 b 또는 B이면 B입니다. 라고 콘솔에 출력
		 * 문자 ch가 a,b,A,B가 아니면 A와 B가 아닙니다. 라고 콘솔에 출력 
		 */
		char ch = 'A';
		switch(ch){
		case 'a': 
		case 'A':
			System.out.println("A입니다.");
		break;
		case 'b': 
		case 'B':
			System.out.println("B입니다.");
		break;
		default:
			System.out.println("A와 B가 아닙니다");
		}

	}

}
