package by.htp.inventory.controller.command.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.inventory.controller.command.Command;

public class GoToFind implements Command{
	
	
	

	public GoToFind() {
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		return "/WEB-INF/jsp/searchComp.jsp";
	}

}
