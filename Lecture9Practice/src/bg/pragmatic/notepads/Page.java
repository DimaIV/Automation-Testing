package bg.pragmatic.notepads;

public class Page {

	private String title;
	private String text;
	private int pageNumber;
	
	public Page() {
		this.text = "";
		this.title = "";
	}

	public void setTitle(String title) {
		this.title = title;
	}

	void addText(String text){
		this.text += text;
	}
	
	void deleteText(){
		this.text = "";
	}
	
	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	String viewPage(){
		return this.title + System.lineSeparator() + this.text;
	}
}
