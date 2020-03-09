package com.csci360.activitytracker;
	
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

public class StepTracker{
	
	final static int width = 54;
	final static int height = 160;
	final static int tallness = 72;
	
	public static void StepTracker(){
		try {
			Stage window = new Stage();
			window.setTitle("Step Tracker");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,width,height);
			Text burnedCals = new Text("Calories Burned: \n1000"); 
			burnedCals.setTranslateY((-height/8)*3);
			Text stepCount = new Text("Step Counter: \n1000");
			stepCount.setTranslateY(-height/8);
			Text stepGoal = new Text("Step Goal: \n78%"); 
			stepGoal.setTranslateY(height/8);
			Button back = new Button("Back"); 

			sp.getChildren().add(burnedCals);
			sp.getChildren().add(stepCount);
			sp.getChildren().add(stepGoal);			
			
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
