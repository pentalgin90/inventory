package by.htp.inventory.entitytest;

import java.util.List;
import java.util.Optional;

import javax.naming.Context;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.htp.inventory.dao.impl.DaoConnectionHelper;
import by.htp.inventory.dao.impl.EquipmentDAOImpl;
import by.htp.inventory.dao.impl.UserDAOImpl;
import by.htp.inventory.domain.Brand;
import by.htp.inventory.domain.Monitor;
import by.htp.inventory.domain.User;
import repository.MonitorRepository;

public class TestConnection {
	
	/*@Test
	public void properties() {
		DaoConnectionHelper dch = new DaoConnectionHelper();
		System.out.println(dch.getUrl());
	}

	@Test
	public void userAll() {
		UserDAOImpl dao = new UserDAOImpl();
		List<User> users = dao.userAll();
		users.forEach(user -> System.out.println(user.toString()));
	}
	
	@Test
	public void brandAll() {
		EquipmentDAOImpl dao = new EquipmentDAOImpl();
		List<Brand> brands = dao.brandAll();
		for(Brand i : brands) {
			System.out.println(i);
		}
	}*/
	
	@Test
	public void findMonitorById() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextSpringData.xml");
		
		MonitorRepository monitorRepository = context.getBean(MonitorRepository.class);
		List<Monitor> findMonitor = monitorRepository.findAll();
		findMonitor.forEach(monitor -> System.out.println(monitor.toString()));
	}
	
}
