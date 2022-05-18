import javax.swing.*;
import java.awt.*;

public class GraphicsClipEx extends JFrame {
	private MyPanel panel = new MyPanel();

	public GraphicsClipEx() {
		setTitle("Ŭ���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 400);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon(
				"E:\\2022 2�г� 1�б� ����\\�ڹ� ���α׷���\\[9��GUI��ġ������(�ǽ����ʿ���images)9�����ǽ�����������]_files\\images\\image0.jpg");
		private Image img = icon.getImage(); // �̹��� ��ü

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setClip(100, 20, 150, 150);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			g.setColor(Color.YELLOW);
			g.setFont(new Font("Arial", Font.ITALIC, 40));
			g.drawString("Go Gator!!", 10, 150);
		}
	}

	public static void main(String[] args) {
		new GraphicsClipEx();
	}
}