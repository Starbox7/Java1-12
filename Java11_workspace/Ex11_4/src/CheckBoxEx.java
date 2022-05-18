import javax.swing.*;
import java.awt.*;

public class CheckBoxEx extends JFrame {
	public CheckBoxEx() {
		setTitle("üũ�ڽ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		ImageIcon cherryIcon = new ImageIcon(
				"E:\\2022 2�г� 1�б� ����\\�ڹ� ���α׷���\\[9��GUI��ġ������(�ǽ����ʿ���images)9�����ǽ�����������]_files\\images\\cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon(
				"E:\\2022 2�г� 1�б� ����\\�ڹ� ���α׷���\\[9��GUI��ġ������(�ǽ����ʿ���images)9�����ǽ�����������]_files\\images\\selectedCherry.jpg");

		JCheckBox apple = new JCheckBox("���");
		JCheckBox pear = new JCheckBox("��", true);
		JCheckBox cherry = new JCheckBox("ü��", cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);

		c.add(apple);
		c.add(pear);
		c.add(cherry);

		setSize(250, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CheckBoxEx();
	}
}