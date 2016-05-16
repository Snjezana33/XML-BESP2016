package forms;

import gui.main.form.MainFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class NewKeystoreForm extends JFrame {
	
	public static NewKeystoreForm instance;
	
	public NewKeystoreForm() {
		
		setSize(new Dimension(250,300));
		setLocationRelativeTo(null);
		setTitle("New Keystore Type");
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(NORMAL);
		setResizable(false);
		//setUpMenu();
		//setJMenuBar(menuBar);
		initGui();
	}
	
	private void initGui() {
		
		JPanel panel = new JPanel();
		Container con = this.getContentPane();
		con.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		panel.setVisible(true);
		panel.setBackground(new Color(0, 0, 0));
		
		String text1 = "JKS";
		JRadioButton button1 = new JRadioButton(text1);
		button1.setActionCommand(text1);
		button1.setMnemonic(KeyEvent.VK_J);
		button1.setSelected(true);
		
		String text2 = "PKCS#12";
		JRadioButton button2 = new JRadioButton(text2);
		button2.setActionCommand(text2);
		button2.setMnemonic(KeyEvent.VK_P);
		
		String text3 = "JCEKS";
		JRadioButton button3 = new JRadioButton(text3);
		button3.setActionCommand(text3);
		button3.setMnemonic(KeyEvent.VK_C);
		
		String text4 = "JKS(case sensitive)";
		JRadioButton button4 = new JRadioButton(text4);
		button4.setActionCommand(text4);
		button4.setMnemonic(KeyEvent.VK_S);
		
		String text5 = "BKS";
		JRadioButton button5 = new JRadioButton(text5);
		button5.setActionCommand(text5);
		button5.setMnemonic(KeyEvent.VK_B);
		
		String text6 = "BKS-V1";
		JRadioButton button6 = new JRadioButton(text6);
		button6.setActionCommand(text6);
		button6.setMnemonic(KeyEvent.VK_1);
		
		String text7 = "UBER";
		JRadioButton button7 = new JRadioButton(text7);
		button7.setActionCommand(text7);
		button7.setMnemonic(KeyEvent.VK_U);
		
		JLabel label = new JLabel();
		label.setText("Select the type of the new keystore: ");
		
		JButton btn1 = new JButton("OK");
		JButton btn2 = new JButton("Cancel");
		
		btn1.setBounds(250, 250, 200, 100);
		
		ButtonGroup group = new ButtonGroup();
		group.add(button1);
		group.add(button2);
		group.add(button3);
		group.add(button4);
		group.add(button5);
		group.add(button6);
		group.add(button7);
		
		
		panel.add(label);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		
		panel.add(btn1);
		//panel.add(btn2);
		
		
	}

	public static NewKeystoreForm getInstance(){
		if (instance==null)
			instance=new NewKeystoreForm();
		return instance;

	}

}
