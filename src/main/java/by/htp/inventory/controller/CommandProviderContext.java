package by.htp.inventory.controller;


import org.springframework.web.context.WebApplicationContext;

import by.htp.inventory.controller.command.Command;

public class CommandProviderContext {

	public CommandProviderContext() {
	}
	
	public static Command getCommand(String command, WebApplicationContext webApplicationContext) {
		return (Command) webApplicationContext.getBean(command);
	
	}

}
