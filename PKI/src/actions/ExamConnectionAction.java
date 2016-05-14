package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

public class ExamConnectionAction extends AbstractAction {

	public ExamConnectionAction() {
		
		KeyStroke ctrlIKeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK);
		putValue(ACCELERATOR_KEY, ctrlIKeyStroke);
		putValue(NAME, "Examine SSL/TLS Connection...");
	}
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
