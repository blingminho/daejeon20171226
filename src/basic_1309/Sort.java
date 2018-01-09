package basic_1309;

import java.util.Arrays;
/**
 * 정렬 - 버블, 선택
 * 삽입 미구현
 * @author SangJun
 *
 */
public class Sort {
	public static void main(String[] args) {
		/*
		 * 1. 정렬
		 * - 어떤 데이터를 빠르고 쉽게 찾기 위해 순서대로 데이터를 가지런히 나열하는 작업
		 * - 버블정렬, 선택정렬, 삽입정렬
		 * 
		 * 2. 버블정렬(Bubble sort) - 오름차순
		 * - 인접한 데이터간에 교환이 계속해서 일어나면서 정렬이 이루어 진다.
		 * - 한 회전이 끝날때 가장 큰값을 뒤로 보낸다.(한 항목을 확정시킨다.)
		 * - 숫자가 5개이면 4회전
		 * 
		 * 
		 * 
		 */
		
		int[] intArray = {2,3,1,5,4};
		
		System.out.println( "주어진 배열 : " + intArray[0] +"  "+ intArray[1] +"  "+ intArray[2] +"  "+ intArray[3] +"  "+ intArray[4]);
		// 1회전 - 4번 반복
		/*
		if(intArray[0] < intArray[1]){
			tmp = intArray[1];
			intArray[1] = intArray[0];
			intArray[0] = tmp;
		}
		if(intArray[1] < intArray[2]){
			tmp = intArray[2];
			intArray[2] = intArray[1];
			intArray[1] = tmp;
		}
		if(intArray[2] < intArray[3]){
			tmp = intArray[3];
			intArray[3] = intArray[2];
			intArray[2] = tmp;
		}
		if(intArray[3] < intArray[4]){
			tmp = intArray[4];
			intArray[4] = intArray[3];
			intArray[3] = tmp;
		}
		
		// 2회전 - 3번 반복
		if(intArray[0] < intArray[1]){
			tmp = intArray[1];
			intArray[1] = intArray[0];
			intArray[0] = tmp;
		}
		if(intArray[1] < intArray[2]){
			tmp = intArray[2];
			intArray[2] = intArray[1];
			intArray[1] = tmp;
		}
		if(intArray[2] < intArray[3]){
			tmp = intArray[3];
			intArray[3] = intArray[2];
			intArray[2] = tmp;
		}
		
		// 3회전 - 2번 반복
		if(intArray[0] < intArray[1]){
			tmp = intArray[1];
			intArray[1] = intArray[0];
			intArray[0] = tmp;
		}
		if(intArray[1] < intArray[2]){
			tmp = intArray[2];
			intArray[2] = intArray[1];
			intArray[1] = tmp;
		}
		
		// 4회전 - 1번 반복
		if(intArray[0] < intArray[1]){
			tmp = intArray[1];
			intArray[1] = intArray[0];
			intArray[0] = tmp;
		}
		*/
		for(int i = 0; i < intArray.length-1 ; i++){
			System.out.println( i + "회전");
			for(int j = 0; j < intArray.length-1-i; j++){
				if(intArray[j] > intArray[j+1]){
					int tmp = intArray[j];
					intArray[j] = intArray[j+1];
					intArray[j+1] = tmp;
				}
				System.out.println(Arrays.toString(intArray));
			}
		}
		
		/*
		 * 2. 선택정렬
		 * - 숫자 5개 -> 4회전
		 * - 1회전의 내용
		 * 배열의 0번째 선택
		 * -> 0번째를 포함한 나머지 중에서 최솟값을 찾음
		 * -> 0번째와 최솟값의 해당 위치와 자리를 교환
		 * 
		 * - 2회전의 내용
		 * 배열의 1번째 선택
		 * -> 1번째를 포함한 나머지 중에서 최솟값을 찾음
		 * -> 1번째와 최솟값의 해당 위치와 자리를 교환
		 * 
		 */
		
		/*
		int[] intArray2 = {2,3,1,5,4};
		int select = 0;
		int min = 0;
		// 1회전의 내용
		if(min > intArray2[0]){
			min = intArray2[0];
			select = 0;
		}
		if(min > intArray2[1]){
			min = intArray2[1];
			select = 1;
		}		
		if(min > intArray2[2]){
			min = intArray2[2];
			select = 2;
		}
		if(min > intArray2[3]){
			min = intArray2[3];
			select = 3;
		}
		if(min > intArray2[4]){
			min = intArray2[4];
			select = 4;
		}
		
		// 1회전바깥 반복문의 내용
		int tmp = intArray2[0];
		intArray2[0] = intArray2[select];
		intArray2[select] = tmp;
		
		*/
		System.out.println("-------------선택정렬------------------");
		int[] intArray2 = {2,3,1,5,4};
		System.out.println("초기 배열값 : " +Arrays.toString(intArray2));			
		for(int i = 0; i < intArray2.length-1 ; i++){
			int min = intArray2[i];
			int select = 0;
			for(int j = i; j < intArray2.length; j++){
				if(min >= intArray2[j]){
					min = intArray2[j];
					select = j;
				}
			}
			System.out.println( i+1 + "회전");
			int tmp = intArray2[i];
			intArray2[i] = intArray2[select];
			intArray2[select] = tmp;
			System.out.println(Arrays.toString(intArray2));			
		}
		
		
		
		
		
		
		
	}
}
