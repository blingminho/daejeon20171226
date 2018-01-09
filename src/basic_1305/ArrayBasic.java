package basic_1305;
/**
 * 배열
 * 변수타입[] 변수명 = new 변수타입[];
 * 최대값, 최소값 뽑기
 * @author SangJun
 *
 */
public class ArrayBasic {
	public static void main(String[] args) {
		/*
		 * 1. 배열(array)이란?
		 * - 같은 타입의 여러변수를 하나의 묶음으로 다루는 것.
		 * 
		 * 
		 * 2.  배열의 선언
		 * - 원하는 타입의 변수를 선언하고 변수 또는 타입에 배열을 의미하는 [] 을 붙이면된다.
		 * - 변수타입[] 변수명;
		 * - 변수타입 변수명[];// 가능하나 위에꺼 사용!
		 *
		 * 3. 배열의 생성
		 * - 배열을 선언후에는 배열을 생성해야 한다.
		 * - 배열의 생성을 위해서는 연산자 'new'와 함께 배열의 타입과 크기를 지정해 주어야 한다.
		 * - 배열도 객체임으로 멤버변수와 메서드를 갖고 있으며 이중 멤버 변수 length는 배열의 크기를 담고있다.
		 * 
		 * 4. 배열의 초기화
		 * - 배열은 생성과 동시에 자동적으로 자신의 타입에 해당하는 기본값으로 초기화 된다.
		 * 
		 * 
		 * 
		 * 
		 */
		int score1 = 100;
		int score2 = 80;
		int score3 = 50;
		int score4 = 90;
		
		int[] score;// 배열의 선언
		score = new int[4];// 배열의 생성
		int[] score10 = new int[4];// 배열의 선언 및 초기화
		// new : 새로운 주소를 만들어준다.
		/*
		int형 배열은 기본값 0으로 초기화됨
		{0,0,0,0}
		String형 배열은 참조형의 기본값인 null로 초기화됨
		{null,null,null,null}
		*/
		int[] score11 = new int[]{1,2,3,4};// 배열 선언 및 초기화
		int[] score12 = {1,2,3,4};// 배열 선언 및 초기화
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		
		for(int i = 0 ; i < score.length ; i++){
			System.out.println(score[i]);
		}
		
		// 1. 0번방 10, 1번방 20, 2번방 30, 3번방 40
		score[0] = 10;
		score[1] = 20;
		score[2] = 30;
		score[3] = 40;
		
		for(int i = 0 ; i < score.length ; i++){
			System.out.println(score[i]);
		}
		
		// 1. 숫자 7개를 저장할 수 있는 배열을 선언 및 초기화 하세요
		int[] scoreArray = new int[7];
		// 2. 각방의 값을 0 ~ 100사이의 랜덤한 값을 지정해주세요.(반복문 없이)
//		scoreArray[0] = (int)(Math.random()*101);
//		scoreArray[1] = (int)(Math.random()*101);
//		scoreArray[2] = (int)(Math.random()*101);
//		scoreArray[3] = (int)(Math.random()*101);
//		scoreArray[4] = (int)(Math.random()*101);
//		scoreArray[5] = (int)(Math.random()*101);
//		scoreArray[6] = (int)(Math.random()*101);
		for(int i = 0 ; i < scoreArray.length; i++){
			scoreArray[i] = (int)(Math.random()*101);
		}
		
		for(int i = 0 ; i < scoreArray.length; i++){
			System.out.println(scoreArray[i]);
		}
		
		int sum = 0;
		for(int i = 0 ; i < scoreArray.length; i++){
			sum += scoreArray[i];
		}
		System.out.println(sum);
		
		System.out.println((float)sum/scoreArray.length);
		System.out.println( ( (float)sum/scoreArray.length * 100 + 0.5 ));
		System.out.println( (int)((float)sum/scoreArray.length * 100 + 0.5));
		System.out.println( (int)((float)sum/scoreArray.length * 100 + 0.5) / (float)100);
		
		
		// 최대값 뽑기 // 배열의 첫번째 값이 시작 비교 기준
		int maxScore = scoreArray[0];
		for(int i = 1 ; i < scoreArray.length; i++){
			if(maxScore < scoreArray[i]){
				maxScore = scoreArray[i];
			}
		}
		System.out.println(maxScore);
		
		// 최소값 뽑기 // 배열의 첫번째 값이 시작 비교 기준 : 만약 minScore를 101로 할 경우 점수의 범위가 바뀌는 경우 사용할 수 없게 된다.
		// 모든 배열에서 사용할 수 있도록 시작 비교 기준을 배열의 첫번째 값으로 지정한다.
		int minScore = scoreArray[0];
		for(int i = 1; i < scoreArray.length; i++){
			if(minScore > scoreArray[i]){
				minScore = scoreArray[i];
			}
		}
		System.out.println(minScore);
		
	}
}
