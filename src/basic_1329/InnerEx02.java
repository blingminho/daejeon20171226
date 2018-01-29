package basic_1329;
/**
 * 내부클래스의 메서드 호출 연습
 * @author SangJun
 *
 */

public class InnerEx02 {
	public static void main(String[] args) {
		Outer out = new Outer();
		
		
		Outer.Inner inner = out.new Inner();
		inner.method();
		System.out.println("===================================");
		Outer.Inner.Inner2 inner2 = inner.new Inner2();
		inner2.method2();
		
		
	}
}

class Outer{
	int value = 10;
	
	class Inner{
		int value = 20;
		
		void method(){
			int value = 30;
			System.out.println(value);// 30
			System.out.println(this.value);// 20
			System.out.println(Outer.this.value);// 10
		}
		
		class Inner2{
			int value = 40;
			void method2(){
				int value = 50;
				System.out.println(value);// 50
				System.out.println(this.value);// 40
				System.out.println(Inner.this.value);// 20
				System.out.println(Outer.this.value);// 10
			}
		}
		
	}
	
	
}