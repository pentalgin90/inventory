package by.htp.inventory.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/exeption")
public class ExeptionRest {
	@RequestMapping()
	public void exception() {
		throw new RuntimeException();
		
	}
}
