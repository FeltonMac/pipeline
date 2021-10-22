package com.revature.DAO;

import java.util.List;

import com.revature.models.User;

public interface UserDAO {
	List<User> findall();
    User findById(int id);
    boolean addUser(User user);
    boolean deleteUser(String username);
}
