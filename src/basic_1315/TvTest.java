package basic_1315;

public class TvTest {
	public static void main(String[] args) {
		
		System.out.println(Tv.color);// String의 기본값 null 출력
		Tv.color = "yellow";
		System.out.println(Tv.color);// "yellow" 출력
		Tv.changeColor();
		System.out.println(Tv.color);// "red" 출력
		
		// Scanner sc = new Scanner();
		Tv t = new Tv();
		System.out.println(t.channel);
		t.channelUp();
		System.out.println(t.channel);
		
		
		
	}
}


class Tv{
	// 전역변수
	
	// 클래스변수(static)
	static String color;
	// 인스턴스변수
	boolean power;
	int channel;
	
	// 클래스메서드
	static void changeColor(){
		color = "red";
		// 지역변수
		int a = 10;
	}
	// 인스턴스 메서드
	void power(){
		power = !power;
	}
	
	void channelUp(){
		int a = 1;
		channel++;
	}
	
	
	
	
	
}