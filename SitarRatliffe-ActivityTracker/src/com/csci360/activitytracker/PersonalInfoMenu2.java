package com.csci360.activitytracker;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class PersonalInfoMenu2{
	public static void PersonalInfoMenu2() {
		try {
			// create a window for the PersonalInfoMenu2 scene
			// set up text and buttons and translate to correct location 
			Stage window = new Stage();
			window.setTitle("Personal Info Menu 2");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,Controller.width,Controller.height);
			Button userage = new Button("Age"); 
			Button userWeight = new Button("Weight");
			Button userHeight = new Button("Height"); 
			Button back = new Button("Back"); 

			// create buttons to take you to specific scenes
			userage.setTranslateY((-Controller.height/8)*3);
			userage.setMaxSize(Controller.width, Controller.height/4);
			sp.getChildren().add(userage);
			userage.setOnAction(e -> AgeAdjust.AgeAdjust());
			
			userWeight.setTranslateY(-Controller.height/8);
			userWeight.setMaxSize(Controller.width, Controller.height/4);
			sp.getChildren().add(userWeight);
			userWeight.setOnAction(e -> WeightAdjust.WeightAdjust());
			
			userHeight.setTranslateY(Controller.height/8);
			userHeight.setMaxSize(Controller.width, Controller.height/4);
			sp.getChildren().add(userHeight);
			userHeight.setOnAction(e -> HeightAdjust.HeightAdjust());
			
			// create a button to take you to previous scene
			back.setTranslateY((Controller.height/8)*3);
			back.setMaxSize(Controller.width, Controller.height/4);
			sp.getChildren().add(back);	
			back.setOnAction(e -> window.close());

			window.setScene(scene);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
