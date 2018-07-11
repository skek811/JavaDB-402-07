package day1;

public class IfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 조건식 : 결과가 참 또는 거짓이 나오는 식
		 * 조건문
		 * if(조건식1){
		 * 	     실행문1; // 조건식1이 참 일경우 실행됨
		 * }
		 * else if(조건식2){
		 *      실행문2;// 조건식1이 거짓이고, 조건식2가 참 일경우 실행됨
		 * }
		 * else{
		 *      실행문3; //조건식1과 조건식2가 거짓일 때 실행됨
		 * }  
		 * if와 else if의 순서가 중요함.   
		 * else 는 이미 조건식 1과 2를 오면서 제외되는 것들을 말하기에 조건식이 필요하지 않다.
		 */
		int num = 0;
	
		if(num == 0){
			System.out.println("0입니다.");
			//만약 num가 0이면. 콘솔에 0입니다.를 출력하세요.
		}else if(num % 2 == 0){
			System.out.println(num+"는 짝수입니다.");
			//만약 num가 0이 아니고, 
			//num을 2로 나누었을때 0과 같다면,
			//콘솔에 짝수입니다.를 출력하세요.
		}else{
			System.out.println(num+"는 홀수입니다.");
			//else에는 조건식이 들어가지 않는다.
			//만약 num이 0이 아니고,
			//num을 2로 나누었을때 0과 같지 않다면
			//콘솔에 홀수입니다. 를 출력하세요.
		}
	}

}
