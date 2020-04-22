package com.csci360.activitytracker;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
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
			// create a window for the SleepTracker scene
			// set up text and buttons and translate to correct location 
			StackPane sp = new StackPane();
			Stage window = new Stage();
			window.setTitle("SleepTracker");
			Scene scene = new Scene(sp,Controller.width,Controller.height);
			Button Start = new Button("Start");
			Start.setTranslateY((-Controller.height/8));
			Start.setMaxSize(Controller.width, Controller.height/4);
			Button reset = new Button("Reset");
			reset.setTranslateY((Controller.height/8));
			reset.setMaxSize(Controller.width, Controller.height/4);
		
			
			// create button that starts the stopwatch
			Start.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					Controller.stopwatchOn = true;
					sp.getChildren().remove(Controller.timerOn);
					sp.getChildren().remove(Controller.timerOff);
						if((Controller.stopwatchHourIncrement == 0&&Controller.stopwatchMinIncrement == 0&&Controller.stopwatchSecIncrement == 0)) {
							Controller.stopwatchHourIncrement=-LocalTime.now().getHour();
							Controller.stopwatchMinIncrement=-LocalTime.now().getMinute();
							Controller.stopwatchSecIncrement=-LocalTime.now().getSecond();
						}
						Controller.timerOn.setStyle("-fx-font: 20 arial;");
						Controller.timerOn.setTranslateY(Controller.height/8);
						Controller.timerOn.setTranslateY((-Controller.height/10)*3);
						sp.getChildren().add(Controller.timerOn);
						Controller.stopwatchOn = true;
						System.out.println("");
						Timeline steps = new Timeline(new KeyFrame(Duration.ZERO, e -> { LocalTime
							sleepTime = LocalTime.now();
							sleepTime = sleepTime.plusHours(Controller.stopwatchHourIncrement);
							sleepTime = sleepTime.plusMinutes(Controller.stopwatchMinIncrement);
							sleepTime = sleepTime.plusSeconds(Controller.stopwatchSecIncrement);
							Controller.timerOn.setText((sleepTime).format(formatter)); 
							Controller.timerOn.setStyle("-fx-font: 20 arial;");
							}), 
							new KeyFrame(Duration.seconds(1)));
							steps.setCycleCount(Animation.INDEFINITE); 
							steps.play();
					}
				});	
			
			// create button that stops, then resets the stopwatch
			reset.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					Controller.stopwatchOn = false;
					Controller.stopwatchHourIncrement=0;
					Controller.stopwatchMinIncrement=0;
					Controller.stopwatchSecIncrement=0;
					sp.getChildren().remove(Controller.timerOn);
					sp.getChildren().remove(Controller.timerOff);
					sp.getChildren().add(Controller.timerOff);
				}
			});
			
			if(Controller.stopwatchOn) {
				sp.getChildren().add(Controller.timerOn);
			}
			else {
				sp.getChildren().add(Controller.timerOff);
			}
			
			// button to take you back to previous scene
			Button back = new Button("Back");
			back.setTranslateY((Controller.height/8)*3);
			back.setMaxSize(Controller.width, Controller.height/4);
			sp.getChildren().add(back);
			sp.getChildren().add(Start);
			sp.getChildren().add(reset);
			Controller.timerOff.setStyle("-fx-font: 20 arial;");
			Controller.timerOff.setTranslateY(Controller.height/8);
			Controller.timerOff.setTranslateY((-Controller.height/10)*3);
			back.setOnAction(e -> window.close());

			window.setScene(scene);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}