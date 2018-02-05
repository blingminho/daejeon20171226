package basic_1330;
/**
 * equals테스트
 * @author SangJun
 *
 */
public class EqualsTest2 {
	public static void main(String[] args) {
		Person p1 = new Person(9311161412328L);
		Person p2 = new Person(9311161412328L);
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		
	}
}

class Person{
	long id;
	
	public Person(long id){
		this.id = id;
	}
	
	// 오버라이드를 통해 id값을 비교한다
	@Override
	public boolean equals(Object obj) {
		boolean result = id == ((Person)obj).id;
		return result;
	}
	
	
	
}