package bg.pragmatic.notepads.contracts;

import bg.pragmatic.notepads.exceptions.PageNotFoundException;

public interface INotepad {
	void createPageAndWrite(String title, String text);
	void replaceTextOnPage(int pageNumber,String text ) throws PageNotFoundException;
	void deleteText(int pageNumber) throws PageNotFoundException;
	void showPages();
}
