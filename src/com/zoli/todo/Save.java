package com.zoli.todo;

import java.util.ArrayList;

public interface Save {
    void SaveTasks(ArrayList<String> tasks);
    ArrayList<String> LoadTasks();
}
