package gui.main.form;

import gui.main.form.MyToolbar;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

import actions.AboutPortecleAction;
import actions.ChangeKeystTypeAction;
import actions.ExamCRLAction;
import actions.ExamCertRequestAction;
import actions.ExamCertificateAction;
import actions.ExamConnectionAction;
import actions.ExitAction;
import actions.GenKeyPairAction;
import actions.HelpAction;
import actions.ImportKeyPairAction;
import actions.ImportTrusCerAction;
import actions.JarsAction;
import actions.KeystoreReportAction;
import actions.NewKeystoreAction;
import actions.OnlineResourcesAction;
import actions.OpenCACertsAction;
import actions.OpenKeystoreAction;
import actions.OptionsAction;
import actions.SaveKeystoreAction;
import actions.SaveKeystoreAsAction;
import actions.SecurityProvidersAction;
import actions.SetKeystPassAction;
import actions.WebsiteAction;

public class MainFrame extends JFrame {
	
	public static MainFrame instance;
	private JMenuBar menuBar;
	
	public MainFrame() {
		
		setSize(new Dimension(800,600));
		setLocationRelativeTo(null);
		setTitle("Portecle");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(NORMAL);
		setUpMenu();
		setJMenuBar(menuBar);

	}

	private void setUpMenu() {
		
		menuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		
		JMenuItem newKeystore = new JMenuItem(new NewKeystoreAction());
		newKeystore.setMnemonic(KeyEvent.VK_N);
		JMenuItem openKeystore = new JMenuItem(new OpenKeystoreAction());
		openKeystore.setMnemonic(KeyEvent.VK_O);
		JMenuItem openCACerts = new JMenuItem(new OpenCACertsAction());
		openCACerts.setMnemonic(KeyEvent.VK_Y);
		JMenuItem saveKeystore = new JMenuItem(new SaveKeystoreAction());
		saveKeystore.setMnemonic(KeyEvent.VK_S);
		JMenuItem saveKeystoreAs = new JMenuItem(new SaveKeystoreAsAction());
		saveKeystoreAs.setMnemonic(KeyEvent.VK_A);
		JMenuItem exit = new JMenuItem(new ExitAction());
		exit.setMnemonic(KeyEvent.VK_X);
		
		fileMenu.add(newKeystore);
		fileMenu.add(openKeystore);
		fileMenu.add(openCACerts);
		fileMenu.add(new JSeparator());
		fileMenu.add(saveKeystore);
		fileMenu.add(saveKeystoreAs);
		fileMenu.add(new JSeparator());
		fileMenu.add(exit);
		
		JMenu toolsMenu = new JMenu("Tools");
		toolsMenu.setMnemonic(KeyEvent.VK_T);
		
		JMenuItem genKP = new JMenuItem(new GenKeyPairAction());
		genKP.setMnemonic(KeyEvent.VK_G);
		JMenuItem importTC = new JMenuItem(new ImportTrusCerAction());
		importTC.setMnemonic(KeyEvent.VK_I);
		JMenuItem importKP = new JMenuItem(new ImportKeyPairAction());
		importKP.setMnemonic(KeyEvent.VK_M);
		JMenuItem setKP = new JMenuItem(new SetKeystPassAction());
		setKP.setMnemonic(KeyEvent.VK_S);
		JMenuItem changeKT = new JMenuItem(new ChangeKeystTypeAction());
		changeKT.setMnemonic(KeyEvent.VK_C);
		JMenuItem keystoreReport = new JMenuItem(new KeystoreReportAction());
		keystoreReport.setMnemonic(KeyEvent.VK_K);
		JMenuItem options = new JMenuItem(new OptionsAction());
		options.setMnemonic(KeyEvent.VK_O);
		
		toolsMenu.add(genKP);
		toolsMenu.add(importTC);
		toolsMenu.add(importKP);
		toolsMenu.add(new JSeparator());
		toolsMenu.add(setKP);
		toolsMenu.add(changeKT);
		toolsMenu.add(keystoreReport);
		toolsMenu.add(new JSeparator());
		toolsMenu.add(options);
		
		JMenu examineMenu = new JMenu("Examine");
		examineMenu.setMnemonic(KeyEvent.VK_E);
		
		JMenuItem examCertificate = new JMenuItem(new ExamCertificateAction());
		examCertificate.setMnemonic(KeyEvent.VK_E);
		JMenuItem examConnection = new JMenuItem(new ExamConnectionAction());
		examConnection.setMnemonic(KeyEvent.VK_S);
		JMenuItem examCertRequest = new JMenuItem(new ExamCertRequestAction());
		examCertRequest.setMnemonic(KeyEvent.VK_Q);
		JMenuItem examCrl = new JMenuItem(new ExamCRLAction());
		examCrl.setMnemonic(KeyEvent.VK_L);
		
		examineMenu.add(examCertificate);
		examineMenu.add(examConnection);
		examineMenu.add(examCertRequest);
		examineMenu.add(examCrl);
		
		JMenu helpMenu = new JMenu("Help");
		helpMenu.setMnemonic(KeyEvent.VK_H);
		
		JMenuItem help = new JMenuItem(new HelpAction());
		help.setMnemonic(KeyEvent.VK_H);
		JMenu onlineRes = new JMenu(new OnlineResourcesAction());
		onlineRes.setMnemonic(KeyEvent.VK_O);
		JMenuItem website = new JMenuItem(new WebsiteAction());
		website.setMnemonic(KeyEvent.VK_W);

		onlineRes.add(website);
		
		JMenuItem secProv = new JMenuItem(new SecurityProvidersAction());
		secProv.setMnemonic(KeyEvent.VK_S);
		JMenuItem jars = new JMenuItem(new JarsAction());
		jars.setMnemonic(KeyEvent.VK_J);
		JMenuItem aboutPort = new JMenuItem(new AboutPortecleAction());
		aboutPort.setMnemonic(KeyEvent.VK_A);
		
		helpMenu.add(help);
		helpMenu.add(onlineRes);
		helpMenu.add(new JSeparator());
		helpMenu.add(secProv);
		helpMenu.add(jars);
		helpMenu.add(new JSeparator());
		helpMenu.add(aboutPort);
		
		menuBar.add(fileMenu);
		menuBar.add(toolsMenu);
		menuBar.add(examineMenu);
		menuBar.add(helpMenu);
		
		MyToolbar toolbar = new MyToolbar();
		add(toolbar, BorderLayout.NORTH);
		
	}
	
	public static MainFrame getInstance(){
		if (instance==null)
			instance=new MainFrame();
		return instance;

	}

}
