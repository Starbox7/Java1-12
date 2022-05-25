import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class GraphicsDrawPolygonEx extends JFrame {
	GraphicsDrawPolygonEx() {
		this.setTitle("drawPolygon 사용 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MyPanel panel = new MyPanel();

		this.add(panel, BorderLayout.CENTER);
		this.setLocationRelativeTo(null);
		this.setSize(300, 300);
		this.setVisible(true);
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);

			for (int i = 0; i < 10; i++) {
				int[] x = { getWidth() / 2, 0+i*10, getWidth() / 2, getWidth()-i*10 };
				int[] y = { getHeight()-i*10, getHeight() / 2, 0+i*10, getHeight() / 2 };
				g.drawPolygon(x, y, 4);
			}
		}
	}
}

public class Ten_Rectangle {
	public static void main(String[] args) {
		new GraphicsDrawPolygonEx();
	}
}