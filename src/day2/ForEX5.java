package day2;

public class ForEX5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ������ �Ҽ����� �ƴ��� �Ǻ��ϴ� �ڵ带 �ۼ��ϼ���
		 * �Ҽ��� ����� 1�� �ڱ��ڽ��� ���� �Ҽ�
		 */
		//��� 1
		int num1 = 8, cnt=0, i = 0;
		for(i=1; i<=num1; i++){
			if(num1%i==0){
				cnt++;			
			}

		}
		if(cnt==2){
			System.out.println(num1+"�� �Ҽ�");
		}else{
			System.out.println(num1+"�� �ռ���");
		}
		//���2
		for(i=num1-1; i>=1; i--){
			if(num1%i==0){
				break;
			}
			
		}
		if(i==1){
			System.out.println(num1+"�� �Ҽ�");
		}else{
			System.out.println(num1+"�� �ռ���");
		}

	}

}
