package com.systex.mvc.service;

import com.systex.mvc.model.TaskTable;

public interface TaskService {

    public void add(TaskTable input);

    public void delete(TaskTable input);

    public TaskTable get();

}
