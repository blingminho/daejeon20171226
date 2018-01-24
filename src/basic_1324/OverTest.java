package basic_1324;
/**
 * 메소드 오버로딩
 * 오버라이드 연습
 * @author SangJun
 *
 */
public class OverTest {
	public static void main(String[] args) {
		OverGo og = new OverGo();

		// 1. upMethod()를 호출하세요
		//  -> 반환값이 있다면 변수에 저장하세요 -> 저장된 변수의 값을 출력하세요
		String ogUpMethodResult = og.upMethod();
		System.out.println(ogUpMethodResult);
		
		// 2. upMethod()중 매개변수가 있는 메서드를 호출하세요
		// -> 반환값이 있다면 변수에 저장하세요 -> 저장된 변수의 값을 출력하세요
		String ogUpMethodResult2 = og.upMethod(1);
		System.out.println(ogUpMethodResult2);
		
		// 1. downMethod()를 호출하세요
		//  -> 반환값이 있다면 변수에 저장하세요 -> 저장된 변수의 값을 출력하세요
		String ogDownMethodResult = og.downMethod();
		System.out.println(ogDownMethodResult);
		
		// 2. downMethod()중 매개변수가 있는 메서드를 호출하세요
		// -> 반환값이 있다면 변수에 저장하세요 -> 저장된 변수의 값을 출력하세요
		String ogDownMethodResult2 = og.downMethod(1);
		System.out.println(ogDownMethodResult2);
		
	}
}

class OverUp{
	int x = 1;
	int y = 2;
	
	String upMethod(){
		return "하이" + x + y;
	}
}


class OverGo extends OverUp{
	int z = 3;
	
	@Override// 오버라이드
	String upMethod(){
		return x + y + z + "오버라이드";
	}
	
	// 오버로딩
	String upMethod(int k){
		return x + k + "오버로딩";
	}
	
	// 오버로딩
	String downMethod(){
		return "basic" + x + y;
	}
	
	String downMethod(int k){
		return "basic" + k;
	}
	
	
	
	
}