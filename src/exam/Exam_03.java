package exam;
/**
 * Java의 정석 3장 변수 연습문제
 * @author SangJun
 * 3-7번의 반올림 못품 : 배우면 풀기
 */
public class Exam_03 {
	public static void main(String[] args) {
		/*
			3-1
			int x = 2;
			int y = 5;
			char c = 'A'; // 'A'의 문자코드는 65
			
			System.out.println(1 + x << 33);
			// int는 4byte로 총 32비트로 이루어져 있다. 33칸을 왼쪽으로 shift연산을 하게 되면 33 = 32 + 1 칸이므로 오버플로우가 발생한다.
			// 산술연산자와 쉬프트연산자의 우선순위를 비교해보면 산술연산자가 더 높기 때문에 1 + x == 3을 왼쪽으로 33번 쉬프트한다.
			// 3은 11(2) 이므로 11(2)<<1 ==> 110(2) ==> 정답 : 6
			
			System.out.println(y >= 5 || x < 0 && x > 2);
			// 비교연산자와 논리연산자의 우선순위를 비교해보면 비교연산자가 더 높다.
			// y >= 5 : true // x < 0 : false // x > 2 : false
			// &&와 || 중 &&의 우선순위가 더 높다
			// x < 0 && x > 2 == false // true || false == true // 정답 : true
			
			System.out.println(y += 10 - x++);
			// y = y + 10 - x++
			// 후위증감연산자와 산술연산자의 우선순위를 비교해보면 산술연산자가 더 높다.
			// y = 5 + 10 - 2 = 13 // x = 3
			// 정답 : 13
			
			System.out.println(x+=2);
			// x = x + 2 // x = 3 + 2 ==5
			// 정답 : 5
			
			System.out.println( !('A' <= c && c <='Z') );
			// 비교연산자와 논리연산자의 우선순위를 비교해보면 비교연산자가 더 높다.
			// 'A' <= c : true // c <= 'Z' : true
			// true && true : true
			// !(true) : false // 정답 : false
			
			System.out.println('C'-c);
			// char자료형은 2byte 의 크기이기 때문에 연산을 할때 int로 바뀌어서 연산된다.
			// 'C' == 67 // 67 - 65 == 2
			// 정답 : 2
			
			System.out.println('5'-'0');
			// '5' 와 '0' 은 둘다 char자료형이다. 그러므로 연산할때 int로 바뀌어서 연산된다.
			// '0' == 48, '5' == 53
			// 53 - 48 == 5 // 정답 : 5
			
			System.out.println(c+1);
			// c는 char + 1은 int형 == int로 바꾸어서 연산
			// 65 + 1 == 66 // 정답 : 66
			
			System.out.println(++c);
			// ++c 는 c = c + 1이 된후 println이 진행된다 // c == 66
			// 중요한점 : 증감연산자는 단항연산자로 c = c + 1 과는 엄연히 다르다.
			// 				단항연산자로 혼자 증감하는 것이기 때문에 char형이 int로 바뀌어서 연산되는 것이 아니다!!!!!
			// 정답 : 'B'
			
			System.out.println(c++);
			// c++ 은 c가 println 된후 c = c + 1 이 진행된다 // print되고 c == 67
			// 정답 : 'B'
			
			System.out.println(c);
			// 위에서 66이었던 c가 후위증감연산자로 인해 67 이 되었다.
			// 정답 : 'C'
		 */
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		System.out.println(1 + x << 33);
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++);
		System.out.println(x+=2);
		System.out.println( !('A' <= c && c <='Z') );
		System.out.println('C'-c);
		System.out.println('5'-'0');
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c); 
		/*
			3-2
			int numOfApples = 123; // 사과의 개수
			int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
			int numOfBucket = ( (1) ); // 모든 사과를 담는데 필요한 바구니의 수
			System.out.println("필요한 바구니의 수 :"+numOfBucket);
			
			정답 : (numOfApples / sizeOfBucket) + (numOfApples % sizeOfBucket > 0 ? 1 : 0)
			풀이 : 123 인경우 12 + 1 개가 나와야하고
					120 인경우 12 개가 나와야 한다.
					바구니의 크기로 나누어 12를 구하고
					바구니의 크기로 나누고 남은 나머지가 하나라도 있을 경우 바구니 1을 더한다.
					만약 나머지가 없다면 추가하지 않아도 되기 때문에 0을 더한다
					조건이 true 인경우 +1, false 인경우 +0이므로 결과가 무조건 두개중 하나가 나올수 있는 삼항 연산자를 이용한다.
		 */
		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = ( (numOfApples / sizeOfBucket) + (numOfApples % sizeOfBucket > 0 ? 1 : 0) ); // 모든 사과를 담는데 필요한 바구니의 수
		System.out.println("필요한 바구니의 수 :"+numOfBucket);
		
		/*
			3-3
			int num3 = 10;
			System.out.println( (1) );
			
			정답 : num3 > 0 ? "양수" : ( num3 < 0 ? "음수" : "0" )
			풀이 : 삼항 연산자는 조건의 참 거짓에 따라 결과가 다르게 나온다
			먼저 양수인지 아닌지를 판단하고
			양수일 경우 "양수"
			양수가 아닐경우 한번 더 삼항 연산자를 이용하여 해당 수가 음수 인지 0인지를 판단한다
			양수가 아닌 수가 음수일 경우 "음수"
			양수가 아닌 수가 음수도 아닐 경우 "0" 을 출력한다
		 */
		int num3 = 10;
		System.out.println( num3 > 0 ? "양수" : ( num3 < 0 ? "음수" : "0" ) );
		
		/*
			3-4
			int num4 = 456;
			System.out.println( (1) );
			
			정답 : num4 - num4%100
			풀이 : 100미만의 자릿수를 버리는 방법은
					해당 수를 100으로 나누고 남은 나머지를
					해당 수에서 빼는 것이다.
		 */
		int num4 = 456;
		System.out.println( num4 - num4%100 );
		
		
		/*
			3-5
			int num5 = 333;
			System.out.println( (1) );
			
			정답 : num5 - num5%10 + 1
			풀이 : 1의 자릿수를 버리고 1을 더하면 
					모든 수의 1의 자리는 1이 될 수 있다.
					1의 자릿수를 버리는 방법은 10으로 나눈 나머지를
					해당 수에서 빼는 것이다.
		 */
		int num5 = 333;
		System.out.println( num5 - num5%10 + 1 );
		
		/*
			3-6
			int num6 = 24;
			System.out.println( (1) );
			
			정답 : 10 - num6 % 10 
			풀이 : 변수 num의 값보다 크면서 가장 가까운 10의 배수이므로
					변수가 24인경우 10으로 나누고 남은 나머지가 4일 것이다.
					그러므로 10 - (10으로 나누고 남은 나머지)를 할 경우
					10 - 4 == 6이 나온다
		 */
		int num6 = 24;
		System.out.println( 10 - num6 % 10  );
		
		/*
			3-7
			int fahrenheit = 100;
			float celcius = ( (1) );
			System.out.println("Fahrenheit:"+fahrenheit);
			System.out.println("Celcius:"+celcius);
			
			정답 : (int)(5f/9 * (fahrenheit - 32) * 100 + 0.5) / 100f
			풀이 : 변환공식이 C = 5/9 ×(F - 32) 이므로 그에 맞게 식을 세운다
					여기서 중요한것은 int형으로 이루어진 식이므로
					float형인 C에게 값을 float형으로 주기위해서 어느 하나라도 float형 리터럴이 있어야 한다.
					그래서 5를 5f로 바꿈으로써 계산 결과가 float형으로 반환된다. (5f/9 * (fahrenheit - 32))
		 			그래서 37.77778가 나오게 된다.
		 			이 결과의 소수점 셋째자리에서 반올림을 해야한다.
		 			그러므로 먼저 100을 곱하여 3777.778 이 되게하여 소수점 두자리였던 숫자가 소수점 위로 올라오게한다. (* 100)
		 			그 후 반올림을 위하여 0.5를 더한다. (+ 0.5)
		 			그러면 3778.278 이라는 결과가 나오게 되는데
		 			여기서 소수점 아래를 버리기 위해 int형으로 형변환 시켜준다. ((int)결과)
		 			그 결과 3778이 남게된다. (3778)
		 			/100f 을 하여 소수점이하도 나오게 한다. (37.78)
		 			
		 			이 식들을 위에서부터 정리해보면
		 			5/9 * (fahrenheit - 32)
		 			5f/9 * (fahrenheit - 32)
		 			5f/9 * (fahrenheit - 32) * 100
		 			5f/9 * (fahrenheit - 32) * 100 + 0.5
		 			(int)(5f/9 * (fahrenheit - 32) * 100 + 0.5)
		 			(int)(5f/9 * (fahrenheit - 32) * 100 + 0.5) / 100f
		 
		 */
		int fahrenheit = 100; 
		float celcius = (int)(5f/9 * (fahrenheit - 32) * 100 + 0.5) / 100f ;
		float celcius2 = 5f / 9 * (fahrenheit - 32) ;
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
		System.out.println("Celcius2:"+celcius2);
		
		/*
			3-8
			byte a = 10;
			byte b = 20;
			byte c = a + b;
			char ch = 'A';
			ch = ch + 2;
			float f = 3 / 2;
			long l = 3000 * 3000 * 3000;
			float f2 = 0.1f;
			double d = 0.1;
			boolean result = d==f2;
			System.out.println("c="+c);
			System.out.println("ch="+ch);
			System.out.println("f="+f);
			System.out.println("l="+l);
			System.out.println("result="+result);
			
			정답 : byte c = (byte)(a + b);
					ch = (char)(ch + 2);
					float f = 3 / 2f;
					long l = 3000 * 3000 * 3000L;
					boolean result = (float)d==f2;
			풀이 : 
				byte + byte 는 4byte보다 작은 크기를 가진 정수형 자료형이므로 int로 변환되어 연산된다.
					그러므로 연산된 결과값을 byte로 강제적형변환을 시켜줘야 한다.
				char형은 단항연산자인 증감연산자를 통하여 증감하는 것이 아닌 이항연산자를 통하여 연산이 될 경우 int로 변환되어 연산된다.
					그러므로 연산된 결과값을 char로 강제적형변환을 시켜줘야한다.
				float형은 리터럴 뒤에 f를 붙여줘야한다. 왜냐하면 실수형의 기본형은 double이기 때문이다.
					double형은 리터럴 뒤에 d를 안붙혀줘도 double로 인식한다.
					float의 리터럴뒤에 f를 붙여줌으로써 float형 변수는 리터럴이 float형인 것을 알게되어 실수형 연산을 할 수 있다.
				long형은 정수형의 최대크기인 8byte크기를 가진다. 정수형의 기본형은 int형으로 int형 리터럴에는 붙여주는 알파벳이 없다.
					byte와 short는 각각 1byte, 2byte 크기를 가진다. 둘은 연산이 될 때 int형으로 변환되므로 리터럴 뒤에 붙여주는 알파벳이 필요없다.
					long형은 리터럴뒤에 L을 붙혀줌으로써 해당 리터럴이 long형인 것을 알고 연산을 할 때 long형에 맞게 연산을 진행한다.
				boolean형의 결과값은 true 또는 false 를 가진다.
					비교연산자인 == 은 좌항과 우항이 같을경우 true, 다를경우 false가 결과값이 된다.
					double형의 0.1은 float의 0.1과 다르다.
					double형의 0.1 == 0.999998 와 같이 근사치를 표현한다.
					float형의 0.1 == 0.1 와 같이 근사치가 아닌 정확한 수를 가진다.
					그러므로 double형을 float형으로 강제적형변환을 할 경우 0.999998은 0.1로 바뀌어 float의 0.1과 같아 true가 나온다.
					단, 2^(-n)의 리터럴을 갖는 double형과 float형은 서로 같다. 이유는 계산방식이 2^(-n)일 때마다 같기 때문이다.
					
					만약, d == (double)f2 를 비교할경우 결과는 false가 나온다.
					왜냐하면 double d = 0.999998을 가리키는 반면
					(double)float f2 = 0.1 이라는 정확한 값을 가리키기 때문이다
		 */
		byte a = 10;
		byte b = 20;
		byte c1 = (byte)(a + b);
		char ch = 'A';
		ch = (char)(ch + 2);
		float f = 3 / 2f;
		long l = 3000 * 3000 * 3000L;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = (float)d==f2;
		boolean result2 = d==(double)f2;
		boolean result3 = d==f2;
		System.out.println("c="+c1);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);// true
		System.out.println("result2="+result2);// false
		System.out.println("result3="+result3);// false
		
		double d1 = 0.1;
		double d2 = (0.1*10)/10;
		System.out.println("result4="+ (d1==d2));// true
		
		/*
			3-9
			char ch1 = 'z';
			boolean b1 = ( (1) );
			System.out.println(b);
			
			정답 : ('a'<= ch1 && ch1 <='z') || ('A'<=ch1 && ch1 <='Z') || ('0'<=ch1 && ch1 <='9')
		 	풀이 : 문자형 변수 ch1이
		 			대문자 범위안에 있거나
		 			또는 소문자 범위안에 있거나
		 			또는 숫자 범위안에 있으면 true이다.
		 			대문자 범위는 'A'<= ch1 <= 'Z' 로 표현할 수 없기 때문에
		 			두개로 나누어서 비교한다. 'A'<= ch1 && ch1 <= 'Z'로 나누어서 둘다 true일 경우만 true
		 			즉, 대문자 범위 안에 있어야 true이다.
		 			또는 소문자 범위안에 있어야 하므로
		 			"또는" 을 뜻하는 || (or연산자)를 이용하여 다른 항과 결합시킨다.
		 */
		char ch1 = 'z';
		boolean b1 = ('a'<= ch1 && ch1 <='z') || ('A'<=ch1 && ch1 <='Z') || ('0'<=ch1 && ch1 <='9');
		System.out.println(b1);
		
		/*
			3-10
			char ch2 = 'A';
			char lowerCase = ( (1) ) ? ( (2) ) : ch2;
			System.out.println("ch2:"+ch2);
			System.out.println("ch2 to lowerCase:"+lowerCase);
		 
		 	정답 : 'A' <= ch2 && ch2 <= 'Z'
		 			(char)(ch2+32)
		 	풀이 : 삼항연산자를 이용한 분류방법을 사용했다.
		 			대문자인경우 true, 소문자인경우 false를 이용하여
		 			false인 경우 입력한 문자가 그대로 나오게 만들었다.
		 			true인 경우 대문자를 소문자로 바꾸어줘야 하는데
		 			소문자는 대문자보다 32만큼 크다.
		 			그래서 해당 대문자 + 32를 해준다. 하지만 여기서 char형이 int형으로 바뀌게 되어 결과값이 int형으로 나온다.
		 			그러므로 결과값을 char으로 강제적형변환 해주어서 결과가 char형으로 나오게 한다.
		 */
		char ch2 = 'A';
		char lowerCase = ( 'A' <= ch2 && ch2 <= 'Z' ) ? ( (char)(ch2+32) ) : ch2;
		System.out.println("ch2:"+ch2);
		System.out.println("ch2 to lowerCase:"+lowerCase);
	}
}
