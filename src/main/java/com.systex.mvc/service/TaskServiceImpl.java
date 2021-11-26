package com.systex.mvc.service;

import com.systex.mvc.dao.TaskDao;
import com.systex.mvc.model.TaskTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskDao taskDao;

    @Override
    public void add(TaskTable input) {

        System.out.println("here");
        taskDao.add(input);

    }

    @Override
    public void delete(int seq) {
        taskDao.delete(seq);
    }

    @Override
    public List<TaskTable> findAll() {
        return taskDao.findAll();

    }

}
