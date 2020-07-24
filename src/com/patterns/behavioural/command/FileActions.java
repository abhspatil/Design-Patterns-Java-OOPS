package com.patterns.behavioural.command;

public interface FileActions {
    public FileOperations getFileOperation();
    public void execute(String filename);
}
