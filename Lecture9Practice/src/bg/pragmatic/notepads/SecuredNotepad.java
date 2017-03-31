package bg.pragmatic.notepads;

import java.util.Scanner;

import bg.pragmatic.notepads.exceptions.PageNotFoundException;

public class SecuredNotepad extends SimpleNotepad	{
	private String password;
	
	public SecuredNotepad(String password) {
		this.password = password;
	}

	@Override
	public void createPageAndWrite(String title, String text) {
		if(this.checkPassword()) {
			super.createPageAndWrite(title, text);
			System.out.println("You have successfully created a page!");
		} else {
			System.out.println("To be continued ...");
		}
		
	}

	@Override
	public void replaceTextOnPage(int pageNumber, String text) throws PageNotFoundException {
		if(this.checkPassword()) {
			super.replaceTextOnPage(pageNumber, text);
			System.out.println("You have successfully replaced the text!");
		} else {
			System.out.println("To be continued ...");
		}
		
	}

	@Override
	public void deleteText(int pageNumber) throws PageNotFoundException {
		if(this.checkPassword()) {
			super.deleteText(pageNumber);
			System.out.println("You have successfully deleted the text!");
		} else {
			System.out.println("To be continued ...");
		}
	}

	@Override
	public void showPages() {
		if(this.checkPassword()) {
			super.showPages();
		} else {
			System.out.println("To be continued ...");
		}
		
	}
	
	protected boolean checkPassword() {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Please, enter password: ");
			String enteredPassword = scan.nextLine();
			if(enteredPassword.equals(this.password)) {
				System.out.println("Correct Password!");
				return true;
			} else {
				System.out.println("Wrong Password!");
			}
		}
		
		return false;
	}
}
