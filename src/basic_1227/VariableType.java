package basic_1227;
/**
 * 변수 타입을 공부하기 위한 클래스
 * 형변환, String클래스
 * @author PC17
 *
 */
public class VariableType {
	public static void main(String[] args) {
		/*
		 * 1. 변수의 타입
		 *  - 기본형 타입(primitive type) 8가지 : 값을 저장한다
		 *  	boolean, char, byte, short, int, long, float, double
		 *  - 참조형 타입(reference type) : 주소를 저장한다
		 *  	기본형 8가지를 제외한 모든 타입
		 *  
		 *  
		 * 기본형 타입
		 * 1. 종류
		 * - 논리형 : boolean //true, false 중 하나의 값을 가지며 조건식과 논리적 계산에 사용된다.
		 * - 문자형 : char //문자를 저장하는데 사용되며 변수당 단 하나의 문자만을 저장할 수 있다.
		 * - 정수형 : byte, short, int, long //정수값을 저장하는데 사용된다.
		 * - 실수형 : float, double //실수값을 저장하는데 사용된다.
		 *  
		 * 2. 기본형 변수의 크기
		 * - 1byte : boolean, byte
		 * - 2byte : char, short
		 * - 4byte : int, float
		 * - 8byte : long, double
		 * 		1	2	4	8
		 * 논리 boolean
		 * 문자		char
		 * 정수byte short int long
		 * 실수			float	double
		 * 
		 * 
		 * 3. 논리형 - boolean(기본값 false)
		 * - boolean형 변수에는 true 와 false 중 하나를 저장할수 있다.
		 * - boolean형 변수는 대답(yes,no), 스위치 등의 논리구현에 사용된다.
		 * - 데이터를 다루는 최소단위가 1byte 이므로 1byte형을 가진다.
		 */
		boolean power = true;
		
		/*
		 * 4. 문자형 - char(기본값 ' ')
		 * - 문자형에는 char 한가지 밖에 없다.
		 * - 무조건 한글자가 들어가야한다.
		 * - java는 Unicode문자 체계(16진수)를 가지고 있기 때문에 2byte의 크기를 가진다.
		 */
		 char ch1 = 'A';
		 char ch2 = '\u0041'; //65 역슬래쉬u는 유니코드를 뜻함 + 0041 == 16진수로 41 == 10진수로 65
		 
		 /*
		  * 5. 정수형 - byte, short, int, long
		  * - 기본 자료형은 int이다.
		  * - 변수에 저장하려는 정수값의 범위에 따라 4개의 정수형 중에 하나를 선택하면 된다.
		  * - byte나 short의 경우 표현범위가 작아서 범위를 넘어서는 경우가 많다.
		  * - JVM의 피연산자의 스택이 피연산자를 4byte 단위로 저장을 하기 때문에 
		  * 	4byte보다 작은 자료형의 값을 계산시 4byte형으로 변환하여 수행되기 때문에 
		  * 	int형을 사용하는 것이 좋다.
		  */
		 byte b = 126;
		 short s = 249;
		 int i = 220000000;
		 long l = 1231231233123L;// 4byte보다 큰 숫자를 저장할경우 뒤에 L 을 써줌
		 
		 System.out.println(b);// 126
		 System.out.println(++b);// 127
		 System.out.println(++b);// -128 최소값으로 돌아감
		/* 
		 * 오버플로우(overflow)
		 * 자신이 표현할수 있는 범위를 넘어 섰을때 최소값부터 다시 표현하는 
		 * 현상을 오버플로우 라고 한다.
		 */
		 
		 /*
		  * 6. 실수형 - float, double
		  * - 기본 자료형읜 double이다.
		  * - 실수형에는 float, double 두가지가 있으며 실수를 저장하는데 사용한다.
		  * - float : 1 + 8 + 23
		  * - double : 1 + 11 + 52
		  * - 실수형은 사용할 자료형을 선택할때 값의 범위뿐만 아니라 
		  * 	정밀도도 중요한 요소가 된다.
		  */
		 float f = 3.141592123123f;// float은 뒤에 f를 붙여줌 long과 같은거임
		 double d = 2.1123123123132;// double은 실수의 기본형이기 때문에 그냥 쓰기
		 
		 /*
		  * 7. 형변환(casting) - 기본형 끼리만 가능!
		  * - 변수 또는 리터럴(값)의 타입을 다른 타입으로 변환하는 것.
		  * - (바꾸고 싶은 변수타입)변수명
		  * 
		  * 형변환 연산자가 없어도 화살표 방향으로 형변환 가능함
		  * byte -> short -> int -> long -> float -> double
		  *			 char -> int
		  */
		 byte b3 = 50;
		 int i2 = b3;// byte --> int 로 캐스팅 함// 캐스팅연산자 : ()
		 
		 short s2 = (short)i2;
		 
		 
		 int i3 = 50;
		 int i4 = 100;
		 long l3 = 500L;
		 byte b4 = 15;
		 short s4 = 60;
		 
		 
		 int i5 = i3 + i4;
		 long l4 = i3 + l3;
		 int i6 = b4 + s4;// 4byte 보다 작은 놈들끼리 연산을 할 때 
		 				//JVM에서 각각 4byte로 바꾸어서 계산하기 때문에 4byte 정수형인 int로 받아야 한다.
		 long i7 = b4 + l3;// 4byte 보다 큰 게 하나라도 있을 때 
		 				//그 중 제일 큰 것을 선택하여 받는다.
		 
		 char c1 = 'A';// 65
		 char c2 = 'D';// 68
		 
		 int c3 = c2 - c1;// char는 int로 바꾸어서 연산된다.
		 System.out.println(c3);// 3
		 System.out.println(c1 - c2);// -3
		 
		 
		 /*
		  * 8. String 문자열 (참조형)
		 	- char형 변수는 단 하나의 문자 밖에 저장할 수 없기 때문에
		 	여러문자를 저장하기 위해서는 String클래스를 사용해야 한다.
		 	무조건 참조형의 기본값은 null 이다. (주소가 없다)
		 	기본형 과 참조형 끼리의 연산은 불가하다.
		 	어떤 타입이든 String과 연산을 할 경우 다 String으로 받아줌!
		 */
		 String s7 = "";// 한글자도 없어도 오류가 안뜸
		 String s71 = null;// == String s71;
		 
		 String s8 = "sdfsdfsdfsdfsdf";// 문자열 길이의 제한이 없다.
		 System.out.println(156 + "123");// 156123
		 System.out.println(true + "123");// true123
		 
		
	}
}
