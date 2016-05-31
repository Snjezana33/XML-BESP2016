package forms;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GenerateKeyPairForm extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -572497822506860145L;
	public static GenerateKeyPairForm instance;
	
	public GenerateKeyPairForm() {
		
		setSize(new Dimension(300,150));
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
	
	public void initGui(){
		
		JPanel panel = new JPanel();
		Container con = this.getContentPane();
		con.add(panel);
		//panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS));
		panel.setVisible(true);
		
		JLabel label = new JLabel();
		label.setText("Key Algorithm: ");
		
		String textDSA = "DSA";
		JRadioButton btnDSA = new JRadioButton(textDSA);
		btnDSA.setActionCommand(textDSA);
		
		String textRSA = "RSA";
		JRadioButton btnRSA = new JRadioButton(textRSA);
		btnRSA.setActionCommand(textRSA);
		btnRSA.setSelected(true);
		
		ButtonGroup group = new ButtonGroup();
//		group.add(label);
		group.add(btnDSA);
		group.add(btnRSA);
		
		panel.add(label);
		panel.add(btnDSA);
		panel.add(btnRSA);
		
		JLabel label2 = new JLabel();
		label2.setText("Key size: ");
		
		JComboBox<Integer> size = new JComboBox<Integer>();
		size.addItem(4096);
		size.addItem(2048);
		size.addItem(1024);
		size.addItem(512);
		size.setEditable(true);
		size.setToolTipText("Key strength in bits");
		size.setSelectedItem(2048);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.LINE_AXIS));
		
		panel2.add(label2);
		panel2.add(size);
		
		panel.add(panel2);
		
		JButton btnOk = new JButton("OK");
		JButton btnCancel = new JButton("Cancel");
		
		JPanel panel3 = new JPanel();
		panel3.add(btnOk);
		panel3.add(btnCancel);
		
		panel.add(panel3);
		
	
	}

}
