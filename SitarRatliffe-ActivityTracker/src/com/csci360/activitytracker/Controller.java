package com.csci360.activitytracker;

import javafx.application.Application;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Controller extends Application{
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
	public void start(Stage arg0) throws Exception {
		ClockFace.ClockFace();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
