package Composite_Pattern;

public class Main {
    public static void main(String[] args) {

        File file1 = new File("file1.txt", "Hi hello bye");
        File file2 = new File("file2.txt", "Honolulu adasdkae");
        File file3 = new File("file3.txt", "Abra ka dabra");


        Folder folder1 = new Folder("Folder1");
        folder1.add(file1);
        folder1.add(file2);

        Folder folder2 = new Folder("Folder2");
        folder2.add(file3);

        Folder rootFolder = new Folder("RootFolder");
        rootFolder.add(folder1);
        rootFolder.add(folder2);


        if(!rootFolder.search("Abra")) System.out.println("Content not found");
    }
}

