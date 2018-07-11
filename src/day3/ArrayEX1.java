package day3;

import java.util.Scanner;

public class ArrayEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 배열은 자료형이 같은 변수를 하나로 묶는것으로,
		 * 동일한 목적의 변수이어야 한다.
		 * 1. 배열을 쓰면 반복문을 이용하기 편하다.
		 * 2. 배열의 값을 가져오기 위해서는 배열의 인덱스로 접근해야하는데, 인덱스의 시작번지는 0번지이다.
		 * 3. 배역의 마지막 인덱스(번지)는 '배열의 크기-1' 이다.
		 */
		//기본형 그냥 이형태만 기억하자.
		int num[]=new int [5];//new라는 키워드로 인해 5개의 정수를 정한다.
		                       //변수를 따로 정하면 각자 다른 공간을 차지하지만
							   //배열을 사용하면 연속된 공간을 차지하게 된다.
							   //즉 위의 키워드를 해석해보면 new int로 인해 5개의 공간을 앞의 num에게 주는형태.
		System.out.println("배열 기본 예제");
		for(int i=0; i<num.length; i++){
			num[i]=i+1;
		}
		for(int i=0; i<num.length; i++){
			System.out.println("num["+i+"] :" + num[i]);
		}
		int []num1,num3;//int후 []로 배열 선언이다.
		//int[]가 공통으로 된다.
		int num2[],num4;//int후 num2만 []으로 배열선언이고 그 뒤에 num4는 일반 변수가 된다.
		//int가 공통으로 되어 num2만 배열, num4는 일반 변수.
		num1 = new int[3];//선언후 바로 할당하지 않아도 됨.
		/* num1 : 배열
		 * num2 : 배열
		 * num3 : 배열
		 * num4 : 변수
		 * */
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		if(size >= 0)
			num1 = new int[size];
		scan.close();
		int num5[] = {1,2,3,4,5};//이런식으로 초기화 할수있다.
		System.out.println("초기화 예제");
		for(int i=0; i<num5.length;i++){
			System.out.println("num["+i+"] : "+num5[i]);
		}
		int num6[];//num6 = {1,2,3,4,5}; -> 초기화는 배열을 선언할때에만 가능
	}

}
