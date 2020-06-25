package com.zoli.todo;

public class Main {
    public static void main(String[] args){
       Todo todo = new Todo();
       todo.loadTasks();
       todo.displayTasks();
       todo.inputTasks();
       todo.saveTasks();
    }
}
