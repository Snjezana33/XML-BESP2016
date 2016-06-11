package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

public class SaveKeystoreAction extends AbstractAction {
	
	public SaveKeystoreAction() {
		
		KeyStroke ctrlSKeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK);
		putValue(ACCELERATOR_KEY, ctrlSKeyStroke);
		putValue(SHORT_DESCRIPTION, "Save Keystore");
		putValue(NAME, "Save Keystore");
		this.setEnabled(false);
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
