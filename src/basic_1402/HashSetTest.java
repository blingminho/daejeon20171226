package basic_1402;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 * HashSet연습
 * @author SangJun
 */
public class HashSetTest {
	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		// 반복되는 것들은 저장되지 않는다
		for (int i = 0; i < 10; i++) {
			set.add((int)(Math.random()*45));
		}
		System.out.println(set);
		
		
		List list = new ArrayList(set);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		
		
		
		
		
	}
}
