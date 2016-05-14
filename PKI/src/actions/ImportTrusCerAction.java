package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

public class ImportTrusCerAction extends AbstractAction {

	public ImportTrusCerAction() {
		
		KeyStroke ctrlTKeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK);
		putValue(ACCELERATOR_KEY, ctrlTKeyStroke);
		putValue(NAME, "Import Trusted Certificate...");
		this.setEnabled(false);
		
	}
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	

}
