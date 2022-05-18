import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame {
	public LabelEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel textLabel = new JLabel("사랑합니다.");

		ImageIcon beauty = new ImageIcon(
				"E:\\2022 2학년 1학기 전공\\자바 프로그래밍\\[9장GUI배치관리자(실습에필요한images)9주차실습과제보고서]_files\\images\\beauty.jpg");
		JLabel imageLabel = new JLabel(beauty);

		ImageIcon normalIcon = new ImageIcon(
				"E:\\2022 2학년 1학기 전공\\자바 프로그래밍\\[9장GUI배치관리자(실습에필요한images)9주차실습과제보고서]_files\\images\\normalIcon.gif");
		JLabel label = new JLabel("보고싶으면 전화하세요", normalIcon, SwingConstants.CENTER);

		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);

		setSize(400, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LabelEx();
	}
}
