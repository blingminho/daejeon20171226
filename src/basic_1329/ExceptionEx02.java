package basic_1329;
/**
 * 예외처리 연습2
 * try-catch문
 * @author SangJun
 *
 */
public class ExceptionEx02 {
	public static void main(String[] args) {
		int a = 3;
		int b = 0;
		
		try {
			// 1. 문장을 수행한다
			System.out.println(a);
			// 2. 예외가 발생한다
			System.out.println(a/b);
			// 3. 예외 다음문장은 수행하지 않는다
			System.out.println(b);
			// 4. 일치하는 예외를 찾는다
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e2){
			System.out.println("Exception : 0으로 나누지마");
		}
		System.out.println("end");
	}
}
