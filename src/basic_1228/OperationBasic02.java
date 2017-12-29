package basic_1228;

public class OperationBasic02 {
	public static void main(String[] args) {
		
		/*
		 * 1. 증감 연산자(++, --)
		 * - 증가연산자(++) : 피연산자의 값을 1 증가시킨다.
		 * - 감소연산자(--) : 피연산자의 값을 1 감소시킨다.
		 * 
		 */
		int i = 3;
		System.out.println(i);
		i++;
		System.out.println(i);
		
		int i2 = 10;
		int i3 = 0;
		i3 = i2++;
		System.out.println("i2 : " + i2);// ++i2 => i2 = 11, i3 = 11
		System.out.println("i3 : " + i3);// i2++ => i2 = 11, i3 = 10
		
		int i4 = 5;
		int i5 = ++i4 + ++i4 + i4++;
		// i4 = 8 // 5 -> 6 -> 7 -> 8
		// i5 = 6 + 7 + 7 = 20
		System.out.println("i4 : " + i4);
		System.out.println("i5 : " + i5);
		
		
		
		
	}
}
