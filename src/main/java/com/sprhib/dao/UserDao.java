package com.sprhib.dao;

/**
 * Created by tanvigupta on 23/06/17.
 */

import java.util.List;
import com.sprhib.model.User;

public interface UserDao {
    public void addUser(User user);
    public void updateUser(User user);
    public User getUser(String name);
    public void deleteUser(String name);
    public List<User> getUsers();
}
