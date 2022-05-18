package ch10_02;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class dragColor extends JFrame {
	private Container c = getContentPane();

	public dragColor() {
		setTitle("MouseListener와 MouseMotionListener 예제 \n18114847 김범준");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(new FlowLayout());
		

		MyMouseListener listener = new MyMouseListener();
		c.addMouseMotionListener(listener);
		c.setBackground(Color.GREEN);


		setSize(300, 200);
		setVisible(true);
	}

	class MyMouseListener implements MouseMotionListener {
		public void mouseDragged(MouseEvent e) {
			c.setBackground(Color.YELLOW);
		}

		public void mouseMoved(MouseEvent e) {
			c.setBackground(Color.GREEN);
		}
	}

	public static void main(String[] args) {
		new dragColor();
	}
}
