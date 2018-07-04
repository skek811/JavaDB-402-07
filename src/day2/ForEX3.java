package day2;

public class ForEX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 정수의 약수를 구하는 코드를 작성하세요
		 * 정수를 1부터 자기 자신까지 나누어서 나머지가 0이되면 그 수는 정수의 약수이다.
		 */
		
		int num1 = 100;
		int i = 1;
		// = int num = 10, i = 1;
		for(i = 1; i <=num1; i++){
			if(num1%i==0){
				System.out.println(i +"는 "+num1+"의 약수입니다.");
			}
			
		}
	
		/* 두 수의 최대 공약수를 구하는 코드를 작성하세요.
		 * 최대 공약수 : 두 수의 공약수 중 가장 큰 수
		 * 공약수 : 두수의 약수중 공통인 약수
		 * 약수 : 나누어 떨어지는 수로 4의 약수는 1,2,4가 있다.
		 * 8과 12의 공약수는 1,2,4 최대공약수는 4
		 */
		int num2 = 50;
		for(i = 1; i <=num2; i++){
			if(num2%i==0){
				System.out.println(i+"는"+num2+"의 약수입니다.");
			}
			
		}
		System.out.println();
		System.out.print(num1+"과 "+num2+"의 최대공약수 : ");
		int gcd = 1; //최대 공약수로 지정되야할 변수를 하나 선언한다.
		for(i=1; i<=num2; i++){
			if(num1%i==0 && num2%i==0){
			gcd = i; //num1을 i로 나눈값이 0이고 num2를 i로 나눈값이 0일때 i를 최대공약수로 출력한다.
			}
		}
		System.out.println(gcd);
		
	}

}
