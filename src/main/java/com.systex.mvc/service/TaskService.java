package com.systex.mvc.service;

import com.systex.mvc.model.TaskTable;

import java.util.List;

public interface TaskService {

    public void add(TaskTable input);

    public void delete(int seq);

    public List<TaskTable> findAll();


}
