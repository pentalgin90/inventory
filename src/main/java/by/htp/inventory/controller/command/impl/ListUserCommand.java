package by.htp.inventory.controller.command.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.inventory.controller.command.Command;
import by.htp.inventory.domain.User;
import by.htp.inventory.service.UserService;

public class ListUserCommand implements Command{

	private UserService userService;


	public ListUserCommand() {
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		List<User> users = userService.userAll();
		request.setAttribute("userlist", users);
		return "/WEB-INF/jsp/listUser.jsp";
	}	
	

}
