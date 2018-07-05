package by.htp.inventory.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.mysql.cj.api.jdbc.Statement;
import com.mysql.cj.jdbc.PreparedStatement;

import by.htp.inventory.dao.UserDAO;
import by.htp.inventory.domain.User;

public class UserDAOImpl implements UserDAO{

	static final Logger logger = Logger.getLogger(UserDAOImpl.class);
	static final String SELECT_ALL_USERS = "SELECT idusers, name, lastname FROM users;";
	DaoConnectionHelper conn = new DaoConnectionHelper();
	
	@Override
	public List<User> userAll() {
		List<User> allUser = new ArrayList<User>();
		Connection connection = conn.connect();
		Statement st = null;
		try {
			st = (Statement) connection.createStatement();
			
			ResultSet rs = st.executeQuery(SELECT_ALL_USERS);
			while(rs.next()) {
				String idUser = rs.getString(1);
				String name = rs.getString(2);
				String lastname = rs.getString(3);
				allUser.add(new User(idUser, name, lastname));
			}
			logger.info("Connected");
		}catch (SQLException e) {
			logger.error("Dont connected");
		}
		
		return allUser;
	}

	

}
