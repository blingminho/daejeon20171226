package exam;
/**
 * 자바의 정석 6장 연습문제
 * @author SangJun
 *
 */
public class Exam_06 {

	public static void main(String[] args) {
		/*
		 * 6.1
		 * SutdaCard클래스를 정의하시오.
		 * int/ num/ 카드의 숫자.(1~10사이의 정수)
		 * boolean/ isKwang/ 광(光)이면 true, 아니면 false
		 */
		
		/*
		 * 6.2
		 * SutdaCard클래스에 두 개의 생성자와 info()를 추가해서 실행
		 * 결과와 같은 결과를 얻도록 하시오.
		 */
		SutadaCard card1 = new SutadaCard(3,false);
		SutadaCard card2 = new SutadaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
		
		
		
		/*
		 * 6-4
		 */
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름:"+s.name);
		System.out.println("총점:"+s.getTotal());
		System.out.println("평균:"+s.getAverage());
		
		/*
		 * 6-5
		 */
		Student s1 = new Student("홍길동",1,2,100,60,76);
		System.out.println(s.info());
		
		
		/*
		 * 6-6
		 */
		System.out.println(Exercise6_6.getDistance(1, 1, 2, 2));
		
		
		/*
		 * 6-7
		 */
		MyPoint p = new MyPoint(1,1);
		System.out.println(p.getDistance(2, 2));
		
		
		/*
		 * 6-20
		 */
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
		
		/*
		 * 6-21
		 */
		MyTv t = new MyTv();
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
		
		/*
		 * 6-22
		 */
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		str = "1234o";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		
		/*
		 * 6-23
		 */
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:"+max(data));
		System.out.println("최대값:"+max(null));
		System.out.println("최대값:"+max(new int[]{})); // 크기가 0인 배열
		
		/*
		 * 6-24
		 */
		int value = 5;
		System.out.println(value+"의 절대값:"+abs(value));
		value = -10;
		System.out.println(value+"의 절대값:"+abs(value));
		
		
	}
	/*
	 * 6-20
	 */
	static int[] shuffle(int[] arr){
		for(int i = 0; i < arr.length; i++){
			int j = (int)(Math.random()*arr.length);
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
		return arr;
	}
	
	/*
	 * 6-22
	 */
	static boolean isNumber(String str){
		boolean result = false;
		if(str == "" || str == null){
			return result;
		}
		for(int i = 0; i < str.length(); i++){
			if('0' <= str.charAt(i) && str.charAt(i) <= '9'){
				result = true;
			}else{
				result = false;
				return result;
			}
		}
		return result;
	}
	
	/*
	 * 6-23
	 */
	static int max(int[] arr){
		int result = 0;
		
		if(arr == null || arr.length == 0){
			return -999999;
		}
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > result){
				result = arr[i];
			}
		}
		return result;
	}
	
	/*
	 * 6-24
	 */
	static int abs(int value){
		value = (value > 0) ? value : -value;
		return value;
	}
}

class SutadaCard{// 6.1
	int num;// 카드의 숫자.(1~10사이의 정수)
	boolean isKwang;// 광(光)이면 true, 아니면 false
	SutadaCard(){
		this.num = 1;
		this.isKwang = true;
	}
	SutadaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	String info(){
		String result = this.num + ((this.isKwang == true)? "K" : "");
		return result;
	}
}

class Student{// 6-3번
	String name;// 학생이름
	int ban;// 반
	int no;// 번호
	int kor;// 국어점수
	int eng;// 영어점수
	int math;// 수학점수
	
	// 6-4번
	int getTotal(){
		int result = kor + eng + math;
		return result;
	}
	
	float getAverage(){
		float result = (int)(((float)kor+eng+math)/3 * 10 + 0.5) / (float)10;
		return result;
	}
	
	// 6-5번
	Student(){
		
	}
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;		
	}
	String info(){
		String result = this.name+","+this.ban+","+this.no+","+this.kor+","+this.eng+","+this.math+","+this.getTotal()+","+this.getAverage();
		return result;
	}
}


class Exercise6_6{// 6-6
	static double getDistance(int x, int y, int x1, int y1){
		double result = Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
		
		return result;
	}
}

class MyPoint{// 6-7
	int x;
	int y;
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x, int y){
		double result = Math.sqrt((x-this.x)*(x-this.x) + (y-this.y)*(y-this.y));
		
		return result;
	}
}
 
class PlayingCard {// 6-8
	int kind;// 인스턴스변수
	int num;// 인스턴스변수
	
	static int width;// 클래스변수
	static int height;// 클래스변수
	
	PlayingCard(int k, int n) {// 지역변수 k, n
		kind = k;
		num = n;
	}
	
	public static void main(String args[]) {// 지역변수 args[]
		PlayingCard card = new PlayingCard(1,1);// 지역변수 card
	}
}


class Marine {// 6-9
	int x=0, y=0; // Marine의 위치좌표(x,y)
	int hp = 60; // 현재 체력
	static int weapon = 6; // 공격력 // 모든 병사들이 공유한다
	static int armor = 0; // 방어력 // 모든 병사들이 공유한다
	
	static void weaponUp() {// 쓰인 변수가 클래스변수이므로 클래스메서드로 바꾼다
		weapon++;
	}
	static void armorUp() {// 쓰인 변수가 클래스변수이므로 클래스메서드로 바꾼다
		armor++;
	}
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}


/*
 * 6-10
 * 정답 : e// 오버로딩 가능
 * 
 * 6-11
 * 정답 : b// b : 클래스메서드에서는 사용불가
 * 
 * 6-12
 * 정답 : c,d// 리턴 상관없음, 매개변수의 수나 타입이 달라야한다
 * 
 * 6-13
 * 정답 : b, c, d
 * 
 * 6-14
 * 정답 : c, e// c : 생성자가 제일 마지막에 수행됨 , e : 클래스가 먼저 로딩됨
 * 
 * 6-15
 * 정답 : a
 * 
 * 6-16
 * 정답 : a,e// a : 자동초기화 x, e: 힙영역은 인스턴스
 * 
 * 6-17
 * 정답 : b, f// b : 대기중, f : 다른 메서드가 대기중
 * 
 * 6-18
 * 정답 : A, B, D
 * A : static변수는 인스턴스 변수보다 먼저 로드된다
 * B,D : 클래스메서드는 인스턴스 변수와 메서드를 사용할 수 없다 
 */

/*
 * 6-19
 * 정답 :
 * ABC123
 * After change:ABC123456
 */

/*
 * 6-21
 */
class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	void turnOnOff() {
		// (1) isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
		isPowerOn = (isPowerOn == true) ? false : true;
	}
	void volumeUp() {
		// (2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1증가시킨다.
		volume = (volume < MAX_VOLUME) ? volume+1 : volume;
	}
	void volumeDown() {
		// (3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1감소시킨다.
		volume = (volume > MIN_VOLUME) ? volume-1 : volume;
	}
	void channelUp() {
		// (4) channel의 값을 1증가시킨다.
		// 만일 channel이 MAX_CHANNEL이면, channel의 값을 MIN_CHANNEL로 바꾼다.
		channel = (channel == MAX_CHANNEL) ? MIN_CHANNEL : channel+1;
	}
	void channelDown() {
		// (5) channel의 값을 1감소시킨다.
		// 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
		channel = (channel == MIN_CHANNEL) ? MAX_CHANNEL : channel-1;
	}
}