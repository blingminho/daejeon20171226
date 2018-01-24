package basic_1322;
/**
 * private 연습
 * @author SangJun
 *
 */
public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time();
		t.setHour(100);
		t.setMinute(195);
		t.setSecond(10000);
		
		
		System.out.println(t.getHour() + " : " + t.getMinute() + " : " + t.getSecond());
	}

}

class Time{
	private int hour;
	private int minute;
	private int second;
	
	public void setHour(int hour){
		if(hour > 23){
			// this.hour = hour % 24;
			this.hour = hour - 24*(hour/24);
		}else{
			this.hour = hour;			
		}
	}
	
	public int getHour(){
		return hour;
	}
	
	
	public void setMinute(int minute){
		if(minute > 59){
			int hour = minute / 60;
			setHour( hour + getHour());
			this.minute = minute % 60;
		}else{
			this.minute = minute;
		}
	}
	
	public int getMinute(){
		return this.minute;
	}
	
	
	public void setSecond(int second){
		if(second > 59){			
			int minute = second / 60;
			second = second % 60;
			this.second = second;
			setMinute(minute + getMinute());
		}else{
			this.second = second;
		}
	}
	
	public int getSecond(){
		return this.second;
	}
	
	
	
	
	
	
	
}