package by.htp.inventory.web.action;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

public interface BaseAction {
	
	String executeAction(HttpServletRequest request) throws SQLException;

}
