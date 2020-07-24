package com.patterns.behavioural.command;

import java.util.ArrayList;
import java.util.List;

public class File {

    private static List<FileActions> fileActions;

    public File(){
        fileActions = new ArrayList<>();

        fileActions.add(new FileOpen());
        fileActions.add(new FileClose());
        fileActions.add(new FilePrint());
        fileActions.add(new FileSave());

    }

    public FileActions getCommand(FileOperations fileOperation){

        for(FileActions action : fileActions){
            if(action.getFileOperation() == fileOperation){
                return action;
            }
        }

        return null;
    }
}
