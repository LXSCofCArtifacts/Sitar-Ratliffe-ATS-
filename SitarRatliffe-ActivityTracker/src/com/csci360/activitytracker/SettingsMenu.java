package com.csci360.activitytracker;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class SettingsMenu extends Application {
	
	final protected int width = 54;
	final protected int height = 160;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Settings");
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
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
