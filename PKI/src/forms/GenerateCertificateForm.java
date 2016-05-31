package forms;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;




public class GenerateCertificateForm extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4915449893971490741L;
	public static GenerateCertificateForm instance;
	
	public GenerateCertificateForm() {
		
		setSize(new Dimension(340,350));
		setLocationRelativeTo(null);
		setTitle("Generate Key Pair");
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(NORMAL);
		setResizable(false);
		//setUpMenu();
		//setJMenuBar(menuBar);
		
		initGui();
	}
	
	public void initGui() {
		
		JPanel panel = new JPanel();
		Container con = this.getContentPane();
		con.add(panel);
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		panel.setLayout(new FlowLayout());
//		panel.setAlignmentY(RIGHT_ALIGNMENT);
		panel.setVisible(true);
		
		JLabel label1 = new JLabel();
		label1.setText("Signature Algorithm: ");
		//label1.seta
		
		JLabel label2 = new JLabel();
		label2.setText("Validity (days): ");
		
		JLabel label3 = new JLabel();
		label3.setText("Common Name (CN): ");
		
		JLabel label4 = new JLabel();
		label4.setText("Organisation Unit (OU): ");
		
		JLabel label5 = new JLabel();
		label5.setText("Organisation Name (O): ");
		
		JLabel label6 = new JLabel();
		label6.setText("Locality Name (LN): ");
		
		JLabel label7 = new JLabel();
		label7.setText("State Name (SN): ");
		
		JLabel label8 = new JLabel();
		label8.setText("Country (C): ");
		
		JLabel label9 = new JLabel();
		label9.setText("Email (E): ");
		
		JComboBox<String> sa = new JComboBox<String>();
		sa.addItem("MD2withRSA");
		sa.addItem("MD5withRSA");
		sa.addItem("SHA1withRSA");
		sa.addItem("SHA224withRSA");
		sa.addItem("SHA256withRSA");
		sa.addItem("SHA384withRSA");
		sa.addItem("SHA512withRSA");
		sa.addItem("RIPEMD128withRSA");
		sa.addItem("RIPEMD160withRSA");
		sa.addItem("RIPMED256withRSA");
		sa.setToolTipText("Signature algorithm for certificate");
		sa.setSelectedItem("SHA256withRSA");
		
		JTextField text1 = new JTextField("356", 5);
		text1.setToolTipText("Certificate validity period");
		
		JTextField text2 = new JTextField(15);
		text2.setToolTipText("Common name of a person");
		
		JTextField text3 = new JTextField(15);
		text3.setToolTipText("Small organisation (e.g, department)");
		
		JTextField text4 = new JTextField(15);
		text4.setToolTipText("Large organisation name");
		
		JTextField text5 = new JTextField(15);
		text5.setToolTipText("Locality (city) name");
		
		JTextField text6 = new JTextField(15);
		text6.setToolTipText("State or province name");
		
		JTextField text7 = new JTextField("US");
		text7.setToolTipText("Two-letter country code");
		
		JTextField text8 = new JTextField(15);
		text8.setToolTipText("Email adress");
		
		panel.add(label1);
		panel.add(sa);
		panel.add(label2);
		panel.add(text1);
		
		JPanel panel2 = new JPanel();
		panel2.add(label3);
		panel2.add(text2);
		
		panel.add(panel2);
		
		panel.add(label4);
		panel.add(text3);
		
		panel.add(label5);
		panel.add(text4);
		
		panel.add(label6);
		panel.add(text5);
		
		panel.add(label7);
		panel.add(text6);
		
		panel.add(label8);
		panel.add(text7);
		
		JPanel panel3 = new JPanel();
		panel3.add(label9);
		panel3.add(text8);
		
		panel.add(panel3);
		
		JButton btnOk = new JButton("OK");
		JButton btnCancel = new JButton("Cancel");
		
		JPanel panel4 = new JPanel();
		panel4.add(btnOk);
		panel4.add(btnCancel);
		
		panel.add(panel4);
		
		

		
	}

}
