package com.csci360.activitytracker;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class MainMenu2{	
	public static void MainMenu2() {
		try {
			Stage window = new Stage();
			window.setTitle("Main Menu 2");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,ClockFace.width,ClockFace.height);
			Button info = new Button("Personal \nInformation"); 
			Button settings = new Button("Settings"); 
			Button back = new Button("Back"); 

			info.setTranslateY((-ClockFace.height/8)*2.5);
			info.setMaxSize(ClockFace.width, ClockFace.height/2.7);
			sp.getChildren().add(info);
			info.setOnAction(e -> PersonalInfoMenu.PersonalInfoMenu());
			
			settings.setTranslateY(ClockFace.height/15);
			settings.setMaxSize(ClockFace.width, ClockFace.height/2.7);
			sp.getChildren().add(settings);
			settings.setOnAction(e -> SettingsMenu.SettingsMenu());
			
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
