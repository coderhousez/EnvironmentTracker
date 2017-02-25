package com.coderhousez.envtracker.model;

import java.io.Serializable;
import java.util.UUID;

public class Server implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2511135409777818330L;
	
	private String id;
	
	/**
	 * For now, one hostname associated with Server
	 */
	private String defaultHostname;
	
	/**
	 * IP Address
	 */
	private String ipAddress;
	
	/**
	 * Hosting Location
	 * (Vera Bradley, Spark Red)
	 */
	private String networkName;
	
	private Server() {
		this.id = UUID.randomUUID().toString();
	}

	public String getDefaultHostname() {
		return defaultHostname;
	}

	public void setDefaultHostname(String defaultHostname) {
		this.defaultHostname = defaultHostname;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getNetworkName() {
		return networkName;
	}

	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}

	public String getId() {
		return id;
	}
	
	
}
