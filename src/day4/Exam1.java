package day4;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{int num = 10;
		System.out.printf("num : %d\n",num);
		System.out.println("num : "+ num);
		/* printf에 쓰이는 서식문자
		 * %d : 정수형
		 * %f, %lf : 실수형
		 * %c : 문자형
		 * %s : 문자열
		 */
		}//조건식으로 정수형 변수 num가 홀수, 짝수를 구분하여 출력하는 코드를 작성해보자.
		{int num =4;
		if(num%2==0){
			System.out.println(num+"은 짝수입니다.");
		}else{
			System.out.println(num+"은 홀수입니다.");
		}
		}//switch case문에서의 값은 정수상수와 문자상수만 올수있다.
		int month =1; //자료형을 char로 주면 month = '1';이 된다
		switch(month){
		case 1:       //그러면 여기서도 case'1'이여야 한다.
		case 3: case 5: case 7: case 8: case 10: case 12:
		//이것을 if문으로 바꿔보면 
			//if(month ==1 || month ==3 || month ==5 || .....||month ==12)
			System.out.println("마지막날 : 31일");
			break;
		case 2:
			System.out.println("마지막날 : 28일");
			break;
		default:
			System.out.println("마지막날 : 30일");
		}
		/* 초기화는 반복문이 실행될 때 처음 한번만 실행
		 * 조건식이 참이면 실행문, 증감연산, 조건식 비교순으로 반복.
		 * 조건식이 거짓이면 반복문 종료.
		 */
		//1~10까지 더한값을 구하는 반복문을 작성해보자.
		
		int sum=0;
		for(int i=1; i<=10; i++ ){
			sum+=i;
		}
		System.out.println(sum);
		//정수 num가 소수인지 아닌지 판별하는 코드를 작성하세요.
		//방법1
		int num = 8;
		int cnt = 0;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				cnt++;
			}
		}
		if(cnt==2){
			System.out.println(num+"은 소수입니다.");
		}
		else{
			System.out.println(num+"은 합성수입니다.");
		}//방법2
		int div=0; //num은 방법 1에서 선언해서 별도로 선언안하고 끌어와서 쓴다.
		for(int i=num-1; i>0; i--){
			if(num%i==0){
				div=i;
				break;
			}
		}
		if(div==1){
			System.out.println(num+"은 소수");
		}
		else{
			System.out.println(num+"은 합성수");
		}//최대공약수를 구하는 코드 작성
		int num2 = 100;
		int num3 = 80;
		int i=0;
		for(i=num3; i>0; i--){
			if(num2%i==0 && num3%i==0)
				break;	
		}
		System.out.println(i+"은 최대공약수");
		
		/*int t=0;
		for(t=0; t<10; t+=2){
			
		}*/
		/*반복횟수:5, 종료후 i의 값 : 10
		 흔히 8로 착각할수 있는데 10이 되서 t<10이라는 조건식에 만족해야지 종료가 되기때문에
		 종료 후의 i는 10이 되야한다.*/
		//최소 공배수를 구하는 코드를 작성해 보세요.
		//4와 6의 최소공배수는 12
		int c=0;
		int num4 = 4;
		int num5 = 6;
		int lcm = 0;
		for(c=num4; c<=num4*num5; c+=num4){
			if(c%num4==0 && c%num5==0){
				lcm=c;
				break;
			}
			
		}
		System.out.println(lcm);
		
		Scanner scan = new Scanner(System.in);
		int num6 = scan.nextInt();
		for(int b=1; b<=num6; b++){
			for(int j=1; j<=num6; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int b=1; b<=num6; b++){
			for(int j=1; j<=b; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int b=1; b<=num6; b++){
			for(int j=1; j<=b-1; j++){
				System.out.print(" ");
			}
			for(int j=1; j<=num6+1-b; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int b=1; b<=num6; b++){
			for(int j=1; j<=num6; j++){
				if(j<=b-1){
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		for(int b=1; b<=num6; b++){
			for(int j=1; j<=(num6+1)/2; j++){
				if(j<=Math.abs((num6+1)/2-b)){
				System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		

	}

}
