package com.osi.loan.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.osi.loan.dao.UserDAO;
import com.osi.loan.domain.User;
import com.osi.loan.mapper.UserRowMapper;

public class UserDAOImpl implements UserDAO {

	private String addUserCommand = "INSERT INTO USER VALUES (?,?,?,?,?,?)";
	private String deleteUserCommand = "DELETE FROM USER WHERE username = ?";
	private String updateUserCommnad = "UPDATE USER SET password = ? email = ? WHERE username = ?";
	private String getAllUserCommnad = "SELECT * FORM USER";
	private String findByUserNameUserCommnad = "SELECT * FROM user WHERE username = ?";
	private String findByMobileCommnad = "SELECT * FROM user WHERE mobile = ?";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addUser(User user) {

		jdbcTemplate.update(addUserCommand, new Object[] { user.getUserId(), user.getUserName(), user.getPassword(),
				user.getEmail(), user.getMobile(), user.getUserType() });
		int i = 10 / 0;

	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User findUser(User user) {
		System.out.println("****** Found me !*********");
		int i = 10 / 0;
		return null;
	}

	@Override
	public void updateUser(User user) {
		jdbcTemplate.update(updateUserCommnad,
				new Object[] { user.getPassword(), user.getEmail(), user.getUserName() });

	}

	@Override
	public List<User> getAllUsers() {
		List<Map<String, Object>> users = jdbcTemplate.queryForList(getAllUserCommnad);
		List<User> userList = new ArrayList<User>();
		for (Map<String, Object> currentUser : users) {
			User user = new User();
			user.setUserName((String) currentUser.get("USERNAME"));
			user.setUserName((String) currentUser.get("PASSWORD"));
			user.setUserName((String) currentUser.get("EMAIL"));
			user.setUserName((String) currentUser.get("MOBILE"));
			user.setUserName((String) currentUser.get("USERTYPE"));
			userList.add(user);
		}
		return userList;
	}

	@Override
	public User findByUserName(String userName) {
		List<User> userList = jdbcTemplate.query(findByUserNameUserCommnad, new Object[] { userName },
				new UserRowMapper());
		return userList.get(0);
	}

	@Override
	public User findByMobile(String mobile) {
		User user = (User) jdbcTemplate.query(findByMobileCommnad, new Object[] { mobile }, new UserRowMapper());
		return user;
	}

}
