package exam;
/**
 * 자바의 정석 4장 연습문제 풀이완료
 * @author SangJun
 *
 */
public class Exam_04 {
	public static void main(String[] args) {
		/* 4-1
		다음의 문장들을 조건식으로 표현하라.
		1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
		4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
		5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
		6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지
		않을 때 true인 조건식
		7. boolean형 변수 powerOn가 false일 때 true인 조건식
		8. 문자열 참조변수 str이 “yes”일 때 true인 조건식
		*/
		// 1번
		int x = 11;
		if(10 < x && x < 20) {
			System.out.println("1번 : " + true);
		}
		
		// 2번 : 문제를 잘 읽기
		// 탭 은 '\t'이나 '	'으로 표현가능하나 직관적인 '\t' 사용
		// (공백 이나 탭 일때) 의 부정
		// 공백 이나 탭 일때 => ch1 == ' ' || ch1 == '	'
		// 의 부정 => !(ch1 == ' ' || ch1 == '	')
		char ch1 = '\t';
		if(!(ch1 == '\t' || ch1 == ' ')) {
			System.out.println("2번 : " + true);
		}
		
		// 3번
		char ch2 = 'x';
		if(ch2 == 'x' || ch2 == 'X') {
			System.out.println("3번 : " + true);
		}
		
		// 4번
		char ch3 = '1';
		if('0' <= ch3 && ch3 <= '9') {
			System.out.println("4번 : " + true);
		}
		
		// 5번
		char ch4 = 'a';
		if('a' <= ch4 && ch4 <= 'z' || 'A' <= ch4 && ch4 <= 'Z' ){
			System.out.println("5번 : " + true);
		}
		
		// 6번
		int year = 400;
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("6번 : " + true);
		}
		
		// 7번
		boolean powerOn = false;
		if(powerOn == false) {
			System.out.println("7번 : " + true);
		}
		
		// 8번
		// 문자열 비교는 .equals("비교할 문자열" 또는 변수)
		String str = "yes";
		if( str.equals("yes")) {
			System.out.println("8번 : " + true);
		}
		
		
		/* 4-2 합과 식 다 출력
		1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		
		풀이 : 총합을 받아줄 변수 result2 선언 및 0으로 초기화
		1 부터 20까지의 정수를 매번 입력하는 것을 피하기위해 반복문 사용
		정수는 1부터 시작이므로 반복조건에 int i = 1 선언 및 초기화
		i <= 20 일 경우 반복, i를 반복이 될 때마다 1씩 증가 i++
		반복 횟수를 20회로 알고 있으므로 while문이 아닌 for문 사용 => for(int i = 1; i <= 20 ; i++) { }
		정수중에 2 또는 3의 배수가 아닌 수를 찾는 방법은 조건문 사용 => if(조건문) { }
		배수를 알기위해 나머지 연산자 사용 => %
		변수i가 2의 배수 또는 3의 배수인경우 => i % 2 == 0 || i % 3 == 0
		배수가 아닌 수 이므로 마지막에 not연산자 사용 => !(i % 2 == 0 || i % 3 == 0)
		=> if( !(i % 2 == 0 || i % 3 == 0)) { }
		if문에 걸리는 해당 횟수가 2또는 3의 배수가 아닐 경우의 정수이므로
		총합 변수 result2 에 더함
		*/
		int result2 = 0;
		for(int i = 1; i <= 20 ; i++) {
			if( !(i % 2 == 0 || i % 3 == 0)) {
				result2 += i;
			}
		}
		System.out.println("4-2의 결과 : " + result2);
		
		
		/* 4-3
		1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오
		풀이1 : 반복문 두개로 풀이
		결과를 받아줄 int result3 = 0 선언 및 초기화
		(1) , (1 2), (1 2 3), (1 2 3 4), ... , (1 2 3 ... 10)
		() 의 갯수 10개 => 바깥 반복문 10회
		(1)안의 갯수 1개 총 1회 => 안쪽반복문 1회
		(1 2)안의 갯수 2개 총 2회 => 안쪽반복문 2회
		...
		(1 2 3 ... 10)안의 갯수 10개 총 10회 => 안쪽반복문 10회
		즉, 안쪽 반복문의 횟수는 유동적이다.
		
		()이 나오는 횟수는 10번 => 바깥 반복문 총 10회 반복
		반복횟수를 알고 있으므로 for문 사용
		반복조건에 int i = 1 을 선언 및 초기화
		i가 반복 후 1씩 증가하도록 설정 -> i++
		10번 반복하도록 설정 -> i <= 10 일 경우 반복
		즉, 바깥 반복문의 횟수는 고정적이다.
		
		바깥 반복문의 요소를 이용하여 안쪽 반복문의 횟수를 유동적으로 변화시킨다!
		바깥 반복문의 요소인 i
		안쪽 반복문의 요소인 j
		
		안쪽 반복문의 반복횟수를 해당 i만큼 반복
		안쪽 반복문 안에 해당 j를 계속 더해줌으로써 결과값도출
		
		정답1 : 
		for(int i = 1 ; i <= 10 ; i++) {
			for(int j = 1; j <= i; j++) {
				result3 += j;
			}
		}
		*/
		int result3 = 0;
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.print("(");
			for(int j = 1; j <= i; j++) {
				result3 += j;
				System.out.print(j);
				if(i!=1 && j!=i){
					System.out.print("+");
				}
			}
			if(i==10){
				System.out.println(") = " + result3);
			}
			else{
				System.out.print(") + ");
			}
		}
		
		/*
		풀이2-1 : 반복문 하나로 풀이
		(1 + 2 + 3 + ... + 10) == 10*11/2 == 55
		1 + 2 + ... + n == n * (n+1) / 2
		1 = 1 * (1+1)/2 == 1
		1 + 2 = 2 * (2+1)/2 == 3
		
		정답2-1 :
		for(int i = 1 ; i <= 10 ; i++) {
			result3 += i * (i+1) / 2;
		}
		*/
		result3 = 0;
		for(int i = 1 ; i <= 10 ; i++) {
			result3 += i * (i+1) / 2;
		}
		System.out.println("result3 : " + result3);
		
		/*
		풀이2-2 : 반복문 하나로 풀이 식도 나오게함
		괄호안에 들어가는 식을 temp라는 문자열로 받아줌
		모든 식을 계속해서 더해주는 sumStr 문자열 선언
		괄호안에 들어가는 식의 합을 받아주는 tempInt 선언
		괄호끼리의 합을 더해가는 sumInt 선언
		
		조건문을 이용하여
		1일때는 괄호 없음
		10일때는 괄호닫고 "+"가 아닌 "="과 식의 결과값(sumInt) 추가
		
		
		정답2-1 :
		String sumStr = "";
		String temp = "";
		int sumInt=0;
		int tempInt=0;
		for(int i = 1 ; i < 11 ; i++){
			tempInt += i;
			sumInt += tempInt;
			if(i==1){
				temp += i;
				sumStr += temp + "+";
			}else if(i==10){
				temp += "+" + i;
				sumStr += "(" + temp + ")=" + sumInt;
			}else{
				temp += "+" + i;
				sumStr += "(" + temp + ")+";
			}
		}
		System.out.println(sumStr);
		*/
		String sumStr = "";
		String temp = "";
		int sumInt=0;
		int tempInt=0;
		for(int i = 1 ; i < 11 ; i++){
			tempInt += i;
			sumInt += tempInt;		
			if(i==1){
				temp += i;
				sumStr += temp + "+";
			}else if(i==10){
				temp += "+" + i;
				sumStr += "(" + temp + ")=" + sumInt;
			}else{
				temp += "+" + i;
				sumStr += "(" + temp + ")+";
			}
		}
		System.out.println(sumStr);
		
		// 풀이3
		int sum = 0;
		int total = 0;
		String sumS = "";
		String totalS = "";
		for (int i = 1; i < 11; i++) {	
			if(i!=1){
				totalS += "(";
			}
			for (int j = 1; j < i + 1; j++) {
				sum += j;
				if(j==1){
					sumS += j;	
				}else{
					sumS = sumS + "+" + j;
				}
			}
			totalS += sumS;
			if(i!=1 && i!=10){
				totalS += ")+";
			} else if(i==10){
				totalS += ")=";
			} else if(i==1){
				totalS += "+";
			}
			sumS = "";
			total += sum;
			sum = 0;
		}
		System.out.println(totalS + total);
		
		/* 4-4
		1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이
		100이상이 되는지 구하시오.
		
		풀이1 : 
		총합을 받아줄 변수 선언 및 초기화 -> int result4 = 0;
		반복횟수를 정확하게 모르기 때문에 while문을 이용한다
		반복조건으로 result4가 100이상이면 끝나게 한다 -> while(result4 < 100) { }
		1씩 증가할 변수 선언 및 초기화 -> int count1 = 0;
		count1은 반복될때 마다 1씩 증가해야 한다 -> count1++;
		짝수인 경우 음수, 홀수인 경우 양수 를 result4에 더한다
		짝수인 경우와 홀수인 경우를 위한 조건식 -> 삼항연산자 사용
		-> result4 += (count1 % 2 == 0) ? -count1 : count1;
		
		정답1 :
		int result4 = 0;
		int count1 = 0;
		while(result4 < 100) {
			count1++;
			result4 += (count1 % 2 == 0) ? -count1 : count1 ;
		}
		
		*/
		int result4 = 0;
		int count1 = 0;
		while(result4 < 100) {
			count1++;
			result4 += (count1 % 2 == 0) ? -count1 : count1 ;
		}
		System.out.println("4-4 count1 : " + count1);
		
		/*
		풀이2 :
		1 == 1
		1 - 2 == -1
		1 - 2 + 3 == 2 == 1 + 1
		1 - 2 + 3 - 4 == -2
		1 - 2 + 3 - 4 + 5 == 3 == 2 + 1
		1 - 2 + 3 - 4 + 5 -6 == -3
		
		반복횟수를 모르기 때문에 while문을 사용한다
		이처럼 홀수번째인 홀수를 더할때만 양수가 나온다. 즉, 음수가 나오는 짝수번째는 생각할 필요가 없다.
		홀수번째 식 마다 +1씩 result4값이 증가한다. -> if(count1 % 2 == 1) { result4++;}
		그러므로 홀수번째 마다 result4값을 증가시켜
		result4값이 100이 나올경우 반복을 종료한다. -> 반복조건 : while(result4 < 100) {}
		
		정답2 :
		while(result4 < 100) {
			count1++;
			if(count1 % 2 == 1) {
				result4++;
			}
		}
		*/
		result4 = 0;
		count1 = 0;
		while(result4 < 100) {
			count1++;
			if(count1 % 2 == 1) {
				result4++;
			}
		}
		System.out.println("4-4 count1 : " + count1);
		
		// 풀이3 구분자를 사용
		int gubun = 1;// 1 or -1
		result4 = 0;
		count1 = 1;
		while(result4 < 100){
			result4 += count1*gubun;
			count1++; 
			gubun *= -1;
		}
		
		/* 4-5 다음의 for문을 while문으로 변경하시오.
		public class Exercise4_5 {
			public static void main(String[] args) {
				for(int i=0; i<=10; i++) {
					for(int j=0; j<=i; j++)
						System.out.print("*");
					System.out.println();
				}
			} // end of main
		} // end of class
		
		풀이 :
		바깥 for문 10번 반복 (고정적 반복)
		안쪽 for문 i번째 에서 i번 반복 (유동적 반복)
		int i를 대신할 변수 선언 및 초기화 -> int countI = 0;
		int j를 대신할 변수 선언 및 초기화 -> int countJ = 0;
		바깥 for문의 int i는 한번만 0으로 초기화됨 -> while문 밖에 선언함 , while문 안에서 0으로 초기화X
		안쪽 for문의 int j는 바깥 for문의 반복문이 끝날때마다 0으로 초기화됨 -> while문 밖에 선언함 , 안쪽 while문 안에서 0으로 초기화
		
		countI는 바깥 while문의 반복문의 마지막에 증가시킴 -> countI++;
		countJ는 안쪽 while문의 반복문의 마지막에 증가시킴 -> countJ++;
		countJ는 바깥 while문의 반복문의 마지막에 0으로 초기화시킴 -> countJ = 0;
		
		
		
		정답 :
		while(countI <= 10) {
			while(countJ <= countI) {
				System.out.print("*");
				countJ++;
			}
			System.out.println();
			countI++;
			countJ = 0;
		}
		
		*/

		int countI = 0;
		int countJ = 0;
		
		while(countI <= 10) {
			while(countJ <= countI) {
				System.out.print("*");
				countJ++;
			}
			System.out.println();
			countJ = 0;
			countI++;
		}
		
		
		/* 4-6 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프
		로그램을 작성하시오.
		
		풀이 : 
		주사위의 범위 : 1 ~ 6
		같은 주사위를 2번 던진것이 아닌 각각 다른 주사위를 한번씩 던짐
		A주사위 B주사위
		1		5
		5		1
		은 다른 경우이다. 그래서 위의 경우 2가지의 경우의 수라고 할 수 있다.
		눈의 합이 6이 나와야 하므로 주사위에서 6은 제외한다. -> 반복조건 : a < 6
		
		A주사위를 기준으로 한다.
		A주사위의 눈금수를 1씩 증가시킨다. -> a++
		이때 B주사위의 눈금수는 6에서 A주사위의 눈금수를 뺀 것이다. -> b = 6 - a;	
		
		정답 : 
		int b = 0;
		for(int a = 1; a < 6; a++) {
			b = 6 - a;
			System.out.println("주사위 경우 "+ a +" : "+ a + "\t\t" + b);
		}
		*/
		int b = 0;
		for(int a = 1; a < 6; a++) {
			b = 6 - a;
			System.out.println("주사위 경우 "+ a +" : "+ a + "\t\t" + b);
		}
		
		
		
		
		/* 4-7
		Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는
		코드를 완성하라. (1)에 알맞은 코드를 넣으시오.
		
		class Exercise4_7 {
			public static void main(String[] args) {
				int value = ( (1) );
				System.out.println("value:"+value);
			}
		}
		
		풀이 : 
		Math.random()은 0(포함)에서 1(미포함)까지의 실수값을 주는 메서드이다.
		1부터 6사이는 총 6개의 경우가 있으므로 *6 을 해준다.
		그러면 0(포함) ~ 6(미포함)인 실수가 된다.
		여기에 1부터 시작하기 위해 +1 을 해준다.
		그러면 1(포함) ~ 7(미포함)인 실수가 된다.
		여기에 int로 형변환을 시켜준다.
		그러면 6.90909 -> 6 이 되어
		1, 2, 3, 4, 5, 6이라는 정수값만 랜덤하게 나오게된다.
		
		정답 : 
		int value = (int)(Math.random()*6 + 1);
		System.out.println("value:"+value);
		*/
		
		int value = (int)(Math.random()*6 + 1);
		System.out.println("value:"+value);
		
		/* 4-8
		방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는
		0<=x<=10, 0<=y<=10 이다.
		
		풀이 : 
		먼저 x와 y는 정수이다 -> int x, int y
		x의 범위는 0<=x<=10 이다 -> 0 <= x && x <= 10
		y의 범위는 0<=y<=10 이다 -> 0 <= y && y <= 10
		y가 0일경우 방정식의 해로 들어갈 수 있는 x의 범위는 0<=x<=5 이다 -> x의 최대값은 5이다 -> x가 5가 될 때까지만 반복한다.
		-> 반복조건 : x <= 5		
		x가 0일경우 방정식의 해로 들어갈 수 있는 y의 범위는 0<=x<=2 이다 -> y의 최대값은 2이다 -> y가 2가 될 때까지만 반복한다.
		-> 반복조건 : y <= 2
		
		x의 값에 따라서 y에 들어가는 값이 달라진다.
		그러므로 x의 값을 반복문을 통해 1씩 증가시키면서 y의 해가 될 수 있는 y를 찾는다.
		y를 찾기 위해서는 y도 반복문을 통해 1씩 증가시키면서 y의 해를 찾는다.
		
		정답 : 
		for(int x1 = 0; x1 <= 5; x1++) {
			for(int y1 = 0; y1 <= 2; y1++) {
				if(2*x1 + 4*y1 == 10) {
					System.out.println("x=" + x1 + ", y=" + y1);
				}
			}
		}

		*/
		for(int x1 = 0; x1 <= 5; x1++) {
			for(int y1 = 0; y1 <= 2; y1++) {
				if(2*x1 + 4*y1 == 10) {
					System.out.println("x=" + x1 + ", y=" + y1);
				}
			}
		}
		
		
		/* 4-9
		숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코
		드를 완성하라. 만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되
		어야 한다. (1)에 알맞은 코드를 넣으시오.
		[Hint] String클래스의 charAt(int i)을 사용
		
		class Exercise4_9 {
			public static void main(String[] args) {
				String str = "12345";
				int sum = 0;
				for(int i=0; i < str.length(); i++) {
					(1) 알맞은 코드를 넣어 완성하시오.
				}
				System.out.println("sum="+sum);
			}
		}
		
		풀이 :
		str.length() 는 해당 문자열의 길이를 뜻한다.
		str.charAt(int i)는 i번째에 해당하는 문자 하나를 char형으로 반환한다.
		여기서 주의할 점은 문자열의 첫번째 글자는 0번째이다. 즉, 0번부터 시작한다.
		반복문을 통해 문자열의 i번째 글자 하나만을 고른다 -> str1.charAt(i)
		그리고 char형인 '1'을 int형 1로 바꾸기 위해 int로 강제적형변환을 시킨다.
		여기서 주의할 점은 '1'을 int형으로 바꿀경우 49가 반환될 것이다.
		그러므로 '0'을 빼줌으로써 '1'을 실제 1로 바뀐다.
		마지막으로 최종계산값에 sum에 계속해서 더해준다.
		
		정답 :
		sum += (int)(str1.charAt(i)-'0');
		
		*/
		String str1 = "12345";
		sum = 0;
		for(int i=0; i < str1.length(); i++) {
			sum += str1.charAt(i)-'0';// char끼리의 연산을 통해 int형으로 바뀌고 연산됨 -> 결과도 int형으로 나온다
		}
		System.out.println("sum="+sum);
		
		/* 4-10
		int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를
		완성하라. 만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라. (1)
		에 알맞은 코드를 넣으시오.
		[주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.
		
		class Exercise4_10 {
			public static void main(String[] args) {
				int num = 12345;
				int sum = 0;
				(1) 알맞은 코드를 넣어 완성하시오.
				System.out.println("sum="+sum);
			}
		}
		
		풀이 : 
		1+2+3+4+5순서가 아닌 5+4+3+2+1순서가 더 좋다
		num을 10으로 나눈 나머지는 항상 일의 자리이다.
		그리고 해당 num을 10으로 나누어서 5자리가 4자리가 되게한다.
		그리고 또 10으로 나눈 나머지를 구하여 처음 num의 10의 자리수가 나오게 한다.
		계속 반복!
		정답 :
		while(num > 0) {
			sum1 += num % 10;
			num /= 10;
		}
		
		*/
		
		int num = 12345;
		int sum1 = 0;
		while(num > 0) {
			sum1 += num % 10;
			num /= 10;
		}
		System.out.println("sum1="+sum1);
		
		
		/* 4-11
		피보나치(Fibonnaci) 수열(數列)은 앞을 두 수를 더해서 다음 수를 만들어 나가
		는 수열이다. 예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는
		1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21,... 과 같은 식으로 진행된다. 1과 1부터
		시작하는 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오.
		
		public class Exercise4_11 {
			public static void main(String[] args) {
				// Fibonnaci 수열의 시작의 첫 두 숫자를 1, 1로 한다.
				int num1 = 1;
				int num2 = 1;	
				int num3 = 0; // 세번째 값
				System.out.print(num1+","+num2);
				for (int i = 0 ; i < 8 ; i++ ) {
					(1) 알맞은 코드를 넣어 완성하시오.
				}
			} // end of main
		} // end of class
		
		풀이 : 
		피보나치 수열은 앞의 두 수를 더해서 ( num1 + num2)
		다음 수를 만드는 수열이다. ( num3 = num1 + num2 )
		for문이 8번 반복됨으로 10번째 수까지 계산할 수 있도록 되어있다.
		반복문 안에
		먼저 다음 수를 만드는 공식을 이용한다 -> num3 = num1 + num2;
		이 공식을 다음 번 반복에도 이용하기 위해서는
		다음번에 num3 = num1 + num2 에 들어가는 num1과 num2를 땡겨서 주어야 한다.
		그러므로 num1은 num2를 받고 -> num1 = num2;
		num2 는 num3을 받음으로써 -> num2 = num3;
		진행될 수 있다.
		
		정답 : 
		num3 = num1 + num2;
		num1 = num2;
		num2 = num3;
		System.out.print(","+num3);
		*/
		
		int num1 = 1;
		int num2 = 1;	
		int num3 = 0; // 세번째 값
		System.out.print(num1+","+num2);
		for (int i = 0 ; i < 8 ; i++ ) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.print(","+num3);
		}
		System.out.println("");
		/* 4-12
		구구단의 일부분을 다음과 같이 출력하시오.
		2*1=2 3*1=3 4*1=4
		2*2=4 3*2=6 4*2=8
		2*3=6 3*3=9 4*3=12
		
		5*1=5 6*1=6 7*1=7
		5*2=10 6*2=12 7*2=14
		5*3=15 6*3=18 7*3=21
		
		8*1=8 9*1=9
		8*2=16 9*2=18
		8*3=24 9*3=27
		
		풀이 : 
		왼쪽의 수를 k, 오른쪽의 수를 j로 생각해본다.
		이 경우 k의 범위는 2,3,4 // 5,6,7 // 8,9 까지의 정수이다. -> for(int k = 2 + m ; k <= 4 + m; k++) { }
		이 경우 j의 범위는 1 ~ 3 까지의 정수이다. -> for(int j = 1 ; j <= 3 ; j++) { }
		k는 가로로 1씩 증가한다. j는 세로로 1씩 증가한다. -> 그러므로 바깥 반복문은 j를 쓰는 반복문이 된다., j반복문보다 안쪽반복문은 k반복문이 된다.
		그리고 2, 3, 4 단이 끝난후 줄내림, 5, 6, 7 단이 끝난후 줄내림이 있다. -> \n
		2 단과 3단 그리고 4단 사이에는 일정한 간격의 공백이 있다 -> \t
		
		겉으로 봤을때 규칙은
		2,3,4 단은 k반복문에 의하여 생긴다
		줄내림
		또한 5,6,7 단도 k반복문에 의하여 생긴다
		줄내림
		그리고 8,9 단도 k반복문에 의하여 생긴다
		
		그러므로 반복문을 제일 바깥에 하나 더 설정하여 k반복문의 k 조건을 바꾸어준다.
		제일 바깥 반복문은 변수 i를 이용한다.
		k반복문 + 줄내림 을 i반복문의 수행문으로 생각한다. 총 3번 진행된다 -> for( int i = 0 ; i < 3 ; i++ ) { }
		변수 m에 의해 k의 초기값과 최대값을 유동적으로 변경한다. -> for(int k = 2 + m ; k <= 4 + m ; k++) { }
		m은 j반복문이 끝났을때 3씩 증가시킨다.
		
		
		정답 : 
		
		
		*/
		System.out.println(" 4 - 12 ");
		int m = 0;
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 1 ; j <= 3 ; j++) {
				for(int k = 2 + m ; k <= 4 + m; k++) {
					System.out.print(k + "*" + j + "=" + k*j + "\t");
					if(k==9) {
						break;
					}
				}
				System.out.println("");
			}
			m += 3;
			System.out.println("");
		}
		
		
		
		/* 4-13
		다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다. (1)에 알맞
		은 코드를 넣어서 프로그램을 완성하시오.
		
		class Exercise4_13{
			public static void main(String[] args){
				String value = "12o34";
				char ch = ' ';
				boolean isNumber = true;
				// 반복문과 charAt(int i)를 이용해서 문자열의 문자를
				// 하나씩 읽어서 검사한다.
				for(int i=0; i < value.length() ;i++) {
					(1) 알맞은 코드를 넣어 완성하시오.
				}
				if (isNumber) {
					System.out.println(value+"는 숫자입니다.");
				} else {
					System.out.println(value+"는 숫자가 아닙니다.");
				}
			} // end of main
		} // end of class
		
		풀이 : 
		value.charAt(int i)는 해당 i번째 글자를 char형으로 받아오는 메서드이다.
		for문의 반복조건은 int i = 0; i < value.length(); i++ 인데
		문자열의 번호는 0부터 시작이므로 int i를 0으로 초기화한다.
		value.length()는 해당 문자열의 길이를 뜻한다.
		i < value.length()와 i++를 사용함으로써 문자열의 마지막 글자까지 고를 수 있다.
		
		i번째에 해당하는 글자를 가져와서 조건문을 통해 하나라도 숫자가 아닐경우 -> if(!숫자인경우)
		isNumber = false; 로 초기화 한다. 그 후 반복문을 나간다.(반복할 필요가 없기 때문에)
		
		if(!숫자인경우) -> if(!('0' <= value.charAt(i) <= '9'))
		-> if(!('0' <= value.charAt(i) && value.charAt(i) <= '9')) { isNumber = false; }
		
		
		정답 : 
		if(!('0'<= value1.charAt(i) && value1.charAt(i) <= '9')) {
				isNumber = false;
		}
		
		*/
		String value1 = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		// 반복문과 charAt(int i)를 이용해서 문자열의 문자를
		// 하나씩 읽어서 검사한다.
		for(int i=0; i < value1.length() ;i++) {
			if(!('0'<= value1.charAt(i) && value1.charAt(i) <= '9')) {
				isNumber = false;
				break;
			}
		}
		if (isNumber) {
			System.out.println(value1+"는 숫자입니다.");
		} else {
			System.out.println(value1+"는 숫자가 아닙니다.");
		}
		
		 /* 4-14
		class Exercise4_14{
			public static void main(String[] args){
				// 1~100사이의 임의의 값을 얻어서 answer에 저장한다.
				int answer =  (1) ;
				int input = 0; // 사용자입력을 저장할 공간
				int count = 0; // 시도횟수를 세기위한 변수
				// 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
				java.util.Scanner s = new java.util.Scanner(System.in);
				do {
					count++;
					System.out.print("1과 100사이의 값을 입력하세요 :");
					input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.
					(2) 알맞은 코드를 넣어 완성하시오.
				} while(true); // 무한반복문
			} // end of main
		} // end of class HighLow
		
		풀이 : 
		do while 문은 한번은 무조건 실행하고 그 후 반복조건을 확인하여 반복여부를 결정한다.
		문제에는 while(true) 가 들어감으로써 무한 반복을 확인할 수 있다.
		그렇기때문에 반복문을 나갈수 있는 break 문을 사용해야한다.
		
		int answer 는 1~100까지의 정수 중 하나의 랜덤한 값이다.
		그렇기에 랜덤한 값을 만들어주는 Math class의 random()메서드를 이용한다.
		Math.random() == 0(포함) ~ 1(미포함) 실수를 의미한다.
		100개의 경우가 필요하기 때문에 * 100을 한다. -> Math.random()*100
		1부터 시작하기 위해 +1을 해준다 -> Math.random()*100 + 1
		실수형을 정수형으로 바꾸기 위해 int형으로 강제형변환 시킨다.
		-> int answer = (int)(Math.random()*100 + 1);
		
		숫자를 넣었을 때 나오는 경우는 총 3가지이다.
		answer보다 큰 수일경우
		answer보다 작은 수일경우
		answer와 일치하는 수일경우
		
		경우를 나누기 위해 조건문 if 를 사용한다.
		경우가 3가지이기 때문에
		if() {
		} else if() {
		} else {
		}
		를 사용한다.
		
		먼저 일치하는 경우 -> "맞췄습니다." 출력, "시도횟수는 ?번입니다." 출력, 반복문 탈출 
		if(answer == input) {
			System.out.println("맞췄습니다.");
			System.out.println("시도횟수는 " + count +"번입니다.");
			break;// 반복문 탈출
		}
		
		더 큰 수를 입력했을 경우 -> "더 작은 수를 입력하세요." 출력, 반복문 유지
		else if(input > answer) {
			System.out.println("더 작은 수를 입력하세요.");
		}
		더 작은 수를 입력했을 경우 -> "더 큰 수를 입력하세요." 출력, 반복문 유지
		else {
			System.out.println("더 큰 수를 입력하세요.");
		}
		
		
		
		정답 : 
			int answer = (int)(Math.random()*100 + 1);
			
			if(input == answer) {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 " + count +"번입니다.");
				break;
			} else if(input > answer) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
				System.out.println("더 큰 수를 입력하세요.");
			}
		
		
		
		
		*/
		
		int answer = (int)(Math.random()*100 + 1);
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0; // 시도횟수를 세기위한 변수
		// 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
		java.util.Scanner s = new java.util.Scanner(System.in);
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 :");
			input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.
			
			if(input == answer) {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 " + count +"번입니다.");
				break;
			} else if(input > answer) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
				System.out.println("더 큰 수를 입력하세요.");
			}
		} while(true);
		
		
		
		/* 4-15 문자도 가능하게!
		
		class Exercise4_15{
			public static void main(String[] args){
				int number = 12321;
				int tmp = number;
				int result =0; // 변수 number를 거꾸로 변환해서 담을 변수
				while(tmp !=0) {
					(1) 알맞은 코드를 넣어 완성하시오.
				}
				if(number == result)
					System.out.println( number + "는 회문수 입니다.");
				else
					System.out.println( number + "는 회문수가 아닙니다.");
			} // main
		}
		
		풀이 : 
		반복문의 반복조건이 tmp != 0 으로 tmp가 0이 아니면 계속해서 반복한다
		그러므로 tmp를 줄여서 0으로 만들어 주는 식이 반복문 안에 있어야 한다.
		
		tmp = number 로 초기화 되어있다. 여기서 tmp는 int형이다
		회문이란
		tmp의 1의 자리수가 result의 10000의 자리수
		tmp의 10의 자리수가 result의 1000의 자리수
		tmp의 100의 자리수가 result의 100의 자리수
		tmp의 1000의 자리수가 result의 10의 자리수
		tmp의 10000의 자리수가 result의 1의 자리수
		인데 나머지연산자를 이용하여 해당 tmp의 일의 자리수를 가져올 수 있다.
		
		1회차에 tmp의 1의 자리수는 result의 1의 자리로 가야한다.
		
		2회차에 tmp의 10의 자리수는 result의 1의 자리로 가야한다.
		그리고 기존의 result의 1의 자리에 있던 수는 10의 자리로 가야한다.		
		
		3회차에 tmp의 100의 자리수는 result의 1의 자리로 가야한다.
		그리고 기존의 result의 1의 자리에 있던 수는 10의 자리로 가야한다.
		그리고 기존의 result의 10의 자리에 있던 수는 100의 자리로 가야한다.
		
		이처럼 tmp에서 가져온 수는 무조건 먼저 result의 1의 자리로 간다. -> result = result + tmp에서 가져온수
		그리고 가져옴과 동시에 기존에 있던 수는 왼쪽으로 한칸씩 이동한다. -> result = result*10 + tmp에서 가져온수;
		그리고 다음 tmp의 ?자리수를 가져오기보다는 1의 자리를 가져오면서  -> result = result*10 + tmp%10;
		while문을 빠져나가기 위해 0으로 줄어들게 만든다. -> tmp /= 10;
		
		정답 : 
		result = result * 10 + tmp % 10;
		tmp /= 10;
		
		*/
		
		int number = 12321;
		int tmp = number;
		int result =0; // 변수 number를 거꾸로 변환해서 담을 변수
		while(tmp !=0) {
			result = result * 10 + tmp % 10;
			tmp /= 10;
		}
		if(number == result){
			System.out.println( number + "는 회문수 입니다.");			
		}
		else{
			System.out.println( number + "는 회문수가 아닙니다.");			
		}
		
		// 4-15 문자회문
		/*
		풀이 : 
		문자열을 반으로 나누어 왼쪽과 오른쪽을 비교한다 => for문의 끝나는 조건을 문자열 길이의 절반만큼만 반복
		반복문을 이용하여 charAt(i)를 사용한다 => 횟수를 알고 있으므로 for문
		왼쪽의 첫글자와 오른쪽의 끝글자를 비교한다
		index를 증가시켜 왼쪽의 두번째글자와 오른쪽의 끝에서 두번째 글자를 비교한다
		inputs.charAt(i) != inputs.charAt(length -i -1)		
		조건문을 이용하여 하나라도 같지않을경우 boolean형 key를 false로 변경후 break;
		key가 false일경우 "회문수가 아닙니다"를 출력
		key가 true일경우 "회문수가 맞습니다"를 출력
		
		정답 :
		String inputs = "abca";
		int tmpLength = inputs.length();
		boolean key = true;
		for(int i = 0; i < tmpLength/2 ; i++){
			if(inputs.charAt(i) != inputs.charAt(tmpLength-i-1)){
				key = false;
				break;
			}
		}
		if(key==true){
			System.out.println(inputs + "는 회문수가 맞습니다.");	
		}else{
			System.out.println(inputs + "는 회문수가 아닙니다.");	
		}
		 */
		String inputs = "abca";
		int tmpLength = inputs.length();
		boolean key = true;
		for(int i = 0; i < tmpLength/2 ; i++){
			if(inputs.charAt(i) != inputs.charAt(tmpLength-i-1)){
				key = false;
				break;
			}
		}
		if(key==true){
			System.out.println(inputs + "는 회문수가 맞습니다.");	
		}else{
			System.out.println(inputs + "는 회문수가 아닙니다.");	
		}
		
		
	}
}
