package day3;

public class BreakCOntinueEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("break�� ����");
		for(int j=1; j<=5;j++){		
			for(int i=1;i<=5;i++){
				System.out.println("j="+j+",i="+i);
				if(i ==4){
					break;
			}
		}
	}
	System.out.println("continue�� ����");	
	for(int j=1; j<=5;j++){		
		for(int i=1;i<=5;i++){
			if(i ==4){
				continue;
			}
			System.out.println("j="+j+",i="+i);
		}
	}
	System.out.println("�̸��ִ� for�� break�� ����");
	TEST:
	for(int j=1; j<=5;j++){		
		for(int i=1;i<=5;i++){
			System.out.println("j="+j+",i="+i);
			if(i ==4){
				break TEST;//���� for���� �̸��� ������ �� �̸��� break�ϸ� �� �̸��� for���� ���´�
				      	   //�����غ��� for���� �ݺ����� �ʰ� �ٷ� ����Ǵ°��� Ȯ���Ҽ� �ִ�.
			}
		}
	}
	//1���� 100���� ¦���� ���� continue���� �̿��Ͽ� �ۼ��غ���.
		int num = 0;
		for(int i=1;i<=100;i++){
			if(i%2==1)
				continue;
			num = num +i;
		}
		System.out.println("1���� 100���� ¦���� ��"+num);
	}
}