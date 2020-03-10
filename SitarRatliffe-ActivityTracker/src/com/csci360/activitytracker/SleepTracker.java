package com.csci360.activitytracker;
	
import java.text.DecimalFormat;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

public class SleepTracker {
	
	public static void SleepTracker() {
		try {
			Stage window = new Stage();
			window.setTitle("Sleep Tracker");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,ClockFace.width,ClockFace.height);
			
			double sleepTrackTotal = ClockFace.sleepTrackerMin+(ClockFace.sleepTrackerHr*60);
			double sleepGoalTotal = ClockFace.sleepGoalMin+(ClockFace.sleepGoalHr*60);
			
			double percentage = ((sleepTrackTotal*1.0/sleepGoalTotal)*100);
			DecimalFormat decimalFormat = new DecimalFormat("#.00");
	        String percentageAsString = decimalFormat.format(percentage);
	        Text sleepGoal = new Text("Sleep Goal: \n "+percentageAsString+"%");
	        
	        DecimalFormat hrFormat = new DecimalFormat("# hr");
	        String hrAsString = hrFormat.format(ClockFace.sleepTrackerHr);
	        DecimalFormat minFormat = new DecimalFormat("# min");
	        String minAsString = minFormat.format(ClockFace.sleepTrackerMin);

			Text sleepTimer = new Text("Sleep Timer: \n"+hrAsString+"  "+minAsString); 
			sleepTimer.setTranslateY(ClockFace.height/8);
			sleepTimer.setTranslateY((-ClockFace.height/10)*3);
			//sleepGoal.setTranslateY(-height/8);
			Button back = new Button("Back"); 

			sp.getChildren().add(sleepTimer);
			sp.getChildren().add(sleepGoal);
			
			back.setTranslateY((ClockFace.height/8)*3);
			back.setMaxSize(ClockFace.width, ClockFace.height/4);
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
