package basic_1329;

import javax.management.RuntimeErrorException;
/**
 * 예외처리 연습2
 * try-catch문
 * 예외 만들기
 * throw
 * @author SangJun
 */
public class ExceptionEx03 {
	public static void main(String[] args) {
		Exception e = new Exception("그냥만들었어");
		
		try {
			throw e;
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		System.out.println("프로그램 종료1");

		try{
			throw new RuntimeException();
		} catch(RuntimeException e1){
			e1.printStackTrace();
		}
		System.out.println("프로그램 종료2");
		
		// RuntimeException과 그 자손 클래스에 해당하는 예외는 프로그래머의 실수이기 때문에
		// 예외처리를 강제하지 않는다
		
		// 컴파일러가 예외처리를 강제하지 않는 경우
		// 1. RuntimeException과 그 자손 클래스들
		// 2. Error와 그 자손 클래스들
		// 이런 것들을 'unchecked예외'라 부른다
		
		
		
		
		
		
	}
}
