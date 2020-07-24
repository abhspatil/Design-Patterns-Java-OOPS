package com.patterns.behavioural.command;

public class FileClose implements FileActions{

    public FileOperations getFileOperation(){
        return FileOperations.CLOSE;
    }

    @Override
    public void execute(String filename) {
        System.out.println("Closing File : "+filename);
    }
}
