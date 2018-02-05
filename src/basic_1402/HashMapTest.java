package basic_1402;

import java.util.HashMap;
import java.util.Map;
/**
 * HashMap 연습
 * @author SangJun
 *
 */
public class HashMapTest {
	public static void main(String[] args) {
		Map<String, Integer> params = new HashMap<String, Integer>();
		
		Integer result = params.put("백선경", new Integer(100));
		System.out.println(result);
		result = params.put("전병현", 56);
		System.out.println(result);
		params.put("김규영", 290);
		params.put("정은채", 0);
		
		System.out.println(params);
		
		// Read
		System.out.println(params.get("김규영"));
		
		// Update
		result = params.put("정은채", 1000);
		System.out.println(result);
		System.out.println(params.get("정은채"));
		
		// Delete 키가 가지고 있던 value값을 반환함 select와 관련됨
		Integer result2 = params.remove("정은채");
		System.out.println(result2);
		
		
	}
}
