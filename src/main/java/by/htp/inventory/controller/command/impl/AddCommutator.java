package by.htp.inventory.controller.command.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.inventory.controller.command.Command;
import by.htp.inventory.domain.Commutator;
import by.htp.inventory.service.EquipmentService;

public class AddCommutator implements Command{

	private EquipmentService equipmentService;
	
	public AddCommutator() {
	}
	
	public void setEquipmentService(EquipmentService equipmentService) {
		this.equipmentService = equipmentService;
	}



	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String inventory_id = request.getParameter("inventory_id");
		String location = request.getParameter("location");
		String model = request.getParameter("model");
		int port = Integer.parseInt(request.getParameter("port"));
		String fc = request.getParameter("fc");
		System.out.println(request.getParameter("fc"));
		Commutator commutator = new Commutator(model, port, fc, location, inventory_id);
		equipmentService.addCommutator(commutator);
		return "/WEB-INF/jsp/addComp.jsp";
	}
	
}
