package com.osi.loan.service;

import java.util.List;

import com.osi.loan.domain.User;

public interface UserService {

	public void addUser(User user);

	public void deleteUser(User user);

	public User findUser(User user);

	public void updateUser(User user);

	public List<User> getAllUsers();

	public User findByUserName(String userName);

	public User findByMobile(String mobile);

}
