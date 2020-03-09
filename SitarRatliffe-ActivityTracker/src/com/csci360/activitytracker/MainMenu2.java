package com.csci360.activitytracker;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class MainMenu2{	
	final static int width = 54;
	final static int height = 160;
	
	public static void MainMenu2() {
		try {
			Stage window = new Stage();
			window.setTitle("Main Menu 2");
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
			settings.setOnAction(e -> SettingsMenu.SettingsMenu());
			
			back.setTranslateY((height/8)*3);
			back.setMaxSize(width, height/4);
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
