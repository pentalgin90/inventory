package by.htp.inventory.controller.command.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.inventory.controller.command.Command;
import by.htp.inventory.domain.Commutator;
import by.htp.inventory.domain.Monitor;
import by.htp.inventory.service.EquipmentService;

public class RemoveCommutator implements Command{
	
	private EquipmentService equipmentService;

	public RemoveCommutator() {
	}

	public void setEquipmentService(EquipmentService equipmentService) {
		this.equipmentService = equipmentService;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		equipmentService.deleteCommutator(id);
		List<Commutator> commutators = equipmentService.commutstorAll();
		request.setAttribute("commutatorlist", commutators);
		return "/WEB-INF/jsp/listCommutator.jsp";
	}

	
}
