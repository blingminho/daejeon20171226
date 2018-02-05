package basic_1330;

import java.util.Arrays;

/**
 * getClass() 연습
 * @author SangJun
 *
 */
public class CardTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Card c = new Card();
		Class c2 = Card.class;// 클래스의 리터럴로부터 얻는 방법
		System.out.println(c2.getName());
		
		Class c3 = c.getClass();// 생성된 객체로부터 얻는 방법
		System.out.println(c3.getName());
		
		Class c4 = Class.forName("basic_1330.Card");// 패키지명.클래스의 이름으로부터 얻는 방법// 많이 쓰인다
		System.out.println(c4.getName());
		
		System.out.println(Arrays.toString(c4.getInterfaces()));
		
		
		
	}
}

class Card implements Card3{

}
interface Card3{
	
}