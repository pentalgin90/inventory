package by.htp.inventory.controller.command.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.inventory.controller.command.Command;
import by.htp.inventory.domain.Brand;
import by.htp.inventory.domain.Diagonal;
import by.htp.inventory.domain.Monitor;
import by.htp.inventory.service.EquipmentService;

public class UpdateMonitor implements Command{
	
	private EquipmentService equipmentService;
	
	

	public UpdateMonitor() {
	}

	

	public void setEquipmentService(EquipmentService equipmentService) {
		this.equipmentService = equipmentService;
	}



	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String inventory_id = request.getParameter("inventoryID");
		String location = request.getParameter("location");
		String monitorModel = request.getParameter("monitorModel");
		int brandFromWeb = Integer.parseInt(request.getParameter("brand"));
		int diagonalFromWeb = Integer.parseInt(request.getParameter("diagonal"));
		int id = Integer.parseInt(request.getParameter("id"));
		Brand brand = new Brand();
		brand.setId(brandFromWeb);
		Diagonal diagonal = new Diagonal();
		diagonal.setId(diagonalFromWeb);
		Monitor newMonitor = new Monitor(id, brand, diagonal, monitorModel, location, inventory_id);
		equipmentService.updateMonitor(newMonitor);
		return "/WEB-INF/jsp/listMonitor.jsp";
	}

}
