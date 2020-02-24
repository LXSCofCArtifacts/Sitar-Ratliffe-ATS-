package com.csci360.activitytracker;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class PersonalInfoMenu2 extends Application {
	
	final protected int width = 54;
	final protected int height = 160;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Personal Data");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,width,height);
			Button userage = new Button("Age"); 
			Button userweight = new Button("Weight");
			Button userheight = new Button("Height"); 
			Button back = new Button("Back"); 

			userage.setTranslateY((-height/8)*3);
			userage.setMaxSize(width, height/4);
			sp.getChildren().add(userage);
			
			userweight.setTranslateY(-height/8);
			userweight.setMaxSize(width, height/4);
			sp.getChildren().add(userweight);
			
			userheight.setTranslateY(height/8);
			userheight.setMaxSize(width, height/4);
			sp.getChildren().add(userheight);
			
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
