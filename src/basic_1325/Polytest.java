package basic_1325;
/**
 * 다형성 연습
 * @author SangJun
 *
 */
public class Polytest {
	public static void main(String[] args) {
		SmartTv st = new SmartTv();
		
		Tv tv = new SmartTv();// 업 캐스팅(자동 형변환) 자손 -> 조상
		
		SmartTv st2 = (SmartTv)tv;// 다운 캐스팅(형변환 필요) (자손타입)조상 -> 자손
		
		// SmartTv st3 = (SmartTv)new Tv();// 불가
		
		Tv[] t2 = {new Tv(), new Tv()};
		
		
		
		SmartTv[] st3 = {new SmartTv(), new SmartTv()};
		AfreecaTv[] af3 = {new AfreecaTv(), new AfreecaTv()};
		
		Tv[] tv3 = {new SmartTv(), new SmartTv(), new AfreecaTv(), new AfreecaTv()};// 업 캐스팅
		SmartTv st4 = (SmartTv)tv3[0];// 다운 캐스팅
		
		
		
	}
}

class Tv{
	boolean power;
	int channel;
	
	void power(){
		power = !power;
	}
	
	void channelUp(){
		channel++;
	}
}

class SmartTv extends Tv{
	void search(){
		
	}
	
	void voiceInsic(){
		
	}
	
}

class AfreecaTv extends Tv{
	
	
	
}







