package bg.pragmatic.notepads;

import java.util.ArrayList;
import java.util.List;

import bg.pragmatic.notepads.contracts.INotepad;
import bg.pragmatic.notepads.exceptions.PageNotFoundException;

public class SimpleNotepad implements INotepad {
	private List<Page> pages;

	public SimpleNotepad() {
		this.pages = new ArrayList<>();
	}

	@Override
	public void createPageAndWrite(String title, String text) {
		Page currentPage = new Page();
		currentPage.setTitle(title);
		currentPage.addText(text);
		this.pages.add(currentPage);
		currentPage.setPageNumber(this.pages.size());

	}

	@Override
	public void replaceTextOnPage(int pageNumber, String text) throws PageNotFoundException {
		Page foundPage = findPage(pageNumber);
		foundPage.deleteText();
		foundPage.addText(text);
	}

	@Override
	public void deleteText(int pageNumber) throws PageNotFoundException {
		Page foundPage = findPage(pageNumber);
		foundPage.deleteText();
	}

	@Override
	public void showPages() {
		for (Page page : pages) {
			System.out.println(page.viewPage());
		}

	}

	private Page findPage(int pageNumber) throws PageNotFoundException {
		for (Page currentPage : this.pages) {
			if (currentPage.getPageNumber() == pageNumber) {
				return currentPage;
			}
		}

		throw new PageNotFoundException("A page with number" + pageNumber + " was not found.");
	}

}
