package ir.patterns.behavioural.visitor.impl;

public class TextFile extends File {

	private String content;

	public TextFile(String title, String fileExtension, int size, String icon, String content) {
		super(title, fileExtension, size, icon);
		this.setContent(content);
	}

	public String getContent() {
		return content;

	}

	public void setContent(String content) {
		this.content = content;

	}

	@Override
	public String accept(IVisitor visitor) {
		return visitor.visitTextFile(this);
	}

}
