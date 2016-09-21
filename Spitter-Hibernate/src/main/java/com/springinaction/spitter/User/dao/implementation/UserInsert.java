package com.springinaction.spitter.User.dao.implementation;

import com.springinaction.spitter.User.dao.UserDAO;
import com.springinaction.spitter.User.model.Spitter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(propagation= Propagation.SUPPORTS,readOnly=false)
public class UserInsert implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession(){
       return sessionFactory.getCurrentSession();
    }

    @Override
    public void addSpitter(Spitter spitter) {
        currentSession().save(spitter);
    }

    @Override
    public Spitter getSpitterById(int id) {
        return (Spitter) currentSession().get(Spitter.class, id);
    }

    @Override
    public void updateSpitter(Spitter spitter) {
        currentSession().update(spitter);
    }
}