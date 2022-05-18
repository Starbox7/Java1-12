import javax.swing.*;
import java.awt.*;

public class ButtonEx extends JFrame {
	public ButtonEx() {
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		ImageIcon normalIcon = new ImageIcon(
				"E:\\2022 2학년 1학기 전공\\자바 프로그래밍\\[9장GUI배치관리자(실습에필요한images)9주차실습과제보고서]_files\\images\\normalIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon(
				"E:\\2022 2학년 1학기 전공\\자바 프로그래밍\\[9장GUI배치관리자(실습에필요한images)9주차실습과제보고서]_files\\images\\rolloverIcon.gif");
		ImageIcon pressedIcon = new ImageIcon(
				"E:\\2022 2학년 1학기 전공\\자바 프로그래밍\\[9장GUI배치관리자(실습에필요한images)9주차실습과제보고서]_files\\images\\pressedIcon.gif");

		JButton btn = new JButton("call~~", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);

		c.add(btn);
		setSize(250, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonEx();
	}
}
