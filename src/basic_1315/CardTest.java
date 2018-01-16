package basic_1315;

public class CardTest {
	public static void main(String[] args) {
		System.out.println(Card.width);// 100
		System.out.println(Card.height);// 250
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 3;
		
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 7;
		
		System.out.println("c1 모양 : " + c1.kind + " c1 번호 : " + c1.number);
		System.out.println("c1 너비 : " + c1.width + " c1 높이 : " + c1.height);
				
		System.out.println("c2 모양 : " + c2.kind + " c2 번호 : " + c2.number);
		System.out.println("c2 너비 : " + c2.width + " c2 높이 : " + c2.height);
		
		c1.width = 50;
		c1.height = 80;
		System.out.println("c1 모양 : " + c1.kind + " c1 번호 : " + c1.number);
		System.out.println("c1 너비 : " + c1.width + " c1 높이 : " + c1.height);
		
		System.out.println("c2 모양 : " + c2.kind + " c2 번호 : " + c2.number);
		System.out.println("c2 너비 : " + c2.width + " c2 높이 : " + c2.height);
		
		
		/*
		 * 1. 출력결과(콘솔창) 예상해서 종이에 쓰기
		 * 2. 돌리고 틀린부분 분석 및 틀린이유 정리
		 * 3. jvm메모리 구조 그리고 정리
		 */
		
		
		
	}
}

class Card {
	
	String kind;
	int number;
	
	static int width = 100;
	static int height = 250;
	
	void method(){
		int v = 30;
		for(int i = 0; i < 5; i++){
			System.out.println(i);
		}
	}
	
	static void method2(){
		
	}
	
	
	
}