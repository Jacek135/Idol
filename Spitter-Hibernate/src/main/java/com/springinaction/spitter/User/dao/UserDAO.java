package com.springinaction.spitter.User.dao;

import com.springinaction.spitter.User.model.Spitter;

public interface UserDAO {

    public void addSpitter(Spitter spitter);
    public Spitter getSpitterById(int id);
    public void updateSpitter(Spitter spitter);
}
