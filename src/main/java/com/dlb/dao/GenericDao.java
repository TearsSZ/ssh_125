package com.dlb.dao;

import org.hibernate.Session;

import java.util.List;

public interface GenericDao<T,PK>{
        Session getSession();
        void  sessionClose();
        void addOne(T t);
        void deleteOne(PK pk);
        void updateOne(T t);
        T getOneByKey(PK pk);
        List<T> getAll();
}