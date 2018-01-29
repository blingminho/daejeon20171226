package basic_1329;
/**
 * throws 연습
 * @author SangJun
 *
 */
public class ExceptionThrows {
	public static void main(String[] args) throws Exception{
		method1();
	}
	
	static void method1() throws Exception{
		method2();
	}

	static void method2() throws Exception{
		/*
		try{
			throw new Exception("2번에서 발생함");
		}catch(Exception e){
			e.printStackTrace();
		}
		*/
		throw new Exception("2번에서 발생함");
	}
	
}
