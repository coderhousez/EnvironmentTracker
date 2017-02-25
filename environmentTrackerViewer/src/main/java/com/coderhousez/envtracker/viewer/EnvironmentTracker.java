package com.coderhousez.envtracker.viewer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


/**
 * EnvironmentTracker
 *
 */
public class EnvironmentTracker 
{
    public static void main( String[] args )
    {
    	// args[0] Project Filename proerty file
    	InputStream is = null;
        EnvironmentTrackerProject project = new EnvironmentTrackerProject();
    	try {
    		is = new FileInputStream(new File(args[0]));
            project.load(is);
    	} catch(FileNotFoundException e) {
    		System.out.println(e.getMessage());
    	} catch (IOException e) {
			e.printStackTrace();
		}    	
        
    }
}
