package com.coderhousez.envtracker.viewer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.coderhousez.envtracker.model.Application;
import com.coderhousez.envtracker.model.Environment;
import com.coderhousez.envtracker.viewer.markdown.MarkdownViewer;

public class EnvironmentTrackerManager {
	
	public EnvironmentTrackerManager() {
		
	}
	
    public EnvironmentTrackerProject createProject(File projectFile, String projectName) {
    	EnvironmentTrackerProject project = null;
		project = new EnvironmentTrackerProject(projectName);
		project.getEnvironment().setName("DEV");
		project.getEnvironment().setBasePath(projectFile.getPath());
		project.getEnvironment().addApplication(new Application("Web Server 1"));
		project.getEnvironment().addApplication(new Application("Web Server 2"));
		project.getEnvironment().addApplication(new Application("Web Server 3"));
		try {
			project.save(projectFile.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return project;
    }
    
    public EnvironmentTrackerProject openProject(File projectFile) {
    	EnvironmentTrackerProject project = new EnvironmentTrackerProject();
    	try {
            project = project.load(projectFile.getCanonicalPath());
            Environment environment = project.getEnvironment();
            MarkdownViewer viewer = new MarkdownViewer();
            System.out.print(viewer.markdown(environment));
    	} catch(FileNotFoundException e) {
    		System.out.println(e.getMessage());
    	} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    	return project;
    }

}
