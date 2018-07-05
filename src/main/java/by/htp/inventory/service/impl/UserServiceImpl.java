package by.htp.inventory.service.impl;

import java.util.List;

import by.htp.inventory.dao.UserDAO;
import by.htp.inventory.dao.impl.UserDAOImpl;
import by.htp.inventory.domain.User;
import by.htp.inventory.service.UserService;

public class UserServiceImpl implements UserService{

	private UserDAO userDAO;
	
	public UserServiceImpl() {		
	}
	
	@Override
	public List<User> userAll() {
		UserDAO userDAO = new UserDAOImpl();
		return userDAO.userAll();
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	

	
	
}
