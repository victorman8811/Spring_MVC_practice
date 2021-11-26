package com.systex.mvc.dao;

import com.systex.mvc.model.TaskTable;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
@EnableTransactionManagement
public class TaskDaoImpl implements TaskDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(TaskTable taskTable) {

        sessionFactory.getCurrentSession().save(taskTable);

    }

    @Override
    public void delete(int seq) {
        TaskTable deleteTemp = sessionFactory.getCurrentSession().get(TaskTable.class, seq);
        sessionFactory.getCurrentSession().delete(deleteTemp);
    }


    @Override
    public List<TaskTable> findAll() {

        return sessionFactory.getCurrentSession().createQuery("from TaskTable").list();

    }
}
