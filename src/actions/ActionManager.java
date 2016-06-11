package actions;

public class ActionManager {

	//file
	private NewKeystoreAction actionNew = new NewKeystoreAction();
	private OpenKeystoreAction actionOpen = new OpenKeystoreAction();
	private OpenCACertsAction actionOpenCA = new OpenCACertsAction();
	private SaveKeystoreAction actionSave = new SaveKeystoreAction();
	private SaveKeystoreAsAction actionSaveAs = new SaveKeystoreAsAction();
	private ExitAction actionExit = new ExitAction();
	public NewKeystoreAction getActionNew() {
		return actionNew;
	}
	public void setActionNew(NewKeystoreAction actionNew) {
		this.actionNew = actionNew;
	}
	public OpenKeystoreAction getActionOpen() {
		return actionOpen;
	}
	public void setActionOpen(OpenKeystoreAction actionOpen) {
		this.actionOpen = actionOpen;
	}
	public OpenCACertsAction getActionOpenCA() {
		return actionOpenCA;
	}
	public void setActionOpenCA(OpenCACertsAction actionOpenCA) {
		this.actionOpenCA = actionOpenCA;
	}
	public SaveKeystoreAction getActionSave() {
		return actionSave;
	}
	public void setActionSave(SaveKeystoreAction actionSave) {
		this.actionSave = actionSave;
	}
	public SaveKeystoreAsAction getActionSaveAs() {
		return actionSaveAs;
	}
	public void setActionSaveAs(SaveKeystoreAsAction actionSaveAs) {
		this.actionSaveAs = actionSaveAs;
	}
	public ExitAction getActionExit() {
		return actionExit;
	}
	public void setActionExit(ExitAction actionExit) {
		this.actionExit = actionExit;
	}
	
}
