package Ch7;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// �ڹ��� ���� 7�� 9�� ����
// Date : 22 / 07 / 04

// �Ʒ��� EventHandler�� �͸� Ŭ������ �����Ͻÿ�.

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
