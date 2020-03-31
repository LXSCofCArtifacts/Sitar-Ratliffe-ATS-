package com.csci360.activitytracker;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class GoalMenu{
	public static void GoalMenu() {
		try {
			Stage window = new Stage();
			window.setTitle("Goal Menu");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,Controller.width,Controller.height);
			Button stepgoal = new Button("Step \nGoal"); 
			Button sleepgoal = new Button("Sleep \nGoal"); 
			Button caloriegoal = new Button("Calorie \nGoal");
			Button back = new Button("Back"); 

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
