package by.htp.inventory.controller.command.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.inventory.controller.command.Command;
import by.htp.inventory.domain.Brand;
import by.htp.inventory.domain.Diagonal;
import by.htp.inventory.service.EquipmentService;


public class GoToAddMonitor implements Command{
	
	private EquipmentService equipmentService;

	

	public void setEquipmentService(EquipmentService equipmentService) {
		this.equipmentService = equipmentService;
	}

	public GoToAddMonitor() {
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		List<Brand> brands = equipmentService.brandAll();
		request.setAttribute("brandAll", brands);
		List<Diagonal> diagonals = equipmentService.diagonalAll();
		request.setAttribute("diagonalAll", diagonals);
		return "/WEB-INF/jsp/addMonitor.jsp";
	}

	
	
}
