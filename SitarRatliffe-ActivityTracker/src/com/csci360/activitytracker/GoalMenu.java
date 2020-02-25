package com.csci360.activitytracker;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class GoalMenu extends Application {
	
	final protected int width = 54;
	final protected int height = 160;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Goal Menu");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,width,height);
			Button stepgoal = new Button("Activity \nGoal"); 
			Button sleepgoal = new Button("Sleep \nGoal"); 
			Button caloriegoal = new Button("Calorie \nGoal");
			Button back = new Button("Back"); 

			stepgoal.setTranslateY((-height/8)*3);
			stepgoal.setMaxSize(width, height/4);
			sp.getChildren().add(stepgoal);
			
			sleepgoal.setTranslateY(-height/8);
			sleepgoal.setMaxSize(width, height/4);
			sp.getChildren().add(sleepgoal);
			
			caloriegoal.setTranslateY(height/8);
			caloriegoal.setMaxSize(width, height/4);
			sp.getChildren().add(caloriegoal);
			
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
