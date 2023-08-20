package ir.patterns.behavioral.visitor;

import ir.patterns.behavioral.visitor.impl.*;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Visitor is a behavioral design pattern that allows adding new behaviors to existing class
 * hierarchy without altering any existing code.
 */
public class VisitorExample {

    private final List<IVisitor> visitors = new ArrayList<>(List.of(new HumanReadableVisiror()));
    private final IFile root;

    public VisitorExample() {
        root = new Directory("root", 0);
    }

    public void addToRoot(IFile file) {
        ((Directory) root).addFile(file);
    }

    public IFile getRoot() {
        return this.root;
    }

    public void visit(IFile file, int level) {
        for (IVisitor visitor : visitors) {
            if (file instanceof Directory) {
                level = ((Directory) file).getLevel();
                StringJoiner joiner = new StringJoiner("");
                joiner.add(String.format("%" + (level + 1) + "s", "-"));
                joiner.add(visitor.visitDirectory((Directory) file));
                System.out.println(joiner);
                List<IFile> files = ((Directory) file).getFiles();
                if (files != null) {
                    for (IFile iFile : files) {
                        this.visit(iFile, (level + 1));
                    }
                }
            } else if (file instanceof ImageFile) {
                StringJoiner joiner = new StringJoiner("");
                joiner.add(String.format("%" + (level + 1) + "s", "-"));
                joiner.add(visitor.visitImageFile((ImageFile) file));
                System.out.println(joiner);

            } else if (file instanceof TextFile) {
                StringJoiner joiner = new StringJoiner("");
                joiner.add(String.format("%" + (level + 1) + "s", "-"));
                joiner.add(visitor.visitTextFile((TextFile) file));
                System.out.println(joiner);
            }
        }
    }

    public static void main(String[] args) {
        VisitorExample example = new VisitorExample();
        Directory bin = new Directory("/root/bin", 1);
        bin.addFile(new ImageFile("Personal Image File", "png", 1024, "", "1024*1024", "Base64"));
        bin.addFile(new ImageFile("Nature", "jpeg", 512, "", "512*512", "Base64"));
        bin.addFile(new Directory("/root/bin/my", 2));
        example.addToRoot(bin);
        example.addToRoot(new Directory("/root/exc", 1));
        example.addToRoot(new Directory("/root/home", 1));
        example.addToRoot(new TextFile("Nature", "txt", 512, "", "Hello"));
        example.visit(example.getRoot(), 0);
    }

}
