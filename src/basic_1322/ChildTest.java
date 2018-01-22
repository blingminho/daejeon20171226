package basic_1322;
/**
 * 상속 관련 연습
 * super()와 this()는 같이 못씀
 * super()는 적어도 하나가 있어야한다
 * 
 * @author SangJun
 *
 */
public class ChildTest {
	public static void main(String[] args) {
		
		Child c = new Child();
		
		// 자식
		c.volume = 15;
		c.volumeUp();
		System.out.println(c.volume);
		
		// 부모
		c.channel = 20;
		c.channelUp();
		System.out.println(c.channel);
		
		
	}
}

class Parent{
	int channel;
	void channelUp(){
		channel++;
	}
}

class Child extends Parent{
	int volume;
	void volumeUp(){
		volume++;
	}
	Child(){
		super();// 숨어있음 this()와 같이 사용못함
	}
}