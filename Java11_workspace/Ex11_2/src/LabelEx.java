import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame {
	public LabelEx() {
		setTitle("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel textLabel = new JLabel("����մϴ�.");

		ImageIcon beauty = new ImageIcon(
				"E:\\2022 2�г� 1�б� ����\\�ڹ� ���α׷���\\[9��GUI��ġ������(�ǽ����ʿ���images)9�����ǽ���������]_files\\images\\beauty.jpg");
		JLabel imageLabel = new JLabel(beauty);

		ImageIcon normalIcon = new ImageIcon(
				"E:\\2022 2�г� 1�б� ����\\�ڹ� ���α׷���\\[9��GUI��ġ������(�ǽ����ʿ���images)9�����ǽ���������]_files\\images\\normalIcon.gif");
		JLabel label = new JLabel("��������� ��ȭ�ϼ���", normalIcon, SwingConstants.CENTER);

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
