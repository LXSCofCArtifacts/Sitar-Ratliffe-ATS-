package com.csci360.activitytracker;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;


public class SleepGoalAdjust{
	public static void SleepGoalAdjust() {
		try {
			Stage window = new Stage();
			window.setTitle("TimeAdjust");
			StackPane p = new StackPane();
			Scene scene = new Scene(p,ClockFace.width,ClockFace.height,Color.AZURE);
			String minTxt = Integer.toString(ClockFace.sysMin);
			String hourTxt = Integer.toString(ClockFace.sysHour);
			Text t1 = new Text (minTxt);
			Text t2 = new Text (hourTxt);
			Text t3 = new Text (":");
			Text t4 = new Text ("\n\nHrs   Mins");
			t2.setTranslateX(-ClockFace.width/3);
			t1.setTranslateX(ClockFace.width/3);
			t2.setTranslateY(-ClockFace.height/8);
			t1.setTranslateY(-ClockFace.height/8);
			t3.setTranslateY(-ClockFace.height/8);
			t4.setTranslateY(-ClockFace.height/7);
			
			
			Button hrUp = new Button("^");
			hrUp.setMaxSize(ClockFace.width/2, ClockFace.height/4);
			hrUp.setTranslateY((-ClockFace.height/8)*3);
			hrUp.setTranslateX(-ClockFace.width/4);
			hrUp.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					if (ClockFace.sleepGoalHr == 12) {
						ClockFace.sleepGoalHr = 1;
						String hourTxt = Integer.toString(ClockFace.sleepGoalHr);
						t2.setText(hourTxt);
					}
					else {
						ClockFace.sleepGoalHr += 1;
						String hourTxt = Integer.toString(ClockFace.sleepGoalHr);
						t2.setText(hourTxt);
					}
				}
			});
			
			Button hrDown = new Button("v");
			hrDown.setMaxSize(ClockFace.width/2, ClockFace.height/4);
			hrDown.setTranslateY((ClockFace.height/8));
			hrDown.setTranslateX(-ClockFace.width/4);
			hrDown.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					if (ClockFace.sleepGoalHr == 1) {
						ClockFace.sleepGoalHr = 12;
						String hourTxt = Integer.toString(ClockFace.sleepGoalHr);
						t2.setText(hourTxt);
					}
					else {
						ClockFace.sleepGoalHr -= 1;
						String hourTxt = Integer.toString(ClockFace.sleepGoalHr);
						t2.setText(hourTxt);
					}
				}
			});
			
			Button minUp = new Button("^");
			minUp.setMaxSize(ClockFace.width/2, ClockFace.height/4);
			minUp.setTranslateY((-ClockFace.height/8)*3);
			minUp.setTranslateX(ClockFace.width/4);
			minUp.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					if (ClockFace.sleepGoalMin == 59) {
						ClockFace.sleepGoalMin = 0;
						ClockFace.sleepGoalHr += 1;
						String minTxt = Integer.toString(ClockFace.sleepGoalMin);
						String hourTxt = Integer.toString(ClockFace.sleepGoalHr);
						t1.setText(minTxt);
						t2.setText(hourTxt);
					}
					else {
						ClockFace.sleepGoalMin += 1;
						String minTxt = Integer.toString(ClockFace.sleepGoalMin);
						t1.setText(minTxt);
					}
				}
			});
			
			Button minDown = new Button("v");
			minDown.setMaxSize(ClockFace.width/2, ClockFace.height/4);
			minDown.setTranslateY((ClockFace.height/8));
			minDown.setTranslateX(ClockFace.width/4);
			minDown.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					if (ClockFace.sleepGoalMin == 0) {
						ClockFace.sleepGoalMin = 59;
						ClockFace.sleepGoalHr -= 1;
						String minTxt = Integer.toString(ClockFace.sleepGoalMin);
						String hourTxt = Integer.toString(ClockFace.sleepGoalHr);
						t1.setText(minTxt);
						t2.setText(hourTxt);
					}
					else {
						ClockFace.sleepGoalMin -= 1;
						String minTxt = Integer.toString(ClockFace.sleepGoalMin);
						t1.setText(minTxt);
					}
				}
			});
			
			Button back = new Button("Back");
			back.setMaxSize(ClockFace.width, ClockFace.height/4);
			back.setTranslateY((ClockFace.height/8)*3);
			back.setOnAction(e -> window.close());
			
			p.getChildren().add(hrDown);
			p.getChildren().add(hrUp);
			p.getChildren().add(minDown);
			p.getChildren().add(minUp);
			p.getChildren().add(t1);
			p.getChildren().add(t2);
			p.getChildren().add(t3);
			p.getChildren().add(t4);
			p.getChildren().add(back);
			
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			window.setScene(scene);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
