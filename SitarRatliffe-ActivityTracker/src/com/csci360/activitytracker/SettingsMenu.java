package com.csci360.activitytracker;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class SettingsMenu{
	
	final static int width = 54;
	final static int height = 160;
	
	public static void settingsMenu(){
		try {
			Stage window = new Stage();
			window.setTitle("Settings");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,width,height);
			Button timesetting = new Button("Time \nSettings"); 
			Button datesetting = new Button("Date \nSettings");
			Button connectivity = new Button("Connectivity"); 
			Button back = new Button("Back"); 

			timesetting.setTranslateY((-height/8)*3);
			timesetting.setMaxSize(width, height/4);
			sp.getChildren().add(timesetting);
			
			datesetting.setTranslateY(-height/8);
			datesetting.setMaxSize(width, height/4);
			sp.getChildren().add(datesetting);
			
			connectivity.setTranslateY(height/8);
			connectivity.setMaxSize(width, height/4);
			sp.getChildren().add(connectivity);
			
			back.setTranslateY((height/8)*3);
			back.setMaxSize(width, height/4);
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
