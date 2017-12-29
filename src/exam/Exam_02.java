package exam;

public class Exam_02 {
	public static void main(String[] args) {
		/*
			2-1
					1byte	2byte	4byte	8byte
		 	논리형	boolean
		 	문자형			char
		 	정수형	byte	short	int		long
		 	실수형					float	double
		 	
		 */
		/*
		 	2-2
		 	주민등록번호의 길이는 하이픈(-)을 제외하고 총 13자리로 이루어져있다.
		 	9,999,999,999,999 : int로는 표현 할 수 없다 그래서 long 을 사용한다.
		 */
		long regNo = 9999999999999L;
		
		/*
		 	2-3
		 	int i = 100;
			long l =100L;
			final float PI = 3.14f;
			- 리터럴 : 100, 100L, 3.14f --> 리터럴이란 값 자체를 의미한다.
			- 변수 : i, l --> 변수는 변경된 값을 언제든지 받을 수 있는 변수이다.
			- 키워드 : int, long, final, float --> 키워드는 예약어를 뜻하며 내가 변수 이름으로 사용할 수 없는 것들이다.
			- 상수 : PI --> final이 들어감으로써 변수가 아닌 상수이다.
		 */
		int i = 100;
		long l =100L;
		final float PI = 3.14f;
		
		/*
		 	2-4
		 	답 : b(Byte : 참조형 이다) --> byte(기본형의 정수형)가 올바른 표기이다.
		 	
		 	int : 기본형의 정수형
		 	double : 기본형의 실수형
		 	boolean : 기본형의 논리형
		 */
		
		/*
		 	2-5
		 	System.out.println(“1” + “2”) -> ( 12 ) : String으로 받아진다
			System.out.println(true + “”) -> ( true ) : String으로 받아진다
			System.out.println(‘A' + 'B') -> ( 65 + 66 ) -> ( 131 ) : char 형은 연산을 할 때 int 형으로 바뀌어서 계산된다
			System.out.println('1' + 2) -> ( 49 + 2 ) -> ( 51 ) : 유니코드 참조
			System.out.println('1' + '2') -> ( 49 + 50 ) -> ( 99 ) : 유니코드 참조
			System.out.println('J' + “ava”) -> ( Java ) : String이 제일 크기때문에 String으로 계산된다
			System.out.println(true + null) -> ( 컴파일 오류 ) : 기본형과 참조형간의 연산은 불가하다. 
		 */
		//null은 참조형의 주소가 없다는 뜻이다
		System.out.println("1" + "2");
		System.out.println(true + "");
		System.out.println('A' + 'B');
		System.out.println('1' + 2);
		System.out.println('1' + '2');
		System.out.println('J' + "ava");
		//System.out.println(true + null);
		/*
		 	2-6
		 	대소문자를 구분한다.
		 	답 : True, NULL, Class, System
		 	if, true, null, class 가 키워드이다.
		 	System 은 대문자로 시작하므로 class명 이다 
		 */
		
		/*
		 	2-7
		 	a. $ystem : 특수문자 $ 가능
			b. channel#5 : 특수문자 # 불가능
			c. 7eleven : 숫자로 시작 불가능
			d. If : if가 예약어이므로 가능
			e. 자바 : 한글 가능
			f. new : 예약어 불가능
			g. $MAX_NUM : 특수문자 $, _ 가능
			h. hello@com : 특수문자 @ 불가능
		 	
		 	답 : a, d, e, g
		 	
		 	특수문자는 '$','_' 만 사용할 수 있다.
		 	숫자로 시작할 수 없다.
		 	한글명도 가능하다. 다만 하지말자.
		 	대문자로 시작가능하다. 다만 소문자로 하자.
		 	전부 대문자도 가능하다. 다만 상수만 대문자로 하자
		 */
		
		/*
		 	2-8
		 	답 : int, float
		 	참조형 변수의 크기는 4byte이다.
		 	int와 float이 4byte이다.
		 */
		
		/*
		 	2-9
		 	byte b = 10;
			char ch = 'A';
			int i = 100;
			long l = 1000L;
			
			a. b = (byte)i;
			b. ch = (char)b;
			c. short s = (short)ch;
			d. float f = (float)l;
			e. i = (int)ch;
		 	
		 	답 : d, e
		 	
		 	자동 형변환 순서
		 	byte -> short -> int -> long -> float -> double
		 			char  -> int
		 */
		
		/*
		 	2-10
		 	char 타입은 2byte이다
		 	음수가 없다. 즉 0이 최소값이다.
		 	1byte 는 8bit 로 이루어져있다.
		 	char 타입은 즉 16bit 이다. 총 16칸을 가진다.
		 	1bit는 0과 1을 가진 2진수 이다.
		 	
		 	2의 0승 + 2의 1승 + ... +  2의 15승
		 	최대값을 구하기 위해서는 각 칸을 1로 다 채우고 더하면 된다.
		 	즉, 1 + 2 + 4 + ... + 2의 15승 이 최대값 이다.
		 	수학공식을 이용하면
		 	최대값은 2의 16승 - 1 인것을 알 수 있다.
		 	즉 정수값의 범위는 0 ~ (2의 16승 -1) 이다. 
		 */
		
		/*
		 	2-11
		 	a. byte b = 256;
			b. char c = '';
			c. char answer = 'no';
			d. float f = 3.14
			e. double d = 1.4e3f;
		 
		 	답 : a,b,c,d
		 	
		 	a : byte는 1byte의 크기를 가져서 -2의 7승 ~ (2의 7승 - 1)인 범위를 가진다.
		 		고로 (2의 7승 - 1) 은 127을 의미하므로 256으로 초기화 할 수 없다.
		 	b : char는 무조건 한개의 글자를 가지고 있어야 한다. '' -> ' ' 와 같이 공백을 넣어서라도 한개를 꼭 넣어야 한다.
		 	c : char는 무조건 한개이므로 'no'로 초기화 할 수 없다. 만약 no 를 초기화 하고 싶다면 String 클래스를 이용하여 초기화 한다.
		 		String s = "no"; 큰따옴표를 사용한다.
		 	d : float은 실수형이다. 리터럴뒤에 f를 붙혀서 사용해야한다. 그리고 ; 를 꼭 붙혀준다.
		 	e : double형은 실수형의 기본자료형이다. 그래서 리터럴 뒤에 f를 안붙혀도 된다. 하지만 double은 float보다 크므로 f를 붙인 float 형 리터럴도 받을 수 있다.
		 
		 */
		
		/*
		 	2-12
		 	
		 
		 
		 
		 
		 */
		
		
		/*
		 	2-13
		 	a. boolean - false
			b. char - '\u0000'
			c. float - 0.0 : 0.0f 가 맞다
			d. int - 0
			e. long - 0 : 0L 이 맞다
			f. String - "" : 참조형 변수이므로 null이 맞다
		 	
		 	답 : c, e, f
		 
		 
		 */
	}
}
