package com.coderhousez.envtracker.model;

import java.io.Serializable;
import java.util.UUID;

public class Configuration implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7274539367180913620L;
	
	private String id;
	
	private String name;
	
	/**
	 *  One of Properties, BCC config, XML
	 */
	private String type; 
	
	/**
	 * One of multiApplication, singleApplication
	 */
	private String scope;
	
	/**
	 * Virtual path that contains location of configuration
	 */
	private Store store;
	
	public Configuration() {
		this.id = UUID.randomUUID().toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public String getId() {
		return id;
	}

}
