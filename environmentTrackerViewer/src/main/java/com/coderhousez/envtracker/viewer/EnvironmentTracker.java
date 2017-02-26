package com.coderhousez.envtracker.viewer;

import java.io.File;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



/**
 * EnvironmentTracker
 *
 */
public class EnvironmentTracker extends javafx.application.Application
{
	
	@Override
	public void start(Stage stage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("/resources/EnvironmentEditor.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
    public static void main( String[] args )
    {
    	launch(args);
        
    }
    

}
