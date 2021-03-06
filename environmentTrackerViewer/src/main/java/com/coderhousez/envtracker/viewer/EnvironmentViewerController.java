package com.coderhousez.envtracker.viewer;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import com.coderhousez.envtracker.model.Application;
import com.coderhousez.envtracker.model.Environment;
import com.coderhousez.envtracker.model.Item;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
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
	private TreeView<Item> treeView;
	@FXML
	private Tab tabEnvironment;
	@FXML
	private Tab tabApplication;
	
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
	
	private void fillTreeView(TreeView<Item> treeView, EnvironmentTrackerProject project) {
		Environment environment = project.getEnvironment();
		TreeItem<Item> root = new TreeItem<>((Item) environment);
		root.setExpanded(true);
		treeView.setRoot(root);
		for(Application application : project.getEnvironment().getApplications()) {
			TreeItem<Item> app = new TreeItem<>(application);
			root.getChildren().add(app);

		}
		
	}
	
	
	public void initialize(URL url, ResourceBundle rb) {
		// TreeView handler
		treeView.getSelectionModel().selectedItemProperty().addListener(
				new ChangeListener<TreeItem<Item>>() {
					@Override
					public void changed(
							ObservableValue<? extends TreeItem<Item>> arg0,
							TreeItem<Item> arg1, TreeItem<Item> arg2) {
						System.out.println("0" + arg0.getValue().getValue().getItemType());
						System.out.println("1" + arg1.getValue().getItemType());
						System.out.println("2" + arg2.getValue().getItemType());
					}
				}
		);
	}

}
