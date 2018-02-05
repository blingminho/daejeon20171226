package basic_1330;
/**
 * java.lang 패키지<br>
 * Object클래스<br>
 * String클래스<br>
 * StringBuffer클래스와 StringBuilder클래스<br>
 * Math클래스<br>
 * wrapper클래스<br>
 * StringTokenizer 클래스<br>
 * @author SangJun
 *
 */
public class JavaLangBasic {
	/*
	 * 1. java.lang 패키지
	 * 	- java.lang 패키지는 자바프로그래밍의 기본이 되는 클래스들을 포함하고 있습니다.
	 * 	- ex) String, System...
	 * 
	 * 2. Object클래스
	 * 	- Object클래스는 멤버변수 없이 11개의 메서드만 가지고 있다.
	 * 	- equals(Object o)
	 * 		: 매개변수로 객체의 참조변수를 받아서 비교하여 그 결과를 boolean값으로 알려준다
	 * 		: 참조변수에 저장된 주소값이 같은지를 판단할수밖에 없다
	 * 		: 주소값이 아닌 멤버변수의 값을 비교하기 위해서는 equals메서드를 오버라이드 해야한다
	 * 		: equals메서드가 오버라이드 되어있는 클래스들
	 * 		ex) String, Date, File, wrapper 클래스들
	 * 	
	 * 	- hashcode() - 10진수
	 * 		: 객체의 주소값을 이용해서 해시코드를 만들어 반환한다
	 * 		: String클래스는 문자열의 내용이 같으면 동일 해시코드를 반환하게 만들어져 있다.(문자열의 내용이 같으면 주소가 같다)
	 * 
	 * 	- toString()
	 * 		: 인스턴스에 대한 정보를 문자열로 제공할 목적으로 작성
	 * 		: 기본 toString()
	 * 			return getClass().getName() +"@" + Integer.toHexString(hashCode());
	 * 
	 * 	- clone()
	 * 		: 얕은 복사
	 * 		: 자신을 복제하여 새로운 인스턴스를 생성한다 (주소가 다르다)
	 * 		: 단순히 인스턴스의 값만을 복사한다
	 * 		: 객체가 참조하고 있는 객체까지 복제하지 않는다
	 * 
	 * 	- getClass()
	 * 		: 자신이 속한 클래스의 Class객체를 반환하는 메서드
	 * 		: class의 객체를 얻는 방법
	 * 			클래스의 정보가 필요할 때 먼저 class객체에 대한 정보를 얻어와야 한다
	 * 			(1) Class obj = new Card().getClass();// 생성된 객체로부터 얻는 방법
	 * 			(2) Class obj = Card.class;// 클래스의 리터럴로부터 얻는 방법
	 * 			(3) Class obj = C
	 * 
	 * 3. String클래스
	 * 	- 다른 언어에서는 문자열을 char형의 배열로 다루었으나 자바에서는 문자열을 위한 클래스를 제공한다
	 * 		: 문자열을 합치게 될때 새로운 문자열을 가진 String인스턴스가 생성된다
	 * 		: 문자열을 결합하는 작업이 많이 필요한 경우 StringBuffer클래스를 사용하는 것이 좋다
	 * 
	 * 	- 문자열의 비교
	 * 		: 문자열 리터럴을 지정하는 방법과 String클래스의 생성자를 사용해서 만드는 방법이 있다
	 * 		: 문자열 리터럴은 클래스가 메모리에 로드될때 자동적으로 미리 생성된다
	 * 
	 * 	- String클래스의 생성자와 메서드
	 * 		: 자주 사용되는 것들만 실습
	 * 
	 *  - 문자인코딩 변환
	 *  	: 한글 윈도우의 경우 문자인코딩으로 CP949를 이용한다
	 *  	: eclipse에서는 문자 인코딩으로 MS949를 사용한다
	 *  	: 우리가 사용하는 문자 인코딩은 UTF-8 이다.
	 * 
	 * 	- String.format
	 * 		: 기본형 값을 String으로 변환
	 * 		1) 빈 문자열을 더하는 방식
	 * 			int a = 10;
	 * 			String b = 10 + "";
	 * 
	 * 		2) valueOf()를 이용하는 방법
	 * 			int a = 10;
	 * 			String b = String.valueOf(a);
	 * 		: String을 기본형 값으로 변환
	 * 		1) wrapper클래스를 이용
	 * 			String s = "100";
	 * 			int a = Integer.parseInt(s);
	 * 			byte b = Byte.parseByte(s);
	 * 
	 * 			int a2 = Integer.valueOf(s);
	 * 
	 * 		2) String을 기본형으로 변환시 결과는 10진수이다
	 * 		String s = "200";
	 * 		int a = Integer.parseInt(s, 4);// s문자열을 4진수로 바꿈, 200(4) -> 32
	 * 
	 * 4. StringBuffer클래스와 StringBuilder클래스
	 * 	- String클래스는 인스턴스를 생성할 때 지정된 문장을 변경할 수 없다
	 * 	- 문자열의 변경을 위해서는 StringBuffer 클래스를 이용한다
	 *  - StringBuilder
	 *  	: StringBuffer는 멀티쓰레드에 안전하도록 동기화 되어 있다
	 * 
	 * 5. Math클래스
	 * 
	 * 6. wrapper클래스
	 * 	- 객체지향의 개념은 모든 것은 객체로 다루어야 한다
	 * 	- 8가지 기본형은 객체로 다루지 않는다
	 * 	- 때로는 기본형 변수도 객체로 다루어야 할때가 있다
	 * 		: 매개변수로 객체를 요구할때
	 * 		void method(Object obj){
	 * 		}
	 * 		: 기본형이 아닌 객체로 저장되어야할때.
	 * 		Object[] obj = new Object[3];
	 * 
	 * 		기본형	|	wrapper클래스
	 * 		boolean	|	Boolean
	 * 		char	|	Character	***
	 * 		byte	|	Byte
	 *      short	|	Short
	 *      int		|	Integer		***
	 *      long	|	Long
	 *      float	|	Float
	 *      double	|	Double
	 * 
	 * 	- 오토박싱 : 기본형 값을 wrapper클래스의 객체로 자동변환해준다
	 * 	- 오토언박싱 : wrapper클래스를 기본형 값으로 자동 변환해 준다
	 * 	
	 * 	int i = new Integer(100).intValue();
	 * 	
	 * 	int sum = i + new Integer(50);
	 * 
	 * 	7. StringTokenizer 클래스
	 * 	- 긴 문자열을 지정된 구분자를 기준으로 토큰(token)이라는 여러개의 문자열로 잘라내는데 사용한다
	 * 
	 */
}
