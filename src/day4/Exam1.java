package day4;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{int num = 10;
		System.out.printf("num : %d\n",num);
		System.out.println("num : "+ num);
		/* printf�� ���̴� ���Ĺ���
		 * %d : ������
		 * %f, %lf : �Ǽ���
		 * %c : ������
		 * %s : ���ڿ�
		 */
		}//���ǽ����� ������ ���� num�� Ȧ��, ¦���� �����Ͽ� ����ϴ� �ڵ带 �ۼ��غ���.
		{int num =4;
		if(num%2==0){
			System.out.println(num+"�� ¦���Դϴ�.");
		}else{
			System.out.println(num+"�� Ȧ���Դϴ�.");
		}
		}//switch case�������� ���� ��������� ���ڻ���� �ü��ִ�.
		int month =1; //�ڷ����� char�� �ָ� month = '1';�� �ȴ�
		switch(month){
		case 1:       //�׷��� ���⼭�� case'1'�̿��� �Ѵ�.
		case 3: case 5: case 7: case 8: case 10: case 12:
		//�̰��� if������ �ٲ㺸�� 
			//if(month ==1 || month ==3 || month ==5 || .....||month ==12)
			System.out.println("�������� : 31��");
			break;
		case 2:
			System.out.println("�������� : 28��");
			break;
		default:
			System.out.println("�������� : 30��");
		}
		/* �ʱ�ȭ�� �ݺ����� ����� �� ó�� �ѹ��� ����
		 * ���ǽ��� ���̸� ���๮, ��������, ���ǽ� �񱳼����� �ݺ�.
		 * ���ǽ��� �����̸� �ݺ��� ����.
		 */
		//1~10���� ���Ѱ��� ���ϴ� �ݺ����� �ۼ��غ���.
		
		int sum=0;
		for(int i=1; i<=10; i++ ){
			sum+=i;
		}
		System.out.println(sum);
		//���� num�� �Ҽ����� �ƴ��� �Ǻ��ϴ� �ڵ带 �ۼ��ϼ���.
		//���1
		int num = 8;
		int cnt = 0;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				cnt++;
			}
		}
		if(cnt==2){
			System.out.println(num+"�� �Ҽ��Դϴ�.");
		}
		else{
			System.out.println(num+"�� �ռ����Դϴ�.");
		}//���2
		int div=0; //num�� ��� 1���� �����ؼ� ������ ������ϰ� ����ͼ� ����.
		for(int i=num-1; i>0; i--){
			if(num%i==0){
				div=i;
				break;
			}
		}
		if(div==1){
			System.out.println(num+"�� �Ҽ�");
		}
		else{
			System.out.println(num+"�� �ռ���");
		}//�ִ������� ���ϴ� �ڵ� �ۼ�
		int num2 = 100;
		int num3 = 80;
		int i=0;
		for(i=num3; i>0; i--){
			if(num2%i==0 && num3%i==0)
				break;	
		}
		System.out.println(i+"�� �ִ�����");
		
		/*int t=0;
		for(t=0; t<10; t+=2){
			
		}*/
		/*�ݺ�Ƚ��:5, ������ i�� �� : 10
		 ���� 8�� �����Ҽ� �ִµ� 10�� �Ǽ� t<10�̶�� ���ǽĿ� �����ؾ��� ���ᰡ �Ǳ⶧����
		 ���� ���� i�� 10�� �Ǿ��Ѵ�.*/
		//�ּ� ������� ���ϴ� �ڵ带 �ۼ��� ������.
		//4�� 6�� �ּҰ������ 12
		int c=0;
		int num4 = 4;
		int num5 = 6;
		int lcm = 0;
		for(c=num4; c<=num4*num5; c+=num4){
			if(c%num4==0 && c%num5==0){
				lcm=c;
				break;
			}
			
		}
		System.out.println(lcm);
		
		Scanner scan = new Scanner(System.in);
		int num6 = scan.nextInt();
		for(int b=1; b<=num6; b++){
			for(int j=1; j<=num6; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int b=1; b<=num6; b++){
			for(int j=1; j<=b; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int b=1; b<=num6; b++){
			for(int j=1; j<=b-1; j++){
				System.out.print(" ");
			}
			for(int j=1; j<=num6+1-b; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int b=1; b<=num6; b++){
			for(int j=1; j<=num6; j++){
				if(j<=b-1){
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		for(int b=1; b<=num6; b++){
			for(int j=1; j<=(num6+1)/2; j++){
				if(j<=Math.abs((num6+1)/2-b)){
				System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		

	}

}
