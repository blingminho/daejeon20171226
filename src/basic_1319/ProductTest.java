package basic_1319;
/**
 * 변수의 초기화
 * - 명시적초기화
 * - 생성자를 이용한 초기화
 * - 초기화블럭을 이용한 초기화
 * @author SangJun
 *
 */
public class ProductTest {
	public static void main(String[] args) {
		System.out.println(Init.action);
		Init.action = 3;		
		System.out.println(Init.action);
		
		Init init = new Init();
		System.out.println(init.action2);
		
		
		
	}
}
class Init{
	
	static int action;
	int action2 = 15;// 명시적 초기화
	
	Init(){
		//action2 = 3;
		System.out.println("middle");
	}
	
	Init(int action2){
		this.action2 = action2;
		System.out.println("후발대");
	}
	
	static{// 클래스 초기화블럭
		action = 15;
		System.out.println("클래스 초기화 블럭");
	}
	
	{// 인스턴스 초기화 블럭
		action2 = 25;
		System.out.println("인스턴스 초기화 블럭");
	}
	
}