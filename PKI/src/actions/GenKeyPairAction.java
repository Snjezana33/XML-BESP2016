package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

public class GenKeyPairAction extends AbstractAction {

	public GenKeyPairAction() {
		
		KeyStroke ctrlGKeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK);
		putValue(ACCELERATOR_KEY, ctrlGKeyStroke);
		putValue(NAME, "Generate Key Pair...");
		this.setEnabled(false);
		
	}
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
