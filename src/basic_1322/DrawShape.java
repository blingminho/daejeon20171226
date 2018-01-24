package basic_1322;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class DrawShape extends Frame{
	public static void main(String[] args) {
		// DrawShape ds = new DrawShape();
		
		DrawShape ds = new DrawShape("타이틀 맘대로~~~");
		// ds.paint(g);// Frame을 상속받은 클래스가 인스턴스를 만들면 자동으로 paint(Graphics g)를 호출됨
	}
	
	@Override
	public void paint(Graphics g){
		// 원객체를 만드세요 중심점 150,150 반지름 50
		// Circle c = new Circle(new Point(150, 150), 50);
		Point p = new Point(150, 150);
		Circle c = new Circle(p, 50);
		g.drawOval(c.p.x, c.p.y, c.r, c.r);
		
		
		// 100, 100
		Point p0 = new Point(100, 100);
		// 200, 200
		Point p1 = new Point(200, 200);
		// 200, 100
		Point p2 = new Point(200, 100);
		Triangle t = new Triangle(p0, p1, p2);
		g.drawLine(t.p[0].x, t.p[0].y, t.p[1].x, t.p[1].y);
		g.drawLine(t.p[2].x, t.p[2].y, t.p[1].x, t.p[1].y);
		g.drawLine(t.p[0].x, t.p[0].y, t.p[2].x, t.p[2].y);
		//g.drawString("도서관시스템", p0.x, p0.y);
			
	}
	
	
	DrawShape(){
		super("처음으로 그려봅니다.");
		setSize(500, 500);
		setVisible(true);
		setBackground(Color.GREEN);
		/*
		addWindowListener(new WindowAdapter() {
			public void 
		});
		*/
		
	}
	
	DrawShape(String title){
		super(title);
		setSize(500, 500);
		setVisible(true);
		setBackground(Color.CYAN);
		setResizable(false);
		
		
	}

}

class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	Point(){
		this(500, 500);
	}
}

class Circle{
	// 점 하나를 저장할 수 있는 변수를 선언하세요(p)
	Point p;
	
	// 반지름을 저장할 수 있는 변수를 선언하세요(r)
	int r;
	
	// 매개변수가 두개인 생성자를 만드세요
	Circle(Point p, int r){
		this.p = p;
		this.r = r;
	}
	
	// 기본생성자를 만드세요
	// 단 매개변수가 두개인 생성자를 이용하여 점은 100, 100으로 반지름은 50으로 만드세요
	Circle(){
		this(new Point(100, 100), 50);
	}
}

class Triangle{
	// 점 3개를 저장할 수 있는 변수를 선언 및 초기화 하세요(p)
	Point[] p = new Point[3];
	
	// 매개변수가 하나인 생성자를 만드세요
	Triangle(Point[] p){
		this.p = p;
	}
	
	// 매개변수가 3개인 생성자를 만드세요
	Triangle(Point p0, Point p1, Point p2){
		this.p[0] = p0;
		this.p[1] = p1;
		this.p[2] = p2;
	}
}










