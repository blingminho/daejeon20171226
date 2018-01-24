package basic_1324;
/**
 * 상속 연습
 * @author SangJun
 *
 */
public class PointTest {
	public static void main(String[] args) {
		
	}
}

class Point{
	int x = 10;
	int y = 20;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point{
	int z = 10;
	Point3D(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
}