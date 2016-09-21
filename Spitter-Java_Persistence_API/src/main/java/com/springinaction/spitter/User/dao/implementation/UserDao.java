package com.springinaction.spitter.User.dao.implementation;

import com.springinaction.spitter.User.model.Spitter;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
public class UserDao {

    private static final String SELECT_QUERY = "select s from Spitter s";

    @PersistenceContext
    private EntityManager entityManager;

    public EntityManager getEntityManager(){
       return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void insert(Spitter spitter){
        entityManager.persist(spitter);
    }

    public List<Spitter> selectAll() {
        Query query = entityManager.createQuery(SELECT_QUERY);
        List<Spitter> spitters = (List<Spitter>) query.getResultList();
        return spitters;
    }
}