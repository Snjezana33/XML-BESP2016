package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

public class HelpAction extends AbstractAction {
	
	public HelpAction() {
		
		KeyStroke ctrlKeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_F1, ActionEvent.CTRL_MASK);
		putValue(ACCELERATOR_KEY, ctrlKeyStroke);
		putValue(SHORT_DESCRIPTION, "Help");
		putValue(NAME, "Help");
		
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
