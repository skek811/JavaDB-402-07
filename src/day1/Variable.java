package day1;

public class Variable {
	public static void main(String[] args) {
		//변수 이름의 규칙
		//int 1num; // 처음에는 숫자가 올수 없음
		//int num%; // 특수문자는 $와 _만 가능
		//int int;  // 키워드 사용 불가
		//int num 1 // 공백 사용 불가
		int num;
		//int num;  //동일한 변수는 선언 불가
		int Num;    // 대소문자를 구별하여 다른 변수로 취급
		
		//변수 이름의 관례
		int studentScore; 
		/*2단어 이상으로 변수명을 만들 경우 
		 * 두번째 단어부터 첫글자를 대문자로 한다 : 카멜표기법*/
		int a;//(x)
		/*변수는 변수명을 보고 해당하는 역할을 알수 있어야 한다.
		 * 안되는건 아니다*/
		num = 10;
		// 10 = num; (x)
		// 10 : 10 * 1 + 1 * 0 = 10
		System.out.println("num = 10 : "+num);
		num = 0x11;
		// 0x11 : 16 * 1 + 1 * 1 = 17
		System.out.println("num = 1x11 : "+num);
		num = 012;
		// 012 : 8 * 1 + 1 * 2 = 10
		System.out.println("num = 012 : "+num);
		//""의 경우 문자열을 ''의 경우는 문자를 추가할때 쓴다
		
		//실수 변수 확인 예제
		double num2 = 1.234;
		System.out.println("num2 = 1.234 : "+num2);
		num2 = 1.234e3;
		System.out.println("num2 = 1.234e3 : "+num2);
		//문자 변수 확인 예제
		char ch = 'A';
		System.out.println("ch = 'A' : " + ch);
		ch = '한';
		System.out.println("ch = '한' : " + ch);
		//boolean 변수 확인 예제
		boolean isTrue = false;
		System.out.println("isTrye = false : " + isTrue);
		isTrue = true;
		System.out.println("isTrye = true : " + isTrue);
		
	}

}


