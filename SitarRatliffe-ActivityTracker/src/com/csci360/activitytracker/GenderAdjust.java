package com.csci360.activitytracker;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class GenderAdjust{
	public static void GenderAdjust() {
		try {
			Stage window = new Stage();
			window.setTitle("Gender");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,ClockFace.width,ClockFace.height);
			Button male = new Button("Male"); 
			Button female = new Button("Female");
			Button other = new Button("Other"); 
			Button back = new Button("Back"); 

			male.setTranslateY((-ClockFace.height/8)*3);
			male.setMaxSize(ClockFace.width, ClockFace.height/4);
			sp.getChildren().add(male);
			
			female.setTranslateY(-ClockFace.height/8);
			female.setMaxSize(ClockFace.width, ClockFace.height/4);
			sp.getChildren().add(female);
			
			other.setTranslateY(ClockFace.height/8);
			other.setMaxSize(ClockFace.width, ClockFace.height/4);
			sp.getChildren().add(other);
			
			back.setTranslateY((ClockFace.height/8)*3);
			back.setMaxSize(ClockFace.width, ClockFace.height/4);
			sp.getChildren().add(back);
			back.setOnAction(e -> window.close());
			
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			window.setScene(scene);
			window.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
