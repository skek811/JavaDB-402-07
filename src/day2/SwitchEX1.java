package day2;

public class SwitchEX1 {

	public static void main(String[] args) {
		
		
		/*swith���϶� ()�ȿ� ���ǽ��� �ټ������� ���� ������ ���� �ش�.
		 * �� switch(���� or ���ǽ�){
		 * case ��1: -> if(���� == ��1)
		 *    ���๮1:;
		 *    break; -> �������� ��1�϶� ���๮ 1�� �����Ѵ�.
		 *           -> break�� ������ �������� ��1�϶� ���๮1�� ���๮2�� ���� ����ȴ�.
		 * case ��2: -> else if(���� == ��2)
		 *    ���๮2:;
		 *    break;
		 * default: -> else
		 *    ���๮3;
		 * }
		 * �� ���¸� ������.
		 * ������ num�� ���� 0�̸� �ֿܼ� 0�Դϴ�. ��� ���
		 * num�� ���� 1�̸� �ֿܼ� 1�Դϴ�. ��� ���
		 * num�� ���� 0�� 1�� �ƴϸ� �ֿܼ� 0�� 1�� �ƴմϴ�. ��� ����ϴ� switch���� �ۼ��غ���
		 */
		int num = 2;
		switch(num){
		case 0:// if(num == 0)
			System.out.println("0�Դϴ�.");
			break;
		case 1:// else if(num == 1)
			System.out.println("1�Դϴ�.");
			break;
		default://else
			System.out.println(num+"�� 0�� 1�� �ƴմϴ�.");
		}
		
		
		
		

	}

}
