package basic_1329;
/**
 * 내부 클래스 - 인스턴스클래스, static클래스, 지역클래스
 * @author SangJun
 *
 */
public class InnerEx01 {
	// 인스턴스 클래스
	class InstancClass{
		int iv = 100;
		// static int cv = 200;// 불가// 인스턴스친구가 아니라서
		static final int CV = 200;// 상수라서 가능
	}
	
	// static 클래스
	static class StaticClass{
		int iv = 400;
		static int cv = 500;
		// 상수도 가능
	}
	
	
	void myMethod(){
		// 지역클래스
		class LocalClass{
			int iv = 600;
			// static int cv = 700;// 불가// 인스턴스친구가 아니라서
			// 상수도 가능
		}
	}
	
}
