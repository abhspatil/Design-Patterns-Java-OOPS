package com.patterns.behavioural.command;

public class Client {
    public static void main(String[] args) {

        File file = new File();

        //Open File
        FileActions open = file.getCommand(FileOperations.OPEN);
        open.execute("patil.txt");

        //Close File
        FileActions close = file.getCommand(FileOperations.CLOSE);
        close.execute("patil.txt");

        //Save File
        FileActions save= file.getCommand(FileOperations.SAVE);
        save.execute("patil.txt");

        //Print File
        FileActions printfile = file.getCommand(FileOperations.PRINT);
        printfile.execute("patil.txt");

    }
}
