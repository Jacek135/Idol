package com.springinaction.spitter.User.dao;

import com.springinaction.spitter.User.model.Spitter;

import java.util.List;

public interface UserDAOInterface {

    public void insert(Spitter spitter);
    public List<Spitter> selectAll();
}
