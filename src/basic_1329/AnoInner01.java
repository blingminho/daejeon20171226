package basic_1329;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * 익명클래스연습1
 * @author SangJun
 *
 */
public class AnoInner01 {
	public static void main(String[] args) {
		Button b = new Button();
		ActionListener a = new EventHandler();
		b.addActionListener(a);
		
		
		
		
	}
}

class EventHandler implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼눌림");	
	}
}