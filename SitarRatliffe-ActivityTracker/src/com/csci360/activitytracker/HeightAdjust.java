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


public class HeightAdjust{
	public static void HeightAdjust() {
		try {
			// create a window for the HeightAdjust scene
			// set up text and translate to correct location 
			Stage window = new Stage();
			window.setTitle("AgeAdjust");
			StackPane p = new StackPane();
			Scene scene = new Scene(p,Controller.width,Controller.height,Color.AZURE);
			String heightTxt = Integer.toString(Controller.userHeight);
			Text t = new Text (Controller.width/2, Controller.height/2, " Height:\n  "+ heightTxt + " in");
			t.setTranslateY(-Controller.height/8);

			// create button to increment the user's height
			Button up = new Button("    ^   ");
			up.setMaxSize(Controller.width, Controller.height/4);
			up.setTranslateY((-Controller.height/8)*3);
			up.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					Controller.userHeight += 1;
					String heightTxt = Integer.toString(Controller.userHeight);
					t.setText(" Height:\n  " + heightTxt + " in");
				}
			});

			// button to decrememt the users height
			Button down = new Button("   v   ");
			down.setMaxSize(Controller.width, Controller.height/4);
			down.setTranslateY(Controller.height/8);
			down.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					Controller.userHeight -= 1;
					String heightTxt = Integer.toString(Controller.userHeight);
					t.setText(" Height:\n  " + heightTxt + " in");
				}
			});

			// button to go back to previous scene
			Button back = new Button("Back");
			back.setMaxSize(Controller.width, Controller.height/4);
			back.setTranslateY((Controller.height/8)*3);
			back.setOnAction(e -> window.close());

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
