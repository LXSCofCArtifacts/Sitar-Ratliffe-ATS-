package com.csci360.activitytracker;

import java.text.DecimalFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;

import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

public class SleepTracker {

	@SuppressWarnings("static-access")
	public static void SleepTracker() {
		try {
			Stage window = new Stage();
			window.setTitle("Sleep Tracker");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,Controller.width,Controller.height);

		//	double percentage = (sleepTime.getHour()+(Controller.stopwatch.getMinute()*60))/
			//		Controller.sleepGoalHr+(Controller.sleepGoalMin*60);
			DecimalFormat decimalFormat = new DecimalFormat("#.00");
	     //   String percentageAsString = decimalFormat.format(percentage);
	     //   Text sleepGoal = new Text("Sleep Goal: \n "+percentageAsString+"%");
			Controller.stopwatch = LocalTime.of(0, 0, 0);
	        Text s = new Text("");

	        //timer shit here
	        sp.getChildren().add(s);
	        Timeline steps = new Timeline(new KeyFrame(Duration.ZERO, e -> {
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		        LocalTime sleepTime = Controller.stopwatch.now();
		        s.setText((sleepTime).format(formatter));
		        s.setStyle("-fx-font: 24 arial;");
		    }), new KeyFrame(Duration.seconds(1)));
		    steps.setCycleCount(Animation.INDEFINITE);
		    steps.play();

	        s.setTranslateY(Controller.height/8);
	        s.setTranslateY((-Controller.height/10)*3);
			//sleepGoal.setTranslateY(-height/8);
			Button back = new Button("Back");


		//	sp.getChildren().add(sleepGoal);

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
