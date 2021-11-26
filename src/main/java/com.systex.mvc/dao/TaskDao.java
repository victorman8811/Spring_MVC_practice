package com.systex.mvc.dao;

import com.systex.mvc.model.TaskTable;
import com.systex.mvc.service.TaskServiceImpl;

import java.util.List;

public interface TaskDao {

    public void add(TaskTable taskTable);

    public void delete(int seq);

    public List<TaskTable> findAll();

}
