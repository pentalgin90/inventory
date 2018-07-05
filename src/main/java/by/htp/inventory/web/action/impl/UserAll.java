package by.htp.inventory.web.action.impl;

import javax.servlet.http.HttpServletRequest;
import static by.htp.inventory.web.util.WebConstantDeclaration.*;

import java.util.List;

import by.htp.inventory.domain.User;
import by.htp.inventory.service.UserService;
import by.htp.inventory.web.action.BaseAction;

public class UserAll implements BaseAction{
	
	private UserService userService;
	
	public UserAll() {
	}

	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@Override
	public String executeAction(HttpServletRequest request) {
		
		List<User> users = userService.userAll();
		
		request.setAttribute(REQUEST_PARAM_ACTION_USER_LIST, users);
		
		return PAGE_USER_MAIN;
	}

		
	
}
