package com.springinaction.spitter.User.dao;

import com.springinaction.spitter.User.model.Spitter;

public interface UserDAO {

    public void insertSpitter(Spitter spitter);
    public Spitter findBySpitterId(int SpitterId);

}
