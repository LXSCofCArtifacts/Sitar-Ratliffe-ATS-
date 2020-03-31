package com.csci360.activitytracker;
	
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;


public class ClockFace extends Controller{
	
	public static void ClockFace() {
		try {
			Stage window = new Stage();
			window.setTitle("Clock Face");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,Controller.width,Controller.height);
			Button b = new Button(); 			//same as b.setText("It's working!!!");
			b.setLayoutX(Controller.width/2);
			b.setLayoutY(Controller.height/2);
			b.setMaxSize(Controller.width, Controller.height);
			sp.getChildren().add(b);			
			b.setOnAction(e -> MainMenu.MainMenu());
			
            DateFormat dateFormat = new SimpleDateFormat("hh:mm a");
            Calendar cal = Calendar.getInstance();

            Controller.sysMin = cal.get(Calendar.MINUTE);
            Controller.sysHour = cal.get(Calendar.HOUR);
            Controller.sysDay = cal.get(Calendar.DAY_OF_MONTH);
            Controller.sysMonth = cal.get(Calendar.MONTH) + 1;
            Controller.sysYear = cal.get(Calendar.YEAR);
            Controller.timeDisplay = new Text(Controller.sysHour+ " : " + Controller.sysMin);
			Controller.timeDisplay.setStyle("-fx-font: 24 arial;");
			sp.getChildren().add(Controller.timeDisplay);
			
		//	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			window.setScene(scene);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}