package chapter9;

import javax.swing.*;
import java.awt.*;

public class openChallenge extends JFrame {

	public openChallenge() {
		setTitle("ContentPane°ú JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		// -------------------------------------------------------------------
		JPanel top = new Top();
		c.add(top, BorderLayout.NORTH);

		JPanel center = new Center();
		c.add(center, BorderLayout.CENTER);

		setSize(400, 550);
		setVisible(true);
	}

	public static void main(String[] args) {
		openChallenge oc = new openChallenge();
	}

}

class Top extends JPanel {
	public Top() {
		setLayout(new FlowLayout());	
		setBackground(Color.LIGHT_GRAY);
		add(new JButton("Open"));
		add(new JButton("Read"));
		add(new JButton("Close"));
	}

}

class Center extends JPanel {
	public Center() {
		setLayout(null);
		
		JLabel hello = new JLabel("Hello");
		hello.setLocation(130, 50);
		hello.setSize(200, 20);
		add(hello);

		JLabel java = new JLabel("Java");
		java.setLocation(50, 150);
		java.setSize(200, 20);
		add(java);

		JLabel love = new JLabel("Love");
		love.setLocation(150, 250);
		love.setSize(200, 20);
		add(love);

	}
}
