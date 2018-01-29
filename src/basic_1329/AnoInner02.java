package basic_1329;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * 익명클래스연습2 - 구현됨
 * @author SangJun
 *
 */
public class AnoInner02 {
	public static void main(String[] args) {
		Button b = new Button();
		
		b.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼눌림");
				System.out.println(e);
			}
		});
		
		b.getActionListeners()[0].actionPerformed(new ActionEvent("xxx", 0, "yyyy"));
		
	}
}
