package day3;

public class ArrayEX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ������ ����� �迭�� �����ϴ� �ڵ带 �ۼ��ϼ���.
		 * �迭�� 10��¥����, ����� ������ 10�� �̻��� ������ 10�������� ���Ѵ�.*/
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
