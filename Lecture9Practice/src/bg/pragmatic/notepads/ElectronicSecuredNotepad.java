package bg.pragmatic.notepads;

import bg.pragmatic.notepads.contracts.IElectronicDevice;
import bg.pragmatic.notepads.exceptions.PageNotFoundException;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {

	private boolean isStarted;
	
	public ElectronicSecuredNotepad(String password) {
		super(password);
	}

	@Override
	public void start() {
		if(this.checkPassword()) {
			this.isStarted = true;
		} else {
			System.out.println("To be continued ...");
		} 

	}


	@Override
	public void stop() {
		if(this.checkPassword()) {
			this.isStarted = false;
		} else {
			System.out.println("To be continued ...");
		}

	}

	@Override
	public boolean isStarted() {
		if (isStarted) {
			return true;
		}
		return false;
	}

	@Override
	public void createPageAndWrite(String title, String text) {
		if (isStarted()) {
			super.createPageAndWrite(title, text);
		} else {
			System.out.println("You have to switch on the device first!");
		}
	}

	@Override
	public void replaceTextOnPage(int pageNumber, String text) throws PageNotFoundException {
		if (isStarted()) {
			super.replaceTextOnPage(pageNumber, text);
		} else {
			System.out.println("You have to switch on the device first!");
		}
	}

	@Override
	public void deleteText(int pageNumber) throws PageNotFoundException {
		if (isStarted()) {
			super.deleteText(pageNumber);
		} else {
			System.out.println("You have to switch on the device first!");
		}
	}

	@Override
	public void showPages() {
		if (isStarted()) {
			super.showPages();
		} else {
			System.out.println("You have to switch on the device first!");
		}
	}

	@Override
	protected boolean checkPassword() {
		return super.checkPassword();
	}
	
	
}
