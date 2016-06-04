package actions;

import java.awt.event.ActionEvent;
import java.util.concurrent.locks.StampedLock;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

import forms.AliasForm;
import forms.ExportForm;
import forms.GenerateCertificateForm;
import forms.GenerateKeyPairForm;
import forms.NewKeystoreForm;
import forms.PasswordForm;

public class CancelAction extends AbstractAction {
	
	private JFrame standardForm;
	
	public CancelAction(JFrame standardForm){
		
		putValue(NAME, "Cancel");
		this.standardForm = standardForm;
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(standardForm instanceof GenerateKeyPairForm){
			standardForm.dispose();
		}
		
		else if(standardForm instanceof NewKeystoreForm){
			standardForm.dispose();
		}
		
		else if(standardForm instanceof GenerateCertificateForm){
			standardForm.dispose();
		}
		
		else if(standardForm instanceof AliasForm){
			standardForm.dispose();
		}
		
		else if(standardForm instanceof PasswordForm){
			standardForm.dispose();
		}
		
		else if(standardForm instanceof ExportForm){
			standardForm.dispose();
		}
	}

}
