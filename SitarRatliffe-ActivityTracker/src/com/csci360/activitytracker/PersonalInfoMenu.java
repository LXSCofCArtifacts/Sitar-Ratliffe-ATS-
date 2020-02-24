package com.csci360.activitytracker;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class PersonalInfoMenu extends Application {
	
	final protected int width = 54;
	final protected int height = 160;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Personal Info Menu");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,width,height);
			Button personaldata = new Button("Personal Data"); 
			Button gender = new Button("Gender");
			Button goals = new Button("Activity \nGoals"); 
			Button back = new Button("Back"); 

			personaldata.setTranslateY((-height/8)*3);
			personaldata.setMaxSize(width, height/4);
			sp.getChildren().add(personaldata);
			
			gender.setTranslateY(-height/8);
			gender.setMaxSize(width, height/4);
			sp.getChildren().add(gender);
			
			goals.setTranslateY(height/8);
			goals.setMaxSize(width, height/4);
			sp.getChildren().add(goals);
			
			back.setTranslateY((height/8)*3);
			back.setMaxSize(width, height/4);
			sp.getChildren().add(back);	
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
