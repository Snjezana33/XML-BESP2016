package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

public class SetKeystPassAction extends AbstractAction {

	public SetKeystPassAction() {
		
		KeyStroke ctrlPKeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK);
		putValue(ACCELERATOR_KEY, ctrlPKeyStroke);
		putValue(NAME, "Set Keystore Password...");
		this.setEnabled(false);
		
	}
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
