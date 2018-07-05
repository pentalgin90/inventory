package by.htp.inventory.controller.command.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.inventory.controller.command.Command;
import by.htp.inventory.domain.Computer;

import by.htp.inventory.service.EquipmentService;

public class ListComputer implements Command{
	
	private EquipmentService equipmentService;
	
	

	public ListComputer() {
	}

	public void setEquipmentService(EquipmentService equipmentService) {
		this.equipmentService = equipmentService;
	}




	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		List<Computer> computers = equipmentService.computerAll();
		if(computers == null) {
			System.out.println("что не так нет компов");
		}
		request.setAttribute("computerlist", computers);
		return "/WEB-INF/jsp/listComputer.jsp";
	}

}
