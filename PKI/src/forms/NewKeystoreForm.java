package forms;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.security.KeyStore;
import java.security.KeyStoreException;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class NewKeystoreForm extends JFrame {
	
	public static NewKeystoreForm instance;
	public KeyStore keystore;
	
	public NewKeystoreForm() {
		
		setSize(new Dimension(300,300));
		setLocationRelativeTo(null);
		setTitle("New Keystore Type");
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
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		panel.setVisible(true);
		//panel.setAlignmentX(LEFT_ALIGNMENT);
		//panel.setBackground(new Color(0, 0, 0));
		//panel.setPreferredSize(new Dimension(250, 300));
		
		final String text1 = "JKS";
		JRadioButton button1 = new JRadioButton(text1);
		button1.setActionCommand(text1);
		button1.setMnemonic(KeyEvent.VK_J);
		button1.setSelected(true);
		//button1.setAlignmentX(CENTER_ALIGNMENT);

		
		final String text2 = "PKCS#12";
		JRadioButton button2 = new JRadioButton(text2);
		button2.setActionCommand(text2);
		button2.setMnemonic(KeyEvent.VK_P);
		//button2.setAlignmentX(CENTER_ALIGNMENT);

		
		final String text3 = "JCEKS";
		JRadioButton button3 = new JRadioButton(text3);
		button3.setActionCommand(text3);
		button3.setMnemonic(KeyEvent.VK_C);
		//button3.setAlignmentX(CENTER_ALIGNMENT);

		
		final String text4 = "JKS(case sensitive)";
		JRadioButton button4 = new JRadioButton(text4);
		button4.setActionCommand(text4);
		button4.setMnemonic(KeyEvent.VK_S);
		//button4.setAlignmentX(CENTER_ALIGNMENT);

		
		final String text5 = "BKS";
		JRadioButton button5 = new JRadioButton(text5);
		button5.setActionCommand(text5);
		button5.setMnemonic(KeyEvent.VK_B);
		//button5.setAlignmentX(CENTER_ALIGNMENT);

		
		final String text6 = "BKS-V1";
		JRadioButton button6 = new JRadioButton(text6);
		button6.setActionCommand(text6);
		button6.setMnemonic(KeyEvent.VK_1);
		//button6.setAlignmentX(CENTER_ALIGNMENT);
		

		final String text7 = "UBER";
		JRadioButton button7 = new JRadioButton(text7);
		button7.setActionCommand(text7);
		button7.setMnemonic(KeyEvent.VK_U);
		//button7.setAlignmentX(CENTER_ALIGNMENT);

		
		JLabel label = new JLabel();
		label.setText("Select the type of the new keystore: ");
		//label.setAlignmentX(LEFT_ALIGNMENT);
		
		final JButton btn1 = new JButton("OK");
		final JButton btn2 = new JButton("Cancel");
		
		//btn1.setBounds(250, 250, 200, 100);
		
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
		
		//panel.add(btn1);
		//panel.add(btn2);
		
		JPanel spanel = new JPanel();
		//spanel.setLayout(new BoxLayout(spanel, BoxLayout.LINE_AXIS));
		spanel.setVisible(true);
		//spanel.setPreferredSize(new Dimension(250, ));

		panel.add(spanel);
		
		spanel.add(btn1);
		spanel.add(btn2);
		
	
	
	
	
	button1.addActionListener(new ActionListener() {
		  
        public void actionPerformed(ActionEvent e)
        {
            //Execute when button is pressed
            System.out.println("You clicked the button");
            btn1.addActionListener(new ActionListener(){
            	public void actionPerformed(ActionEvent e){
            		System.out.println("ok");
            		try {
						keystore.getInstance(text1);
					} catch (KeyStoreException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            	   // keystore.getProvider();
            	  //  keystore.getType();
            	    
            	}
            });
            	
            
        	btn2.addActionListener(new ActionListener(){
        		public void actionPerformed(ActionEvent e){
        			System.out.println("Cancel");
        		}
        	});
        	
        	}
        
    });     

	button2.addActionListener(new ActionListener() {
		  
        public void actionPerformed(ActionEvent e)
        {
            //Execute when button is pressed
            System.out.println("You clicked the button");
            btn1.addActionListener(new ActionListener(){
            	public void actionPerformed(ActionEvent e){
            		System.out.println("ok");
            		try {
						keystore.getInstance(text2);
					} catch (KeyStoreException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            	}
            });
            	
            
        	btn2.addActionListener(new ActionListener(){
        		public void actionPerformed(ActionEvent e){
        			System.out.println("Cancel");
        		}
        	});
        	
        	}
        
    });     
	button3.addActionListener(new ActionListener() {
		  
        public void actionPerformed(ActionEvent e)
        {
            //Execute when button is pressed
            System.out.println("You clicked the button");
            btn1.addActionListener(new ActionListener(){
            	public void actionPerformed(ActionEvent e){
            		System.out.println("ok");
            		try {
						keystore.getInstance(text3);
						System.out.println(keystore.getInstance(text3));
					} catch (KeyStoreException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            	}
            });
            	
            
        	btn2.addActionListener(new ActionListener(){
        		public void actionPerformed(ActionEvent e){
        			System.out.println("Cancel");
        		}
        	});
        	
        	}
        
    });     
	button4.addActionListener(new ActionListener() {
		  
        public void actionPerformed(ActionEvent e)
        {
            //Execute when button is pressed
            System.out.println("You clicked the button");
            btn1.addActionListener(new ActionListener(){
            	public void actionPerformed(ActionEvent e){
            		System.out.println("ok");
            		try {
						keystore.getInstance(text4);
					} catch (KeyStoreException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            	}
            });
            	
            
        	btn2.addActionListener(new ActionListener(){
        		public void actionPerformed(ActionEvent e){
        			System.out.println("Cancel");
        		}
        	});
        	
        	}
        
    });     
	button5.addActionListener(new ActionListener() {
		  
        public void actionPerformed(ActionEvent e)
        {
            //Execute when button is pressed
            System.out.println("You clicked the button");
            btn1.addActionListener(new ActionListener(){
            	public void actionPerformed(ActionEvent e){
            		System.out.println("ok");
            		try {
						keystore.getInstance(text5);
					} catch (KeyStoreException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            	}
            });
            	
            
        	btn2.addActionListener(new ActionListener(){
        		public void actionPerformed(ActionEvent e){
        			System.out.println("Cancel");
        		}
        	});
        	
        	}
        
    });     

	button6.addActionListener(new ActionListener() {
		  
        public void actionPerformed(ActionEvent e)
        {
            //Execute when button is pressed
            System.out.println("You clicked the button");
            btn1.addActionListener(new ActionListener(){
            	public void actionPerformed(ActionEvent e){
            		System.out.println("ok");
            		try {
						keystore.getInstance(text6);
					} catch (KeyStoreException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            	}
            });
            	
            
        	btn2.addActionListener(new ActionListener(){
        		public void actionPerformed(ActionEvent e){
        			System.out.println("Cancel");
        		}
        	});
        	
        	}
        
    });     

	button7.addActionListener(new ActionListener() {
		  
        public void actionPerformed(ActionEvent e)
        {
            //Execute when button is pressed
            System.out.println("You clicked the button");
            btn1.addActionListener(new ActionListener(){
            	public void actionPerformed(ActionEvent e){
            		System.out.println("ok");
            		try {
						keystore.getInstance(text7);
					} catch (KeyStoreException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            	}
            });
            	
            
        	btn2.addActionListener(new ActionListener(){
        		public void actionPerformed(ActionEvent e){
        			System.out.println("Cancel");
        		}
        	});
        	
        	}
        
    });     

	
	}


	public static NewKeystoreForm getInstance(){
		if (instance==null)
			instance=new NewKeystoreForm();
		return instance;

	}

}
