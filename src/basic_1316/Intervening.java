package basic_1316;
/*
 * 1. 자신의 머리로 JVM을 돌려서 노트에 console을 찍으세요
 * 2. 소스를 실행해서 1번에서 찍은 console과 동일한지 확인하세요
 * 3. JVM을 그려오세요
 */
class Data{
	int x;
}

public class Intervening {
	public static void main(String[] args) {
		Data d1 = new Data();
		d1.x = 10;
		System.out.println("main기본 : " + d1.x);
		Intervening.change(d1.x);
		System.out.println("after기본 : " + d1.x);
		
		
		Data d2 = new Data();
		d2.x = 10;
		System.out.println("main참조 : " + d2.x);
		Intervening.change(d2);
		System.out.println("after참조 : " + d2.x);
		
		String k = "ddd";
		change(k);
		System.out.println(k);
	}
	
	static void change(int x){
		x = 1000;
		System.out.println("change기본 : " + x);
	}
	
	static void change(Data d1){
		d1.x = 1000;
		System.out.println("change참조 : " + d1.x);
	}

	static void change(String d1){
		d1 = "kk";
	}

}
