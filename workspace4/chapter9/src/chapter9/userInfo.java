package chapter9;

import javax.swing.*;
import java.awt.*;

public class userInfo extends JFrame {
	userInfo() {
		setTitle("UserInfo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JTextArea testArea = new JTextArea();
		testArea.setBounds(50, 50, 300, 300); 
		testArea.setEditable(true);
		
		

		c.add(new JLabel("���� "));
		c.add(new JTextField("�����", 20));
		c.add(new JLabel("�й� "));
		c.add(new JTextField("18114847", 20));
		c.add(new JLabel("�а� "));
		c.add(new JTextField("����ϼ���Ʈ����", 20));
		c.add(new JLabel("�巡��� "));
		c.add(new JTextField("���α׷���", 20));
		c.add(new JLabel("�������� ��ȹ "));
		c.add(new JTextField("����Ƽ ����", 20));
		c.add(new JLabel("�����б� ��ȹ "));
		c.add(new JTextField("���� ����", 20));
		c.add(new JLabel("�¿�� "));
		c.add(new JTextField("��̰� ����", 20));
		
		
		
		c.add(new JLabel("���λ��� ���� "));
		c.add(testArea);
		c.add(new JScrollPane(testArea));

		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new userInfo();
	}
}