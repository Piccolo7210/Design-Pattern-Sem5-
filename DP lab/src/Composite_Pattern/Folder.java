package Composite_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem {
    private String name;
    private List<FileSystem> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystem FileSystem) {
        children.add(FileSystem);
    }

    public void remove(FileSystem FileSystem) {
        children.remove(FileSystem);
    }

    @Override
    public boolean search(String keyword) {
        if(this.name.contains(keyword)){
            System.out.println("It is a part of directory path and its name is = "+this.name);
            return true;
        }
        System.out.println("Searching in folder: " + name);
        for (FileSystem child : children) {
            if(child.search(keyword)){
                return true;
            }
        }

        return false;
        //children.stream().forEach(child -> child.search(keyword));
    }
}

