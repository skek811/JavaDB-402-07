package day3;

public class LoopEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 무한루프가 생성되는 경우
		// 1. 가장 기본적인 무한 루프 만들기
/*		for(;;){ //가장 기본적으론 초기화, 조건, 증감연산을 주지 않는방법이 있다.
			System.out.println("Hello world");
		}
*/		// 2. 잘못된 초기화로 인한 반 무한 루프
		/*int i = 0;
		for(i=-1000000000;i<=10;i++){
			System.out.println("Hello world");
		}*/ // 이경우는 정확하겐 무한루프는 아니다.
		// 3. 잘못된 조건식으로 인한 반 무한 루프
		/*int i = 1;
		for(i=1;i>=1;i++){
			System.out.println("Hello world");
		}*/ //이경우도 엄밀히 말하면 무한루프는 아니다. 
		    //정수의 표현범위가 있고 그범위를 넘어서는순간 -1이 되기때문이다.
		// 4. 잘못된 증감연산으로 인한 무한루프
		/*int i = 1;
		for(i=1;i<=10;){
			System.out.println("Hello world");
		}*/ // 이경우엔 증감연산이 없어서 i는 계속 1이되므로 무한루프에 빠진다.
		// 5. 잘못된 증감연산으로 인한 반 무한루프
		/*int i = 1;
		for(i=1;i<=10;i--){
			System.out.println("Hello world");
		}*/ //이경우도 정확한 무한루프는 아니다.
		
		//반복문이 실행이 한번도 안되는 경우
		// 1. 변수 초기화를 잘못한 경우
	
		/*for(int i=11;i<=10;i++){
			System.out.println("hello world");
		}*/ // 조건식이 10보다 작거나 같을경우인데 변수가 애초에 11로 선언되어버려서 실행되지 않는다.
		// 2. 변수 초기화를 하지 않은경우
		/*int i=0;
		for(i=1;i<=10;i++){
			System.out.println("hello world");
		}
		for (;i<=10;i++){
			System.out.println("hello world1");
		}*/ // 앞에서 사용한 변수가 초기화가 안되있으므로 일반 헬로월드는 10번 출력하지만
		    // 그밑으로는 i가 11이기때문에 헬로월드1 은 출력되지 않는다.
		// 3. 조건식을 잘못 설정한 경우
		for(int i =1;i>=10;i++){
			System.out.println("hello world");
		} //i는 1로 선언이 되있는데 조건식에서 i가 10보다 클경우라 설정되어있다.
		//증감연산자로 인해서 한번도 실행되지 않는경우는 없다.

	}

}
