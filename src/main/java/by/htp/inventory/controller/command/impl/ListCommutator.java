package by.htp.inventory.controller.command.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.htp.inventory.controller.command.Command;
import by.htp.inventory.domain.Commutator;
import by.htp.inventory.domain.Monitor;
import by.htp.inventory.service.EquipmentService;
import repository.CommutatorRepository;
import repository.MonitorRepository;

public class ListCommutator implements Command{
	
	private EquipmentService equipmentService;
	
	public ListCommutator() {	
	}
	
	public void setEquipmentService(EquipmentService equipmentService) {
		this.equipmentService = equipmentService;
	}



	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
	/*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextSpringData.xml");
		CommutatorRepository commutatorRepository = context.getBean(CommutatorRepository.class);
		List<Commutator> commutators = commutatorRepository.findAll();
		request.setAttribute("commutatorlist", commutators);
		return "/WEB-INF/jsp/listCommutator.jsp";*/
		List<Commutator> commutators = equipmentService.commutstorAll();
		commutators.forEach(commutator -> System.out.println(commutator.toString()));
		request.setAttribute("commutatorlist", commutators);
		return "/WEB-INF/jsp/listCommutator.jsp";
	}

}
