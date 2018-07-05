package by.htp.inventory.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import by.htp.inventory.domain.Monitor;
import by.htp.inventory.service.EquipmentService;

@Controller
public class DefaultActionContext {
	@Autowired
	private EquipmentService equipmentService;
	
	public DefaultActionContext() {
	}
	
	public void setEquipmentService(EquipmentService equipmentService) {
		this.equipmentService = equipmentService;
	}
	
	@RequestMapping(value="/allEquipment", method=RequestMethod.GET)
	public String listEquipment() {
		return "listEquipment";
		
	}
	
	@RequestMapping(value="/monitor", method=RequestMethod.GET)
	public String listmonitor() {
		return "monitor";
		
	}
	
	@RequestMapping(value="/addEquipment", method=RequestMethod.GET)
	public String goToAdd() {
		return "addEquipment";
	}
}
