import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Solution extends JFrame {
	private JTextField tf = new JTextField(20);
	private String [] text = {};


	public Solution() {
		setTitle("텍스트영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(tf);
		JComboBox<String> strCombo = new JComboBox<String>(text);
		c.add(strCombo);

		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				strCombo.addItem(t.getText());
			}
		});
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String [] args) {
		new Solution();
	}
}


//nameCombo.addItem(names[i]);
