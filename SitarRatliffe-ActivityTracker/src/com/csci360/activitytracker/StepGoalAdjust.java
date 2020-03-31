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


public class StepGoalAdjust{
	public static void StepGoalAdjust() {
		try {
			Stage window = new Stage();
			window.setTitle("StepGoalAdjust");
			StackPane p = new StackPane();
			Scene scene = new Scene(p,Controller.width,Controller.height,Color.AZURE);
			String stepGoalTxt = Integer.toString(Controller.stepGoal);
			Text t = new Text (Controller.width/2, Controller.height/2, " Steps:\n  " + stepGoalTxt);
			t.setTranslateY((-Controller.height/8));
			
			Button up = new Button("    ^   ");
			up.setMaxSize(Controller.width, Controller.height/4);
			up.setTranslateY((-Controller.height/8)*3);
			up.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					Controller.stepGoal += 1;
					String stepGoalTxt = Integer.toString(Controller.stepGoal);
					t.setText(" Steps:\n  " + stepGoalTxt);
				}
			});
			
			Button down = new Button("   v   ");
			down.setMaxSize(Controller.width, Controller.height/4);
			down.setTranslateY(Controller.height/8);
			down.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					Controller.stepGoal -= 1;
					String stepGoalTxt = Integer.toString(Controller.stepGoal);
					t.setText(" Steps:\n  " + stepGoalTxt);
				}
			});

			Button back = new Button("Back");
			back.setMaxSize(Controller.width, Controller.height/4);
			back.setTranslateY((Controller.height/8)*3);
			back.setOnAction(e -> window.close());
			
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
