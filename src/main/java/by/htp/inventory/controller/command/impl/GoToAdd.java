package by.htp.inventory.controller.command.impl;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.inventory.controller.command.Command;

public class GoToAdd implements Command{
	
	

	public GoToAdd() {
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
	
		return "/WEB-INF/jsp/addComp.jsp";
	
	}

}
