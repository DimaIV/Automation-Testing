package bg.pragmatic.notepads;

import bg.pragmatic.notepads.contracts.IElectronicDevice;
import bg.pragmatic.notepads.contracts.INotepad;
import bg.pragmatic.notepads.exceptions.PageNotFoundException;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		INotepad simpleNotepad = new SimpleNotepad();
		simpleNotepad.createPageAndWrite("title1", "text1");
		simpleNotepad.createPageAndWrite("title2", "text2");
		simpleNotepad.createPageAndWrite("title3", "text3");
		
		simpleNotepad.showPages();
		
		try {
			simpleNotepad.replaceTextOnPage(2, "bla");
		} catch (PageNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("**********************************");
		simpleNotepad.showPages();
		
		System.out.println("**********************************");

		try {
			simpleNotepad.deleteText(1);
		} catch (PageNotFoundException e) {
			e.printStackTrace();
		}

//		simpleNotepad.showPages();
//				
//		INotepad securedNotepad = new SecuredNotepad("parola");
//		securedNotepad.createPageAndWrite("title1", "text1");
//
//		securedNotepad.showPages();
		
		IElectronicDevice hpNotebook = new ElectronicSecuredNotepad("baiPe6o");
		hpNotebook.start();
		System.out.println(hpNotebook.isStarted() ? "Started" : "Stopped");
		
		hpNotebook.createPageAndWrite("Once upon a time", "There was a ...");
		hpNotebook.showPages();
	}

}
