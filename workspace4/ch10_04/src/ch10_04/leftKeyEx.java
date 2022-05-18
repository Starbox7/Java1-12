package ch10_04;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class leftKeyEx extends JFrame {
	private String str = "Love Java";
	private JLabel la = new JLabel(str);

	public leftKeyEx() {
		setTitle("MouseListener와 MouseMotionListener 예제 \n18114847 김범준");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());

		c.add(la);

		setSize(300, 200);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();

	}

	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();

			switch (keyCode) {
			case KeyEvent.VK_LEFT:
				int len = str.length();
				String first, last;

				first = str.substring(0, 1);
				last = str.substring(1);

				str = last + first;
				la.setText(str);

				break;
			}
		}
	}

	public static void main(String[] args) {
		new leftKeyEx();
	}

}
