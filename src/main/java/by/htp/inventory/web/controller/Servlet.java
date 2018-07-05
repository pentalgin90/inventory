package by.htp.inventory.web.controller;

import static by.htp.inventory.web.util.WebConstantDeclaration.*;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import by.htp.inventory.web.action.ActionManagerContext;
import by.htp.inventory.web.action.BaseAction;



public class Servlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4778319920311062970L;

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		try {
			processRequest(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		try {
			processRequest(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

		ServletContext servletContext = request.getServletContext();
		WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
		
		
		String action = request.getParameter(REQUEST_PARAM_ACTION);
		System.out.println(action);
		//BaseAction baseAction = ActionManager.getAction(action);
		BaseAction baseAction = ActionManagerContext.getAction(action, webApplicationContext);
		if(action != null) {
			String page = baseAction.executeAction(request);
			request.getRequestDispatcher(page).forward(request, response);
		}else {
			response.getWriter().println("Incorrect Action!");
		}
		
		
		
	}
	
}
