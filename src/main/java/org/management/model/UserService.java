package org.management.model;

import org.jetbrains.annotations.NotNull;

import javax.security.auth.login.LoginException;
import java.util.ArrayList;
import java.util.List;

public class UserService{
    private final List<User> userList = new ArrayList<>();
    private User loggedInUser;

    public User login(@NotNull String username, @NotNull String password) throws LoginException {
        for (User user : userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                user.connect();
                loggedInUser = user;
                return user;
            }
        }
        throw new LoginException("Credenciais inválidas");
    }

    public void logout(@NotNull User user) {
        if(user.equals(loggedInUser)) {
            user.disconnect();
            loggedInUser = null;
        }
    }

    public User addUser(@NotNull String id, @NotNull String username, @NotNull String firstName,
                        @NotNull String lastName, @NotNull String email, @NotNull String password,
                        @NotNull Role role) {

        if (loggedInUser != null && loggedInUser.isConnected() && loggedInUser.getRole().equals(Role.ADMIN)) {
            User newUser = new User(id, firstName, lastName, username, password, email, role, true);
            userList.add(newUser);
            return newUser;
        } else {
            throw new SecurityException("Somente administradores podem adicionar usuários.");
        }
    }

    public List<User> getUserList() {
        return userList;
    }
}
