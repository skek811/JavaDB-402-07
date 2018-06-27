package day1;

public class IfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 조건문
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
		 */
		int num = 0;
		if(num == 0){
			System.out.println("0입니다.");
		}else if(num % 2 == 0){
			System.out.println(num+"는 짝수입니다.");
		}else{
			System.out.println(num+"는 홀수입니다.");
		}
	}

}
