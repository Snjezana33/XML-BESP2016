package forms;

import java.awt.BorderLayout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.ItemSelectable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.security.KeyStore;
import java.security.KeyStoreException;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import rs.ac.uns.ftn.informatika.ib.security.KeyStoreReader;
import rs.ac.uns.ftn.informatika.ib.security.KeyStoreWriter;

import rs.ac.uns.ftn.informatika.ib.security.KeyStoreReader;
import rs.ac.uns.ftn.informatika.ib.security.KeyStoreWriter;
import javax.swing.UIManager;

import org.bouncycastle.asn1.x500.X500NameBuilder;
import org.bouncycastle.asn1.x500.style.BCStyle;

import actions.CancelAction;
import actions.OkAction;



public class GenerateKeyPairForm extends JFrame{

	private static final long serialVersionUID = -572497822506860145L;

	public static GenerateKeyPairForm instance;
	
	private JButton btnOk;

	public GenerateKeyPairForm() {

		setSize(new Dimension(300, 150));
		setLocationRelativeTo(null);
		setTitle("Generate Key Pair");
		// setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(NORMAL);
		setResizable(false);
		// setUndecorated(true);
		// setUpMenu();
		// setJMenuBar(menuBar);
		initGui();
	}

	public void initGui() {

		JPanel panel = new JPanel();
		Container con = this.getContentPane();
		con.add(panel);
		// panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS));
		panel.setVisible(true);

		JLabel label = new JLabel();
		label.setText("Key Algorithm: ");

		final String textDSA = "DSA";
		JRadioButton btnDSA = new JRadioButton(textDSA);
		btnDSA.setActionCommand(textDSA);

		final String textRSA = "RSA";
		JRadioButton btnRSA = new JRadioButton(textRSA);
		btnRSA.setActionCommand(textRSA);
		btnRSA.setSelected(true);

		ButtonGroup group = new ButtonGroup();
		// group.add(label);
		group.add(btnDSA);
		group.add(btnRSA);

		panel.add(label);
		panel.add(btnDSA);
		panel.add(btnRSA);

		JLabel label2 = new JLabel();
		label2.setText("Key size: ");

		final JComboBox<Integer> size = new JComboBox<Integer>();
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
		
		btnOk = new JButton(new OkAction(this));
		JButton btnCancel = new JButton(new CancelAction(this));

		JPanel panel3 = new JPanel();
		panel3.add(btnOk);
		panel3.add(btnCancel);

		panel.add(panel3);

		btnDSA.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// Execute when button is pressed
				System.out.println("You clicked the button");
				btnOk.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.println("ok");
						try {
							KeyStore.getInstance(textDSA);
						//	KeyStoreReader.readKeyStore();
						//	KeyStoreWriter.loadKeyStore("./data/marija.jks",
						//			null);
							
							setVisible(false);
							new GenerateCertificateForm().dispose();
							
							
						} catch (KeyStoreException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

					}
				});
			}

		});

		btnRSA.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// Execute when button is pressed
				//System.out.println("You clicked the button");
				btnOk.addActionListener(new ActionListener() {
					@SuppressWarnings("deprecation")
					public void actionPerformed(ActionEvent e) {
						//System.out.println("ok");
						try {
							KeyStore.getInstance(textRSA);
							System.out.println(KeyStore.getInstance(textRSA));
							setVisible(false);
							new GenerateCertificateForm().dispose();
							
							
						} catch (KeyStoreException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

					}
				});
			}

		});
		
		
//		btnOk.addActionListener(new A)

	/*	ItemListener itemListener = new ItemListener() {
			public void itemStateChanged(ItemEvent itemEvent) {
				int state = itemEvent.getStateChange();
				System.out.println((state == ItemEvent.SELECTED) ? "Selected"
						: "Deselected");
				System.out.println("Item: " + itemEvent.getItem());
				ItemSelectable is = itemEvent.getItemSelectable();
				System.out.println(", Selected: " + selectedString(is));
			}
		};
		size.addItemListener(itemListener);*/
		
		
	     // JComboBox comboBox = new JComboBox(names);
	        //
	        // Create an ActionListener for the JComboBox component.
	        //
	        size.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	                //
	                // Get the source of the component, which is our combo
	                // box.
	                //
	                JComboBox size = (JComboBox) event.getSource();

	                //
	                // Print the selected items and the action command.
	                //
	                Object selected = size.getSelectedItem();
	                System.out.println("Selected Item  = " + selected);
	                String command = event.getActionCommand();
	                System.out.println("Action Command = " + command);

	                //
	                // Detect whether the action command is "comboBoxEdited"
	                // or "comboBoxChanged"
	                //
	                if ("comboBoxEdited".equals(command)) {
	                    System.out.println("User has typed a string in " +
	                            "the combo box.");
	                } else if ("comboBoxChanged".equals(command)) {
	                    System.out.println("User has selected an item " +
	                            "from the combo box.");
	                }
	            }
	        });
		
		
		
		
	}

	/*static private String selectedString(ItemSelectable is) {
		Object selected[] = is.getSelectedObjects();
		return ((selected.length == 0) ? "null" : (String) selected[0]);
	}
*/
}
