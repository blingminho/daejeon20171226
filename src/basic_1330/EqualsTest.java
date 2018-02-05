package basic_1330;
/**
 *  * equals테스트
 * @author SangJun
 *
 */
public class EqualsTest {
	public static void main(String[] args) {
		Value v1 = new Value(5);
		Value v2 = new Value(5);
		
		System.out.println(v1.equals(v2));
		
	}
}

class Value{
	int value;
	
	Value(int value){
		this.value = value;
	}
}