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
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

public class SleepTracker {
	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	public static void SleepTracker() {
		try {
			Stage window = new Stage();
			window.setTitle("Sleep Tracker");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,Controller.width,Controller.height);
			Text s = new Text((LocalTime.MIN).format(formatter));
			s.setStyle("-fx-font: 24 arial;");
			sp.getChildren().add(s);
			Button StartStop = new Button("Start/Stop");		
			StartStop.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					if (!Controller.stopwatchOn) {
						Controller.stopwatchHourIncrement = -LocalTime.now().getHour();
						Controller.stopwatchMinIncrement = -LocalTime.now().getMinute();
						Controller.stopwatchSecIncrement = -LocalTime.now().getSecond();
						Controller.stopwatchOn = true;
						System.out.println("");
						Timeline steps = new Timeline(new KeyFrame(Duration.ZERO, e -> { LocalTime
							sleepTime = LocalTime.now();
							sleepTime = sleepTime.plusHours(Controller.stopwatchHourIncrement);
							sleepTime = sleepTime.plusMinutes(Controller.stopwatchMinIncrement);
							sleepTime = sleepTime.plusSeconds(Controller.stopwatchSecIncrement);
							s.setText((sleepTime).format(formatter)); 
							s.setStyle("-fx-font: 24 arial;");
							}), 
							new KeyFrame(Duration.seconds(1)));
							steps.setCycleCount(Animation.INDEFINITE); 
							steps.play();
					}
					else {
						
					}
				}
			});	
			s.setTranslateY(Controller.height/8);
			s.setTranslateY((-Controller.height/10)*3);
			//sleepGoal.setTranslateY(-height/8);
			Button back = new Button("Back");

			back.setTranslateY((Controller.height/8)*3);
			back.setMaxSize(Controller.width, Controller.height/4);
			sp.getChildren().add(back);
			sp.getChildren().add(StartStop);

			back.setOnAction(e -> window.close());
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			window.setScene(scene);
			window.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void stopwatchStart() {

	}
}
