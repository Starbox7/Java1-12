import javax.swing.*;
import java.awt.*;

public class ButtonEx extends JFrame {
	public ButtonEx() {
		setTitle("�̹��� ��ư ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		ImageIcon normalIcon = new ImageIcon(
				"E:\\2022 2�г� 1�б� ����\\�ڹ� ���α׷���\\[9��GUI��ġ������(�ǽ����ʿ���images)9�����ǽ���������]_files\\images\\normalIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon(
				"E:\\2022 2�г� 1�б� ����\\�ڹ� ���α׷���\\[9��GUI��ġ������(�ǽ����ʿ���images)9�����ǽ���������]_files\\images\\rolloverIcon.gif");
		ImageIcon pressedIcon = new ImageIcon(
				"E:\\2022 2�г� 1�б� ����\\�ڹ� ���α׷���\\[9��GUI��ġ������(�ǽ����ʿ���images)9�����ǽ���������]_files\\images\\pressedIcon.gif");

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
