package basic_1324;
/**
 * 오버라이드 연습
 * @author SangJun
 *
 */
public class SuperTest {
	public static void main(String[] args) {
		Child c = new Child();
		int x = c.getAdd();
		System.out.println(x);
	}
}

class Parent{
	int x = 10;
	int y = 20;
	
	int getAdd(){
		return x + y;
	}
	
	Parent(){
		
	}
	
	
}

class Child extends Parent{
	int x = 30;
	int y = 40;
	
	@Override
	int getAdd(){
		System.out.println(x);// 30
		System.out.println(this.x);// 30
		System.out.println(super.x);// 10		
		return super.getAdd();
	}
	
	Child(){
		this(5);
	}
	
	Child(int a){
		super();
		x = a;
	}
	
	
	
}