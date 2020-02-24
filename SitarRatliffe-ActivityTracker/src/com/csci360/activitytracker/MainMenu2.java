package com.csci360.activitytracker;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class MainMenu2 extends Application {
	
	final protected int width = 54;
	final protected int height = 160;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Main Menu Cont...");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,width,height);
			Button info = new Button("Personal \nInformation"); 
			Button settings = new Button("Settings"); 
			Button back = new Button("Back"); 

			info.setTranslateY((-height/8)*2.5);
			info.setMaxSize(width, height/2.7);
			sp.getChildren().add(info);
			
			settings.setTranslateY(height/15);
			settings.setMaxSize(width, height/2.7);
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
