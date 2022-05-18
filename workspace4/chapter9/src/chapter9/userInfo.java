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
		
		

		c.add(new JLabel("성명 "));
		c.add(new JTextField("김범준", 20));
		c.add(new JLabel("학번 "));
		c.add(new JTextField("18114847", 20));
		c.add(new JLabel("학과 "));
		c.add(new JTextField("모바일소프트웨어", 20));
		c.add(new JLabel("장래희망 "));
		c.add(new JTextField("프로그래머", 20));
		c.add(new JLabel("여름방학 계획 "));
		c.add(new JTextField("유니티 공부", 20));
		c.add(new JLabel("다음학기 계획 "));
		c.add(new JTextField("전공 공부", 20));
		c.add(new JLabel("좌우명 "));
		c.add(new JTextField("즐겁게 살자", 20));
		
		
		
		c.add(new JLabel("내인생의 멘토 "));
		c.add(testArea);
		c.add(new JScrollPane(testArea));

		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new userInfo();
	}
}