package day3;

public class ForEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ø for��
		for(int i=1;i<=5;i++){
			for(int j=1; j<=5; j++){
				System.out.print("*");
			}
			System.out.println();
		}// *****�� 5�� ����Ѵ�.
		System.out.println("-------�����Ѱ�--------");
		/* *
		 * **
		 * ***
		 * ****
		 * *****
		 * ���� ���ó�� ����غ���.*/
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
		System.out.println("----------Ǯ��-----------");
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}//������ ����ϴ� *�� ������ i�� ������ �̷������� �ϴ°� �� �����ϴ�.
			System.out.println();
		}
		System.out.println("-----------------");
		/*
		 *      *
		 *     **
		 *    ***
		 *   ****
		 *  *****
		 * ���� ����� ����غ���.*/
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
		System.out.println("----------Ǯ��-----------");
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5-i;j++){
			System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}//�Ϲ� ���
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5-i;j++){
				if(j<=5-i){
			    System.out.print(" ");
				}else{
				System.out.print("*");
				}
			}
			System.out.println();
		}//if���� �̿��� ���
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
		}// ��� 1 
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}// ��� 2
		System.out.println("---------------");
		for(int i=1;i<=5;i++){
			for(int j=0;j<=i-1;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=11-2*i;j++){//���ǽ��� ���ͺ��� 2*5+1-2*i �� �ϴ°� ���߿� �����ϱ� ����
				System.out.print("*");
			}
		    System.out.println();
		}//���1
		for(int i=1; i<=5;i++){
			for(int j=1; j<=2*5-i;j++){//���⼭�� ���ǽ��� 10-i�� ������ ���߿� ������ �����ϸ� 2*5-i�� ����.
				if(j<= i-1)
					System.out.print(" ");
				else
					System.out.print("*");
			}	
			System.out.println();
		}
		//������ ��ü�� ����ϴ� �ڵ带 �ۼ��ϼ���.
		for(int i=2;i<=9;i++){
			System.out.println(i+"��");
			for(int j=1;j<=9;j++){
				System.out.println(i+"X"+j+"="+(i*j));
			}
		}
		//2���� 100 ������ ��� �Ҽ��� ����ϼ���.
		//�Ҽ��� �ڽŰ� 1�θ� ���������� ���̴�.
		//����� ������ 2�ϰ�� ����Ʈ�Ѵ�.
		int cnt=0, num=3;
		System.out.println("2���� 100������ �Ҽ�");
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

