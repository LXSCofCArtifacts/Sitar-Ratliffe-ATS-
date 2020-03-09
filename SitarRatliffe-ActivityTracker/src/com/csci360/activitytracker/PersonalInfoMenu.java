package com.csci360.activitytracker;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class PersonalInfoMenu{
	public static void PersonalInfoMenu() {
		try {
			Stage window = new Stage();
			window.setTitle("Personal Info Menu");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,ClockFace.width,ClockFace.height);
			Button personaldata = new Button("Personal Info Menu 2"); 
			Button gender = new Button("Gender");
			Button goals = new Button("Goal Menu"); 
			Button back = new Button("Back"); 

			personaldata.setTranslateY((-ClockFace.height/8)*3);
			personaldata.setMaxSize(ClockFace.width, ClockFace.height/4);
			sp.getChildren().add(personaldata);
			personaldata.setOnAction(e -> PersonalInfoMenu2.PersonalInfoMenu2());
			
			gender.setTranslateY(-ClockFace.height/8);
			gender.setMaxSize(ClockFace.width, ClockFace.height/4);
			sp.getChildren().add(gender);
			gender.setOnAction(e -> GenderAdjust.GenderAdjust());
			
			goals.setTranslateY(ClockFace.height/8);
			goals.setMaxSize(ClockFace.width, ClockFace.height/4);
			sp.getChildren().add(goals);
			goals.setOnAction(e -> GoalMenu.GoalMenu());
			
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
