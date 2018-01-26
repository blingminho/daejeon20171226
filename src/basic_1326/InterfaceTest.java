package basic_1326;
/**
 * 인터페이스 연습
 * @author SangJun
 *
 */
public class InterfaceTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		System.out.println(f instanceof Unit2);
		
		System.out.println(f instanceof Object);
		
		System.out.println(f instanceof Movable);// true// f는 Movable이라는 인터페이스를 구현하고 있다
		
		Fightable f2 = new Fighter();
		
	}
}

class Unit2{
	int x;
	int y;
	int currentHp;
	
}

interface Movable{
	void move(int x, int y);
}

interface Attackable{
	void attack(Unit2 u);
}

interface Fightable extends Movable, Attackable{
	
}

class Fighter extends Unit2 implements Fightable{
	
	@Override
	public void move(int x, int y) {
		
	}

	@Override
	public void attack(Unit2 u) {
		
	}
	
}


