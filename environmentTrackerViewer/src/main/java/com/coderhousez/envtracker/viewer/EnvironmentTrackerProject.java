package com.coderhousez.envtracker.viewer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Properties;

import com.coderhousez.envtracker.model.Environment;

public class EnvironmentTrackerProject implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Friendly name for application
	 */
	private String projectName;
	
	/**
	 * Top level configuration
	 */
	private Environment environment;
	
	public String getProjectName() {
		return projectName;
	}

	public Environment getEnvironment() {
		return environment;
	}
	
	public EnvironmentTrackerProject() {}
	
	public EnvironmentTrackerProject(String projectName) {
		this.projectName = projectName;
		this.environment = new Environment();
	}
	
	public EnvironmentTrackerProject load(String path) throws ClassNotFoundException, IOException {
		EnvironmentTrackerProject project = null;
		InputStream file = new FileInputStream(path);
		InputStream buffer = new BufferedInputStream(file);
		ObjectInput input = new ObjectInputStream(buffer);
		try {
			project = (EnvironmentTrackerProject) input.readObject();
		} finally {
			input.close();
		}
		return project;
	}
	
	public void save(String path) throws IOException {
		OutputStream file = new FileOutputStream(path);
		OutputStream buffer = new BufferedOutputStream(file);
		ObjectOutput output = new ObjectOutputStream(buffer);
		try {
			output.writeObject(this);
		} finally {
			output.close();
		}
	}

}
