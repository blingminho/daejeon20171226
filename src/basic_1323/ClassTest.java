package basic_1323;

public class ClassTest {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		System.out.println(t1.hashCode());
		
		
		
		Test2 t2 = new Test2(2,2);
		Test3 t3 = new Test3(t1);
		Test4 t4 = new Test4(t1, t2);
		
		Test1[] t = new Test1[2];
		t[0] = new Test1();
		t[1] = new Test1();
		Test5 t5 = new Test5(5, t);
	}
}

class Test1{
	
	Test1(){
		
	}
	
}

class Test2{
	int a;
	int b;
	Test2(int a, int b){
		this.a = a;
		this.b = b;
	}
}

class Test3{
	Test1 t;
	Test3(Test1 t){
		this.t = t;
	}
}

class Test4{
	Test1 t1;
	Test2 t2;
	Test4(Test1 t1, Test2 t2){
		
	}
}

class Test5{
	int a;
	Test1[] t = new Test1[2];
	Test5(int a, Test1[] t){
		this.a = a;
		this.t = t;
	}
}