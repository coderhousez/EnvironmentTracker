package com.coderhousez.envtracker.viewer;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import com.coderhousez.envtracker.model.Application;
import com.coderhousez.envtracker.model.Environment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.text.Text;

public class EnvironmentViewerController implements Initializable {
	
	private EnvironmentTrackerManager tracker = new EnvironmentTrackerManager();
	private EnvironmentTrackerProject project;

	@FXML
	private MenuItem menuItemNew;
	@FXML
	private MenuItem menuItemOpen;
	@FXML
	private MenuItem menuItemQuit;
	@FXML
	private TextField inputText;
	@FXML
	private TreeView<String> treeView;
	
	@FXML
	private void handleMenuItemOpen(ActionEvent event) {
		
    	File projectFile = new File(inputText.getText());
    	if(projectFile.exists()) {
    		project = tracker.openProject(projectFile);
    		fillTreeView(treeView, project);
    	} else {
    		inputText.setText("Unable to open file: " + inputText.getText());
    	}
	}
	
	@FXML
	private void handleMenuItemNew(ActionEvent event) {
		File projectFile = new File(inputText.getText());
		if(projectFile.exists()) {
			inputText.setText("File exists: " + inputText.getText());
		} else {
			project = tracker.createProject(projectFile, "New Project");
			fillTreeView(treeView, project);
		}
	}
	
	@FXML
	private void handleMenuItemQuit(ActionEvent event) {
		//TODO: Check application status
		System.exit(0);
	}
	
	private void fillTreeView(TreeView<String> treeView, EnvironmentTrackerProject project) {
		TreeItem<String> root = new TreeItem<>(project.getProjectName());
		root.setExpanded(true);
		treeView.setRoot(root);
		for(Application application : project.getEnvironment().getApplications()) {
			TreeItem<String> app = new TreeItem<>(application.getName());
			root.getChildren().add(app);

		}
		
	}
	
	
	public void initialize(URL url, ResourceBundle rb) {
		//TODO: implement

	}

}
