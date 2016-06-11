package gui.main.form;

import javax.swing.JToolBar;

import actions.ActionManager;

public class MyToolbar extends JToolBar {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4910837216339056691L;
	private ActionManager actionManager = new ActionManager();
	
	public MyToolbar() {
		super();
		
		add(actionManager.getActionNew());
	}

}
