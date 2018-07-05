package by.htp.inventory.controller.command.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.inventory.controller.command.Command;
import by.htp.inventory.domain.Commutator;
import by.htp.inventory.service.EquipmentService;

public class UpdateCommutator implements Command{
	
	private EquipmentService equipmentService;

	public UpdateCommutator() {
	}

	public void setEquipmentService(EquipmentService equipmentService) {
		this.equipmentService = equipmentService;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String inverter_id = request.getParameter("invertoryId");
		String location = request.getParameter("location");
		String model = request.getParameter("model");
		int port = Integer.parseInt(request.getParameter("port"));
		String fc = request.getParameter("fc");
		int id = Integer.parseInt(request.getParameter("id"));
		Commutator newCommutator = new Commutator(id, model, port, fc, location, inverter_id);
		equipmentService.updateCommutator(newCommutator);
		return null;
	}
	
	

}
