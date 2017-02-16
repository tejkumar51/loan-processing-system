package com.osi.loan.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.osi.loan.domain.User;

public class UserRowMapper implements RowMapper {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setUserId(Integer.valueOf(rs.getString("USER_ID")));
		user.setUserName(rs.getString("USERNAME"));
		user.setPassword(rs.getString("PASSWORD"));
		user.setEmail(rs.getString("EMAIL"));
		user.setMobile(rs.getString("MOBILE"));
		user.setUserType(rs.getString("USERTYPE"));
		return user;
	}

}
