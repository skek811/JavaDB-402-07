package day2;

public class ForEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1���� 10���̿� Ȧ���� ����ϴ� �ڵ带 
		 * for���� �̿��Ͽ� �ۼ��� ����.
		 */
		int num = 1;
		for(num =1; num <=10; num++){
			if (num%2 ==1){
			System.out.println(num);
			}
		}
		System.out.println("���ǹ� �̻��");
		for(num=1; num<=10; num+=2){
			System.out.println(num);
		}
		System.out.println("����2");
		/*1���� 10������ ���� ���ϴ� ������ �ۼ��ϼ���.
		 * 
		 */
		int sum = 0;
		for(num=1;num<11;num++){
			sum = sum + num;
		}
		System.out.println(sum);
		System.out.println("����3");
		//������ 7���� ����ϴ� �ڵ带 �ۼ��ϼ���
		int num3 = 1;
		for(num3=1;num3<10;num3++){
			System.out.println(7 * num3);
		}
		
	}

}
