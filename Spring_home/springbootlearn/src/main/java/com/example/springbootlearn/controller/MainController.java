package com.example.springbootlearn.controller;

import com.example.springbootlearn.model.Task;
import com.example.springbootlearn.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    private TaskRepository taskRepository;
    @RequestMapping("/")

    public  String getTasks(Model model){



        List<Task>tasks=new ArrayList<>();
        tasks.add(new Task(1,2,"pay bills", LocalDate.of(2022,10,10)));

        tasks.add(new Task(2,23,"call sakshi", LocalDate.of(2022,10,2)));

        tasks.add(new Task(1,2,"Develop new feature in my App", LocalDate.of(2022,9,19)));


      //  List<Task> tasks=taskRepository.findAll();
        model.addAttribute("tasks",tasks);
        return "index";
    }
    @RequestMapping("/tasks/{id}")
    public String closeTask(@PathVariable int id){
    taskRepository.deleteById(id);
    return "redirect";
    }
    @RequestMapping("/newTask")
    public String getTaskFrom(){
        return "task-form";
    }
@PostMapping("/processForm")
    public  String addTask(@ModelAttribute Task task){
        taskRepository.save(task);
        return "redirect:/";
}
@RequestMapping("/sortByPriority")
public String getAllByPriority(Model model){
List<Task>tasks=taskRepository.findAllByOrderPriority();
model.addAttribute("tasks",tasks);
return "index";
}
}
