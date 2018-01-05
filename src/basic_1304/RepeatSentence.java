package basic_1304;

import java.util.Scanner;

/**
 * 반복문
 * for, while, do-while
 * continue, break
 * Scanner
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
		
		
		// 1. 1 ~ ? 의 합이 사용자가 입력한 값보다 커지는 ?의 값은 얼마일까요?
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int input = scan.nextInt();
		
		// while문
		/*
		int i1 = 0;
		int sum1 = 0;
		while(input > sum1) {
			i1++;
			sum1 += i1;
		}
		System.out.println("1 부터 "+ i1 + " 까지의 합이 입력한 수보다 큽니다 : " + sum1);
		*/
		
		// for문
		int sum1 = 0;
		int i1 = 1;
		for( ; input > sum1 ; ) {
			i1++;
			sum1 += i1;
		}
		System.out.println("1 부터 "+ i1 + " 까지의 합이 입력한 수보다 큽니다 : " + sum1);

		/*
		int i1 = 1;
		int sum1 = 0;
		while(true) {
			sum1 += i1;
			if(sum1 > input) {
				System.out.println("1 부터 "+ i1 + " 까지의 합이 입력한 수보다 큽니다 : " + sum1);
				break;
			}
			i1++;
		}
		*/
		
		
		/*
		 * 4. do-while
		 * - while문의 변형으로 기본구조는 while문과 같으나 
		 * 	 블럭{}을 먼저 수행하고 조건식을 판단한다.
		 * - 기본구조
		 * 	 do{
		 * 		수행될 문장
		 * 	 } while(조건식);
		 */
		Scanner scan2 = new Scanner(System.in);
		String input2;
		do{
			System.out.println("문장을 입력해 주세요");
			input2 = scan2.next();			
			System.out.println(input2);
		} while(!(input2.equals("0")));
		
		/*
		 * 5. continue
		 * - 반복문에서만 사용할 수 있다.
		 * - 반복문의 끝으로 이동하여 다음 반복문으로 넘어간다.
		 * - for문의 경우 증감식으로, while문의 경우는 조건식으로 간다.
		 */
		
		for( int k = 0; k < 10; k++){
			if( k % 2 == 0){
				continue;
			}
			System.out.println(k);
		}
		
		/*
		 * 6. break
		 * - switch문, 반복문에서 사용가능하다
		 * - 자신이 포함된 가장 가까운 반복문을 나간다.
		 * - if문안에 있는 break문의 경우 if문이 포함된 가장 가까운 반복문을 나간다.
		 */
		System.out.println("====break====");
		int l = 0;
		while(l < 5){
			int k = 0;
			System.out.println("l : "+ l );
			while(k < 5){
				if( l == 3 ){// k반복문 나감
					break;
				}
				System.out.println("k : "+ k );
				k++;
			}
			
			l++;
		}
		
		
		
		
		
		
		
	}
}
