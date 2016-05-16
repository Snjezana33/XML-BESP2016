package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

public class NewKeystoreAction extends AbstractAction {

	public NewKeystoreAction() {
		
		KeyStroke ctrlNKeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_N , ActionEvent.CTRL_MASK);
		putValue(ACCELERATOR_KEY, ctrlNKeyStroke);
		putValue(SMALL_ICON, new ImageIcon("images/new_keystore.png"));
		putValue(NAME, "New Keystore");
	}
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	

}
