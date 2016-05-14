package gui.main.form;

import javax.swing.JToolBar;

import actions.ActionManager;

public class MyToolbar extends JToolBar {
	
	private ActionManager actionManager = new ActionManager();
	
	public MyToolbar() {
		super();
		
		add(actionManager.getActionNew());
	}

}
