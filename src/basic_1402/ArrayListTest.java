package basic_1402;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * ArrayList 메서드 연습
 * @author SangJun
 *
 */
public class ArrayListTest {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(4);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(list.subList(2, 4));
		
		System.out.println(list);
		System.out.println(list2);
		
		// 그동안 정렬하느라 고생하셨어요...
		Collections.sort(list);
		System.out.println(list);
		
		// create 추가 
		list2.add(7);
		System.out.println(list2);
		list2.add(1, 10);
		System.out.println(list2);
		
		// read
		System.out.println(list2.get(0));
	
		// update
		list2.set(1, 15);
		System.out.println(list2);
		
		// delete
		list2.remove(1);
		System.out.println(list2);
		
		
		
		
		
		
		
		
		
		
		
	}
}
