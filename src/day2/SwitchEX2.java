package day2;

public class SwitchEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ���� ch�� a �Ǵ� A�̸� A�Դϴ�. ��� �ֿܼ� ���
		 * ���� ch�� b �Ǵ� B�̸� B�Դϴ�. ��� �ֿܼ� ���
		 * ���� ch�� a,b,A,B�� �ƴϸ� A�� B�� �ƴմϴ�. ��� �ֿܼ� ��� 
		 */
		char ch = 'A';
		switch(ch){
		case 'a': 
		case 'A':
			System.out.println("A�Դϴ�.");
		break;
		case 'b': 
		case 'B':
			System.out.println("B�Դϴ�.");
		break;
		default:
			System.out.println("A�� B�� �ƴմϴ�");
		}

	}

}
