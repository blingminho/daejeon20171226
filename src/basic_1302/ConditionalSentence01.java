package basic_1302;
/**
 * 조건문 기본
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
 
		if(80 <= score) {
			System.out.println( score >= 90 ? 'A' : 'B' );
		} else if(60 <= score){
			System.out.println( score >= 70 ? 'C' : 'D');
		} else{
			System.out.println("나가");
		}
		
		
		
		
		
		
	}
}
