package com.example.olio_vk9;

import java.util.ArrayList;

public class UserStorage {
    private ArrayList<User> users = new ArrayList<>();

    private static UserStorage userStorage = null;

    private UserStorage() {
    }

    public static UserStorage getInstance() {
        if(userStorage == null) {
            userStorage = new UserStorage();
        }
        return userStorage;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void listUsers() {
        for(User x : users) {
            System.out.println(x.getDegreeProgram() + ": " + x.getFirstName() + " " + x.getLastName() + " " + x.getEmail());
        }
    }
}
