package by.htp.inventory.web.action;

import java.util.HashMap;
import java.util.Map;

import static by.htp.inventory.web.util.WebConstantDeclaration.*;

import by.htp.inventory.web.action.impl.UserAll;

public class ActionManager {

	
	private ActionManager() {
	}

	private static Map<String, BaseAction> actions;
	
	static {
		actions = new HashMap<>();
		
		actions.put(ACTION_NAME_VIEW_USER_LIST, new UserAll());
	}
	
	public static BaseAction getAction(String action) {
		return actions.get(action);
	}
}
