package com.systex.mvc.controller;

import com.systex.mvc.model.TaskTable;
import com.systex.mvc.service.TaskService;
import com.systex.mvc.service.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HelloController {
    @Autowired
    TaskService service;

    @RequestMapping(value = "/")
    public String hello(Model model) {

        model.addAttribute("tasks", service.findAll());
        return "hello";

    }

    @GetMapping(value = "/add")
    public String addTask(@RequestParam String name, @RequestParam String description) {

        TaskTable input = new TaskTable();

        input.setName(name);
        input.setDescription(description);

        service.add(input);

        return "redirect:/";

    }

    @GetMapping(value = "/delete/{task.getSeq()}")
    public String deleteTask(@PathVariable("task.getSeq()") int seq) {

        service.delete(seq);
        return "redirect:/";

    }

}