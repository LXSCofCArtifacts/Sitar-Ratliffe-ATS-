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


public class AgeAdjust{

	public static void AgeAdjust() {
		try {
			Stage window = new Stage();
			window.setTitle("AgeAdjust");
			StackPane p = new StackPane();
			Scene scene = new Scene(p,ClockFace.width,ClockFace.height);
			String ageTxt = Integer.toString(StepTracker.age);
			Text t = new Text (ClockFace.width/2, ClockFace.height/2, " Age:\n  "+ageTxt);
			t.setTranslateY((-ClockFace.height/8));
			
			Button up = new Button("    ^   ");
			up.setMaxSize(ClockFace.width, ClockFace.height/4);
			up.setTranslateY((-ClockFace.height/8)*3);
			up.setOnAction(e -> StepTracker.age++);
			
			Button down = new Button("   v   ");
			down.setMaxSize(ClockFace.width, ClockFace.height/4);
			down.setTranslateY(ClockFace.height/8);
			down.setOnAction(e -> StepTracker.age--);

			Button back = new Button("Back");
			back.setMaxSize(ClockFace.width, ClockFace.height/4);
			back.setTranslateY((ClockFace.height/8)*3);
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
