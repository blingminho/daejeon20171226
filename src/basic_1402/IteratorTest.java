package basic_1402;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
/**
 * Iterator<br>
 * ListIterator<br>
 * @author SangJun
 *
 */
public class IteratorTest {
	public static void main(String[] args) {
		/*
		 * Iterator : 단방향 이동만 가능하다
		 * Enumeratrion : 컬렉션이 만들어지기 전에 사용하던 Iterator의 구버전입니다
		 * 
		 */
		
		List list = new ArrayList();
		list.add("123");
		list.add("456");
		list.add("789");
		
		// list를 Iterator 형태로 바꾸어준다
		Iterator it = list.iterator();
		
		// 다음 요소를 불러오기 전에 다음것이 있는지 확인해야 한다
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		// ListIterator
		// Iterator의 단방향을 보완하기 위해서 나왔다
		// 단, List인터페이스를 구현한 컬렉션에서만 사용할수 있다
		ListIterator li = list.listIterator();
		li.hasNext();
		System.out.println(li.next());
		li.hasPrevious();
		System.out.println(li.previous());
		
	}
}
