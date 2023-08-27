package ir.patterns.behavioural.visitor.impl;

/**
 * This class Implementation of {@link IVisitor } to represent by requirement.
 * You can implement {@link IVisitor} for more implementations to show more
 * representations of file and directory by requirement.
 */
public class HumanReadableVisiror implements IVisitor {

	@Override
	public String visitTextFile(TextFile file) {
		StringBuffer buffer = new StringBuffer();
		if (file != null) {
			buffer.append(file.getIcon());
			buffer.append("##");
			buffer.append(file.getTitle());
			buffer.append(".");
			buffer.append(file.getFileExtension());
			buffer.append(",");
			buffer.append(file.getSize());
			buffer.append("bytes");
			buffer.append(",");
			buffer.append(file.getContent().hashCode());
		}
		return buffer.toString();
	}

	@Override
	public String visitImageFile(ImageFile file) {
		StringBuffer buffer = new StringBuffer();
		if (file != null) {
			buffer.append(file.getIcon());
			buffer.append("##");
			buffer.append(file.getTitle());
			buffer.append(".");
			buffer.append(file.getFileExtension());
			buffer.append(",");
			buffer.append(file.getSize());
			buffer.append("bytes");
			buffer.append(",");
			buffer.append(file.getResolution());
			buffer.append(",");
			buffer.append(file.getContent().hashCode());
		}
		return buffer.toString();
	}

	@Override
	public String visitDirectory(Directory directory) {
		StringBuffer buffer = new StringBuffer();
		if (directory != null) {
			buffer.append(directory.getLevel());
			buffer.append("##");
			buffer.append(directory.getTitle());
			buffer.append(",");
			buffer.append(directory.getSize());
			buffer.append("bytes");
			buffer.append(",");
			buffer.append("#");
			buffer.append(directory.getFiles() != null ? directory.getFiles().size() : 0);
		}
		return buffer.toString();
	}

}
