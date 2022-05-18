import javax.swing.*;
import java.awt.*;

public class RadioButtonEx extends JFrame {
	public RadioButtonEx() {
		setTitle("라디오버튼 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		ImageIcon cherryIcon = new ImageIcon(
				"E:\\2022 2학년 1학기 전공\\자바 프로그래밍\\[9장GUI배치관리자(실습에필요한images)9주차실습과제보고서]_files\\images\\cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon(
				"E:\\2022 2학년 1학기 전공\\자바 프로그래밍\\[9장GUI배치관리자(실습에필요한images)9주차실습과제보고서]_files\\images\\selectedCherry.jpg");

		ButtonGroup g = new ButtonGroup();
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배", true);
		JRadioButton cherry = new JRadioButton("체리", cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);

		g.add(apple);
		g.add(pear);
		g.add(cherry);

		c.add(apple);
		c.add(pear);
		c.add(cherry);
		setSize(250, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new RadioButtonEx();
	}
}
