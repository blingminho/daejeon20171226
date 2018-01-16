package basic_1316;
/**
 * 메서드 연습
 * @author SangJun
 *
 */
public class MyMathTest {
	public static void main(String[] args) {
		MyMath.method();
		int result = MyMath.method2();
		System.out.println(result);
		
		int result2 = MyMath.add();
		System.out.println(result2);
		
		MyMath myMath= new MyMath();
		int result3 = myMath.add2();
		System.out.println(result3);
		
		int result4 = myMath.add3(5);
		System.out.println(result4);
		
		int result5 = MyMath.add4(1, 4);
		System.out.println(result5);
		
		float result6 = myMath.divide(10, 3);
		System.out.println(result6);
		
		long result7 = myMath.multiply(3000, 3000, 3000);
		System.out.println(result7);
		
	}
}

class MyMath{
	
	static int a = 10;
	static int b = 20;
	
	int c = 30;
	int d = 40;
	
	static void method(){
		for(int i = 0; i < 10; i++){
			System.out.println(i);
		}
	}
	
	static int method2(){
		int sum = 0;
		for(int i = 0; i < 10; i++){
			sum += i;
		}
		return sum;
	}
	
	static int add(){
		int result = a + b;
		return result;
	}
	
	int add2(){
		int result = c + d;
		return result;
	}
	
	int add3(int a){
		int sum = 0;
		for (int i = 0; i < a+1; i++) {
			sum+=i;
		}
		return sum;
	}
	
	static int add4(int a, int b){
		int result = a + b;
		return result;
	}
	
	float divide(int a, int b){
		float result = (int)((float)a/b * 100 + 0.5)/(float)100;
		return result;
	}
	
	// method명 : multiply
	// 매개변수 : int형 3개
	// 매개변수 3개의 곱을 반환하는 메서드를 만드세요
	long multiply(int a, int b, int c){
		long result = (long)a*b*c;
		return result;
	}

}