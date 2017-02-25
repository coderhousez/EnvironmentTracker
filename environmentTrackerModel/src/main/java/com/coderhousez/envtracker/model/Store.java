package com.coderhousez.envtracker.model;

import java.io.Serializable;
import java.util.UUID;

/**
 * Virtual File Storage
 * 
 * baseURI will be passed to each object on 
 * project startup based on local configuration
 * 
 * @author coder
 *
 */
public class Store implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6809714540344292210L;
	
	private String id;
	
	/**
	 * Under version control, such as SVN or GIT
	 */
	private boolean versioned;
	
	/**
	 * SCM Type
	 */
	private String scm;
	
	/**
	 * URI, including protocol
	 */
	private String baseURI;
	
	/**
	 * Portion of path after baseURI
	 */
	private String path;
	
	public Store() {
		this.id = UUID.randomUUID().toString();
	}

	public boolean isVersioned() {
		return versioned;
	}

	public void setVersioned(boolean versioned) {
		this.versioned = versioned;
	}

	public String getScm() {
		return scm;
	}

	public void setScm(String scm) {
		this.scm = scm;
	}

	public String getBaseURI() {
		return baseURI;
	}

	public void setBaseURI(String baseURI) {
		this.baseURI = baseURI;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getId() {
		return id;
	}

}
