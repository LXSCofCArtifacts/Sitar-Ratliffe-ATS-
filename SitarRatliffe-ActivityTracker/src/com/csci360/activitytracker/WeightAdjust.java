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


public class WeightAdjust{
	public static void WeightAdjust() {
		try {
			// create a window for the WeightAdjust scene
			// set up text and translate to correct location 
			Stage window = new Stage();
			window.setTitle("AgeAdjust");
			StackPane p = new StackPane();
			Scene scene = new Scene(p,Controller.width,Controller.height,Color.AZURE);
			String weightTxt = Integer.toString(Controller.weight);
			Text t = new Text (Controller.width/2, Controller.height/2, " Weight:\n  " + weightTxt + " lbs");
			t.setTranslateY((-Controller.height/8));
			
			// button to increment the weight of the user
			Button up = new Button("    ^   ");
			up.setMaxSize(Controller.width, Controller.height/4);
			up.setTranslateY((-Controller.height/8)*3);
			up.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					Controller.weight += 1;
					String weightTxt = Integer.toString(Controller.weight);
					t.setText(" Weight:\n  " + weightTxt + " lbs");
				}
			});
			
			// button to decrement the weight of the user
			Button down = new Button("   v   ");
			down.setMaxSize(Controller.width, Controller.height/4);
			down.setTranslateY(Controller.height/8);
			down.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					Controller.weight -= 1;
					String weightTxt = Integer.toString(Controller.weight);
					t.setText(" Weight:\n  " + weightTxt + " lbs");
				}
			});

			// button to take the user back to previous scene
			Button back = new Button("Back");
			back.setMaxSize(Controller.width, Controller.height/4);
			back.setTranslateY((Controller.height/8)*3);
			//back.setOnAction(e -> window.close());
			back.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					PersonalInfoMenu2.PersonalInfoMenu2();
					window.close();
				} 
			});
			p.getChildren().add(up);
			p.getChildren().add(down);
			p.getChildren().add(t);
			p.getChildren().add(back);
			
			window.setScene(scene);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
