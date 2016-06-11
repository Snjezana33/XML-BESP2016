package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

public class ExamCRLAction extends AbstractAction {

	public ExamCRLAction() {
		
		KeyStroke ctrlLKeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK);
		putValue(ACCELERATOR_KEY, ctrlLKeyStroke);
		putValue(NAME, "Examine CRL...");
	}
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
