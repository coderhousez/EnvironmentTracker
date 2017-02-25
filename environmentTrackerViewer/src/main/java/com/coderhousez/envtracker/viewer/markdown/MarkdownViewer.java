package com.coderhousez.envtracker.viewer.markdown;

import com.coderhousez.envtracker.model.Application;
import com.coderhousez.envtracker.model.Environment;
import com.coderhousez.envtracker.viewer.EnvironmentViewer;

public class MarkdownViewer implements EnvironmentViewer {
	
	public MarkdownViewer() {
		
	}
	
	public String markdown(Environment environment) {
		String LF = System.getProperty("line.separator");
		StringBuilder result = new StringBuilder();
		result.append("#" + environment.getName()+"#"+LF);
		if(!environment.getApplications().isEmpty()) {
			for(Application application : environment.getApplications()) {
				result.append("##"+application.getName()+"##"+LF);
			}
		}
		return result.toString();
	}

}
