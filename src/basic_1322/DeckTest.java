package basic_1322;
/**
 * 객체 배열 연습
 * @author SangJun
 *
 */
public class DeckTest {
	public static void main(String[] args) {
		Card c = new Card(2,1);
		System.out.println(c.toString());
		
		Deck d = new Deck();
		System.out.println(d.pick(1));
		System.out.println(d.randomPick());
		d.shuffle();
		System.out.println(d.pick(1));
		d.shuffle2();
		System.out.println(d.pick(1));
		
		
		
	}
}
class Deck{
	// 1. 카드 52장을 저장할 수 있는 변수를 선언 및 초기화 하세요(c)
	private Card[] c = new Card[Card.KIND_MAX * Card.NUM_MAX];
	
	// 2. 기본생성자를 만드세요
	// 		기본생성자 내부에 1번에서 만들어진 변수(c)에 52장의 카드를 저장하세요
	//		1,1 ~ 4,13
	Deck(){
		for(int i = 1, k = 0; i < Card.KIND_MAX+1; i++){
			for (int j = 1; j < Card.NUM_MAX+1; j++) {
				c[k] = new Card(i,j);
				k++;
			}
		}
	}
	
	// 3. 방번호를 입력받아서 해당번재 방의 카드를 반환하는 메서드를 만드세요(pick)
	Card pick(int i){
		Card result = c[i];
		return result;
	}
	
	// 4. 랜덤한 방번호의 카드를 반환하는 메서드를 만드세요(randomPick)
	// 	단, 3번에서 만든 메서드를 활용하세요
	Card randomPick(){
		int i = (int)(Math.random() * c.length);
		return pick(i);
	}
	
	// 5. 카드를 섞으세요(shuffle)
	// 연습문제 5-5번을 응용하세요
	void shuffle(){
		for(int i = 0; i < c.length; i++){
			int j = (int)(Math.random() * c.length);
			Card temp = c[i];
			c[i] = c[j];
			c[j] = temp;
		}
	}
	
	// 6. 카드를 섞으세요(shuffle2)
	// 랜덤한 방을 두개 뽑아 두방의 값을 변경해주세요 1000번반복
	void shuffle2(){
		for (int i = 0; i < 1000; i++) {
			int j = (int)(Math.random() * c.length);
			int k = (int)(Math.random() * c.length);
			
			Card temp = c[j];
			c[j] = c[k];
			c[k] = temp;
		}
	}
	
	
}

class Card{
	
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;
	
	static final int SPADE = 1;
	static final int DIAMOND = 2;
	static final int HEART = 3;
	static final int CLOVER = 4;
	
	int kind;
	int number;
	
	Card(int kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	Card(){
		this(SPADE, 1);
	}
	
	@Override// 부모의 메서드를 재정의
	public String toString(){
		String kind = "";
		String number = "";
		
		switch (this.kind) {
		case 1:
			kind = "SPADE";
			break;
		case 2:
			kind = "DIAMOND";
			break;
		case 3:
			kind = "HEART";
			break;
		case 4:
			kind = "CLOVER";
			break;
		}
		
		switch(this.number){
		case 1:
			number = "A";
			break;
		case 11:
			number = "J";
			break;
		case 12:
			number = "Q";
			break;
		case 13:
			number = "K";
			break;
		default:
			number = this.number+"";
		}
		
		
		
		return kind + " : " + number;
	}
	
	
}




























