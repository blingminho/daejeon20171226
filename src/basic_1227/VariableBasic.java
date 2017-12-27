package basic_1227;
/**
 * 변수를 공부하기 위한 클래스
 * @author PC17
 * @since 2017-12-27
 */
public class VariableBasic { // 클래스명
	public static void main(String[] args) { // 메서드
		// 한줄 주석 ctrl + shift + c
		
		/*
		 * 여러줄 주석 ctrl + shift + /
		 */
		
		/*
			여러줄 주석 ctrl + shift + /
			여러줄 주석 제거 ctrl + shift + \ 역슬래쉬
			
		*/

		/**
		 * doc 주석
		 */
		
		/*
		 * 1. 변수란?
		 *  - 단 하나의 값을 저장할 수 있는 공간이다.
		 *  - 변수의 선언 : 같은 영역에 두명의 상준은 있을 수 없다 여기서 영역은 {} 를 뜻한다
		 *  [변수 타입] 변수명
		 *   	int		  x;
		 *   
		 *   기본형 과 참조형
		 *   int -- 정수
		 *   
		 */
		
		int x; //변수의 선언 : [변수타입] 변수명
		x = 10; //변수의 초기화 : 처음 저장했다
		
		int y = 20; //변수의 선언 및 초기화
		
		/*
		 * 명명규칙
		 * 변수명, 메서드명, 클래스명을 짓는 대는 반드시 지켜야 할 공통적인 규칙이 있다.
		 * 
		 * 1. 대소문자를 구분하며 길이의 제한이 없다.// 예 : int abc != int aBc
		 * 2. 예약어(key word, reserved word)는 사용할 수 없다.// 예 : int true, int static, int public, int package,  등
		 * 3. 숫자로 시작해서는 안된다.// 예 : int 10top; 사용불가
		 * 4. 특수문자는 '_', '$' 만 사용 가능// 예 : int $harp = 20; int a_s = 1; 사용가능
		 * 
		 * 필수는 아니지만 자바 프로그래머들의 암묵적인 약속(가독성 상향)
		 * 1. 클래스명의 첫글자는 대문자로 써야한다.// public class VariableBasic
		 *  - 메서드와 변수명은 첫글자를 소문자로 써야한다.// public static void main(String[] args), int speakingMax;
		 * 2. 여러단어로 이루어진 경우에는 두번째 이후 단어의 첫글자는 대문자로 써야한다.// last index of --> lastIndexOf
		 * 3. 상수의 명칭은 모두 대문자로 사용한다. 띄어쓰기는 '_' 를 사용한다.// max value --> MAX_VALUE
		 */
		
	}
}
