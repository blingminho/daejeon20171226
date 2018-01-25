package basic_1325;
/**
 * 싱글턴 패턴 연습
 * @author SangJun
 *
 */
public class Singleton {
	public static void main(String[] args) {
		SingletonTest st = SingletonTest.getInstance();
		SingletonTest st2 = SingletonTest.getInstance();
		
	}
}


class SingletonTest{
	
	private static SingletonTest st = null;
	
	private SingletonTest(){
		
	}
	
	public static SingletonTest getInstance(){
		if(st == null){
			st = new SingletonTest();
		}
		
		return st;
	}
}