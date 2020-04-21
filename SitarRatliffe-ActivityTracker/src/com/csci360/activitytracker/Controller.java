package com.csci360.activitytracker;

import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;

import javafx.application.Application;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Controller extends Application{
	final protected static int width = 81;
	final protected static int height = 240;
	public static int sysMinIncrement;
	public static int sysHourIncrement;
	public static int sysDay;
	public static int sysMonth;
	public static int sysYear;
	static int sleepGoalMin = 0;
	static int sleepGoalHr = 7;
	static int sleepTrackerStart = 0;
	static int sleepTrackerEnd = 0;
	static boolean gender;
	static int age = 20;
	static int weight = 150;
	static int userHeight = 72;
	static int stepGoal = 5000;
	static int stepCounter = 0;
	static double percentage;
	static int calorieGoal = 3000;
	static double calorieCounter = 0;
	static Text timeDisplay;


	@Override
	public void start(Stage arg0) throws Exception {
		ClockFace.ClockFace();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
