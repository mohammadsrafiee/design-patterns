package ir.patterns.bihavioral.memento.impl;

/**
 * This class is a simple data class which is used as an internal originator's
 * state. It stores multiple properties defining the shape presented in UI:
 * color, height and width.
 */
public class Shape {

	private Color color;
	private int height;
	private int width;

	public Shape() {

	}

	public Shape(Color color, int height, int width) {
		this.setColor(color);
		this.setHeight(height);
		this.setWidth(width);
	}

	public enum Color {
		RED, BLACK, GREEN, BLUE,;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Color : ");
		buffer.append(color != null ? color.name() : " ");
		buffer.append(", ");
		buffer.append("Height : ");
		buffer.append(height);
		buffer.append(", ");
		buffer.append("Width : ");
		buffer.append(width);
		return buffer.toString();
	}
}
