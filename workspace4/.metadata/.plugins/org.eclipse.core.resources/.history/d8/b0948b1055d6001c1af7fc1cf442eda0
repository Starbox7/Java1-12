package open_challenge_10;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class myChallenge extends JFrame {
	private JLabel la = new JLabel("시작합니다.");
	private JLabel numX = new JLabel("0");
	private JLabel numY = new JLabel("0");
	private JLabel numZ = new JLabel("0");

	public myChallenge() {
		setTitle("오픈 챌린지 10장");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);
		c.addKeyListener(new MyKeyListener());

		la.setLocation(300, 270);
		la.setSize(150, 30);
		c.add(la);

		Color color = new Color(128, 0, 128);

		numX.setLocation(100, 100);
		numX.setSize(100, 45);
		numX.setForeground(Color.YELLOW);
		numX.setOpaque(true);
		numX.setBackground(color);
		numX.setFont(new Font("Serif", Font.BOLD, 30));
		numX.setHorizontalAlignment(JLabel.CENTER);
		c.add(numX);

		numY.setLocation(300, 100);
		numY.setSize(100, 45);
		numY.setForeground(Color.YELLOW);
		numY.setOpaque(true);
		numY.setBackground(color);
		numY.setFont(new Font("Serif", Font.BOLD, 30));
		numY.setHorizontalAlignment(JLabel.CENTER);
		c.add(numY);

		numZ.setLocation(500, 100);
		numZ.setSize(100, 45);
		numZ.setForeground(Color.YELLOW);
		numZ.setOpaque(true);
		numZ.setBackground(color);
		numZ.setFont(new Font("Serif", Font.BOLD, 30));
		numZ.setHorizontalAlignment(JLabel.CENTER);
		c.add(numZ);

		setSize(700, 400);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}

	class MyKeyListener extends KeyAdapter {

		public void keyPressed(KeyEvent e) {
			Container component = (Container)e.getSource();

			if (e.getKeyChar() == '\n') {
				int x = (int) (Math.random() * 5);
				int y = (int) (Math.random() * 5);
				int z = (int) (Math.random() * 5);

				numX.setText("" + x);
				numY.setText("" + y);
				numZ.setText("" + z);
				if (x == y && y == z && z == x) {
					la.setText("축하합니다!!!");
					component.setFocusable(false);
				} else {
					la.setText("아쉽군요");
				}
			}
		}
	}

	public static void main(String[] args) {
		new myChallenge();
	}

}
