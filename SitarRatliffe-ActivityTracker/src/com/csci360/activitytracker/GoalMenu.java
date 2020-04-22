package com.csci360.activitytracker;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class GoalMenu{
	public static void GoalMenu() {
		try {
			// create a window for the GoalMenu scene
			// set up text and buttons and translate to correct location 
			Stage window = new Stage();
			window.setTitle("GoalMenu");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,Controller.width,Controller.height);
			Button stepgoal = new Button("Step \nGoal"); 
			Button sleepgoal = new Button("Sleep \nGoal"); 
			Button caloriegoal = new Button("Calorie \nGoal");
			Button back = new Button("Back"); 

			// setOnAction for each button to take you to
			// their own scene
			stepgoal.setTranslateY((-Controller.height/8)*3);
			stepgoal.setMaxSize(Controller.width, Controller.height/4);
			sp.getChildren().add(stepgoal);
			stepgoal.setOnAction(e -> StepGoalAdjust.StepGoalAdjust());
			
			sleepgoal.setTranslateY(-Controller.height/8);
			sleepgoal.setMaxSize(Controller.width, Controller.height/4);
			sp.getChildren().add(sleepgoal);
			sleepgoal.setOnAction(e -> SleepGoalAdjust.SleepGoalAdjust());

			caloriegoal.setTranslateY(Controller.height/8);
			caloriegoal.setMaxSize(Controller.width, Controller.height/4);
			sp.getChildren().add(caloriegoal);
			caloriegoal.setOnAction(e -> CalorieGoalAdjust.CalorieGoalAdjust());

			// back button to take you to previous window
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
