package by.htp.inventory.controller.command.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.inventory.controller.command.Command;
import by.htp.inventory.domain.Monitor;
import by.htp.inventory.service.EquipmentService;

public class RemoveMonitor implements Command{
	
	private EquipmentService equipmentService;
	
	
	public RemoveMonitor() {
	}
	
	

	public void setEquipmentService(EquipmentService equipmentService) {
		this.equipmentService = equipmentService;
	}



	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		equipmentService.deleteMonitor(id);
		List<Monitor> monitors = equipmentService.monitorAll();
		request.setAttribute("monitorlist", monitors);
		return "/WEB-INF/jsp/listEquipment.jsp";
	}

}
