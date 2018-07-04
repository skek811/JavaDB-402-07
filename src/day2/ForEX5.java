package day2;

public class ForEX5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 정수가 소수인지 아닌지 판별하는 코드를 작성하세요
		 * 소수는 약수가 1과 자기자신인 수가 소수
		 */
		//방법 1
		int num1 = 8, cnt=0, i = 0;
		for(i=1; i<=num1; i++){
			if(num1%i==0){
				cnt++;			
			}

		}
		if(cnt==2){
			System.out.println(num1+"는 소수");
		}else{
			System.out.println(num1+"는 합성수");
		}
		//방법2
		for(i=num1-1; i>=1; i--){
			if(num1%i==0){
				break;
			}
			
		}
		if(i==1){
			System.out.println(num1+"는 소수");
		}else{
			System.out.println(num1+"는 합성수");
		}

	}

}
