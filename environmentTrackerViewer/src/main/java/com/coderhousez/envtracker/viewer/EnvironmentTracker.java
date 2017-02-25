package com.coderhousez.envtracker.viewer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.coderhousez.envtracker.model.Application;
import com.coderhousez.envtracker.model.Environment;
import com.coderhousez.envtracker.viewer.markdown.MarkdownViewer;


/**
 * EnvironmentTracker
 *
 */
public class EnvironmentTracker 
{
	public EnvironmentTracker() {
		
	}
	
    public static void main( String[] args )
    {
    	// args[0] Project filename
    	File projectFile = new File(args[0]);
		EnvironmentTracker tracker = new EnvironmentTracker();
    	if(projectFile.exists()) {
    		tracker.viewProject(projectFile);
    	} else {
    		tracker.generateNewProject(projectFile);
    		tracker.viewProject(projectFile);
    	}
        
    }
    
    private void generateNewProject(File projectFile) {
    	EnvironmentTrackerProject project = null;
		project = new EnvironmentTrackerProject("ExampleProject");
		project.getEnvironment().setName("DEV");
		project.getEnvironment().setBasePath(projectFile.getPath());
		project.getEnvironment().addApplication(new Application("Web Server"));
		try {
			project.save(projectFile.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    private void viewProject(File projectFile) {
    	EnvironmentTrackerProject project = null;
        project = new EnvironmentTrackerProject();
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
    }
}
