package by.htp.inventory.controller.command.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.inventory.controller.command.Command;
import by.htp.inventory.domain.Brand;
import by.htp.inventory.domain.Diagonal;
import by.htp.inventory.domain.Monitor;
import by.htp.inventory.service.EquipmentService;

public class AddMonitor implements Command{
	
	private EquipmentService equipmentService;
	
	

	public AddMonitor() {
	}
	


	public void setEquipmentService(EquipmentService equipmentService) {
		this.equipmentService = equipmentService;
	}



	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String inventory_id = request.getParameter("inventory_id");
		String location = request.getParameter("location");
		String monitorModel = request.getParameter("model");
		int brandFromWeb = Integer.parseInt(request.getParameter("brand"));
		int diagonalFromWeb = Integer.parseInt(request.getParameter("diagonal"));
		System.out.println(brandFromWeb + "   " + diagonalFromWeb);
		Brand brand = new Brand();
		brand.setId(brandFromWeb);
		Diagonal diagonal = new Diagonal();
		diagonal.setId(diagonalFromWeb);
		Monitor monitor = new Monitor(brand, diagonal, monitorModel, location, inventory_id);
		equipmentService.addMonitor(monitor);
		return "/WEB-INF/jsp/addComp.jsp";
	}

}
