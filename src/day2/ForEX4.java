package day2;

public class ForEX4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 1111;
		int i = 0;
		int cnt=0;
		for(i=num1; i<=num1*num2; i++){
			cnt++;
			if(i%num1==0 && i%num2==0){
				System.out.println("´Ü¼ø: "+i);
				break;
			}
			
		}
		System.out.println("´Ü¼ø ¹Ýº¹ È½¼ö : "+cnt);
		cnt=0;
		
		
		for(i=num1; i<=num1*num2; i+=num1){
			cnt++;
			if(i%num2==0){
				System.out.println("È¿À²: "+i);
				break;
			}
			
		}
		System.out.println("È¿À² ¹Ýº¹ È½¼ö : "+cnt);
		cnt=0;
		
		int tmpnum = num1;
		int div = num2;
		if(num2>num1){
			tmpnum = num2;
			div = num1;
		}
		for(i=tmpnum; i<=num1*num2; i+=tmpnum){
			cnt++;
			if(i%div==0){
				System.out.println("±ØÈ¿À²: "+i);
				break;
			}
			
		}
		System.out.println("±ØÈ¿À² ¹Ýº¹ È½¼ö : "+cnt);
		cnt=0;



	}

}
