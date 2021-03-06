
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class ImageGalleryApp extends JFrame {
	Vector<ImageIcon> v = new Vector<ImageIcon>();
	ImageIcon[] img = new ImageIcon[4];
	int n = 0;
	JLabel la = new JLabel();
	JButton[] jb = new JButton[2];

	class ButtonPanel extends JPanel {
		public ButtonPanel() {
			setBackground(Color.DARK_GRAY);
			setLayout(new FlowLayout());

			ImageIcon left = new ImageIcon(
					"E:\\2022 2학년 1학기 전공\\자바 프로그래밍\\Java11_workspace\\Image_gallery_Openchallenge\\images\\left.png");
			ImageIcon right = new ImageIcon(
					"E:\\2022 2학년 1학기 전공\\자바 프로그래밍\\Java11_workspace\\Image_gallery_Openchallenge\\images\\right.png");

			jb[0] = new JButton(left);
			jb[1] = new JButton(right);

			jb[0].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (n > 0) {
						n--;
						la.setIcon(img[n]);
					} else if (n <= 0) {
						n += 3;
						la.setIcon(img[n]);
					}
				}
			});
			jb[1].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					n++;
					n %= 4;
					la.setIcon(img[n]);
				}
			});
			jb[0].setPreferredSize(new Dimension(150, 120));
			jb[1].setPreferredSize(new Dimension(150, 120));
			add(jb[0]);
			add(jb[1]);
		}
	}

	public ImageGalleryApp() {
		setTitle("갤러리 App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		img[0] = new ImageIcon(
				"E:\\2022 2학년 1학기 전공\\자바 프로그래밍\\Java11_workspace\\Image_gallery_Openchallenge\\images\\image1.png");
		img[1] = new ImageIcon(
				"E:\\2022 2학년 1학기 전공\\자바 프로그래밍\\Java11_workspace\\Image_gallery_Openchallenge\\images\\image2.png");
		img[2] = new ImageIcon(
				"E:\\2022 2학년 1학기 전공\\자바 프로그래밍\\Java11_workspace\\Image_gallery_Openchallenge\\images\\image3.png");
		img[3] = new ImageIcon(
				"E:\\2022 2학년 1학기 전공\\자바 프로그래밍\\Java11_workspace\\Image_gallery_Openchallenge\\images\\image4.png");

		la.setIcon(img[n]);
		la.setHorizontalAlignment(SwingConstants.CENTER);

		ButtonPanel bp = new ButtonPanel();
		c.add(la, BorderLayout.CENTER);
		c.add(bp, BorderLayout.SOUTH);

		setSize(650, 800);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ImageGalleryApp();

	}

}
