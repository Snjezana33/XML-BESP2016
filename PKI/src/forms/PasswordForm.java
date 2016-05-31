package forms;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PasswordForm extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6757683992968685951L;
	public static PasswordForm instance;
	
	public PasswordForm() {
		
		setSize(new Dimension(350,130));
		setLocationRelativeTo(null);
		setTitle("Generate Key Pair");
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(NORMAL);
		setResizable(false);
		//setUndecorated(true);
		//setUpMenu();
		//setJMenuBar(menuBar);
		initGui();
	}
	
	public void initGui() {
		
		JPanel panel = new JPanel();
		Container con = this.getContentPane();
		con.add(panel);
		//panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS));
		panel.setVisible(true);
		
		JLabel label1 = new JLabel();
		label1.setText("Enter New Password: ");
		
		JLabel label2 = new JLabel();
		label2.setText("Confirm New Password: ");
		
		JTextField text1 = new JTextField(15);
		
		JTextField text2 = new JTextField(15);
		
		panel.add(label1);
		panel.add(text1);
		
		panel.add(label2);
		panel.add(text2);
		
		JButton btnOk = new JButton("OK");
		JButton btnCancel = new JButton("Cancel");
		
		panel.add(btnOk);
		panel.add(btnCancel);
	}

}
