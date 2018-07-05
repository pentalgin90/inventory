package by.htp.inventory.controller;


import java.util.HashMap;
import java.util.Map;

import by.htp.inventory.controller.command.Command;
import by.htp.inventory.controller.command.impl.GoToAdd;
import by.htp.inventory.controller.command.impl.ListUserCommand;

public class CommandProvider {

	private Map<String, Command> commands = new HashMap<>();

	public CommandProvider() {
		commands.put("allUsers", new ListUserCommand());
		commands.put("gotoAdd", new GoToAdd());
	}

	Command getCommand(String commandName) {

		Command command;
		command = commands.get(commandName);
		return command;
	}
}
