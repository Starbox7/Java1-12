import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class Solution extends JFrame {
	private JLabel[] num = new JLabel[10];
	private int n = 0;
	Random r = new Random();

	public Solution() {
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);

		for (int i = 0; i < 10; i++) {
			num[i] = new JLabel("" + i);
			int x = r.nextInt(500);
			int y = r.nextInt(500);
			num[i].setBounds(x, y, 35, 35);
			num[i].addMouseListener(new MML());
			c.add(num[i]);
		}
		

		setSize(600, 600);
		setVisible(true);
	}
	
	class MML extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			JLabel la = (JLabel)e.getSource();
			System.out.println("num[n].getText(): " + num[n].getText());
			System.out.println(n);

			if (n == 9) {
				for (int i = 0; i < 10; i++) {
					num[i].setVisible(true);
					num[i].setBounds(r.nextInt(500), r.nextInt(500), 35, 35);
				}
				n = 0;
			} else if(la.getText().equals(n+"")) {
				num[n].setVisible(false);
				n += 1;
			}
		}
	}

	public static void main(String[] args) {
		new Solution();
	}

}
