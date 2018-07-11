package day3;

public class ArrayEX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 정수의 약수를 배열에 저장하는 코드를 작성하세요.
		 * 배열은 10개짜리로, 약수의 갯수가 10개 이상인 수들은 10개까지만 구한다.*/
		int num = 1000;
		int div[] = new int[10];
		int i= 1;
		int cnt=0;
		for( i=1;i<=num;i++){
			if(num%i==0){
				//System.out.print(i+" ");
				div[cnt]=i;
				cnt++;
				if(cnt==10)
					break;
			}
			
		}
		i=0;
		for(i=0; i<cnt; i++){
			System.out.print(div[i]+" ");
		}

	}

}
