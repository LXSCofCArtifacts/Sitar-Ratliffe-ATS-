package com.csci360.activitytracker;
	
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

public class CalorieGoalAdjust{
	
	public static void CalorieGoalAdjust() {
		try {
			// create a window for the CalorieGoalAdjust scene
			// set up text and translate to correct location 
			Stage window = new Stage();
			StackPane p = new StackPane();
			Scene scene = new Scene(p,Controller.width,Controller.height);
			String calorieTxt = Integer.toString(Controller.calorieGoal);
			Text t = new Text (Controller.width/2, Controller.height/2, " Calories:\n  " + calorieTxt);
			t.setTranslateY((-Controller.height/8));
			
			// create a button to increment the users calorie goal
			Button up = new Button("    ^   ");
			up.setMaxSize(Controller.width, Controller.height/4);
			up.setTranslateY((-Controller.height/8)*3);
			up.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					Controller.calorieGoal += 1;
					String calorieTxt = Integer.toString(Controller.calorieGoal);
					t.setText(" Calories:\n  " + calorieTxt);
				}
			});
			
			// create a button to decrement the users calorie goal
			Button down = new Button("   v   ");
			down.setMaxSize(Controller.width, Controller.height/4);
			down.setTranslateY(Controller.height/8);
			down.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					Controller.calorieGoal -= 1;
					String calorieTxt = Integer.toString(Controller.calorieGoal);
					t.setText(" Calories:\n  " + calorieTxt);
				}
			});

			// create a button to return to the previous window
			// and close the current window
			Button back = new Button("Back");
			back.setMaxSize(Controller.width, Controller.height/4);
			back.setTranslateY((Controller.height/8)*3);
			back.setOnAction(e -> window.close());
			
			// add the buttons and text to the stack pane
			p.getChildren().add(up);
			p.getChildren().add(down);
			p.getChildren().add(t);
			p.getChildren().add(back);
			
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			window.setScene(scene);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
