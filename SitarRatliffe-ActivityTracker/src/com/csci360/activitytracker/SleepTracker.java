package com.csci360.activitytracker;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

public class SleepTracker extends Application {
	
	final protected int width = 54;
	final protected int height = 160;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Sleep Tracker");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,width,height);
			Text sleepTimer = new Text("Sleep Timer: \nHH:MM:SS"); 
			sleepTimer.setTranslateY((-height/10)*3);
			Text sleepGoal = new Text("Sleep Goal: \n83%");
			//sleepGoal.setTranslateY(-height/8);
			Button back = new Button("Back"); 

			sp.getChildren().add(sleepTimer);
			sp.getChildren().add(sleepGoal);
			
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