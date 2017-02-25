package com.coderhousez.envtracker.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Environment
 * 
 *
 */
public class Environment implements Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 3242945364719364174L;
	
	private String id;

	/**
	 * Friendly name for environment, DEV, QA, etc.
	 */
	private String name;
	
	/**
	 * List of applications belonging to environment
	 */
	private List<Application> applications;
	
	/**
	 * Base path used for Virtual paths
	 * 
	 */
	private String basePath;
	
	
	public Environment() {
		this.id = UUID.randomUUID().toString();
		this.applications = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Application> getApplications() {
		return applications;
	}
	
	public void addApplication(Application application) {
		applications.add(application);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBasePath() {
		return basePath;
	}

	public void setBasePath(String basePath) {
		this.basePath = basePath;
	}
	
	
}
