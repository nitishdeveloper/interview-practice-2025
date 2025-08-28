package DesignPatternPractice.CompositePattern.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class FolderComposite implements FileSystemComponent {
    private final String name;

    private final List<FileSystemComponent> children = new ArrayList<>();


    public FolderComposite(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent component) {
        children.add(component);
    }


    public void remove(FileSystemComponent component) {
        children.remove(component);
    }


    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        for (FileSystemComponent c : children) {
            c.showDetails();
        }
    }
}
