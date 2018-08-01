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
			sort(arr,size);
			output(arr);
		}
		arr2 = createRandomArray(min, max, size+1);
		if(arr2==null){
			System.out.println("��÷��ȣ ���� ����");
		}
		else{
			sort(arr2,size);
			output(arr2);
		}
		System.out.println(countCheck(arr,arr2));
		printRank(arr,arr2);
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
		for( ; cnt< size; ){// arr.length = size
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
			//System.out.print(tmp + " ");
			System.out.printf("%2d ", tmp);//���Ĺ��ڸ� �̿��� ���
		}// ����for�� -> �б�� ������ ����� �ȵȴ�.
		System.out.println();
	}
	/* �� �迭�� �־������� ���� ��ȣ�� � �ִ��� ��ȯ�ϴ� �޼ҵ带 ���弼��
	 * �޼ҵ�� : countCheck
	 * �Ű����� : int arr[], int arr2[]
	 * ����Ÿ�� : int
	 * arr�� arr2�� ������ cnt�� ������Ų��. 
	 */
	public static int countCheck(int arr[], int arr2[]){
		int i=0, size=0, cnt=0;
		if(arr.length>arr2.length){
			size=arr2.length;
		}
		else{
			size=arr.length;
		}
		/*for(i=0; i<size;i++){
			for(j=0; j<size; j++){
				if(arr[i]==arr[j]){
					cnt++;
				}
			}
		}*/
		for(i=0; i<size; i++){
			if(isDuplicate(arr,arr2[i],size)){
				cnt++;
			}
		}
		return cnt;
	}
	/* �� �迭�� ���Ͽ� ���� ������ ���� ����� ����ϴ� �޼ҵ�
	 * 1�� : 6, 2�� : 5+���ʽ���ȣ, 3�� : 5, 4�� : 4, 5��: 3, ������ ��
	 */
	public static void printRank(int arr[], int arr2[]){
		int cnt= countCheck(arr, arr2);
		boolean isBonus = false;
		if(arr.length > arr2.length){
			isBonus=isDuplicate(arr2, arr[arr.length-1], arr2.length);
		}
		else{
			isBonus=isDuplicate(arr, arr2[arr2.length-1], arr.length);
		}
		if(cnt==6){
			System.out.println("1��");
		}
		else if(cnt==5){
			if(isBonus){
				System.out.println("2��");
			}
			else{
				System.out.println("3��");
			}
		}
		else if(cnt==4){
			System.out.println("4��");
		}
		else if(cnt==3){
			System.out.println("5��");
		}
		else{
			System.out.println("��");
		}
	}
	public static void sort(int arr[], int size){
		// �������� : ù���� ���ں��� ���� ���ڿ� ��, ū���ڸ� �ڷ� �ѱ�鼭 ����
		//       : j�� �ݺ��ɶ����� ū ���ڰ� �ڷ� �ǳ����ΰ���.
		//       : i�� �ݺ��Ͽ� ������ �������� �̿ܿ� ���� �����߿��� �ٽ� �����Ѵ�.
		for(int i=0; i<size-1; i++){
			for(int j=0; j<size-1-i; j++){//�ݺ�Ƚ���� ���̱����� j�� �ݺ�Ƚ���� -i�� �߰�
				if(arr[j]>arr[j+1]){
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}//�տ� �ִ� ���� ���� ������ ũ�� ���� ��ȯ
			}
		}
	}
}
