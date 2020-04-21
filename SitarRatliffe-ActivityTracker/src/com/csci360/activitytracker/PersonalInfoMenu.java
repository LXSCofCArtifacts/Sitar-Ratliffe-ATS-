package com.csci360.activitytracker;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class PersonalInfoMenu{
	public static void PersonalInfoMenu() {
		try {
			// create a window for the PersonalInfoMenu scene
			// set up text and buttons and translate to correct location 
			Stage window = new Stage();
			window.setTitle("Personal Info Menu");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,Controller.width,Controller.height);
			Button personaldata = new Button("Personal Info Menu 2"); 
			Button gender = new Button("Gender");
			Button goals = new Button("Goal Menu"); 
			Button back = new Button("Back"); 

			// buttons will take you to own specific scene
			personaldata.setTranslateY((-Controller.height/8)*3);
			personaldata.setMaxSize(Controller.width, Controller.height/4);
			sp.getChildren().add(personaldata);
			personaldata.setOnAction(e -> PersonalInfoMenu2.PersonalInfoMenu2());
			
			gender.setTranslateY(-Controller.height/8);
			gender.setMaxSize(Controller.width, Controller.height/4);
			sp.getChildren().add(gender);
			gender.setOnAction(e -> GenderAdjust.GenderAdjust());
			
			goals.setTranslateY(Controller.height/8);
			goals.setMaxSize(Controller.width, Controller.height/4);
			sp.getChildren().add(goals);
			goals.setOnAction(e -> GoalMenu.GoalMenu());
			
			// back button to take you to previous scene
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
