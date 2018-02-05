package basic_1331;
/**
 * 오토박싱, 오토언박싱 연습
 * @author SangJun
 *
 */
public class WrapperTest {
	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.equals(i2));// equals 오버라이드
		System.out.println(i1);// toString 오버라이드
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);// 32비트
		
		// 1.8 버전
		// Integer.BYTES
		
	}
}
