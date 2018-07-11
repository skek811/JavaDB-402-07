package day3;

public class BreakCOntinueEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("break문 예제");
		for(int j=1; j<=5;j++){		
			for(int i=1;i<=5;i++){
				System.out.println("j="+j+",i="+i);
				if(i ==4){
					break;
			}
		}
	}
	System.out.println("continue문 예제");	
	for(int j=1; j<=5;j++){		
		for(int i=1;i<=5;i++){
			if(i ==4){
				continue;
			}
			System.out.println("j="+j+",i="+i);
		}
	}
	System.out.println("이름있는 for문 break문 예제");
	TEST:
	for(int j=1; j<=5;j++){		
		for(int i=1;i<=5;i++){
			System.out.println("j="+j+",i="+i);
			if(i ==4){
				break TEST;//만약 for문에 이름이 있을때 그 이름을 break하면 그 이름의 for문을 나온다
				      	   //실행해보면 for문이 반복하지 않고 바로 종료되는것을 확인할수 있다.
			}
		}
	}
	//1부터 100까지 짝수의 합을 continue문을 이용하여 작성해보자.
		int num = 0;
		for(int i=1;i<=100;i++){
			if(i%2==1)
				continue;
			num = num +i;
		}
		System.out.println("1부터 100까지 짝수의 합"+num);
	}
}