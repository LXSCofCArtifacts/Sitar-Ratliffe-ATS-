package com.csci360.activitytracker;
	
import java.util.Calendar;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;


public class ClockFace extends Controller{
	
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Clock Face");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,Controller.width,Controller.height);
			Controller.hourDisplay = new Text(Controller.sysHour+"   :");
			Controller.minDisplay = new Text(Controller.sysMin+"");
			Controller.minDisplay.setTranslateX(Controller.width/4);
			Controller.hourDisplay.setTranslateX(-Controller.width/4);
			Button b = new Button(); 			//same as b.setText("It's working!!!");
			b.setLayoutX(Controller.width/2);
			b.setLayoutY(Controller.height/2);
			b.setMaxSize(Controller.width, Controller.height);
			sp.getChildren().add(b);
			sp.getChildren().add(Controller.hourDisplay);
			sp.getChildren().add(Controller.minDisplay);
			
			b.setOnAction(e -> MainMenu.MainMenu());
			
			
		//	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
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
