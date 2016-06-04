package actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JDialog;
import javax.swing.JFrame;

import forms.GenerateCertificateForm;
import forms.GenerateKeyPairForm;

public class OkAction extends AbstractAction {
	
	
	private JFrame standardForm;
	
	public OkAction(JFrame standardForm){
		putValue(NAME, "OK");
		this.standardForm = standardForm;
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		if(standardForm instanceof GenerateKeyPairForm){
			
		}
		
		if(standardForm instanceof GenerateCertificateForm){
			
		}

		
	}
	
	

}
