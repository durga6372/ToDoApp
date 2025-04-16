package com.TODO.TODOApp.service;

import com.TODO.TODOApp.model.Task;
import com.TODO.TODOApp.repositary.TaskRepositary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {


    private final TaskRepositary taskRepositary;

    public TaskService(TaskRepositary taskRepositary) {
        this.taskRepositary = taskRepositary;
    }


    public List<Task> getAllTask() {
       return taskRepositary.findAll();

    }
    public void createtask(String title) {
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        taskRepositary.save(task);
    }
    public void deleteTask(long id) {
        taskRepositary.deleteById(id);
    }
    public void toggleTask(long id) {
        Task task= taskRepositary.findById(id).orElseThrow(() -> new IllegalArgumentException("invalid task id"));
        task.setCompleted(task.isCompleted());
        taskRepositary.save(task);
    }
}
