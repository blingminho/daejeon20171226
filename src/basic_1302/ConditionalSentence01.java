package basic_1302;
/**
 * 조건문 (if, switch)
 * if, else if, else
 * switch
 * @author SangJun
 *
 */
public class ConditionalSentence01 {
	public static void main(String[] args) {
		/*
		 * 1. 조건문(if, switch)
		 * - 조건문과 문장을 포함하는 블럭{}으로 구성되어 있다.
		 * - 조건식의 연산결과에 따라 프로그램의 실행 흐름을 변경할 수 있다.
		 * 
		 * 2. if문
		 * - 구조
		 * 	1) 기본
		 * 		if(조건식){
		 * 			조건식이 true이면 실행될 문장.
		 * 		}
		 * 	
		 * 	2) 변형
		 * 		if(조건식){
		 * 			조건식이 true일때 실행될 문장.
		 * 		} else {
		 * 			조건식이 false일때 실행될 문장.
		 * 		}
		 * 
		 * 	3) 2단 변형
		 * 		if(조건식1){
		 * 			조건식1이 true일때 실행될 문장.
		 * 		} else if(조건식2) {
		 * 			조건식1이 false이고 조건식2가 true일때 실행될 문장.
		 * 		} else if(조건식3) {
		 * 			조건식1과 조건식2가 false이고 조건식3이 true일때 실행될 문장.
		 * 		}
		 * 
		 * 	4) 3단 변형
		 * 		if(조건식1){
		 * 			조건식1이 true일때 실행될 문장.
		 * 		} else if(조건식2) {
		 * 			조건식1이 false이고 조건식2가 true일때 실행될 문장.
		 * 		} else {
		 * 			조건식1과 조건식2가 false일때 실행될 문장.
		 * 		}
		 */
		int i = -10;
		if(i > 0){
			System.out.println("i는 양수입니다.");
		} else if( i == 0 ) {
			System.out.println("i는 0 입니다.");
		} else {
			System.out.println("i는 음수입니다.");
		}
		
		// 1. 0(포함) ~ 100(포함)사이의 정수를 저장할 수 있는 변수를 선언 및 초기화하세요(int score)
		//int score = 96;
		int score = (int)(Math.random()*101);
		
		// 2. 1에서 선언된 변수의 값이 90이상이면 'A'를 출력하세요
		// 	  1에서 선언된 변수의 값이 80이상이면 'B'를 출력하세요
		// 	  1에서 선언된 변수의 값이 70이상이면 'C'를 출력하세요
		// 	  1에서 선언된 변수의 값이 60이상이면 'D'를 출력하세요
		// 	  1에서 선언된 변수의 값이 60미만이면 "나가"를 출력하세요
		if(score < 60) {
			System.out.println("나가");
		} else if(60 <= score && score < 70) {
			System.out.println('D');
		} else if(70 <= score && score < 80) {
			System.out.println('C');
		} else if(80 <= score && score < 90) {
			System.out.println('B');
		} else if(90 <= score) {
			System.out.println('A');
		}
		
		if(score >= 90){
			System.out.println("A");
		} else if(score >= 80){
			System.out.println("B");
		} else if(score >= 70){
			System.out.println("C");
		} else if(score >= 60){
			System.out.println("D");
		} else {
			System.out.println("나가");
		}
		
		
 
		if(80 <= score) {
			System.out.println( score >= 90 ? 'A' : 'B' );
		} else if(60 <= score){
			System.out.println( score >= 70 ? 'C' : 'D');
		} else {
			System.out.println("나가");
		}
		
		System.out.println("=== 2.1 ===");
		// 2.1
		// 중첩 if문 : if문 안에 if문
		//	95점 이상이면 "+" => A+
		//	95점 미만이면 "-" => A-
		if(score >= 90){
			System.out.print("A");
			if(score >= 95){
				System.out.println("+");
			} else {
				System.out.println("-");
			}
		} else if(score >= 80){
			System.out.print("B");
			if(score >= 85){
				System.out.println("+");
			} else {
				System.out.println("-");
			}
		} else if(score >= 70){
			System.out.print("C");
			if(score >= 75){
				System.out.println("+");
			} else {
				System.out.println("-");
			}
		} else if(score >= 60){
			System.out.print("D");
			if(score >= 65){
				System.out.println("+");
			} else {
				System.out.println("-");
			}
		} else {
			System.out.println("나가");
		}
		
		
		
		/*
		 * 3. switch문
		 * - 조건의 경우의 수가 많을 때는 if문 보다는 switch문을 사용하는 것이 좋다.
		 * - 조건의 결과값으로 int형 범위의 정수값을 허용한다.
		 * - 구조
		 * 		switch(조건식 == 변수 or 연산결과){
		 * 			case 정수값1 :
		 * 				조건식과 정수값1이 같을떄 수행될 문장
		 * 				break;
		 * 			case 정수값2 :
		 * 				조건식과 정수값2이 같을떄 수행될 문장
		 * 				break;
		 * 			case 정수값3 :
		 * 				조건식과 정수값3이 같을떄 수행될 문장
		 * 				break;
		 * 			default :	
		 * 				조건식과 일치하는 case가 없을때 수행될 문장 (맨 마지막 문장 - 즉 break 생략가능)
		 * 		}
		 */
		
		int a = 2;
		switch(a) {
			case 0 :
				System.out.println("a는 0입니다.");
				break;
			case 1 :
				System.out.println("a는 1입니다.");
				break;
			case 2 : 
				System.out.println("a는 2입니다.");
				break;
			default :
				System.out.println("일치하는 case가 없습니다.");
		}
		
		// 1. 0 ~ 5 사이의 랜덤한 정수를 저장할 수 있는 변수 num을 선언 및 초기화 하세요.
		int num = (int)(Math.random()*6);
		// 2. num의 값이 5이면 "경품은 24평 아파트 입니다."를 출력하세요.
		//	  num의 값이 4이면 "경품은 santafe 입니다."를 출력하세요.
		//    num의 값이 3이면 "경품은 notebook 입니다."를 출력하세요.
		//    num의 값이 2이면 "경품은 모니터 입니다."를 출력하세요.
		//    num의 값이 1이면 "경품은 문상10000원권 입니다."를 출력하세요.
		//    num의 값이 0이면 "경품은 32평 아파트 가져오세요"를 출력하세요.
		
		System.out.print("경품은 ");
		switch(num){
			case 5 : 
				System.out.print("24평 아파트");
				break;
			case 4 :
				System.out.print("santafe");
				break;
			case 3 :
				System.out.print("notebook");
				break;
			case 2 :
				System.out.print("모니터");
				break;
			case 1 :
				System.out.print("문상10000원권");
				break;
			case 0 :
				System.out.print("32평 아파트");
				break;
		}
		System.out.println(num > 0 ? " 입니다." : " 가져오세요.");
		
		
		System.out.println("---- 숙제 ----");
		// 1. 위에서 만든 성적에 따른 학점주는 소스르 switch문으로 만들어 오세요
		switch(score/10) {
			case 9 :
				System.out.println("A");
				break;
			case 8 :
				System.out.println("B");
				break;
			case 7 :
				System.out.println("C");
				break;
			case 6 :
				System.out.println("D");
				break;
			default :
				System.out.println("나가");
		}
		
		
	}
}
