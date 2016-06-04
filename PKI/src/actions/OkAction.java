package actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
<<<<<<< HEAD
import javax.swing.JButton;
import javax.swing.JFrame;

import forms.AliasForm;
import forms.GenerateCertificateForm;
import forms.GenerateCertificateSucess;
=======
import javax.swing.JDialog;
import javax.swing.JFrame;

import forms.GenerateCertificateForm;
>>>>>>> 503ac6a8ba58c96bdfddd7a93e9c3893677ef705
import forms.GenerateKeyPairForm;
import forms.PasswordForm;

public class OkAction extends AbstractAction {
<<<<<<< HEAD

	private JFrame standardForm;
	private JButton btnOk;

	public OkAction(JFrame standardForm) {
=======
	
	
	private JFrame standardForm;
	
	public OkAction(JFrame standardForm){
>>>>>>> 503ac6a8ba58c96bdfddd7a93e9c3893677ef705
		putValue(NAME, "OK");
		this.standardForm = standardForm;
	}

	public void actionPerformed(ActionEvent arg0) {
<<<<<<< HEAD
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
=======
		// TODO Auto-generated method stub
		
		if(standardForm instanceof GenerateKeyPairForm){
			
		}
		
		if(standardForm instanceof GenerateCertificateForm){
			
		}
>>>>>>> 503ac6a8ba58c96bdfddd7a93e9c3893677ef705

			new GenerateCertificateSucess().setVisible(true);
		}
	}

}
