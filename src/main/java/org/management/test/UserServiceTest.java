package org.management.test;


import org.management.model.Role;
import org.management.model.User;
import org.management.model.UserService;

import javax.security.auth.login.LoginException;


public class UserServiceTest {
    public static void main(String[] args) throws LoginException {
        UserService userService = new UserService();
        User user1 = new User("X24", "ADMIN", "AD", "ADMIN", "ADMIN2", "AD", Role.ADMIN, Boolean.TRUE);
        userService.getUserList().add(user1);
        userService.login("ADMIN", "ADMIN2");

        User user2 = userService.addUser("XXX","usernormal","usernormal","usernormal","usernormal","usernormal",Role.NORMAL_USER);
        userService.getUserList().add(user2);

        System.out.println(userService.getUserList());


    }
}
