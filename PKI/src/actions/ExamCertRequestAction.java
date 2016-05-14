package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

public class ExamCertRequestAction extends AbstractAction {

	public ExamCertRequestAction() {
		
		KeyStroke ctrlQKeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK);
		putValue(ACCELERATOR_KEY, ctrlQKeyStroke);
		putValue(NAME, "Examine Certification Request...");
	}
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
