package basic_1309;

import java.util.Arrays;
/**
 * 다차원 배열 - 2차원배열
 * 변수타입[][] 변수명 = new 변수타입[3][3];
 * 1. 6행 7열(6명 7과목)형태의 이차원 배열을 선언 및 초기화하세요 score2
 * 2. score2 변수 각 방의 값을 0 ~ 100사이의 랜덤한 값을 저장해주세요
 * 3. 아래와 같이 출력하세요
 * 4. 정렬해서 출력하세요
 * @author SangJun
 *
 */
public class ArrayOther {
	public static void main(String[] args) {
		/*
		 * 1. 다차원 배열
		 * - 자바에서는 1차원 배열뿐만 아니라 2차원 이상의 다차원 배열도 허용한다.
		 * - 2차원 배열의 선언
		 * 		선언방법				선언예
		 * 변수타입[] 변수명;		int[] score; => 1차원 배열
		 * 변수타입[][] 변수명;		int[][] score; => 2차원 배열
		 * ----------아래거는 쓰지말자!-------------------------
		 * 변수타입 변수명[][];		int score[][]; => 2차원 배열
		 * 변수타입[] 변수명[];		int[] score[]; => 2차원 배열
		 * 
		 */
		
		int[][] score = new int[3][];
		/*
		 * {
		 * 		null,
		 * 		null,
		 * 		null
		 * }
		 */
		
		int[][] score1 = new int[4][3];
		/*
		 * {
		 * 		{0,0,0},
		 * 		{0,0,0},
		 * 		{0,0,0},
		 * 		{0,0,0}
		 * }
		 */
		score1[0][0] = 1;
		System.out.println(score1.length);
		System.out.println(score1[1].length);

		/*
		score1[0][0] = 10;
		score1[0][1] = 20;
		score1[0][2] = 30;
		score1[1][0] = 40;
		score1[1][1] = 50;
		score1[1][2] = 60;
		score1[2][0] = 70;
		score1[2][1] = 80;
		score1[2][2] = 90;
		score1[3][0] = 100;
		score1[3][1] = 110;
		score1[3][2] = 120;
		*/
		for(int i = 0, k = 1; i < score1.length; i++){
			for(int j = 0 ; j < score1[i].length; j++,k++){
				score1[i][j] = 10*k;
			}
			System.out.println(Arrays.toString(score1[i]));
		}
		
		// 이름, 과목 배열
		String[] name = {"김상준","엄소현","임경환","김보영","김수민","이선재"};
		String[] subject = {"국","영","수","사","과","HTML","JAVA"};
				
		// 1. 6행 7열(6명 7과목)형태의 이차원 배열을 선언 및 초기화하세요 score2
		int[][] score2 = new int[name.length][subject.length];
		
		// 2. score2 변수 각 방의 값을 0 ~ 100사이의 랜덤한 값을 저장해주세요
		// score2[0][0] = (int)(Math.random()*101);
		for(int i = 0; i < score2.length; i++){// 행을 진행하는 for문, 행의 길이만큼 반복
			for(int j = 0; j < score2[i].length; j++){// 열을 진행하는 for문, 열의 길이만큼 반복
				score2[i][j] = (int)(Math.random()*101);// 랜덤한값을 i행j열에 초기화
			}
		}
		
		// 인당 합계
		// 합계용 배열 인당 하나
		int[] sum = new int[name.length];
		for(int i = 0; i < name.length; i++){
			for(int j = 0; j < subject.length; j++){
				sum[i] += score2[i][j];	
			}
		}
		
		// 인당 평균
		// 평균 배열 인당 하나
		float[] average = new float[name.length];
		for(int i = 0; i < sum.length; i++){
			average[i] = (int)((float)sum[i]/subject.length * 100 + 0.5) / (float)100;
		}
		
		// 과목당 합계
		// 합계용 배열 과목당 하나
		int[] sumSub = new int[subject.length];
		for(int i = 0; i < subject.length; i++){
			for(int j = 0; j < name.length; j++){
				sumSub[i] += score2[j][i];
			}
		}
		
		// 과목당 평균
		// 평균 배열 과목당 하나
		float[] averageSub = new float[subject.length];
		for(int i = 0; i < subject.length; i++){
			averageSub[i] = (int)((float)sumSub[i]/name.length * 100 + 0.5) / (float)100;
		}
		
		// 석차용 배열
		int[] rank = new int[name.length];
		for(int i = 0; i < name.length; i++){
			rank[i] = 1;
			for(int j = 0 ; j < name.length; j++){
				if(sum[i] < sum[j]){
					rank[i] += 1; 
				}
			}
		}
		
		
		
		// 3. 아래와 같이 출력하세요
		/*
		90	50	36	90	30	25	94
		54	86	83	36	86	58	21
		...
		*/
		for(int j = 0; j < subject.length; j++){
			System.out.print("\t" + subject[j]);
		}
		System.out.print("\t합계\t평균\t석차");
		for(int i = 0; i < score2.length; i++){
			System.out.print("\n" + name[i]);// 이름 출력
			for(int j = 0; j < score2[i].length; j++){
				System.out.print("\t" + score2[i][j]);// 과목점수 출력
			}
			System.out.print("\t" + sum[i]);// 합계 출력
			System.out.print("\t" + average[i]);// 평균 출력
			System.out.print("\t" + rank[i]);// 석차 출력
		}
		// 과목 합계
		System.out.print("\n합계");
		for(int i = 0; i < subject.length; i++){
			System.out.print("\t"+ sumSub[i]);
		}
		// 과목 평균
		System.out.print("\n평균");
		for(int i = 0; i < subject.length; i++){
			System.out.print("\t"+ averageSub[i]);
		}
		
		
		// 정렬
		// 합계 정렬 - 선택정렬 - 내림차순
		for(int i = 0; i < name.length-1; i++){
			int tmp;
			int maxIndex = i;
			for(int j = i; j < name.length; j++){
				if(sum[j] > sum[maxIndex]){
					maxIndex = j;
				}
			}
			
			// 합계
			tmp = sum[maxIndex];
			sum[maxIndex] = sum[i];
			sum[i] = tmp;
			
			// 평균
			float tmpF = average[maxIndex];
			average[maxIndex] = average[i];
			average[i] = tmpF;
			
			// 석차
			tmp = rank[maxIndex];
			rank[maxIndex] = rank[i];
			rank[i] = tmp;
			
			// 이름
			String tmpS;
			tmpS = name[maxIndex];
			name[maxIndex] = name[i];
			name[i] = tmpS;
			
			// 스코어
			for(int k = 0; k < subject.length; k++){
				tmp = score2[maxIndex][k];
				score2[maxIndex][k] = score2[i][k];
				score2[i][k] = tmp;
			}
			
		}
		
		
		System.out.println("\n====================================정렬후======================================");
		// 3. 아래와 같이 출력하세요
		/*
		90	50	36	90	30	25	94
		54	86	83	36	86	58	21
		...
		 */
		for(int j = 0; j < subject.length; j++){
			System.out.print("\t" + subject[j]);
		}
		System.out.print("\t합계\t평균\t석차");
		for(int i = 0; i < score2.length; i++){
			System.out.print("\n" + name[i]);// 이름 출력
			for(int j = 0; j < score2[i].length; j++){
				System.out.print("\t" + score2[i][j]);// 과목점수 출력
			}
			System.out.print("\t" + sum[i]);// 합계 출력
			System.out.print("\t" + average[i]);// 평균 출력
			System.out.print("\t" + rank[i]);// 석차 출력
		}
		// 과목 합계 출력
		System.out.print("\n합계");
		for(int i = 0; i < subject.length; i++){
			System.out.print("\t"+ sumSub[i]);
		}
		// 과목 평균 출력
		System.out.print("\n평균");
		for(int i = 0; i < subject.length; i++){
			System.out.print("\t"+ averageSub[i]);
		}
	}
}
