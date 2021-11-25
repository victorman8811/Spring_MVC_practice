package com.systex.mvc.controller;

import com.systex.mvc.model.TaskTable;
import com.systex.mvc.service.TaskServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    @RequestMapping(value="/")
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/handleRequest")
    public String handleRequest(@RequestParam String name,@RequestParam String description){

        TaskTable input = new TaskTable();
        TaskServiceImpl service = new TaskServiceImpl();

        input.setName(name);
        input.setDescription(description);

        service.add(input);

        return "hello";

    }
}