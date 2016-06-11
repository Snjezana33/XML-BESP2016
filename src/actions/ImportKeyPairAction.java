package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

public class ImportKeyPairAction extends AbstractAction {
	
	public ImportKeyPairAction() {
		
		KeyStroke ctrlKKeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_K, ActionEvent.CTRL_MASK);
		putValue(ACCELERATOR_KEY, ctrlKKeyStroke);
		putValue(NAME, "Import Key Pair...");
		this.setEnabled(false);
		
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
