package day1;

public class Variable {
	public static void main(String[] args) {
		//���� �̸��� ��Ģ
		//int 1num; // ó������ ���ڰ� �ü� ����
		//int num%; // Ư�����ڴ� $�� _�� ����
		//int int;  // Ű���� ��� �Ұ�
		//int num 1 // ���� ��� �Ұ�
		int num;
		//int num;  //������ ������ ���� �Ұ�
		int Num;    // ��ҹ��ڸ� �����Ͽ� �ٸ� ������ ���
		
		//���� �̸��� ����
		int studentScore; 
		/*2�ܾ� �̻����� �������� ���� ��� 
		 * �ι�° �ܾ���� ù���ڸ� �빮�ڷ� �Ѵ� : ī��ǥ���*/
		int a;//(x)
		/*������ �������� ���� �ش��ϴ� ������ �˼� �־�� �Ѵ�.
		 * �ȵǴ°� �ƴϴ�*/
		num = 10;
		// 10 = num; (x)
		// 10 : 10 * 1 + 1 * 0 = 10
		System.out.println("num = 10 : "+num);
		num = 0x11;
		// 0x11 : 16 * 1 + 1 * 1 = 17
		System.out.println("num = 1x11 : "+num);
		num = 012;
		// 012 : 8 * 1 + 1 * 2 = 10
		System.out.println("num = 012 : "+num);
		//""�� ��� ���ڿ��� ''�� ���� ���ڸ� �߰��Ҷ� ����
		
		//�Ǽ� ���� Ȯ�� ����
		double num2 = 1.234;
		System.out.println("num2 = 1.234 : "+num2);
		num2 = 1.234e3;
		System.out.println("num2 = 1.234e3 : "+num2);
		//���� ���� Ȯ�� ����
		char ch = 'A';
		System.out.println("ch = 'A' : " + ch);
		ch = '��';
		System.out.println("ch = '��' : " + ch);
		//boolean ���� Ȯ�� ����
		boolean isTrue = false;
		System.out.println("isTrye = false : " + isTrue);
		isTrue = true;
		System.out.println("isTrye = true : " + isTrue);
		
	}

}


