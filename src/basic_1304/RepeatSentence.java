package basic_1304;
/**
 * 반복문
 * for, while, do-while
 * @author SangJun
 *
 */
public class RepeatSentence {
	public static void main(String[] args) {
		/*
		 * 1. 반복문(for, while, do-while)
		 * - 어떤 작업이 반복적으로 수행되도록 할 때 사용한다.
		 * - 반복문은 주어진 조건을 만족하는 동안 주어진 문장들을 반복적으로 수행함으로
		 * 	 조건식을 포함한다.
		 * - for문은 반복횟수를 알고 있을때 사용한다. while문은 반복횟수를 모를때 사용한다.
		 * - 공통되는 문장을 찾아서 반복문에 넣는다!
		 * 
		 * .
		 * 2. for문
		 * - 기본구조
		 * 	 for(초기화 ; 조건식 ; 증감식) {
		 * 		조건식이 true 일때 수행될 문장	
		 * 	 }
		 * 
		 * - 초기화 -> 조건식 -> 수행될 문장 -> 증감식
		 * 			-> 조건식 -> 수행될 문장 -> 증감식
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		/*
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		*/
		
		for(int i = 0 ; i < 11 ; i++ ) {
			//System.out.println(i);
		}
		
		int sum = 0;
		// 1 ~ 15까지의 짝수의 합
		for(int i = 1 ; i < 16 ; i++) {
			//sum += (i % 2 == 0) ? i : 0;
			if( i % 2 == 0) {
				sum += i;
			}
		}
		
		sum = 0;
		for(int i = 0; i < 16 ; i+=2) {// 반복회수가 절반! 개굳
			sum += i;
		}
		System.out.println(sum);
		
		/*
		 * 3. while문
		 * - 반복횟수를 모를때 사용한다.
		 * - 조건식과 수행될 문장을 포함한 블럭{}으로 구성되어 있다.
		 * - 기본구조
		 * 	 while(조건식) {
		 * 	 	조건식이 true 일때 수행될 문장
		 * 	 }
		 */
		int i = 0;
		while(i < 11) {
			//System.out.println(i);
			i++;
		}
		
		// 10 ~ 0
		i = 10;
		while( i > -1 ) {
			//System.out.println(i);
			i--;
		}
		
		// 1 ~ 10 합계
		i = 1;
		sum = 0;
		while( i < 11 ) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		// 1 ~ 10 홀수의 합계
		i = 1;
		sum = 0;
		while( i < 11 ) {
			if( i % 2 == 1 ) {
				sum += i;				
			}
			i++;
		}
		System.out.println(sum);
		
		/*
		 * 2 * 1 = 2*1
		 * 2 * 2 = 2*2
		 * 2 * 3 = 2*3
		 * 2 * 4 = 2*4
		 * 2 * 5 = 2*5
		 * 2 * 6 = 2*6
		 * 2 * 7 = 2*7
		 * 2 * 8 = 2*8
		 * 2 * 9 = 2*9
		 *
		 * 3 * 1 = 3*1
		 * 3 * 2 = 3*2
		 * 3 * 3 = 3*3
		 * 3 * 4 = 3*4
		 * 3 * 5 = 3*5
		 * 3 * 6 = 3*6
		 * 3 * 7 = 3*7
		 * 3 * 8 = 3*8
		 * 3 * 9 = 3*9
		 */
		int num2 = 2;
		for( int i1 = 1 ; i1 < 10 ; i1++ ) {
			System.out.println(num2+" * " + i1 + " = " + num2*i1);
		}
		
		for(int j = 2 ; j < 10 ; j++) {
			for(int k = 1; k < 10 ; k++) {
				//System.out.println(j+" * " + k + " = " + j*k);
			}
			System.out.println();
		}
		
		// 1. while문으로 바꾸세요
		int j1 = 2;
		int k1 = 1;
		while(j1 < 10) {
			k1 = 1;
			while(k1 < 10) {
				//System.out.println(j1+" * " + k1 + " = " + j1*k1);
				k1++;
			}
			System.out.println();
			j1++;
		}
		
		
		// 2. 짝수단만 출력하게 만드세요(for문)
		for(int j = 2; j < 10 ; j++) {
			if( j % 2 == 0) {
				for(int k = 1; k < 10 ; k++) {
					System.out.println(j + " * " + k + " = " + j*k);
				}
				System.out.println();
			}
		}
		
		// 3. 짝수단의 홀수곱만 출력하게 만드세요(for문)
		for(int j = 2; j < 10 ; j++) {
			if( j % 2 == 0 ) {
				for(int k = 1 ; k < 10 ; k++) {
					if( k % 2 == 1) {
						System.out.println(j + " * " + k + " = " + j*k);
					}
				}
				System.out.println();
			}
		}
		
		
		
	}
}
