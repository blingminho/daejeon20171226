package basic_1228;
/**
 * 연산자
 * 증감, 부호, 비트전환, 논리부정, 산술( 사칙, 나머지, 쉬프트)
 * @author SangJun
 *
 */
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
		
		/*
		 * 2. 부호 연산자(+, -)
		 * - 부호 연산자는 피연산자의 부호를 변경하는 걸로 사용된다.
		 * - boolean, char 자료형에는 사용할 수 없다.
		 */
		
		/*
		 * 3. 비트전환 연산자( ~ : 틸트 --> 해당수의 1의 보수를 구함) -> 2진수
		 * - 정수형과 char형에만 사용할 수 있다.
		 * - 피연산자를 2진수로 표현했을때 0 은 1로 1은 0 으로 바꾼다
		 * 
		 * ~10 -> -11 -> -11 + 1 = -10 (총 2의 보수)
		 * ~-15 -> 14 -> 14 + 1 = 15 (틸트가 1의 보수 + 1의 보수 = 2의 보수)
		 * 
		 * 1의 보수는 진수를 바꾸었을때의 값 ( ~ )
		 * 10의 1의 보수가 -11
		 * 10의 2의 보수가 -10
		 * 
		 * ----최종----
		 * 10 = 00001010
		 * ~10 = 11110101 = -11 (10의 1의 보수)
		 * ~10 + 1 = 11110110 = -10 (10의 2의 보수)
		 * 
		 * 2진수는 2의 보수까지
		 * 7진수는 7의 보수까지
		 */
		byte b3 = 10;
		System.out.println(~b3);// -11
		
		/*
		 * 4. 논리부정 연산자(! : not)
		 * - boolean형에만 사용가능하다.
		 * - true -> false, fales -> true 
		 */
		boolean power = false;
		power = !power;
		System.out.println(power);// true
		power = !power;
		System.out.println(power);// false
		
		/*
		 * 5. 산술 연산자
		 * - 사칙연산자(+, -, *, /), 나머지 연산자( % ),  쉬프트연산자(<<, >>, >>>)
		 * 두개의 피연산자를 취하는 이항 연산자이다.
		 * - 이항 연산자의 피연산자의 크기가 4byte보다 작으면 4byte형인 int형으로 변환 후 연산을 수행한다.
		 * 
		 * 6. 사칙 연산자 (+, -, *, /)
		 * - int형 4byte 보다 크기가 작은 자료형은 int형으로 변환 후 연산한다.
		 *  : byte + char -> int + int
		 * - 두개의 피연사중 자료형의 범위가 큰 쪽에 맞춰서 변환후 연산한다.
		 *  : int + float -> float + float
		 * - 정수형간의 나눗셈에서 0으로 나누는 것은 금지되어 있다. 
		 */
		
		byte aa = 1;
		short bb = 129;
		int cc = aa + bb;
		
		byte cd = (byte)(aa + bb);
		
		/*
		 * 7. 나머지 연산자 ( % )
		 * - 왼쪽의 피연산자를 오른쪽의 피연산자로 나누고 난 나머지 값을 돌려주는 연산자.
		 * - boolean형을 제외하고 모든 기본형 변수에 사용할수 있다.
		 * - 짝수 홀수에 많이 쓰임
		 */
		
		int a = 10;
		int b = 8;
		int share = a/b;// 1//int형이기 때문에 소수점이 안나옴
		int remain = a%b;// 2// 나머지 나옴
		double shared1 = (double)(a/b);// 1 // int형으로 다 계산하고 마지막에 double로 형변환 한 것이므로 1.0 이 나온다
		double shared2 = (double)a /b;// 1.25 //int형 a또는 b를 double형으로 바꾸고 연산한후 double형 shared2 변수로 받아준다
		System.out.println(shared1);
		System.out.println(shared2);
		//10을 8로 나누면 몫은 1이고 나머지는 2이다.
		System.out.println(a + "을 " + b + "로 나누면 몫은 " + share + "이고 나머지는 " + remain + "이다.");
		
		/*
		 * 8. 쉬프트연산자 ( <<, >>, >>>) - 2진수
		 * - 정수형 변수에만 사용가능하다. 
		 * - 은행에서 많이 쓰임 -> 연산속도가 빠르다
		 * - 피연산자의 각자리(2진수)를 오른쪽 또는 왼쪽으로 이동한다.
		 * - 곱셈과 나눗셈을 할 때 연산속도가 좋음으로 사용한다.
		 * - << : x<<n : x*2^n
		 * - >> : x>>n : x/2^n
		 */
		System.out.println(10<<3);// 80
		System.out.println(10<<35);// 80	10*2^35 == 10*2^3	35 == 32 + 3 == 3 오버플로우!
		
		/*
		 * 9. 비교연산자 - 대소비교, 등가비교
		 * - 두개의 변수 또는 리터럴을 비교하는데 사용되는 연산자
		 * - 주로 조건문과 반복문의 조건식에 사용되며
		 * 	 연산결과는 true또는 false이다.
		 * - 이항 연산자이다.
		 * 
		 */
		
		/*
		 * 10. 대소비교 연산자 ( <, >, <=, >=)
		 * - 기본형에서 boolean형을 제외한 나머지 자료형에 사용가능하다.
		 * - 참조형에서 사용 못함
		 */
		
		/*
		 * 11. 등가비교 연산자 ( ==, !=)
		 * - 모든 자료형에 사용이 가능하다.
		 * - 참조형의 경우에는 주소를 비교하게 된다.
		 * 
		 * 수식			|연산결과
		 * x>y			|x가 y보다 클때 true, 그외에는 false
		 * x<y			|x가 y보다 작을때 true, 그외에는 false
		 * x>=y			|x가 y보다 크거나 같을때 true, 그외에는 false
		 * x<=y			|x가 y보다 작거나 같을때 true, 그외에는 false
		 * x==y			|x와 y가 같을때 true, 그외에는 false
		 * x!=y			|x와 y가 다를때 true, 그외에는 false
		 */
		
		/*
		 * 		float	vs 	double
		 * 값	정확		근사
		 * 2^-n	둘이 같다
		 * 결론, float을 쓰자!
		 */
		
		/*
		 * 12. 비트연산자 ( &, |, ^)
		 * - 이진 비트 연산을 수행한다.
		 * - 실수형인 float, double 을 제외한 모든 기본형에 사용할수 있다.
		 * | (OR 연산) : 피연산자중 한쪽 값이 1이면 1이다.
		 * & (AND 연산) : 피연산자 양쪽 모두 값이 1이면 1이다.
		 * ^ (XOR 연산) : 피연산자의 값이 서로 다를때만 1이다.
		 * 3 & 5 = 1
		 * 3 | 5 = 7
		 * 3 ^ 5 = 6
		 */
		
		/*
		 * 13. 논리연산자 ( &&(AND결합), ||(OR결합))
		 * - 피연산자로 boolean형 또는 boolean형 값을 결과로 하는 조건식만 허용한다.
		 * - 조건식의 결합에 사용한다.
		 * - &&(AND 결합) : 둘다 true 일때 true
		 * - ||(OR 결합) : 둘중 하나만 true이면 true
		 */
		//영어 소문자 이면 true를 출력해주는 출력문을 만들겠습니다.
		char c = 'f';
		System.out.println('a'<=c && c<='z');
		
		//대문자 인지 판단
		System.out.println('A'<=c && c<='B');
		
		//영문자 인지 판단
		System.out.println(('a'<=c && c<='z') || ('A'<=c && c<='Z'));
		
		//숫자 인지 판단
		System.out.println('0'<=c && c<= '9');
		
		
		
		
		
	}
}
