package com.csci360.activitytracker;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class SettingsMenu{
	public static void SettingsMenu(){
		try {
			Stage window = new Stage();
			window.setTitle("Settings");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,Controller.width,Controller.height);
			Button timesetting = new Button("Time \nSettings"); 
			Button datesetting = new Button("Date \nSettings");
			Button connectivity = new Button("Connectivity"); 
			Button back = new Button("Back"); 

			timesetting.setTranslateY((-Controller.height/8)*3);
			timesetting.setMaxSize(Controller.width, Controller.height/4);
			sp.getChildren().add(timesetting);
			timesetting.setOnAction(e -> TimeAdjust.TimeAdjust());

			
			datesetting.setTranslateY(-Controller.height/8);
			datesetting.setMaxSize(Controller.width, Controller.height/4);
			sp.getChildren().add(datesetting);
			datesetting.setOnAction(e -> DateAdjustMenu.DateAdjustMenu());

			
			connectivity.setTranslateY(Controller.height/8);
			connectivity.setMaxSize(Controller.width, Controller.height/4);
			sp.getChildren().add(connectivity);
			//connectivity.setOnAction(e -> SleepTracker.sleepTracker());

			
			back.setTranslateY((Controller.height/8)*3);
			back.setMaxSize(Controller.width, Controller.height/4);
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
