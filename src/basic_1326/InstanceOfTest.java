package basic_1326;
/**
 * instanceof 연습
 * 형변환이 가능한지 확인하는 연산자(연산결과가 true일 경우 가능)
 * 확인 후 다운캐스팅함
 * @author SangJun
 *
 */
public class InstanceOfTest {
	public static void main(String[] args) {
		FireCar fc = new FireCar();
		Car c = new Car();
		
		if(fc instanceof FireCar){// fc는 FireCar의 인스턴스인가? true
			System.out.println("fc는 FireCar의 인스턴스 이다");
			FireCar fc2 = fc;
		}
		
		if(fc instanceof Car){// fc는 Car의 인스턴스인가? true
			System.out.println("fc는 Car의 인스턴스 이다");
			Car c2 =fc;
		}
		
		if(fc instanceof Object){// fc는 Object의 인스턴스인가? true
			System.out.println("fc는 Object의 인스턴스 이다");
			Object o2 = c;
		}
		
		if(c instanceof FireCar){// c는 FireCar의 인스턴스인가? false
			System.out.println("c는 FireCar의 인스턴스 이다");
			// FireCar fc3 = c;// 불가
		}
		
		if(c instanceof Object){// c는 Object의 인스턴스인가? true
			System.out.println("c는 Object의 인스턴스 이다");
			Object o3 = c;
		}
	}
}

class Car{}
class FireCar extends Car{}