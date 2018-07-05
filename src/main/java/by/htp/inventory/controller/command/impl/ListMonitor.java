package by.htp.inventory.controller.command.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.htp.inventory.controller.command.Command;
import by.htp.inventory.domain.Monitor;
import by.htp.inventory.service.EquipmentService;
import repository.MonitorRepository;

public class ListMonitor implements Command{
	
	private EquipmentService equipmentService;
	
	

	public ListMonitor() {
	}

	

	public void setEquipmentService(EquipmentService equipmentService) {
		this.equipmentService = equipmentService;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		/*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextSpringData.xml");
		MonitorRepository monitorRepository = context.getBean(MonitorRepository.class);
		
		List<Monitor> monitors = monitorRepository.findAll();
		request.setAttribute("monitorlist", monitors);
		return "/WEB-INF/jsp/listMonitor.jsp";*/
		List<Monitor> monitors = equipmentService.monitorAll();
		request.setAttribute("monitorlist", monitors);
		return "/WEB-INF/jsp/listMonitor.jsp";
	}

}
