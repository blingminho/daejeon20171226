package myTestRoom;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class FrameTest extends Frame{
	public static void main(String[] args) {
		FrameTest ft = new FrameTest("타이틀");
		
	}
	
	@Override
	public void paint(Graphics g){
		Point[] p = new Point[10];
		
		p[0] = new Point(100, 300);
		p[1] = new Point(400, 300);
		
		//g.drawLine(p[0].x, p[0].y, p[1].x, p[1].y);
		
		/*
		g.drawString(, p[0].x, p[0].y+150);
		g.drawString(, p[0].x, p[0].y+100);
		g.drawString(, p[0].x, p[0].y+50);
		*/
		
		
	}
	
	FrameTest(String title){
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
}






