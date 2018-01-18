package basic_1317;
/**
 * 메서드 오버로딩 연습
 * @author SangJun
 *
 */
public class PrintCall {
	public static void main(String[] args) {
		
		PrintCall pc = new PrintCall();
		int result1 = pc.add();
		int result2 = pc.add(1,2);
		long result3 = pc.add(3,4L);
		long result4 = pc.add(5L,6);
		long result5 = pc.add(7L,8L);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
		
		
		
	}
	
	
	int a1 = 3;
	int b1 = 5;
	// 1
	int add(){
		int result = a1 + b1;
		return result;
	}
	// 2
	int add(int a, int b){
		int result = a + b;
		return result;
	}
	// 3
	long add(int a, long b){
		long result = a + b;
		return result;
	}
	// 4
	long add(long a, int b){
		long result = a + b;
		return result;
	}
	// 5
	long add(long a, long b){
		long result = a + b;
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
