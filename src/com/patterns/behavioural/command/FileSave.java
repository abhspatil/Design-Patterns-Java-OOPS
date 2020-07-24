package com.patterns.behavioural.command;

public class FileSave implements FileActions{

    public FileOperations getFileOperation(){
        return FileOperations.SAVE;
    }

    @Override
    public void execute(String filename) {
        System.out.println("Saving File : "+filename);
    }
}
