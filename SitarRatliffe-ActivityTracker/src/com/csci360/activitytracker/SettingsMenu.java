package com.csci360.activitytracker;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class SettingsMenu{
	public static void SettingsMenu(){
		try {
			// create a window for the SettingsMenu scene
			// set up text and buttons and translate to correct location 
			Stage window = new Stage();
			window.setTitle("SettingsMenu");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,Controller.width,Controller.height);
			Button timesetting = new Button("Time \nSettings"); 
			Button datesetting = new Button("Date \nSettings");
			Button connectivity = new Button("Connectivity"); 
			Button back = new Button("Back"); 

			// create buttons to take you to specifc scenes when clicked
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
			
			// back button to take you to previous page
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
