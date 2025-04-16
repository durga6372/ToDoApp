package com.TODO.TODOApp.controler; // Fix spelling in package name

import com.TODO.TODOApp.model.Task;
import com.TODO.TODOApp.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/tasks")
public class TaskController { 

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public String getTasks(Model model) {
        List<Task> tasks = taskService.getAllTask();
        model.addAttribute("tasks", tasks);
        return "tasksPage"; 
    }
   @PostMapping("/add")
    public String createtask( @RequestParam String title) {
      taskService.createtask(title);
        return "redirect:/tasks";
    }
    @PostMapping("/{id}/delete")
    public String DeleteTasks(@PathVariable long id) {
        taskService.deleteTask(id);
        return "redirect:/tasks";
    }
    @PostMapping("/{id}/toggle")
    public String ToggleTasks(@PathVariable long id) {
        taskService.toggleTask(id);
        return "redirect:/tasks";
    }

}
