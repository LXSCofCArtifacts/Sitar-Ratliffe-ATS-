package com.csci360.activitytracker;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.text.DecimalFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javafx.*;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;


public class TimeAdjust{
	public static void TimeAdjust() {
		try {
			Stage window = new Stage();
			window.setTitle("TimeAdjust");
			StackPane p = new StackPane();
			Scene scene = new Scene(p,Controller.width,Controller.height,Color.AZURE);
			//String minTxt = Integer.toString(Controller.sysMin);
			//String hourTxt = Integer.toString(Controller.sysHour);
			Text t3 = new Text("");
	        t3.setStyle("-fx-font: 24 arial;");
			t3.setTranslateY(-Controller.height/8);
			
			Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		        LocalTime localTime = LocalTime.now();
		        localTime = localTime.plusHours(Controller.sysHourIncrement);
		        localTime = localTime.plusMinutes(Controller.sysMinIncrement);
		        t3.setText((localTime).format(formatter));
		    }), new KeyFrame(Duration.seconds(1)));
		    clock.setCycleCount(Animation.INDEFINITE);
		    clock.play();
			
			Button hrUp = new Button("^");
			hrUp.setMaxSize(Controller.width/2, Controller.height/4);
			hrUp.setTranslateY((-Controller.height/8)*3);
			hrUp.setTranslateX(-Controller.width/4);
			hrUp.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					Controller.sysHourIncrement += 1;
				}
			});
			
			Button hrDown = new Button("v");
			hrDown.setMaxSize(Controller.width/2, Controller.height/4);
			hrDown.setTranslateY((Controller.height/8));
			hrDown.setTranslateX(-Controller.width/4);
			hrDown.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					Controller.sysHourIncrement -= 1;
				}
			});
			
			Button minUp = new Button("^");
			minUp.setMaxSize(Controller.width/2, Controller.height/4);
			minUp.setTranslateY((-Controller.height/8)*3);
			minUp.setTranslateX(Controller.width/4);
			minUp.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					Controller.sysMinIncrement += 1;
				}
			});
			
			Button minDown = new Button("v");
			minDown.setMaxSize(Controller.width/2, Controller.height/4);
			minDown.setTranslateY((Controller.height/8));
			minDown.setTranslateX(Controller.width/4);
			minDown.setMaxSize(Controller.width/2, Controller.height/4);
			minDown.setTranslateY((Controller.height/8));
			minDown.setTranslateX(Controller.width/4);
			minDown.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					Controller.sysMinIncrement -= 1;
				}
			});
			
			Button back = new Button("Back");
			back.setMaxSize(Controller.width, Controller.height/4);
			back.setTranslateY((Controller.height/8)*3);
			back.setOnAction(e -> window.close());		
			
			p.getChildren().add(hrDown);
			p.getChildren().add(hrUp);
			p.getChildren().add(minDown);
			p.getChildren().add(minUp);
			p.getChildren().add(t3);
			p.getChildren().add(back);
			
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			window.setScene(scene);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
