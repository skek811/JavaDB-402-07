package day4;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		for(int i=0; i<5; i++){
			arr[i] = i;//0~4���� �迭i�� �����Ѵ�.
		}
		/* ���� for���� ������
		 * �迭�� ��� �����͸� �����ö� ���
		 * �迭�� ���� �������� ������ ���
		 * ��� �迭�� �ѹ��� ������ �ʿ��� ��
		 */
		for(int tmp:arr){
			System.out.println(tmp);
		}// arr�� ����� ���� tmp�� �����Ͽ� ���� ����ض�.
		
		//���� num�� �� �ڸ��� �߶� �������� �迭�� �����ϴ� �ڵ带 �ۼ��غ���.
		//�� �ݺ����� ����ؾ� �Ѵ�.
		System.out.println();
		
		
		arr = new int[11];
		int num=1234;
		int cnt = 0;
		while(num !=0){
			arr[cnt]=num%10;
			num/=10;
			cnt++;
			//arr[cnt++]�� �ٲٰ� ���� ���������ڸ� �������� ����� ����.
			//������ ++cnt�� ���������� �ٲٸ� ����� �������� �ٲ�� �Ǳ⶧���� ����� �ٲ��.
			//�׷��� 0������ ������ ���� �ʰ� 1�������� �����̵Ǹ�
			// �ؿ��� i<cnt�̱� ������ �տ� 0�� �߰����ǰ� �� ���ڸ��� �߸��Եȴ�.
		}
		int i=0;
		while(i<cnt){
			System.out.print(arr[i]+" ");
			i++;
			//���⵵ ���������� arr[i++]�� �ٲٰ� ���� ���������ڸ� ���� �ȴ�.
			//���� ���������� �ٲ�� ����� �ٲ��.
		}
		System.out.println();
		
		
	}

}
