package com.csci360.activitytracker;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ClockFace extends Controller{

	public static void ClockFace() {
		try {
			// create a window for the ClockFace scene
			// set up text and translate to correct location 
			// this will be the window that opens up every time
			// the program is run
			Stage window = new Stage();
			window.setTitle("ClockFace");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,Controller.width,Controller.height);
			Button b = new Button(); 			//same as b.setText("It's working!!!");
			b.setLayoutX(Controller.width/2);
			b.setLayoutY(Controller.height/2);
			b.setMaxSize(Controller.width, Controller.height);
			sp.getChildren().add(b);
			b.setOnAction(e -> MainMenu.MainMenu());

			// create a calendar object that gets the current
			// day, month and year
			Calendar cal = Calendar.getInstance();
			Controller.timeDisplay = new Text("");
	        Controller.timeDisplay.setStyle("-fx-font: 24 arial;");	
			Text currDay = new Text("");
			currDay.setTranslateY(18);
			currDay.setStyle("-fx-font: 12 arial;");

			sp.getChildren().add(Controller.timeDisplay);
			sp.getChildren().add(currDay);

			// create a time line so the program automatically updates the 
			// displayed time. since we did not have a sensor to track steps,
			// we made it so the system counts a step every second
			Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		        LocalTime localTime = LocalTime.now();
		        localTime = localTime.plusHours(Controller.sysHourIncrement);
		        localTime = localTime.plusMinutes(Controller.sysMinIncrement);
		        Controller.timeDisplay.setText((localTime).format(formatter));
		        Controller.stepCounter += 1;
				Controller.sysDay = cal.get(Calendar.DAY_OF_MONTH) + Controller.sysDayInc;
				Controller.sysMonth = cal.get(Calendar.MONTH) + 1 + Controller.sysMonthInc;
				Controller.sysYear = cal.get(Calendar.YEAR) + Controller.sysYearInc;
				currDay.setText(Controller.sysMonth + "/" + Controller.sysDay + "/" + Controller.sysYear);
		    }), new KeyFrame(Duration.seconds(1)));
		    clock.setCycleCount(Animation.INDEFINITE);
		    clock.play();

			window.setScene(scene);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
