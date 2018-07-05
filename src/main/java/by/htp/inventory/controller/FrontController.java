package by.htp.inventory.controller;




import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;


import by.htp.inventory.controller.command.Command;
import by.htp.inventory.web.action.ActionManagerContext;

public class FrontController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4558968692899379413L;
	
	private final CommandProvider provider = new CommandProvider();

	public FrontController() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{

		try {
			processRequest(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//doGet(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
			

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
		
		
		String command = request.getParameter("command");
		System.out.println(command);
		//BaseAction baseAction = ActionManager.getAction(action);
		Command commands = CommandProviderContext.getCommand(command, webApplicationContext);
		if(commands != null) {
			String page = commands.execute(request, response);
			request.getRequestDispatcher(page).forward(request, response);
		}else {
			response.getWriter().println("Incorrect Action!");
		}
		
		
		
	}
	
	

}
