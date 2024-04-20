package designPatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    private String name;
    private List<FileSystem> components;

    public Directory(String name){
        this.name = name;
        this.components = new ArrayList<>();
    }

    @Override
    public void display() {
        System.out.println("Directory name : "+name);
        components.forEach(FileSystem::display);
    }

    @Override
    public void add(FileSystem fileSystem) {
        components.add(fileSystem);
    }
}
