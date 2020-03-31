package com.csci360.activitytracker;
	
import java.util.Calendar;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;


public class ClockFace extends Application {
	
	final protected static int width = 81;
	final protected static int height = 240;
	public static int sysMin = 50;
	public static int sysHour = 5;
	public static int sysDay = 01;
	public static int sysMonth = 05;
	public static int sysYear = 2012;
	static int sleepGoalMin = 54;
	static int sleepGoalHr = 8;
	static int sleepTrackerMin = 00;
	static int sleepTrackerHr = 8;
	static boolean genderMale = false;
	static int age = 20;
	static int weight = 150;
	static int userHeight = 72;
	static int stepGoal = 5000;
	static int stepCounter = 1000;
	static int calorieGoal = 3000;
	static int calorieCounter = 1000;
	static Text hourDisplay;
	static Text minDisplay;
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Clock Face");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,width,height);
			hourDisplay = new Text(sysHour+"   :");
			minDisplay = new Text(sysMin+"");
			minDisplay.setTranslateX(width/4);
			hourDisplay.setTranslateX(-width/4);
			Button b = new Button(); 			//same as b.setText("It's working!!!");
			b.setLayoutX(width/2);
			b.setLayoutY(height/2);
			b.setMaxSize(width, height);
			sp.getChildren().add(b);
			sp.getChildren().add(hourDisplay);
			sp.getChildren().add(minDisplay);
			
			b.setOnAction(e -> MainMenu.MainMenu());
			
			
		//	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
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
