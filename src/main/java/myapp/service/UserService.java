package myapp.service;

import myapp.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    void updateUser(User user);
    User getUserById(Long id);
    void deleteUserById(Long id);
    List<User> getAllUsers();
}