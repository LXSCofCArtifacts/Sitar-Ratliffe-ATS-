package com.csci360.activitytracker;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class MainMenu extends Application{
	
	final protected int width = 54;
	final protected int height = 160;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Main Menu");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,width,height);
			Button steps = new Button("Step \n Tracker"); 
			Button sleep = new Button("Sleep \n Tracker");
			Button settings = new Button("Main Menu 2"); 
			Button back = new Button("Back"); 

			steps.setTranslateY((-height/8)*3);
			steps.setMaxSize(width, height/4);
			sp.getChildren().add(steps);
			steps.setOnAction(new EventHandler<ActionEvent> ()
				{
					@Override
					public void handle(ActionEvent event) {
						primaryStage.setScene(newscene);
						primaryStage.show();
					}
				});
			
			sleep.setTranslateY(-height/8);
			sleep.setMaxSize(width, height/4);
			sp.getChildren().add(sleep);
			
			settings.setTranslateY(height/8);
			settings.setMaxSize(width, height/4);
			sp.getChildren().add(settings);
			
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
