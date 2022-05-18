package ch10_07;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class MousewWheelEventEx extends JFrame {
	private JLabel la = new JLabel("Love Java");

	public MousewWheelEventEx() {
		setTitle("10장 실습 7번");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		la.setLocation(400, 200);
		la.setSize(80, 40);
		// la.setPreferredSize(new Dimension(170, 90));
		la.setHorizontalAlignment(JLabel.CENTER);
		c.add(la);

		la.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				int size = la.getFont().getSize();
				int n = e.getWheelRotation();
				if (n < 0) {
					size += 5;
				} else {
					if (size > 15)
						size -= 5;
				}
				la.setFont(new Font("Arial", Font.PLAIN, size));
				la.setSize(size, size);
			}
		});

		setSize(800, 400);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();

	}

	public static void main(String[] args) {
		new MousewWheelEventEx();
	}

}
