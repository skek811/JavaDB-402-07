package day2;

public class ForEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1부터 10사이에 홀수만 출력하는 코드를 
		 * for문을 이용하여 작성해 보자.
		 */
		int num = 1;
		for(num =1; num <=10; num++){
			if (num%2 ==1){
			System.out.println(num);
			}
		}
		System.out.println("조건문 미사용");
		for(num=1; num<=10; num+=2){
			System.out.println(num);
		}
		System.out.println("예제2");
		/*1부터 10까지의 합을 구하는 예제를 작성하세요.
		 * 
		 */
		int sum = 0;
		for(num=1;num<11;num++){
			sum = sum + num;
		}
		System.out.println(sum);
		System.out.println("예제3");
		//구구단 7단을 출력하는 코드를 작성하세요
		int num3 = 1;
		for(num3=1;num3<10;num3++){
			System.out.println(7 * num3);
		}
		
	}

}
