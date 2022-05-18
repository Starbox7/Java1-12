import javax.swing.*;
import java.awt.*;

public class GrphicsDrawImageEx1 extends JFrame {
	private MyPanel panel = new MyPanel();

	public GrphicsDrawImageEx1() {
		setTitle("���� ũ��� ���ϴ� ��ġ�� �̹��� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 420);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon(
				"E:\\2022 2�г� 1�б� ����\\�ڹ� ���α׷���\\[9��GUI��ġ������(�ǽ����ʿ���images)9�����ǽ���������]_files\\images\\image0.jpg");
		private Image img = icon.getImage(); // �̹��� ��ü

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 20, 20, this);
		}
	}

	public static void main(String[] args) {
		new GrphicsDrawImageEx1();
	}
}
