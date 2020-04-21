package com.csci360.activitytracker;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javafx.application.Application;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class Controller extends Application{
	// controller class stores all the variables for the program
	// and is how the program initially begins
	// most values assigned are just default until the user changes them
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
	static int stopwatchHourIncrement = 0;
	static int stopwatchMinIncrement = 0;
	static int stopwatchSecIncrement = 0;
	static boolean stopwatchOn = false;
	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	static Text timerOn = new Text((LocalTime.MIN).format(formatter));
	static Text timerOff = new Text((LocalTime.MIN).format(formatter));
	
	// when the program is run, make the first scene the clock face
	@Override
	public void start(Stage arg0) throws Exception {
		ClockFace.ClockFace();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
