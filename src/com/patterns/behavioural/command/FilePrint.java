package com.patterns.behavioural.command;

public class FilePrint implements FileActions{

    public FileOperations getFileOperation(){
        return FileOperations.PRINT;
    }

    @Override
    public void execute(String filename) {
        System.out.println("Printing content of File : " + filename);
    }
}
