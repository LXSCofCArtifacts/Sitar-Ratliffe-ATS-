package com.csci360.activitytracker;
	
import java.util.Calendar;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;


public class ClockFace extends Application {
	
	final protected static int width = 54;
	final protected static int height = 160;
	public static int sysMin = 50;
	public static int sysHour = 5;
	public static int sysDay = 01;
	public static int sysMonth = 05;
	public static int sysYear = 2012;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Clock Face");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,width,height);
			Button b = new Button("12:45a"); 			//same as b.setText("It's working!!!");
			b.setLayoutX(width/2);
			b.setLayoutY(height/2);
			b.setMaxSize(width, height);
			sp.getChildren().add(b);
			b.setOnAction(e -> MainMenu.MainMenu());
			
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
