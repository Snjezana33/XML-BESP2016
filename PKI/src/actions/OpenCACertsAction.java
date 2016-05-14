package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

public class OpenCACertsAction extends AbstractAction {
	
	public OpenCACertsAction() {
		
		KeyStroke ctrlYKeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_Y, ActionEvent.CTRL_MASK);
		putValue(ACCELERATOR_KEY, ctrlYKeyStroke);
		putValue(SHORT_DESCRIPTION, "Open CA Certs Keystore");
		putValue(NAME, "Open CA Certs Keystore");
	
	}
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
