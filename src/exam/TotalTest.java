package exam;

public class TotalTest {// TotalTest 클래스를 Method Area에 로드시킨다 - main()가 TotalTest클래스에 포함된다
	public static void main(String[] args) {// main()메서드가 call stack에 쌓인다
		
		TvMaker.color = "Blue"; // TvMaker클래스를 Method Area에 로드시킨다. - String color, int inch가 포함된다 -> color = null, inch = 0// TvMaker클래스의 클래스변수인 color에 "Blue"를 대입한다
		TvMaker tm = new TvMaker();// TvMaker클래스를 Method Area에 로드되었는지 확인// main()메서드 안에 TvMaker클래스 타입의 참조형 지역변수 tm이 선언되었다.(call stack의 main() 안에 넣어준다)
		// new 연산자를 이용하여 인스턴스를 생성한다(heap메모리 공간)(tm의 주소를 가짐)// 인스턴스 변수와 인스턴스 메서드가 선언됨//  인스턴스 변수들이 기본값으로 초기화 된다 -> name ="";(name의 경우 명시적초기화가 되어있으므로 그대로 가져온다) age = 0; TvMaker(), TvMaker(String name, int age)
		// 생성자인 TvMaker()를 call stack에 호출// call stack의 TvMaker() 안에 생성자내에서 다른 생성자를 부르는 this("man",25) -> TvMaker(String name, int age)를 call stack에 호출
		//TvMaker(String name, int age) 안에 지역변수 String name, int age가 선언하고 받은 인자값으로 초기화한다 -> 그후 각 지역변수의 값으로 tm의 주소를 가진 인스턴스의 인스턴스 변수를 초기화한다 -> call stack 에서 TvMaker(String name, int age),  TvMaker() 순으로 퇴근한다
		// tm의 주소를 가진 인스턴스의 주소를 tm에 넣어준다
		tm.age = 30; // tm주소를 가진 인스턴스의 인스턴스변수인 age를 30으로 초기화
		//3. 메서드 호출
		// 3.1 
		System.out.println(TvControll.channel);// TvControll 클래스를 Method Area에 로드시킴 -> MAX_CHANNEL= 50; MIN_CHANNEL= 1; channel = 15; volumeDown()도 올려짐// channel을 찾아가 15가 출력됨
		TvControll.volumeDown();// TvControll 클래스의 클래스메서드인 volumeDown()을 call stack에 호출// TvControll클래스의 클래스변수 channel 이 15++인 16이 됨// 퇴근
		System.out.println(TvControll.channel);//16이 출력됨
		
		// 3.2
		TvControll tc; // TvControll 클래스 타입의 참조형 변수이자 지역변수 tc선언
		tc = new TvControll(); // new를 이용한 인스턴스 생성 (heap메모리 공간)MAX_VOLUME = 100; MIN_VOLUME = 0; volume = 99; volumeUp()도 포함시킴// 기본 생성자를 이용함 // call stack에 TvControll()호출 후 퇴근
		System.out.println(tc.volume);// tc의 주소를 찾아가 volume을 출력// 99
		tc.volumeUp();// call stack에 volumeUp메서드 호출// 99 -> 99++// 퇴근
		System.out.println(tc.volume);// 100 출력
		tc.volumeUp();// call stack에 volumeUp메서드 호출// 100 -> 0// 퇴근
		System.out.println(tc.volume);// 0 출력
		
		//
		Calc cc = new Calc();// Calc클래스를 Method Area에 로드시킴// Calc 클래스 타입의 참조형이자 지역변수 cc선언
		// new 연산자를 통해 인스턴스 생성(heap메모리 영역)	add(int a, int b), add(long a, int b), minus(int a, int b) 포함됨(add메서드는 오버로딩되었다)
		// 인스턴스의 주소를 cc에 넣어준다
		System.out.println(cc.add(Integer.MAX_VALUE, 4));// cc인스턴스의 add메서드중 add(int a,int b)를 call stack 에 호출
		// Integer.MAX_VALUE == 정수형의 제일 큰값 + 4 == int형을 벗어나서 overflow 발생 // 출력이 이상한 값이 나옴 // 퇴근
		System.out.println(cc.add(3L, Integer.MAX_VALUE));// cc인스턴스의 add메서드중 add(long a,int b)를 call stack 에 호출
		// 3L(long타입 리터럴) + 정수형의 제일 큰값 == long타입 + int타입 == long타입으로 자동형변환됨 // 출력이 오류없이 나옴 // 퇴근
	}// main()메서드 퇴근(call stack에는 아무것도 없음)
}// Method Area 에 로드된 클래스 제거, heap메모리 영역에 있는 인스턴스들 가비지콜렉터(G.C)가 알아서 제거
	class TvMaker{
		//1.
		//  1.1 
		static String color;// 클래스 변수 초기값 null
		static int inch;// 클래스 변수 초기값 0
		//  1.2 
		String name = "";// 인스턴스 변수 초기값 ""
		int age;// 인스턴스 변수 초기값 0
		//2.
		//  2.1 
		TvMaker(){// 생성자가 오버로딩되었다
			this("man",25);// 다른 생성자를 호출(2.2를 호출)
		}
		//  2.2 
		TvMaker(String name, int age){// 생성자가 오버로딩되었다
			this.name = name;// 해당 인스턴스의 변수 name를 받아온 인자값으로 초기화
			this.age = age;// 해당 인스턴스의 변수 age를 받아온 인자값으로 초기화
		}
	}
		
	class TvControll{
		final int MAX_VOLUME = 100;// 인스턴스 상수 (못바꿈)
		final int MIN_VOLUME = 0;// 인스턴스 상수 (못바꿈)
		static final int MAX_CHANNEL= 50;// 클래스 상수 (못바꿈)
		static final int MIN_CHANNEL= 1;// 클래스 상수 (못바꿈)
		
		static int channel = 15;// 클래스 변수
		int volume = 99;// 인스턴스 변수
		// 컴파일시 기본생성자가 생성된다
		//4. return문
		int volumeUp(){// 인스턴스 메서드 return int형
			if(volume == MAX_VOLUME){
				volume = MIN_VOLUME;
			}else{
				volume++;
			}
			
			return volume;
		}
		
		static int volumeDown(){// 클래스 메서드 return int형
			if(channel == MAX_CHANNEL){
				channel = MIN_CHANNEL;
			}else{
				channel++;
			}
			return channel;
		}
	}

	class Calc{
		//5.
		int add(int a, int b){// 인스턴스 메서드 return int형 (오버로딩됨)
			return a+b;
		}
		long add(long a, int b){// 인스턴스 메서드 return int형 (오버로딩됨)
			return a+b;// long + int -> long타입으로 자동형변환됨
		}
		
		
		int minus(int a, int b){// 인스턴스 메서드 return int형
			return a+b;
		}
	}