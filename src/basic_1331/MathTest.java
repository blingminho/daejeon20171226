package basic_1331;

import static java.lang.Math.*;
/**
 * Math 클래스 메서드 연습
 * @author SangJun
 *
 */
public class MathTest {
	public static void main(String[] args) {
		// 그동안 반올림 하느라 고생하셨어요..
		
		double d = 25.143636;
		
		// 반올림
		System.out.println(round(d*1000)/1000f);
		
		// 올림
		System.out.println(ceil(d));
		
		// 버림
		System.out.println(floor(d));
		
		// 제곱
		int a = 16;
		System.out.println(pow(a,1/4f));
		
		// 제곱근(루트)
		int b = 16;
		System.out.println(sqrt(b));
		
		// 두점 사이의 거리를 구하세요(12,17) (27,33)
		// 두점 사이의 거리를 소수점 셋째자리에서 반올림하여 둘째자리 까지 표현하세요
		// pow, sqrt, ceil
		System.out.println(sqrt(pow(27-12,2) + pow(33-17,2)));
	}
}
