package basic_1326;
/**
 * 추상클래스
 * @author SangJun
 *
 */
public class AbstractTest01 {
	
}

abstract class Unit{
	int x;
	int y;
	abstract void move(int x, int y);
	
	void stop(){
		
	}
}


class Marine extends Unit{
	void stimPack(){
		
	}

	@Override
	void move(int x, int y) {
		
	}
	
	
}

class Tank extends Unit{
	void changeMode(){
		
	}

	@Override
	void move(int x, int y) {
		
	}
	
	
}

class DropShip extends Unit{
	void load(){
		
	}
	
	void unload(){
		
	}

	@Override
	void move(int x, int y) {
		
	}
}

