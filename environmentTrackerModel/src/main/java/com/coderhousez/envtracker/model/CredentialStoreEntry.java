package com.coderhousez.envtracker.model;

import java.io.Serializable;

public class CredentialStoreEntry implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 652784571864858703L;
	
	private String id;
	
	/**
	 * Name of Entry in CredentialStore
	 */
	private String name;
	
	/**
	 * Alternative Key to reference in CredentialStore
	 */
	private String key;
	
	
}
