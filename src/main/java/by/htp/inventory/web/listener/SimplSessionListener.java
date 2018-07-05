package by.htp.inventory.web.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SimplSessionListener implements HttpSessionListener{

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("Session was created!!!");
		System.out.println(se.getSession());
		System.out.println(se.getSession().getId());
		System.out.println(se.getSession().getLastAccessedTime());
		se.getSession().setMaxInactiveInterval(100000);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("Session was destroer!!!");
		System.out.println(se.getSession());
		System.out.println(se.getSession().getId());
		System.out.println(se.getSession().getLastAccessedTime());
	}
	
	

}
