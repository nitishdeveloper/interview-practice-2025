package DesignPatternPractice.CompositePattern.FileSystem;

public class FileLeaf implements FileSystemComponent {
    private final String fileName;

    public FileLeaf(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void showDetails() {
        System.out.printf("File name :: " + fileName);
    }
}
