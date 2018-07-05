package by.htp.inventory.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import by.htp.inventory.domain.Monitor;
import by.htp.inventory.service.EquipmentService;

@Controller
@RequestMapping(value = "/monitors")
public class RestController {

	@Autowired
	private EquipmentService equipmentService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Monitor> monitors() throws ProtocolException {
		List<Monitor> monitors = equipmentService.monitorAll();

		return monitors;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	private Monitor monitro(@PathVariable int id) {
		Monitor findMonitor = equipmentService.getMonitor(id);
		
		return findMonitor;

	}
	
	
	
}
