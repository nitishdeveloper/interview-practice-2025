package DesignPatternPractice.CompositePattern.FileSystem;

public class CompositePatternDemo {
    public static void main(String[] args) {
        FileSystemComponent file1 = new FileLeaf("resume.docx");
        FileSystemComponent file2 = new FileLeaf("photo.png");

        FolderComposite folder1 = new FolderComposite("Documents");
        folder1.add(file1);
        folder1.add(file2);

        FileSystemComponent file3 = new FileLeaf("song.mp3");
        FolderComposite rootFolder = new FolderComposite("Root");
        rootFolder.add(folder1);
        rootFolder.add(file3);

        rootFolder.showDetails();
    }
}
