package day2;

public class ForEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 반복문은 규칙성을 가지고 동일한 동작을 수행하도록 하는 문법.
		 * for, while, do while 
		 * for 또는 while문을 주로 사용하고, do while문은 잘 사용하지 않는다.
		 * 반복문에서 중요한건 규칙성을 찾는게 중요하다.
		 */
		/*
		for(변수초기화; 조건식; 증감연산){
			실행문;
			
		}
		변수초기화 : 반복문의 반복횟수를 위해 사용하는 변수의 초기값을 설정. 
		              다른 변수도 초기화를 추가할수있다. 단, 초기화를 설정한 for문에서만 초기화가 된다.
		조건식 : 반복횟수를 결정하는 변수가 언제까지 반복할건지를 정해주는 조건식.
		증감연산 : 반복횟수를 결정하는 변수를 증감하거나 감소를 시킴.
		for문 동작순서
		변수 초기화 > 조건식(참일경우) > 실행문 > 증감연산
				> 조건식(참일경우) > 실행문 > 증감연산
				> 조건식(거짓일경우) > for문 종료
         */
		int i = 0;//반복문을 반복시키기 위한 변수
		for(i = 1; i < 6; i++ ){
			System.out.println(i);
		}
		
	}

}
