package jm.task.core.jdbc.dao;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;


public class UserDaoJDBCImpl implements UserDao {
    private PreparedStatement preparedStatement = null;

    public UserDaoJDBCImpl() {

    }
    public void createUsersTable() {
    }

    public void dropUsersTable() {
    }

    public void saveUser(String name, String lastName, byte age) {
    }

    public void removeUserById(long id) {
    }

    public List<User> getAllUsers() {
        return null;
    }

    public void cleanUsersTable() {
    }
}
