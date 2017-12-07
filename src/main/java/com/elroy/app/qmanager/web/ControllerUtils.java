package com.elroy.app.qmanager.web;

public class ControllerUtils {

	private final static String LIST_PREFIX = "list";
	private final static String NEW_PREFIX = "new";
	
	public static String listView(String domainName) {
		return pluralizeAndAddSlash(domainName) + LIST_PREFIX + capitalizeFirstCharacter(domainName);
	}
	
	public static String newView(String domainName) {
		return pluralizeAndAddSlash(domainName) + NEW_PREFIX + capitalizeFirstCharacter(domainName);
	}
	
	private static final String capitalizeFirstCharacter(String s) {
		return s.substring(0, 1).toUpperCase() + s.substring(1);
	}
	
	private static final String pluralizeAndAddSlash(String s) {
		return s + "s/";
	}
}
