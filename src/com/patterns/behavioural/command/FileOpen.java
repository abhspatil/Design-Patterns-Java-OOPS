package com.patterns.behavioural.command;

public class FileOpen implements FileActions{

    public FileOperations getFileOperation(){
        return FileOperations.OPEN;
    }

    @Override
    public void execute(String filename) {
        System.out.println("Opening File : "+filename);
    }
}
