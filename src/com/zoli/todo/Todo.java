package com.zoli.todo;

import java.util.ArrayList;
import java.util.Scanner;

public class Todo{
    Save save = new FileSave();
    ArrayList<String> tasks = new ArrayList<String>();
    Scanner scan = new Scanner(System.in);

    public void inputTasks(){
        System.out.println("Please input the next task or hit enter to exit!: ");
        while (true) {
            System.out.print("next task: ");
            String temp = scan.nextLine();
            if (temp.length() != 0){
                tasks.add(temp);
            } else {
                break;
            }
        }
    }

    public void displayTasks() {
        if (tasks.size() > 0){
            System.out.println("The saved tasks:");
            for (String task : tasks) {
                System.out.println(" - " + task);
            }
        } else {
            System.out.println("There are no saved tasks:");
        }
    }

    public void saveTasks(){
        save.SaveTasks(tasks);
    }

    public void loadTasks(){
        tasks = save.LoadTasks();
    }

}