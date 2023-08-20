package ir.patterns.behavioral.visitor.impl;

public class ImageFile extends File {

	private String resolution;
	private String content;

	public ImageFile(String title, String fileExtension, int size, String icon, String resulotion, String content) {
		super(title, fileExtension, size, icon);
		this.setResolution(resulotion);
		this.setContent(content);
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	@Override
	public String accept(IVisitor visitor) {
		return visitor.visitImageFile(this);
	}

	public String getContent() {
		return content;
		
	}

	public void setContent(String content) {
		this.content = content;
		
	}
}
