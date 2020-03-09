package com.csci360.activitytracker;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

public class SleepTracker {
	
	final static int sleepGoalMin = 54;
	final static int sleepGoalHr = 160;
	
	public static void SleepTracker() {
		try {
			Stage window = new Stage();
			window.setTitle("Sleep Tracker");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,ClockFace.width,ClockFace.height);
			Text sleepTimer = new Text("Sleep Timer: \nHH:MM:SS"); 
			sleepTimer.setTranslateY((-ClockFace.height/10)*3);
			Text sleepGoal = new Text("Sleep Goal: \n83%");
			//sleepGoal.setTranslateY(-height/8);
			Button back = new Button("Back"); 

			sp.getChildren().add(sleepTimer);
			sp.getChildren().add(sleepGoal);
			
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
