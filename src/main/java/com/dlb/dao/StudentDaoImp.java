package com.dlb.dao;

import com.dlb.pojo.Students;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImp  implements  StudentDao {

    @Autowired
    private SessionFactory factory;

    @Override
    public Session getSession() {
        return factory.openSession();
    }

    @Override
    public void sessionClose() {
       factory.getCurrentSession().close();
    }


    @Override
    public void addOne(Students student) {
         getSession().save(student);
    }

    @Override
    public void deleteOne(Integer sid) {
        getSession().delete(getSession().get(Students.class,sid));
    }



    @Override
    public void updateOne(Students student) {
        getSession().update(student);
    }

    @Override
    public Students getOneByKey(Integer sid) {
        return (Students) getSession().get(Students.class,sid);
    }

    @Override
    public List<Students> getAll() {
        return getSession().createQuery("from com.dlb.pojo.Students").list();
    }
}