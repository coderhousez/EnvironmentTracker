package com.coderhousez.envtracker.viewer;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.coderhousez.envtracker.model.Environment;

public class EnvironmentTrackerProject extends Properties {
	
	private static final long serialVersionUID = 1L;
	
	public EnvironmentTrackerProject() {
		
	}

	public void loadProperties(InputStream propertyFileInputStream) throws IOException {
		super.load(propertyFileInputStream);
	}
}
