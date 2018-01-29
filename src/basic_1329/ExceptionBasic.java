package basic_1329;
/**
 * 예외처리 이론
 * 프로그램 오류, RuntimeException 클래스와 그외 클래스, 예외처리(try-catch), 예외 발생시키기, throws Exception, finally
 * @author SangJun
 *
 */
public class ExceptionBasic {
	public static void main(String[] args) {
		/*
		 * 1. 프로그램 오류
		 * 	- 프로그램이 실행 중 어떤 원인에 의해서 오작동을 하거나 비정상적으로 종료되는 경우
		 * 	- 컴파일 에러 : 컴파일시 발생하는 에러
		 * 	- 런타임 에러 : 실행시에 발생하는 에러
		 * 	- 에러는 프로그램 코드에 의해서 수습될수 없는 심각한 오류
		 * 	  예외(Exeption)는 프로그램 코드에 의해서 수습될수 있는 경미한 오류
		 * 
		 * 2. RuntimeException 클래스와 그외 클래스
		 * 	- 모든 예외의 최고조상은 Exception이다
		 * 	- RuntimeException클래스들은 주로 프로그래머의 실수에 의해 발생할 수 있는 예외
		 * 		ex) IndexOutOfBoundsException, NullPointerException...
		 * 	- Exception클래스들은 주로 외부의 영향으로 발생할 수 있는 것들
		 * 		ex) FileNotFoundException, ClassNotFoundException...
		 * 
		 * 3. 예외처리(try-catch)
		 * 	- 프로그램 실행 시 발생할 수 있는 예외와 발생에 대비한 코드를 작성한다
		 * 
		 * 	try{
		 * 		예외가 발생할 가능성이 있는 문장
		 * 	}catch(Exception1 e){
		 * 		Exception1예외가 발생했을 경우 처리하기 위한 문장
		 * 	}
		 * 	- 발생한 예외의 종류와 일치하는 단 한 개의 catch블럭만을 수행한다
		 * 
		 * 4. 예외 발생시키기
		 * 	- 연산자 'new'를 이용해서 발생시키려는 예외 클래스의 객체를 만든다
		 * 		Exception e = new Exception();
		 * 	- 키워드 'throw'를 이용해서 예외를 발생시킨다
		 * 		throw e; 
		 * 	RuntimeException과 그 자손 클래스에 해당하는 예외는 프로그래머의 실수이기 때문에 예외처리를 강제하지 않는다
		 *	컴파일러가 예외처리를 강제하지 않는 경우
		 *	1. RuntimeException과 그 자손 클래스들
		 *	2. Error와 그 자손 클래스들
		 *	이런 것들을 'unchecked예외'라 부른다
		 * 
		 * 5. throws Exception
		 * 	- 메서드 예외 선언하기
		 * 		: 메서드 선언부에 'throws'를 사용해서 매서드내에서 발생할 수 있는 예외를 적어주기만 하면 된다
		 * 		처리는 그 메서드를 호출한 부분에서 처리해주면 된다
		 * 
		 * 6. finally
		 * 	- try-catch블럭의 예외발생에 상관없이 수행되어야 할 코드를 포함한다
		 * 	- 구조
		 * 		try{
		 * 
		 * 		} catch(Exception e){
		 * 	
		 * 		} finally{
		 * 			
		 * 		}
		 * 	- 순서
		 * 		: try -> catch -> finally
		 * 		: try -> finally
		 */
		
		Member b = new Member();
		System.out.println(b.mem_id);
		/*
		if(b.p.equals("")){// NullPointerException
			
		}
		*/
	}
}

class Member{
	String mem_id;
	Point p;
}
class Point{
	int x;
	int y;
}