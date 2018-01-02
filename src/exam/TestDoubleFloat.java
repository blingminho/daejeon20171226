package exam;
/**
 * float double 형변환 및 비교연산자
 * (float) d == f : true
 * @author SangJun
 *
 */
public class TestDoubleFloat {
	public static void main(String[] args) {
		float f = 0.1f;
		double d = 0.1;
		long size = 10000000000000000L;
		//d *= size;
		//f *= size;
		System.out.println("d : "+ d);// 1.0E15
		System.out.println("f : "+ f);// 1.00000005E15
		
		// float이 더 정확도가 떨어진다
		System.out.println("d==f : " + (d==f));
		System.out.println("(float)d==f : " + ((float)d==f));
		System.out.println("d==(double)f : " + (d==(double)f));
		
		/*
		 * double d = 0.1 == 0.10000000100;
		 * (float)d => d == 0.10000000149 // 값이 변한다!
		 * 
		 * float f = 0.1f == 0.10000000149
		 * (double) f = 0.1000000014900000~
		 */
		
	}
}
