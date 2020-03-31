package com.csci360.activitytracker;
	
import javafx.stage.Stage;

import java.text.DecimalFormat;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

public class StepTracker{
	
	
	
	public static void StepTracker(){
		try {
			Stage window = new Stage();
			window.setTitle("Step Tracker");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,Controller.width,Controller.height);
			Text burnedCals = new Text("Calories: \n  "+Controller.calorieCounter); 
			burnedCals.setTranslateY((-Controller.height/8)*3);
			Text stepCount = new Text("Steps:\n"+Controller.stepCounter);
			stepCount.setTranslateY(-Controller.height/8);
			
			double percentage = ((Controller.stepCounter*1.0/Controller.stepGoal)*100);
			DecimalFormat decimalFormat = new DecimalFormat("#.00");
	        String numberAsString = decimalFormat.format(percentage);
			Text stepGoal = new Text("Step Goal:\n  "+numberAsString+"%"); 
			stepGoal.setTranslateY(Controller.height/8);
			
			Button back = new Button("Back"); 
			
			sp.getChildren().add(burnedCals);
			sp.getChildren().add(stepCount);
			sp.getChildren().add(stepGoal);			
			
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
