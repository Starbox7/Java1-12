package chapter9;

import javax.swing.*;
import java.awt.*;

public class Ex8 extends JFrame {

	public Ex8() {
		setTitle("여러개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		// -------------------------------------------------------------------
		JPanel top = new Top2();
		c.add(top, BorderLayout.NORTH);

		JPanel center = new Center2();
		c.add(center, BorderLayout.CENTER);
		
		JPanel south = new South();
		c.add(south, BorderLayout.SOUTH);

		setSize(400, 550);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex8 oc = new Ex8();
	}

}

class Top2 extends JPanel {
	public Top2() {
		setLayout(new FlowLayout());	
		setBackground(Color.LIGHT_GRAY);
		add(new JButton("열기"));
		add(new JButton("닫기"));
		add(new JButton("나가기"));
	}

}

class Center2 extends JPanel {
	public Center2() {
		setLayout(null);
		
		for (int i = 0; i < 10; i++) {
			JLabel j = new JLabel("*");
			int x = (int) (Math.random() * 200) + 50;
			int y = (int) (Math.random() * 200) + 50;
			j.setLocation(x, y);
			j.setSize(10, 10);
			j.setOpaque(true);
			j.setForeground(Color.red);
			add(j);
		}

	}
}

class South extends JPanel{
	public South() {
		setLayout(new FlowLayout());
		setBackground(Color.yellow);
		add(new JButton("Word Input"));
		add(new JTextField(20));
	}
}
