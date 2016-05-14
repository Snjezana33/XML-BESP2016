package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

public class SaveKeystoreAsAction extends AbstractAction {
	
	public SaveKeystoreAsAction() {
		
		putValue(SHORT_DESCRIPTION, "Save Keystore As");
		putValue(NAME, "Save Keystore As");
		this.setEnabled(false);
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
