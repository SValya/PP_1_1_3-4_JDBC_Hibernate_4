package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService user = new UserServiceImpl();

        user.createUsersTable();

        user.saveUser("Name1", "LastName1", (byte) 10);
        user.saveUser("Name2", "LastName2", (byte) 20);
        user.saveUser("Name3", "LastName3", (byte) 30);
        user.saveUser("Name4", "LastName4", (byte) 127);

        user.getAllUsers();

        user.cleanUsersTable();

        user.dropUsersTable();
    }
}
