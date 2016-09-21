package com.springinaction.spitter.User.Services;

import com.springinaction.spitter.User.dao.implementation.UserDao;
import com.springinaction.spitter.User.model.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SpitterService {

    @Autowired
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void addSpitter(Spitter spitter){
        getUserDao().insert(spitter);
    }

    public List<Spitter> fetchAllSpitters(){
        return getUserDao().selectAll();
    }
}
