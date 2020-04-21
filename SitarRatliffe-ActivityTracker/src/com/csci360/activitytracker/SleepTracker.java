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
			StackPane sp = new StackPane();
			Stage window = new Stage();
			window.setTitle("Sleep Tracker");
			Scene scene = new Scene(sp,Controller.width,Controller.height);
			Button Start = new Button("Start");
			Start.setTranslateY((-Controller.height/8));
			Start.setMaxSize(Controller.width, Controller.height/4);
			Button reset = new Button("Reset");
			reset.setTranslateY((Controller.height/8));
			reset.setMaxSize(Controller.width, Controller.height/4);
			Text timerOn = new Text((LocalTime.MIN).format(formatter));
			Text timerOff = new Text((LocalTime.MIN).format(formatter));
			Start.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					sp.getChildren().remove(timerOn);
					sp.getChildren().remove(timerOff);
						if((Controller.stopwatchHourIncrement == 0&&Controller.stopwatchMinIncrement == 0&&Controller.stopwatchSecIncrement == 0)) {
							Controller.stopwatchHourIncrement=-LocalTime.now().getHour();
							Controller.stopwatchMinIncrement=-LocalTime.now().getMinute();
							Controller.stopwatchSecIncrement=-LocalTime.now().getSecond();
						}
						timerOn.setStyle("-fx-font: 20 arial;");
						timerOn.setTranslateY(Controller.height/8);
						timerOn.setTranslateY((-Controller.height/10)*3);
						sp.getChildren().add(timerOn);
						Controller.stopwatchOn = true;
						System.out.println("");
						Timeline steps = new Timeline(new KeyFrame(Duration.ZERO, e -> { LocalTime
							sleepTime = LocalTime.now();
							sleepTime = sleepTime.plusHours(Controller.stopwatchHourIncrement);
							sleepTime = sleepTime.plusMinutes(Controller.stopwatchMinIncrement);
							sleepTime = sleepTime.plusSeconds(Controller.stopwatchSecIncrement);
							timerOn.setText((sleepTime).format(formatter)); 
							timerOn.setStyle("-fx-font: 20 arial;");
							}), 
							new KeyFrame(Duration.seconds(1)));
							steps.setCycleCount(Animation.INDEFINITE); 
							steps.play();
					}
				});	
			reset.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					Controller.stopwatchHourIncrement=0;
					Controller.stopwatchMinIncrement=0;
					Controller.stopwatchSecIncrement=0;
					sp.getChildren().remove(timerOn);
					sp.getChildren().remove(timerOff);
					sp.getChildren().add(timerOff);
				}
			});
			Button back = new Button("Back");
			back.setTranslateY((Controller.height/8)*3);
			back.setMaxSize(Controller.width, Controller.height/4);
			sp.getChildren().add(back);
			sp.getChildren().add(Start);
			sp.getChildren().add(timerOff);
			sp.getChildren().add(reset);
			timerOff.setStyle("-fx-font: 20 arial;");
			timerOff.setTranslateY(Controller.height/8);
			timerOff.setTranslateY((-Controller.height/10)*3);
			back.setOnAction(e -> window.close());
			window.setScene(scene);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}