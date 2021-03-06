package com.csci360.activitytracker;
	

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class MainMenu{
	public static void MainMenu() {
		try {
			// create a window for the MainMenu scene
			// set up text and buttons and translate to correct location 
			Stage window = new Stage();
			window.setTitle("MainMenu");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,Controller.width,Controller.height);
			Button steps = new Button("Step \n Tracker"); 
			Button sleep = new Button("Sleep \n Tracker");
			Button main2 = new Button("Main Menu 2"); 
			Button back = new Button("Back"); 

			// each button is going to take you to its own separate scene
			steps.setTranslateY((-Controller.height/8)*3);
			steps.setMaxSize(Controller.width, Controller.height/4);
			sp.getChildren().add(steps);
			steps.setOnAction(e -> StepTracker.StepTracker());

			sleep.setTranslateY(-Controller.height/8);
			sleep.setMaxSize(Controller.width, Controller.height/4);
			sp.getChildren().add(sleep);
			sleep.setOnAction(e -> SleepTracker.SleepTracker());
			
			main2.setTranslateY(Controller.height/8);
			main2.setMaxSize(Controller.width, Controller.height/4);
			sp.getChildren().add(main2);
			main2.setOnAction(e -> MainMenu2.MainMenu2());

			// back button takes you to previous scene
			back.setTranslateY((Controller.height/8)*3);
			back.setMaxSize(Controller.width, Controller.height/4);
			sp.getChildren().add(back);	
			back.setOnAction(e -> window.close());
			window.setScene(scene);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
