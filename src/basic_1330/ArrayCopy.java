package basic_1330;

import java.util.Arrays;
/**
 * 얕은복사, 깊은복사
 * @author SangJun
 *
 */
public class ArrayCopy {
	public static void main(String[] args) throws CloneNotSupportedException {
		Point[] arr = {new Point(1,1), new Point(2,2), new Point(3,3)};
		
		Point[] arr2 = arr.clone();
		
		System.out.println(arr == arr2);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		arr[0].x = 5;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = {1,2,3};
		int[] arr4 = arr3.clone();
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		arr3[0] = 10;
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
		
		Point3D p3 = new Point3D(new Point(1,1), 10);
		Point3D p4 = (Point3D)p3.clone();
		System.out.println(p3);
		System.out.println(p4);
		p3.p.x = 20;
		p3.z = 40;
		System.out.println(p3);
		System.out.println(p4);
		
		
	}
}

class Point{
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		String result = "Point [x=" + x + ", y=" + y + "]";
		return result;
	}
}

class Point3D implements Cloneable{
	Point p;
	int z;
	Point3D(Point p, int z){
		this.p = p;
		this.z = z;
	}
	@Override
	public String toString() {
		return "Point3D [p=" + p + ", z=" + z + "]";
	}
	
	// 깊은 복사
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();
		
		((Point3D)obj).p = new Point(p.x, p.y);
		
		return obj;
	}
}


