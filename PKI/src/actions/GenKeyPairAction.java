package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

import forms.AliasForm;
import forms.ExportForm;
import forms.GenerateCertificateForm;
import forms.GenerateKeyPairForm;
import forms.PasswordForm;

public class GenKeyPairAction extends AbstractAction {

	public GenKeyPairAction() {
		
		KeyStroke ctrlGKeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK);
		putValue(ACCELERATOR_KEY, ctrlGKeyStroke);
		putValue(NAME, "Generate Key Pair...");
		this.setEnabled(true);
		
	}
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
//		GenerateKeyPairForm form = new GenerateKeyPairForm();
//		form.setVisible(true);
		
//		GenerateCertificateForm form = new GenerateCertificateForm();
//		form.setVisible(true);
		
//		AliasForm form = new AliasForm();
//		form.setVisible(true);
		
		PasswordForm form = new PasswordForm();
		form.setVisible(true);
		
//		ExportForm form = new ExportForm();
//		form.setVisible(true);
		
		
	}
	

}
