package actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;

import forms.AliasForm;
import forms.GenerateCertificateForm;
import forms.GenerateCertificateSucess;
import forms.GenerateKeyPairForm;
import forms.PasswordForm;

public class OkAction extends AbstractAction {


	private JFrame standardForm;
	private JButton btnOk;

	
	public OkAction(JFrame standardForm){

		putValue(NAME, "OK");
		this.standardForm = standardForm;
	}

	public void actionPerformed(ActionEvent arg0) {
		standardForm.setVisible(false);

		if (standardForm instanceof GenerateKeyPairForm) {

			standardForm.setVisible(false);
			new GenerateCertificateForm().setVisible(true);

		}

		else if (standardForm instanceof GenerateCertificateForm) {

			standardForm.setVisible(false);
			new AliasForm().setVisible(true);

		}
		else if (standardForm instanceof AliasForm) {
			
			standardForm.setVisible(false);
			new PasswordForm().setVisible(true);
			
		}
		else if (standardForm instanceof PasswordForm) {

			standardForm.setVisible(false);

		// TODO Auto-generated method stub
		
		if(standardForm instanceof GenerateKeyPairForm){
			
		}
		
		if(standardForm instanceof GenerateCertificateForm){
			
		}

			new GenerateCertificateSucess().setVisible(true);
		}
	}

}
