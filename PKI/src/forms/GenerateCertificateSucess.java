package forms;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GenerateCertificateSucess extends JFrame{
	
	public static GenerateCertificateSucess instance;

    public GenerateCertificateSucess() {
		
		setSize(new Dimension(300,100));
		setLocationRelativeTo(null);
		setTitle("Generate Certificate Sucess");
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(NORMAL);
		setResizable(false);
		//setUndecorated(true);
		//setUpMenu();
		//setJMenuBar(menuBar);
		initGui();
	}
    
    private void initGui() {
    	JOptionPane.showMessageDialog(this, "Eggs are not supposed to be green.");
		
	}

	
    
}
