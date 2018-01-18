package basic_1315;
/**
 * 클래스멤버와 인스턴스멤버 간의 참조와 호출 연습
 * @author SangJun
 *
 */
public class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = iv;
	
	static void staticMethod(){
		System.out.println(cv);
	}
	
	void instanceMethod(){
		System.out.println(cv);
		staticMethod();
	}
	
	void instanceMethod2(int a){
		instanceMethod();
		System.out.println(iv);
	}

}
