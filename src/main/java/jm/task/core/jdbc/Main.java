package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService us = new UserServiceImpl();
        us.createUsersTable();
        us.saveUser("Ivan", "Ivanov", (byte) 34);
        us.saveUser("Alex", "Alexandrov", (byte) 43);
        us.saveUser("Petr", "Petrov", (byte) 33);
        us.saveUser("Oleg", "Olegov", (byte) 23);
        for (User user : us.getAllUsers()) {
            System.out.println(user);
        }
        us.cleanUsersTable();
        us.dropUsersTable();
    }
}
