package chapter9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class calculatorSystem extends JFrame {
	public calculatorSystem() {
		setTitle("���� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		JPanel top = new JPanel();
		top.setLayout(new FlowLayout());
		top.setBackground(Color.red);
		top.add(new JLabel("�����Է�"));
		top.add(new JTextField(" ", 20));

		c.add(top, BorderLayout.NORTH);

		JPanel center = new JPanel();
		center.setLayout(new GridLayout(4, 4, 5, 5));
		JButton btn[] = new JButton[16];
		String name[] = { "��", "�Ӹ�", "��", "����", "����", "��", "����", "�ʹ�", "���", "�ּ�", "��", "����", "H", "E", "L", "P" };
		for (int i = 0; i < 16; i++) {
			btn[i] = new JButton(name[i]);
			if (i >= 12) {
				btn[i].setBackground(Color.yellow);
			}
			center.add(btn[i]);
		}
		c.add(center, BorderLayout.CENTER);

		JPanel bottom = new JPanel();
		bottom.setLayout(new FlowLayout());
		bottom.setBackground(Color.gray);
		bottom.add(new JLabel("��� ����"));
		bottom.add(new JTextField(" ", 20));
		c.add(bottom, BorderLayout.SOUTH);

		setSize(400, 200);
		setVisible(true);
	}
}

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new calculatorSystem();
	}

}