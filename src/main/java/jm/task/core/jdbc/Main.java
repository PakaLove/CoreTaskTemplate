package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Dmitriy","Sidoroff",(byte)32);
        userService.saveUser("Alexey","Grey",(byte)20);
        userService.saveUser("Vasiliy","Poopkin",(byte)22);
        userService.saveUser("Ivan","Paskal",(byte)40);

        for(User user : userService.getAllUsers()){
            System.out.println(user);
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
