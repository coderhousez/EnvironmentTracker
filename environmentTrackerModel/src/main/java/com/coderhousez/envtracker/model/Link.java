package com.coderhousez.envtracker.model;

import java.io.Serializable;
import java.util.UUID;

public class Link implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7634502910060519427L;
	
	private String id;
	
	private String displayText;
	
	private Service service;
	
	public Link() {
		this.id = UUID.randomUUID().toString();
	}

	public String getDisplayText() {
		return displayText;
	}

	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public String getId() {
		return id;
	}

}
