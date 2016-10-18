package com.epam.testproject.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public abstract class AbstractDAO<T> {

    //
    public List<T> get(String query){
        SessionFactory sessions = new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
        Session session = sessions.openSession();
        return (List<T>)session.createQuery(query).list();
    }
}
