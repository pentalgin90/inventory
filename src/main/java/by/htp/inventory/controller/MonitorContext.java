package by.htp.inventory.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import by.htp.inventory.domain.Brand;
import by.htp.inventory.domain.Diagonal;
import by.htp.inventory.domain.Monitor;
import by.htp.inventory.service.EquipmentService;

@Controller
public class MonitorContext {
	private final static Gson GSON = new GsonBuilder().setPrettyPrinting().create();
	@Autowired
	private EquipmentService equipmentService;

	@RequestMapping(value = "/goAddMonitor", method = RequestMethod.GET)
	public ModelAndView goToAddMonitor(ModelMap model) {
		List<Brand> brands = equipmentService.brandAll();
		List<Diagonal> diagonals = equipmentService.diagonalAll();
		model.addAttribute("brandAll", brands);
		model.addAttribute("diagonalAll", diagonals);
		return new ModelAndView("addMonitor", "command", new Monitor());
	}

	@RequestMapping(value="/checkID", method=RequestMethod.GET)
	   public 
	   @ResponseBody String checkID(@ModelAttribute Monitor monitor) {
				String check;
				Monitor oldMonitor = equipmentService.getMonitor(9);
				String json = GSON.toJson(oldMonitor);
				System.out.println(oldMonitor.getInverterId());
				System.out.println(monitor.getInverterId());
				if(oldMonitor.getInverterId().equals(monitor.getInverterId())) {
					return check = "Bad inventory";
				}else {
					return check = "";
				}
			
				
	   }

	@RequestMapping(value = "/addMonitor", method = RequestMethod.POST)
	public String addMonitor(@ModelAttribute Monitor monitor) {
		equipmentService.addMonitor(monitor);
		return "addMonitor";
	}

}
