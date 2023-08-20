package ir.patterns.behavioral.visitor.impl;

public abstract class File implements IFile {

	private String title;
	private String fileExtension;
	private int size;
	private String icon;

	public File(String title, String fileExtension, int size, String icon) {
		this.setFileExtension(fileExtension);
		this.setSize(size);
		this.setTitle(title);
		this.setIcon(icon);
	}

	public String getTitle() {
		return title;

	}

	public void setTitle(String title) {
		this.title = title;

	}

	public String getFileExtension() {
		return fileExtension;
	}

	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getIcon() {
		return icon;

	}

	public void setIcon(String icon) {
		this.icon = icon;

	}

}
