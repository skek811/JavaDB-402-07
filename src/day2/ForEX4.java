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
				System.out.println("�ܼ�: "+i);
				break;
			}
			
		}
		System.out.println("�ܼ� �ݺ� Ƚ�� : "+cnt);
		cnt=0;
		
		
		for(i=num1; i<=num1*num2; i+=num1){
			cnt++;
			if(i%num2==0){
				System.out.println("ȿ��: "+i);
				break;
			}
			
		}
		System.out.println("ȿ�� �ݺ� Ƚ�� : "+cnt);
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
				System.out.println("��ȿ��: "+i);
				break;
			}
			
		}
		System.out.println("��ȿ�� �ݺ� Ƚ�� : "+cnt);
		cnt=0;



	}

}
