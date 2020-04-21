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
			// create a window for the SleepGoalAdjust scene
			// set up text and translate to correct location 
			Stage window = new Stage();
			window.setTitle("TimeAdjust");
			StackPane p = new StackPane();
			Scene scene = new Scene(p,Controller.width,Controller.height,Color.AZURE);
			String minTxt = Integer.toString(Controller.sleepGoalMin);
			String hourTxt = Integer.toString(Controller.sleepGoalHr);
			Text t1 = new Text (minTxt);
			Text t2 = new Text (hourTxt);
			Text t3 = new Text (":");
			Text t4 = new Text ("\n\nHrs   Mins");
			t2.setTranslateX(-Controller.width/3);
			t1.setTranslateX(Controller.width/3);
			t2.setTranslateY(-Controller.height/8);
			t1.setTranslateY(-Controller.height/8);
			t3.setTranslateY(-Controller.height/8);
			t4.setTranslateY(-Controller.height/7);
			
			//create button to increment hours of user's sleep goal
			Button hrUp = new Button("^");
			hrUp.setMaxSize(Controller.width/2, Controller.height/4);
			hrUp.setTranslateY((-Controller.height/8)*3);
			hrUp.setTranslateX(-Controller.width/4);
			hrUp.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
						Controller.sleepGoalHr += 1;
						String hourTxt = Integer.toString(Controller.sleepGoalHr);
						t2.setText(hourTxt);
				}
			});
			
			// create button to decrement hours of user's sleep goal
			Button hrDown = new Button("v");
			hrDown.setMaxSize(Controller.width/2, Controller.height/4);
			hrDown.setTranslateY((Controller.height/8));
			hrDown.setTranslateX(-Controller.width/4);
			hrDown.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
						Controller.sleepGoalHr -= 1;
						String hourTxt = Integer.toString(Controller.sleepGoalHr);
						t2.setText(hourTxt);
				}
			});
			
			//create button to increment mins of user's sleep goal
			Button minUp = new Button("^");
			minUp.setMaxSize(Controller.width/2, Controller.height/4);
			minUp.setTranslateY((-Controller.height/8)*3);
			minUp.setTranslateX(Controller.width/4);
			minUp.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					if (Controller.sleepGoalMin == 59) {
						Controller.sleepGoalMin = 0;
						Controller.sleepGoalHr += 1;
						String minTxt = Integer.toString(Controller.sleepGoalMin);
						String hourTxt = Integer.toString(Controller.sleepGoalHr);
						t1.setText(minTxt);
						t2.setText(hourTxt);
					}
					else {
						Controller.sleepGoalMin += 1;
						String minTxt = Integer.toString(Controller.sleepGoalMin);
						t1.setText(minTxt);
					}
				}
			});
			
			// create button to decrement mins of user's sleep goal
			Button minDown = new Button("v");
			minDown.setMaxSize(Controller.width/2, Controller.height/4);
			minDown.setTranslateY((Controller.height/8));
			minDown.setTranslateX(Controller.width/4);
			minDown.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					if (Controller.sleepGoalMin == 0) {
						Controller.sleepGoalMin = 59;
						Controller.sleepGoalHr -= 1;
						String minTxt = Integer.toString(Controller.sleepGoalMin);
						String hourTxt = Integer.toString(Controller.sleepGoalHr);
						t1.setText(minTxt);
						t2.setText(hourTxt);
					}
					else {
						Controller.sleepGoalMin -= 1;
						String minTxt = Integer.toString(Controller.sleepGoalMin);
						t1.setText(minTxt);
					}
				}
			});
			
			// create back button
			Button back = new Button("Back");
			back.setMaxSize(Controller.width, Controller.height/4);
			back.setTranslateY((Controller.height/8)*3);
			//back.setOnAction(e -> window.close());
			back.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					GoalMenu.GoalMenu();
					window.close();
				} 
			});
			// add buttons and texts to stack pane
			p.getChildren().add(hrDown);
			p.getChildren().add(hrUp);
			p.getChildren().add(minDown);
			p.getChildren().add(minUp);
			p.getChildren().add(t1);
			p.getChildren().add(t2);
			p.getChildren().add(t3);
			p.getChildren().add(t4);
			p.getChildren().add(back);
			
			window.setScene(scene);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
