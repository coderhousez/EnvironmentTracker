package com.coderhousez.envtracker.model;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public class Application extends Item implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8849842655457177977L;
	
	private String id;
	
	/**
	 * Friendly Name
	 */
	private String name;
	
	/**
	 * Software vendor
	 */
	private String vendor;
	
	/**
	 * Category of Application
	 * Useful for grouping applications
	 */
	private String category;
	
	/**
	 * Services exposed over the network, such as HTTP
	 */
	private List<Service> services;
	
	/**
	 * List of configurations archived locally
	 */
	private List<Configuration> configurations;
	
	/**
	 * List of HTTP links
	 */
	private List<Link> links;
	
	/**
	 * List of applications that this application depends on.
	 * Example, web server depends on application server to
	 * server content.
	 */
	private List<Application> dependsOnApplications;
	
	public Application(String name) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<Service> getServices() {
		return services;
	}

	public void addService(Service service) {
		this.services.add(service);
	}

	public List<Configuration> getConfigurations() {
		return configurations;
	}

	public void addConfigurations(Configuration configuration) {
		this.configurations.add(configuration);
	}

	public List<Link> getLinks() {
		return links;
	}

	public void addLinks(Link link) {
		this.links.add(link);
	}

	public List<Application> getDependsOnApplications() {
		return dependsOnApplications;
	}

	public void addDependsOnApplications(Application dependsOnApplication) {
		this.dependsOnApplications.add(dependsOnApplication);
	}

	public String getId() {
		return id;
	}
	
	public String toString() {
		return this.name;
	}

}
