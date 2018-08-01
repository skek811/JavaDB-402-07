package day5;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = null;
		int arr2[] = null;
		int min = 1, max = 45;
		int size = 6;
		arr = createRandomArray(min, max, size);
		if(arr==null){
			System.out.println("��ȣ ���� ����");
		}
		else{
			output(arr);
		}
		arr2 = createRandomArray(min, max, size+1);
		if(arr2==null){
			System.out.println("��ȣ ���� ����");
		}
		else{
			System.out.print("��÷��ȣ + ���ʽ���ȣ : ");
			output(arr2);
		}
	}
	public static boolean isDuplicate(int arr[], int num, int cnt){
		if(cnt>arr.length){
			cnt = arr.length;
		}//����ó��. �迭������ cnt�� Ŭ��� cnt�� �迭����ŭ���� �����Ѵ�.
		for(int i=0; i<cnt; i++){
			if(arr[i]==num){
				return true;
			}
		}
		return false;
	}
	 // �����ϴ� �ڵ�� ã�� �ڵ带 ���εδ� ������
	 // �迭�� 0~5�����ε� num�� 3�λ��¸� 3�� ã�� �극��ũ�ع����⶧����
	 // �ڿ� �迭 4�� 5���� �ƹ��͵� ����Ǿ� ���� �ʴ� ���°� �ȴ�.
	 // �׷��Ƿ� �����ڵ�� �˻��ڵ�� ���εξ���.
	
	/* �ּҰ��� �ִ��� �Է¹޾� �ּҰ��� �ִ밪 ���̿� �ִ�
	 * ������ ���� �����ϴ� �޼ҵ�
	 * 1. �޼ҵ�� : randomInt
	 * 2. �Ű����� : �ּҰ�, �ִ밪
	 * 3. ����Ÿ�� : ������ ���� -> int
	 */
	public static int randomInt(int min, int max){
		if(min > max){
			int tmp = min;
			min = max;
			max = tmp;
		}// ���� min�� max���� Ŀ�������� ����� ������ġ. min�� max�� �ٲ۴�.
		return (int)(Math.random()*(max-min+1)+min);
	}//Math.random �� 0~1���̿��� �����ȴ�.
	public static int[] createRandomArray(int min, int max, int size){
		if(min > max){
/*			int tmp = min;
			min = max;
			max = tmp;*/
			return null;
		}//�̹���� �߸��Է½ÿ� �۵��� ���ϰ� �ȴ�. �ּ�ó���Ⱥκ��� �츮�� null�κ��� �ּ�ó���ϸ�
		 //�߸� �ԷµǾ ���۵ǰ� �Ҽ��ִ�.
		if(max-min+1 < size){
			return null;
		}//�迭�� ������ ������ ������ ������ �������� ������� �������� ���ϰ� ���� �ڵ�.
		if(size<0){
			return null;
		}//�迭�� 0������ ������ ������ �����ʱ⶧���� �����ϰ�� ������ ���� �ڵ�.
		int arr[] = new int[size];
		
		int cnt = 0;
		for( ; cnt< arr.length; ){// arr.length = size
			int tmp = randomInt(min, max);
			if(!isDuplicate(arr, tmp, cnt)){
				arr[cnt] = tmp;
				cnt++;
			}
		}
		return arr;//��������
	}
	public static void output(int arr[]){
		/*for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+ " ");
		}*/ //�Ϲ� for��
		for(int tmp:arr){
			System.out.print(tmp + " ");
		}// ����for�� -> �б�� ������ ����� �ȵȴ�.
		System.out.println();
	}
}
