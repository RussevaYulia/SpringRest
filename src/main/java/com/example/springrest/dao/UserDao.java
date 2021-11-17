package com.example.springrest.dao;

import com.example.springrest.model.Role;
import com.example.springrest.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();

    public List<Role> getAllRoles();

    public void saveUser(User user);

    public void editUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);

    public User getUserByName(String username);

    Role getRoleByName(String name);
}
