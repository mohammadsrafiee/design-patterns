package ir.patterns.behavioral.visitor.impl;

import java.util.ArrayList;
import java.util.List;

public class Directory implements IFile {

	private String title;
	private int level;
	private List<IFile> files;

	public Directory(String title, int level) {
		this.setTitle(title);
		this.setLevel(level);
	}

	public void addFile(IFile file) {
		if (files == null)
			files = new ArrayList<IFile>();
		files.add(file);

	}

	@Override
	public int getSize() {
		int result = 0;
		if (files != null)
			for (IFile file : files)
				result += file.getSize();
		return result;
	}

	@Override
	public String accept(IVisitor visitor) {
		return visitor.visitDirectory(this);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public List<IFile> getFiles() {
		return files;
	}

	public void setFiles(List<IFile> files) {
		this.files = files;
	}

}
