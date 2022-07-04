package Ch7;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 자바의 정석 7장 9번 문제
// Date : 22 / 07 / 04

// 아래의 EventHandler를 익명 클래스로 변경하시오.

public class Ch7_9 {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});
	}
}
