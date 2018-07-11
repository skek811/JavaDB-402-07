package day3;

public class ForEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//중첩 for문
		for(int i=1;i<=5;i++){
			for(int j=1; j<=5; j++){
				System.out.print("*");
			}
			System.out.println();
		}// *****을 5줄 출력한다.
		System.out.println("-------내가한거--------");
		/* *
		 * **
		 * ***
		 * ****
		 * *****
		 * 위의 모양처럼 출력해보자.*/
		for(int i=1;i<=1;i++){
			for(int j=1;j<=5;j++){
				if(j==1){
					System.out.println("*");
				}else if(j==2){
					System.out.println("**");
				}else if(j==3){
					System.out.println("***");
				}else if(j==4){
					System.out.println("****");
				}else{
					System.out.println("*****");
				}
			}
			
		}
		System.out.println("----------풀이-----------");
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}//어차피 출력하는 *의 갯수는 i와 같으니 이런식으로 하는게 더 간단하다.
			System.out.println();
		}
		System.out.println("-----------------");
		/*
		 *      *
		 *     **
		 *    ***
		 *   ****
		 *  *****
		 * 위의 모양대로 출력해보자.*/
		for(int i=1;i<=1;i++){
			for(int j=1;j<=5;j++){
				if(j==1){
					System.out.println("    *");
				}else if(j==2){
					System.out.println("   **");
				}else if(j==3){
					System.out.println("  ***");
				}else if(j==4){
					System.out.println(" ****");
				}else{
					System.out.println("*****");
				}
			}
			
		}
		System.out.println("----------풀이-----------");
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5-i;j++){
			System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}//일반 방법
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5-i;j++){
				if(j<=5-i){
			    System.out.print(" ");
				}else{
				System.out.print("*");
				}
			}
			System.out.println();
		}//if문을 이용한 방법
		System.out.println("---------------------");
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			for(int j=1;j<=i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}// 방법 1 
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}// 방법 2
		System.out.println("---------------");
		for(int i=1;i<=5;i++){
			for(int j=0;j<=i-1;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=11-2*i;j++){//조건식이 저것보단 2*5+1-2*i 로 하는게 나중에 수정하기 좋다
				System.out.print("*");
			}
		    System.out.println();
		}//방법1
		for(int i=1; i<=5;i++){
			for(int j=1; j<=2*5-i;j++){//여기서도 조건식이 10-i도 되지만 나중에 수정을 생각하면 2*5-i가 좋다.
				if(j<= i-1)
					System.out.print(" ");
				else
					System.out.print("*");
			}	
			System.out.println();
		}
		//구구단 전체를 출력하는 코드를 작성하세요.
		for(int i=2;i<=9;i++){
			System.out.println(i+"단");
			for(int j=1;j<=9;j++){
				System.out.println(i+"X"+j+"="+(i*j));
			}
		}
		//2부터 100 이하의 모든 소수를 출력하세요.
		//소수란 자신과 1로만 나누어지는 수이다.
		//약수의 갯수가 2일경우 프린트한다.
		int cnt=0, num=3;
		System.out.println("2부터 100이하의 소수");
		for(num=2; num<=100; num++){
			cnt=0;	
			for(int i=1;i<=num;i++){
				if(num%i==0){
					cnt++;
				}
			}
			if(cnt == 2)
				System.out.print(num+" ");
		
		}
	}
}

