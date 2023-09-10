package com.patterns.behavioural.visitor.impl;

/**
 *
 */
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

    /**
     * @return
     */
    public String getTitle() {
        return title;

    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;

    }

    /**
     * @return
     */
    public String getFileExtension() {
        return fileExtension;
    }

    /**
     * @param fileExtension
     */
    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    /**
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return
     */
    public String getIcon() {
        return icon;

    }

    /**
     * @param icon
     */
    public void setIcon(String icon) {
        this.icon = icon;

    }

}
