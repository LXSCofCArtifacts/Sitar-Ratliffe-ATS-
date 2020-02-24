package com.csci360.activitytracker;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class GenderAdjust extends Application {
	
	final protected int width = 54;
	final protected int height = 160;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Gender");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,width,height);
			Button male = new Button("Male"); 
			Button female = new Button("Female");
			Button other = new Button("Other"); 
			Button back = new Button("Back"); 

			male.setTranslateY((-height/8)*3);
			male.setMaxSize(width, height/4);
			sp.getChildren().add(male);
			
			female.setTranslateY(-height/8);
			female.setMaxSize(width, height/4);
			sp.getChildren().add(female);
			
			other.setTranslateY(height/8);
			other.setMaxSize(width, height/4);
			sp.getChildren().add(other);
			
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
