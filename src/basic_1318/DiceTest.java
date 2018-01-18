package basic_1318;

import java.util.Scanner;
/**
 * 부루마블
 * @author SangJun
 *
 */
public class DiceTest {
	public static void main(String[] args) {
		System.out.println("참가하는 플레이어 수를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int playerNumber = scan.nextInt();// 참가하는 플레이어 수
		String[] playerLog = new String[playerNumber];// 플레이어 로그 저장
		
		// 플레이어생성 및 초기화
		Player[] player = new Player[playerNumber];
		for(int i = 0; i < playerNumber; i++){
			player[i] = new Player();
			playerLog[i] = new String();
		}
		
		// 다이스 번호 결과
		int result1 = 0;
		int result2 = 0;
		int result = 0;
		
		int count = 0;// 던진 횟수 0 -> 3번까지
		int maxCount = 3;// 연속 던지기 3번 까지 가능 -> 무인도행
		int turnCount = 1;// 턴수
		int playerNum = 0;// player 방번호
		int winnerNum = 0;// 승자 방번호
		
		
		
		while(true){
			
			if(playerNum==0){// 모든 플레이어가 다 진행했을때 턴 수 출력
				System.out.println("\n제 "+ turnCount +" 턴");
				playerLog[playerNum] += "\n제 "+ turnCount +" 턴\n";
			}
			
			System.out.println("=====플레이어"+ (playerNum+1) + "의 차례입니다=====");
			do{
				// 무인도인 경우 한턴 쉬기
 				if(player[playerNum].positionNum == 9 && player[playerNum].state == true){
 					System.out.println("무인도라서 한턴 쉽니다");
 					playerLog[playerNum] += "무인도라서 한턴 쉽니다\n";
 					player[playerNum].state = false;
 					break;
				}
				// 무인도로 보내기
				if(count == maxCount && player[playerNum].state == false){
					player[playerNum].positionNum = 9;// 무인도 번호
					player[playerNum].state = true;
					System.out.println("위치 : " + Map.map[player[playerNum].positionNum]);
					playerLog[playerNum] += "위치 : " + Map.map[player[playerNum].positionNum] + "\n";
					break;
				}
				// 주사위 던지고 합침
				result1 = DoubleDice.throwDice();
				result2 = DoubleDice.throwDice();
				result = result1 + result2;
				
				count++;// 던진횟수 증가
				
				//이동한 거리 출력 및 위치 값 변경
				System.out.println("이동한 거리 : " + result);
				playerLog[playerNum] += "이동한 거리 : " + result + "\n";
				player[playerNum].positionNum += result;
				
				// 무인도로 빠진경우
				if(player[playerNum].positionNum == 9){
					player[playerNum].state = true;
				}
				
				// 한바퀴 돌았을 경우
				if(player[playerNum].positionNum > 31){
					player[playerNum].positionNum %= 32;
					player[playerNum].count++;
					System.out.println("플레이어" + (playerNum+1) +"이 총" + player[playerNum].count +"바퀴를 돌았습니다.");
					playerLog[playerNum] += "플레이어" + (playerNum+1) +"이 총" + player[playerNum].count +"바퀴를 돌았습니다.\n";
				}
				System.out.println("플레이어"+ (playerNum+1) +"의 위치 : " + Map.map[player[playerNum].positionNum]);
				playerLog[playerNum] += "플레이어"+ (playerNum+1) +"의 위치 : " + Map.map[player[playerNum].positionNum] + "\n";
			}while(result1==result2);// 1번 주사위와 2번 주사위가 같을 경우 반복
			count = 0;// 던진 횟수 초기화
			playerNum++;// 다음 플레이어로 넘기기위해 플레이어 방번호 증가
			if(playerNum == playerNumber){// 플레이어가 다 한번씩 진행했을 경우
				playerNum = 0;// 플레이어 방 번호를 0으로 초기화
				turnCount++;// 턴수 증가
			}
			
			if(player[playerNum].count==2){// 해당 플레이어가 2바퀴 돌았을 경우 반복종료
				winnerNum = playerNum;
				break;
			}
			
			// 엔터치면 다음사람으로 넘김
			new Scanner(System.in).nextLine();
		}
		
		System.out.println("\n승자는 플레이어" + (winnerNum+1));
		playerLog[winnerNum] += "\n승자는 플레이어" + (winnerNum+1);
		
		
		System.out.println("\n\n=====로그를 보길 원하는 플레이어의 숫자를 쓰세요=====");
		int selectPlayerLog = new Scanner(System.in).nextInt();
		System.out.println(playerLog[selectPlayerLog-1]);
		
	}
}

class DoubleDice{
	// instance method : throwDice
	static int count = 0;
	static final int throwDice(){
		int result = 0;
		int num = (int)(Math.random()*6+1);
		
		result = num;
		return result;
	}
}

class Map{
	static final String[] map = {// 32개 0 ~ 31
		"서울","시작","방콕","보너스게임","베이징","독도","타이페이","두바이","카이로",
		"무인도","발리","도쿄","시드니","카드","퀘벡","하와이","상파울로","올림픽",
		"프라하","푸켓","베를린","카드","모스크바","제네바","로마","세계여행","타히티",
		"런던","파리","카드","뉴욕","국세청"
	};
}

class Player{
	int positionNum = 1;
	int count;
	boolean state;
}





















