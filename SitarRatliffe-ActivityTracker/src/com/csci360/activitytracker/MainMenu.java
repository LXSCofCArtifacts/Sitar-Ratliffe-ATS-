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
			Stage window = new Stage();
			window.setTitle("Menu");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,ClockFace.width,ClockFace.height);
			Button steps = new Button("Step \n Tracker"); 
			Button sleep = new Button("Sleep \n Tracker");
			Button main2 = new Button("Main Menu 2"); 
			Button back = new Button("Back"); 

			steps.setTranslateY((-ClockFace.height/8)*3);
			steps.setMaxSize(ClockFace.width, ClockFace.height/4);
			sp.getChildren().add(steps);
			steps.setOnAction(e -> StepTracker.StepTracker());

			sleep.setTranslateY(-ClockFace.height/8);
			sleep.setMaxSize(ClockFace.width, ClockFace.height/4);
			sp.getChildren().add(sleep);
			sleep.setOnAction(e -> SleepTracker.SleepTracker());
			
			main2.setTranslateY(ClockFace.height/8);
			main2.setMaxSize(ClockFace.width, ClockFace.height/4);
			sp.getChildren().add(main2);
			main2.setOnAction(e -> MainMenu2.MainMenu2());

			
			back.setTranslateY((ClockFace.height/8)*3);
			back.setMaxSize(ClockFace.width, ClockFace.height/4);
			sp.getChildren().add(back);	
			back.setOnAction(e -> window.close());
			
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			window.setScene(scene);
			window.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
