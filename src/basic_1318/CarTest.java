package basic_1318;
/**
 * 생성자
 * this : 인스턴스 변수와 지역변수를 구분하기 위한 this
 * this() : 생성자내에서 다른 생성자를 호출하기 위한 this() -> 가장 첫줄에 써야함
 * @author SangJun
 *
 */
public class CarTest {
	public static void main(String[] args) {
		
		Car c = new Car("white","stick",4);
		System.out.println(c.color);
		System.out.println(c.gearType);
		System.out.println(c.door);
		
		Car c2 = new Car();
		System.out.println(c2.color);
		System.out.println(c2.gearType);
		System.out.println(c2.door);
		
	}
}

class Car{
	String color;
	String gearType;
	int door;
	Car(){
		this("blue","auto",2);// this() : 생성자내에서 다른 생성자를 호출하기 위한 this() -> 가장 첫줄에 써야함
	}
	
	Car(String color, String gearType, int door){
		this.color = color;// 인스턴스변수와 지역변수를 구분하기 위한 this
		this.gearType = gearType;
		this.door = door;
	}
	
	
	
}