package by.htp.inventory.controller.command.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.inventory.controller.command.Command;
import by.htp.inventory.service.EquipmentService;

public class GoToAddCommutator implements Command{
	
	private EquipmentService equipmentService;
	
	

	public GoToAddCommutator() {
	}

	public void setEquipmentService(EquipmentService equipmentService) {
		this.equipmentService = equipmentService;
	}



	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		return "/WEB-INF/jsp/addCommutator.jsp";
	}

}
