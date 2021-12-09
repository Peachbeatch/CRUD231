package myapp.dao;

import myapp.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    User getUserById(Long id);

    User getUserByUsername(String username);

    void saveUser(User user);

    void updateUser(Long id, User user);

    void deleteUserById(Long id);
}