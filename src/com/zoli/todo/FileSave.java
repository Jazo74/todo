package com.zoli.todo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class FileSave implements Save {


    @Override
    public void SaveTasks(ArrayList<String> tasks) {
        try{
            FileWriter writer = new FileWriter("todo.txt", true);
            for (String task : tasks) {
                writer.write(task);
                writer.write("\r\n");
            }
            writer.close();
        }
        catch (IOException e) {
            System.out.println("Something wrong happened");
        }
    }

    @Override
    public ArrayList<String> LoadTasks() {
        ArrayList<String> tasks = new ArrayList<String>();
        try {
            File todoFile = new File("todo.txt");
            Scanner reader = new Scanner(todoFile);
            while (reader.hasNextLine()){
                tasks.add(reader.nextLine());
            }
            reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("There are no previous saved tasks");
        }
        return tasks;
    }
}
