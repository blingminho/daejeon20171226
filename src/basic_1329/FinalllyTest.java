package basic_1329;
/**
 * finally 연습
 * @author SangJun
 *
 */
public class FinalllyTest {
	public static void main(String[] args) {
		try{
			startInstall();
			copyFiles();
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			deleteFiles();
		}
		
		
		
		
	}
	
	static void startInstall(){
		
	}
	
	static void copyFiles(){
		
	}
	
	static void deleteFiles(){
		
	}
}
