package com.coderhousez.envtracker.model;

import java.io.Serializable;
import java.util.UUID;

public class Service implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	/**
	 * Friendly name for Service
	 */
	private String name;
	
	/**
	 * One of https, http, ftp, sftp, etc.
	 */
	private String protocol;
	
	/**
	 * TCP port
	 */
	private int servicePort;
	
	/**
	 * Server (uses default)
	 */
	private Server server;
	
	/**
	 * Remaining portion of URI (/)
	 */
	private String context;
	
	/**
	 * Location of password required
	 */
	private CredentialStoreEntry credentialStoreEntryId;
	
	/**
	 * Service uses apache challenge
	 */
	private boolean requiresApacheChallenge;
	
	/**
	 * Location of apache challenge 
	 */
	private CredentialStoreEntry apacheCredentialStoreEntryId;
	
	public Service() {
		this.id = UUID.randomUUID().toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public int getServicePort() {
		return servicePort;
	}

	public void setServicePort(int servicePort) {
		this.servicePort = servicePort;
	}

	public Server getServer() {
		return server;
	}

	public void setServer(Server server) {
		this.server = server;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public CredentialStoreEntry getCredentialStoreEntryId() {
		return credentialStoreEntryId;
	}

	public void setCredentialStoreEntryId(
			CredentialStoreEntry credentialStoreEntryId) {
		this.credentialStoreEntryId = credentialStoreEntryId;
	}

	public boolean isRequiresApacheChallenge() {
		return requiresApacheChallenge;
	}

	public void setRequiresApacheChallenge(boolean requiresApacheChallenge) {
		this.requiresApacheChallenge = requiresApacheChallenge;
	}

	public CredentialStoreEntry getApacheCredentialStoreEntryId() {
		return apacheCredentialStoreEntryId;
	}

	public void setApacheCredentialStoreEntryId(
			CredentialStoreEntry apacheCredentialStoreEntryId) {
		this.apacheCredentialStoreEntryId = apacheCredentialStoreEntryId;
	}

	public String getId() {
		return id;
	}

}
