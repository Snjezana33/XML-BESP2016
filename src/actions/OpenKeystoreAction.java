package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

public class OpenKeystoreAction extends AbstractAction {
	
	public OpenKeystoreAction() {
		KeyStroke ctrlOKeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK);
		putValue(ACCELERATOR_KEY, ctrlOKeyStroke);
		putValue(SHORT_DESCRIPTION, "Open Keystore");
		putValue(NAME, "Open Keystore");
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
