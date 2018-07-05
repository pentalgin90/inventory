package by.htp.inventory.controller.command.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.inventory.controller.command.Command;
import by.htp.inventory.domain.Brand;
import by.htp.inventory.domain.Diagonal;
import by.htp.inventory.domain.Monitor;
import by.htp.inventory.service.EquipmentService;

public class GoToUpdate implements Command{
	
	private EquipmentService equipmentService;
	
	

	public GoToUpdate() {
	}

	

	public void setEquipmentService(EquipmentService equipmentService) {
		this.equipmentService = equipmentService;
	}



	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		List<Brand> brands = equipmentService.brandAll();
		List<Diagonal> diagonals = equipmentService.diagonalAll();
		int id = Integer.parseInt(request.getParameter("id"));
		Monitor monitor = equipmentService.getMonitor(id);
		request.setAttribute("brandAll", brands);
		request.setAttribute("diagonalAll", diagonals);
		request.setAttribute("oldMonitor", monitor);
		request.setAttribute("brand", monitor.getBrand());
		return "/WEB-INF/jsp/updateMonitor.jsp";
	}

}
