package by.employee.persistence.dao.impl;

import by.employee.persistence.dao.Common;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public class CommonImpl<E, I extends Serializable> implements Common<E, I>{

    private Class<E> entityClass;

    @Autowired
    private SessionFactory sessionFactory;

    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void save(E e) {

    }

    @Override
    public void update(E e) {

    }

    @Override
    public void delete(I id) {

    }
}
