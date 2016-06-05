package actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
<<<<<<< HEAD
import javax.swing.JButton;
=======
<<<<<<< HEAD
import javax.swing.JButton;
import javax.swing.JFrame;

import forms.AliasForm;
import forms.GenerateCertificateForm;
import forms.GenerateCertificateSucess;
=======
import javax.swing.JDialog;
>>>>>>> f7f4fd398361fae3ac4b15d320bdd91acab7fefd
import javax.swing.JFrame;

import forms.GenerateCertificateForm;
<<<<<<< HEAD
import forms.GenerateCertificateSucess;
=======
>>>>>>> 503ac6a8ba58c96bdfddd7a93e9c3893677ef705
>>>>>>> f7f4fd398361fae3ac4b15d320bdd91acab7fefd
import forms.GenerateKeyPairForm;
import forms.PasswordForm;

public class OkAction extends AbstractAction {
<<<<<<< HEAD

=======
<<<<<<< HEAD
>>>>>>> f7f4fd398361fae3ac4b15d320bdd91acab7fefd

	private JFrame standardForm;
	private JButton btnOk;

<<<<<<< HEAD
	
	public OkAction(JFrame standardForm){

=======
	public OkAction(JFrame standardForm) {
=======
	
	
	private JFrame standardForm;
	
	public OkAction(JFrame standardForm){
>>>>>>> 503ac6a8ba58c96bdfddd7a93e9c3893677ef705
>>>>>>> f7f4fd398361fae3ac4b15d320bdd91acab7fefd
		putValue(NAME, "OK");
		this.standardForm = standardForm;
	}

	public void actionPerformed(ActionEvent arg0) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> f7f4fd398361fae3ac4b15d320bdd91acab7fefd
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
<<<<<<< HEAD

=======
=======
>>>>>>> f7f4fd398361fae3ac4b15d320bdd91acab7fefd
		// TODO Auto-generated method stub
		
		if(standardForm instanceof GenerateKeyPairForm){
			
		}
		
		if(standardForm instanceof GenerateCertificateForm){
			
		}
<<<<<<< HEAD
=======
>>>>>>> 503ac6a8ba58c96bdfddd7a93e9c3893677ef705
>>>>>>> f7f4fd398361fae3ac4b15d320bdd91acab7fefd

			new GenerateCertificateSucess().setVisible(true);
		}
	}

}
