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

			Calendar cal = Calendar.getInstance();
			Controller.sysDay = cal.get(Calendar.DAY_OF_MONTH);
			Controller.sysMonth = cal.get(Calendar.MONTH) + 1;
			Controller.sysYear = cal.get(Calendar.YEAR);
			Controller.timeDisplay = new Text("");
			
			sp.getChildren().add(Controller.timeDisplay);

			Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		        LocalTime localTime = LocalTime.now();
		        localTime = localTime.plusHours(Controller.sysHourIncrement);
		        localTime = localTime.plusMinutes(Controller.sysMinIncrement);
		        Controller.timeDisplay.setText((localTime).format(formatter));
		        Controller.timeDisplay.setStyle("-fx-font: 24 arial;");
		    }), new KeyFrame(Duration.seconds(1)));
		    clock.setCycleCount(Animation.INDEFINITE);
		    clock.play();

			//	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			window.setScene(scene);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}




