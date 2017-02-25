package com.coderhousez.envtracker.model;

import java.io.Serializable;

public class CredentialStore implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9050687956150316374L;
	
	private String id;
	
	/**
	 * Friendly Name
	 */
	private String name;
	
	/**
	 * URI or description of repository.
	 * Example: KeeWeb, KeePass, LastPass
	 */
	private String location;

}
