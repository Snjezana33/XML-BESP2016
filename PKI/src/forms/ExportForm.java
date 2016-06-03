package forms;

import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ExportForm extends JFrame {
	
	public static ExportForm instance;
	
	public ExportForm() {
		
		setSize(new Dimension(270,300));
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
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		panel.setVisible(true);
		
		JLabel label1 = new JLabel();
		label1.setText("Export Type");
		
		String text1 = "Head Certificate";
		JRadioButton btnHC = new JRadioButton(text1);
		btnHC.setActionCommand(text1);
		btnHC.setSelected(true);
		
		String text2 = "Certificate Chain";
		JRadioButton btnCC = new JRadioButton(text2);
		btnCC.setActionCommand(text2);
		
		String text3 = "Private Key and Certificates";
		JRadioButton btnPKC = new JRadioButton(text3);
		btnPKC.setActionCommand(text3);
		
		ButtonGroup group = new ButtonGroup();
		group.add(btnHC);
		group.add(btnCC);
		group.add(btnPKC);
		
		panel.add(label1);
		panel.add(btnHC);
		panel.add(btnCC);
		panel.add(btnPKC);
		
		JLabel label2 = new JLabel();
		label2.setText("Export Format");
		
		String text4 = "DER Encoded";
		JRadioButton btnDE = new JRadioButton(text4);
		btnDE.setActionCommand(text4);
		btnDE.setSelected(true);
		
		String text5 = "PEM Encoded";
		JRadioButton btnPE = new JRadioButton(text5);
		btnPE.setActionCommand(text5);
		
		String text6 = "PKCS #7";
		JRadioButton btnPKCS = new JRadioButton(text6);
		btnPKCS.setActionCommand(text6);
		
		String text7 = "PkiPath";
		JRadioButton btnPP = new JRadioButton(text7);
		btnPP.setActionCommand(text7);
		
		String text8 = "PKCS #12";
		JRadioButton btnP12 = new JRadioButton(text8);
		btnP12.setActionCommand(text8);
		btnP12.setEnabled(false);
		
		ButtonGroup group2 = new ButtonGroup();
		group2.add(btnDE);
		group2.add(btnPE);
		group2.add(btnPKCS);
		group2.add(btnPP);
		group2.add(btnP12);
		
		panel.add(label2);
		panel.add(btnDE);
		panel.add(btnPE);
		panel.add(btnPKCS);
		panel.add(btnPP);
		panel.add(btnP12);
		
		JButton btnOk = new JButton("OK");
		JButton btnCancel = new JButton("Cancel");
		
		JPanel panelBtn = new JPanel();
		panelBtn.add(btnOk);
		panelBtn.add(btnCancel);
		
		panel.add(panelBtn);
	}


}
