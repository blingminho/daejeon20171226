package myTestRoom;
/**
 * 학생성적 출력 - 2차원 배열 사용
 * 버블, 선택, 삽입 정렬 구현
 * @author SangJun
 *
 */
public class ScorePrint {
	public static void main(String[] args) {
		// 이름, 과목 배열
		String[] name = {"김상준","엄소현","임경환","김보영","김수민","이선재"};
		String[] sub = {"국","영","수","사","과","HTML","JAVA"};
		
		
		// 1. 6행 7열(6명 7과목)형태의 이차원 배열을 선언 및 초기화하세요 score
		int[][] score = new int[name.length][sub.length];// 이름이 행, 과목이 열
		
		// 2. score 변수 각 방의 값을 0 ~ 100사이의 랜덤한 값을 저장해주세요
		for(int i = 0; i<name.length; i++){// 행이동
			for(int j = 0; j<sub.length; j++){// 열이동
				int randomScore = (int)(Math.random()*101);// 1 ~ 100사이 랜덤 int값
				score[i][j] = randomScore;// 해당 행의 해당 열에 랜덤값 저장
			}
		}
				
		// 인당 합계
		// 합계용 배열 인당 하나// 행당 하나씩
		int[] sumName = new int[name.length];// 이름배열(String[] name) 만큼의 크기를 가진 int형 1차원 배열 선언 및 0으로 초기화
		for(int i = 0; i<name.length; i++){// 행이동
			int sum = 0;// 점수를 누적해서 더한값을 받아줄 int형 sum변수 선언 및 0으로 초기화// 행을 이동할때마다 0으로 초기화됨
			for(int j = 0; j<sub.length; j++){// 열이동// 해당 행의 모든 열에 접근
				sum += score[i][j];// 점수 배열의 행 i,열 j에 접근// 해당 행의 모든 열에 있는 랜덤점수를 sum에 누적해서 더해줌
			}
			sumName[i] = sum;// 누적해서 더해나간 sum을 인당 합계를 받아주는 배열에 초기화// 각 행(i)의 모든 점수의 합을 sumName[i]에 넣어줌
		}
		
		// 인당 평균// 소수점 셋째자리에서 반올림
		// 평균 배열 인당 하나// 행당 하나씩(이름당 방 배정)
		float[] averageName = new float[name.length];// 이름배열(String[] name) 만큼의 크기를 가진 float형 1차원 배열 선언 및 0.0f으로 초기화
		for(int i = 0; i < name.length; i++){// sumName배열을 기준으로 평균을 구하기때문에 열이동을 위한 for문이 필요없다// 즉, for문 하나로 초기화 가능하다// "i 는 행"
			float average;// 평균값을 받아줄 average변수 선언
			average = (float)sumName[i]/sub.length;// 과목수로 나누어준다, 이때 int형/int형 이기 때문에 float으로 강제적 형변환을 해준다
			average = (int)(average * 100 + 0.5);// 반올림을 원하는 자리까지 곱셈을 한다 그 후 0.5를 더해주어 반올림을 한다// int로 강제적 형변환을 해주어 소수점을 버린다
			average = average / (float)100;// 정수를 float형 숫자 100으로 나누어 주어 다시 원하는 소수점자리까지 나오게 한다
			averageName[i] = average;// 반올림한 결과를 평균배열인 averageName[i]에 넣어준다.
		}
		
		// 과목당 합계
		// 합계용 배열 과목당 하나// 열당 하나씩(과목당 방 배정)
		int[] sumSub = new int[sub.length];// 열당 하나씩(과목당 방 배정)
		for(int i = 0; i < name.length; i++){// 행 이동// "i 는 행(이름)"
			for(int j = 0; j < sub.length; j++){// 열 이동// "j는 열(과목)"
				sumSub[j] += score[i][j];// 인당 합계와 달리 sumSub[열(과목)]에 누적 저장함
			}
		}
		
		// 과목당 평균// 소수점 셋째자리에서 반올림
		// 평균 배열 과목당 하나// 열당 하나씩(과목당 방 배정)
		float[] averageSub = new float[sub.length];// 과목배열(String[] sub) 만큼의 크기를 가진 float형 1차원 배열 선언 및 0.0f으로 초기화
		for(int j = 0; j < sub.length; j++){// sumSub배열을 기준으로 평균을 구하기때문에 행이동을 위한 for문이 필요없다// 즉, for문 하나로 초기화 가능하다// "j 는 열"
			float average;// 평균값을 받아줄 average변수 선언
			average = (float)sumSub[j]/name.length;// 사람수로 나누어준다, 이때 int형/int형 이기 때문에 float으로 강제적 형변환을 해준다
			average = (int)(average * 100 + 0.5);// 반올림을 원하는 자리까지 곱셈을 한다 그 후 0.5를 더해주어 반올림을 한다// int로 강제적 형변환을 해주어 소수점을 버린다
			average = average / (float)100;// 정수를 float형 숫자 100으로 나누어 주어 다시 원하는 소수점자리까지 나오게 한다
			averageSub[j] = average;// 반올림한 결과를 평균배열인 averageSub[j]에 넣어준다.
		}
		
		// 석차용 배열
		int[] rank = new int[name.length];
		for(int i = 0; i < name.length; i++){
			// 석차 배열을 모두 1로 초기화// 이유 : 0등은 없기 때문에 최소 1등부터 시작이기 때문에
			rank[i] = 1;
			
			// sumName배열을 이용하여 비교
			int standard = sumName[i]; // i번째 행에 있는 과목들의 합인 sumName[i]를 매번 "기준"으로 잡는다
			
			// sumName배열안에서 "기준"과 다른 모든 sumName의 항목들과 비교한다 -> for문 하나 추가
			// 비교하여 기준이 더 작은 경우 rank[i]번째를 1씩 증가시킨다
			for(int k = 0; k < name.length; k++){
				if(standard < sumName[k]){
					rank[i]++;
				}
			}
		}
		
		
		// 3. 아래와 같이 출력하세요
		/*
		90	50	36	90	30	25	94
		54	86	83	36	86	58	21
		...
		*/
		// =====맨윗줄의 항목 출력=====
		for(int j = 0; j < sub.length; j++){// 과목의 이름 출력
			System.out.print("\t" + sub[j]);
		}
		System.out.print("\t합계");
		System.out.print("\t평균");
		System.out.print("\t석차");
		System.out.println();// 줄내림
		
		// =====이름 항목, 점수, 합계, 평균, 석차 출력===== 
		for(int i = 0; i < name.length; i++){
			
			// 이름 항목 출력
			System.out.print(name[i]);

			// 점수 출력
			for(int j = 0; j < sub.length; j++){
				System.out.print("\t" + score[i][j]);
			}
			
			// 사람별 합계 출력
			System.out.print("\t" + sumName[i]);
			
			// 사람별 평균 출력
			System.out.print("\t" + averageName[i]);
			
			// 석차 출력
			System.out.print("\t" + rank[i]);
			System.out.println();// 줄내림
		}
		// =====과목별 합계, 과목별 평균
		
		// 과목별 합계 출력
		System.out.print("합계");
		for(int j = 0; j < sub.length; j++){
			System.out.print("\t" + sumSub[j]);
		}
		
		//줄내림
		System.out.println();
		
		// 과목별 평균 출력
		System.out.print("평균");
		for(int j = 0; j < sub.length; j++){
			System.out.print("\t" + averageSub[j]);
		}
		System.out.println("\n\n\n");
		
		
		
		
		// =====내림차순 정렬===== // 기준은 사람별 합계(sumName[i])를 기준으로 한다
		// 버블정렬, 선택정렬, 삽입정렬 중 하나를 사용한다
		
		// 버블 정렬 : 정렬할 배열(sumName[])의 길이-1 만큼 회전한다
		/*
		for(int i = 0; i < sumName.length-1; i++){// 회전을 위한 반복문// i번째 반복문			
			for(int j = 0; j < sumName.length-i-1; j++){// 회전안에 있는 반복문 // "j 는 행"
				if(sumName[j] < sumName[j+1]){// 기준은 사람별 합계(sumName[i])를 기준으로 한다
					
					// 사람당 합계(sumName[j]) 정렬
					// sumName[j] 와 sumName[j+1]의 위치를 바꿈
					int tmpSum = sumName[j+1];
					sumName[j+1] = sumName[j];
					sumName[j] = tmpSum;
					
					// 사람당 평균(averageName[j]) 정렬
					// averageName[j] 와 averageName[j+1]의 위치를 바꿈
					float tmpAverage = averageName[j+1];
					averageName[j+1] = averageName[j];
					averageName[j] = tmpAverage;
					
					// 석차(rank[j]) 정렬
					// rank[j] 와 rank[j+1]의 위치를 바꿈
					int tmpRank = rank[j+1];
					rank[j+1] = rank[j];
					rank[j] = tmpRank;
					
					// 이름(name[j]) 정렬
					// name[j] 와 name[j+1]의 위치를 바꿈
					String tmpName = name[j+1];
					name[j+1] = name[j];
					name[j] = tmpName;
					
					// 점수(score[j][k]) 정렬 : 점수에 접근하기 위해서는 행뿐만 아니라 열에도 접근해야한다 -> 즉 반복문(for)을 통하여 열(k)에 접근한다
					// score의 해당 행[j]과 다른 행[j+1]끼리 바꾸어야 한다, 해당 열[k]과 다른 열[k]끼리 바꾸어야 한다
					for(int k = 0; k < sub.length; k++){
						int tmpScore = score[j+1][k];
						score[j+1][k] = score[j][k];
						score[j][k] = tmpScore;
					}
				}	
			}
		}
		*/
		
		// 선택 정렬 : 정렬할 배열의 길이-1 만큼 회전한다
		/*
		for(int i = 0; i < sumName.length-1; i++){// 총 sumName-1번 회전
			int standardBang = i;// 비교 기준이 되는 방번호// i와 standardBang 끼리 바꾼다
			for(int j = i; j < sumName.length; j++){
				if(sumName[standardBang] < sumName[j]){
					standardBang = j;// 비교 기준을 계속해서 갱신한다
				}
			}
			
			// 사람당 합계(sumName[i]) 정렬
			// sumName[i] 와 sumName[standardBang]의 위치를 바꿈
			int tmpSum = sumName[standardBang];
			sumName[standardBang] = sumName[i];
			sumName[i] = tmpSum;
			
			// 사람당 평균(averageName[i]) 정렬
			// averageName[i] 와 averageName[standardBang]의 위치를 바꿈
			float tmpAverage = averageName[standardBang];
			averageName[standardBang] = averageName[i];
			averageName[i] = tmpAverage;
			
			// 석차(rank[i]) 정렬
			// rank[i] 와 rank[standardBang]의 위치를 바꿈
			int tmpRank = rank[standardBang];
			rank[standardBang] = rank[i];
			rank[i] = tmpRank;
			
			// 이름(name[i]) 정렬
			// name[i] 와 name[standardBang]의 위치를 바꿈
			String tmpName = name[standardBang];
			name[standardBang] = name[i];
			name[i] = tmpName;
			
			// 점수(score[i][k]) 정렬 : 점수에 접근하기 위해서는 행뿐만 아니라 열에도 접근해야한다 -> 즉 반복문(for)을 통하여 열(k)에 접근한다
			// score의 해당 행[i]과 다른 행[standardBang]끼리 바꾸어야 한다, 해당 열[k]과 다른 열[k]끼리 바꾸어야 한다
			for(int k = 0; k < sub.length; k++){
				int tmpScore = score[standardBang][k];
				score[standardBang][k] = score[i][k];
				score[i][k] = tmpScore;
			}
		}
		*/
		
		// 삽입 정렬 : 정렬할 배열의 길이-1 만큼 회전한다
		// 삽입 정렬은 넘어가도 됩니다.
		/*
		for(int i = 0; i < sumName.length-1; i++){// 총 sumName-1번 회전
			int j;
			int standardSumName = sumName[i+1];
			float standardAverageName = averageName[i+1];
			int standardRank = rank[i+1];
			String standardName = name[i+1];
			int[] standardScore = score[i+1];
			
			for(j = i; j >= 0 && standardSumName > sumName[j]; j--){
				sumName[j+1] = sumName[j];
				averageName[j+1] = averageName[j];
				rank[j+1] = rank[j];
				name[j+1] = name[j];
				score[j+1] = score[j];
			}
			
			// 사람당 합계(sumName[j]) 정렬
			sumName[j+1] = standardSumName;
			
			// 사람당 평균(averageName[j]) 정렬
			averageName[j+1] = standardAverageName;
			
			// 석차(rank[j]) 정렬
			rank[j+1] = standardRank;
			
			// 이름(name[j]) 정렬
			name[j+1] = standardName;
		
			// 점수(score[j]) 정렬 : 
			score[j+1] = standardScore;
		}
		*/
		
		// =====맨윗줄의 항목 출력=====
		for(int j = 0; j < sub.length; j++){// 과목의 이름 출력
			System.out.print("\t" + sub[j]);
		}
		System.out.print("\t합계");
		System.out.print("\t평균");
		System.out.print("\t석차");
		System.out.println();// 줄내림
		
		// =====이름 항목, 점수, 합계, 평균, 석차 출력===== 
		for(int i = 0; i < name.length; i++){
			
			// 이름 항목 출력
			System.out.print(name[i]);
			
			// 점수 출력
			for(int j = 0; j < sub.length; j++){
				System.out.print("\t" + score[i][j]);
			}
			
			// 사람별 합계 출력
			System.out.print("\t" + sumName[i]);
			
			// 사람별 평균 출력
			System.out.print("\t" + averageName[i]);
			
			// 석차 출력
			System.out.print("\t" + rank[i]);
			System.out.println();// 줄내림
		}
		// =====과목별 합계, 과목별 평균
		
		// 과목별 합계 출력
		System.out.print("합계");
		for(int j = 0; j < sub.length; j++){
			System.out.print("\t" + sumSub[j]);
		}
		
		//줄내림
		System.out.println();
		
		// 과목별 평균 출력
		System.out.print("평균");
		for(int j = 0; j < sub.length; j++){
			System.out.print("\t" + averageSub[j]);
		}
		
	}
}
