package org.management.model;

import org.jetbrains.annotations.NotNull;

public class User {
    private final @NotNull String id;
    private final @NotNull String firstName;
    private final @NotNull String lastName;
    private final @NotNull String username;
    private @NotNull String password;
    private @NotNull String email;
    private @NotNull Role role;
    private @NotNull Boolean isActive;
    private @NotNull Boolean isConnected = Boolean.FALSE;

    public User(@NotNull String id, @NotNull String firstName, @NotNull String lastName,
                @NotNull String username, @NotNull String password,
                @NotNull String email, @NotNull Role role,
                @NotNull Boolean isActive) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.isActive = isActive;
    }

    public void connect() {
        this.isConnected = Boolean.TRUE;
    }

    public void disconnect() {
        isConnected = Boolean.FALSE;
    }

    // Getters and Setters
    public @NotNull String getId() { return id; }
    public @NotNull String getFirstName() { return firstName; }
    public @NotNull String getLastName() { return lastName; }
    public @NotNull String getUsername() { return username; }
    public @NotNull String getPassword() { return password; }
    public void setPassword(@NotNull String password) { this.password = password; }
    public @NotNull String getEmail() { return email; }
    public void setEmail(@NotNull String email) { this.email = email; }
    public @NotNull Role getRole() { return role; }
    public void setRole(@NotNull Role role) { this.role = role; }
    public boolean isActive() { return isActive; }
    public void setActive(@NotNull Boolean isActive) { this.isActive = isActive; }
    public boolean isConnected() { return isConnected; }
    public void setConnected(@NotNull Boolean isConnected) { this.isConnected = isConnected; }
}
