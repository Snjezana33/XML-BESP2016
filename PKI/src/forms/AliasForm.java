package forms;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AliasForm extends JFrame {
	
<<<<<<< HEAD
	/**
	 * 
	 */
	private static final long serialVersionUID = -3649570825540931925L;
=======
>>>>>>> bc552d1afa288b7d161ead30044c4167aede56ab
	public static AliasForm instance;
	
	public AliasForm() {
		
		setSize(new Dimension(300,100));
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
		
		JLabel label = new JLabel();
		label.setText("Enter Alias: ");
		
		JTextField text1 = new JTextField(15);
		
		panel.add(label);
		panel.add(text1);
		
		JButton btnOk = new JButton("OK");
		JButton btnCancel = new JButton("Cancel");
		
		JPanel panel2 = new JPanel();
		panel2.add(btnOk);
		panel2.add(btnCancel);
		
		panel.add(panel2);
	}

}
