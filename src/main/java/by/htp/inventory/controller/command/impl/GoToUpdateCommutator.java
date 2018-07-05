package by.htp.inventory.controller.command.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.inventory.controller.command.Command;
import by.htp.inventory.domain.Commutator;
import by.htp.inventory.service.EquipmentService;

public class GoToUpdateCommutator implements Command{

	private EquipmentService equipmentService;
	
	public GoToUpdateCommutator() {
	}

	public void setEquipmentService(EquipmentService equipmentService) {
		this.equipmentService = equipmentService;
	}



	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		Commutator commutator = equipmentService.getCommutator(id);
		request.setAttribute("oldCommutator", commutator);
		return "/WEB-INF/jsp/updateCommutator.jsp";
	}

}
