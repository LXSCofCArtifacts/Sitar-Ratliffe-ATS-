package com.csci360.activitytracker;
	
import java.text.DateFormat;
import java.text.DecimalFormat;
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
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import java.time.Duration;

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
            DecimalFormat decimalFormat = new DecimalFormat("#00");
	        String StrSysMin = decimalFormat.format(sysMin);
	        
	        
            Controller.sysHour = cal.get(Calendar.HOUR);
            Controller.sysDay = cal.get(Calendar.DAY_OF_MONTH);
            Controller.sysMonth = cal.get(Calendar.MONTH) + 1;
            Controller.sysYear = cal.get(Calendar.YEAR);
            Controller.timeDisplay = new Text(Controller.sysHour+ " : " + StrSysMin);
			Controller.timeDisplay.setStyle("-fx-font: 24 arial;");
			sp.getChildren().add(Controller.timeDisplay);
			
			long endTime = 0;
	        Label timeLabel = new Label();
	        DateFormat timeFormat = new SimpleDateFormat( "HH:mm:ss" );
	        final Timeline timeline = new Timeline(
	            new KeyFrame(
	                Duration.millis( 500 ),
	                event -> {
	                    final long diff = endTime - System.currentTimeMillis();
	                    if ( diff < 0 ) {
	                    //  timeLabel.setText( "00:00:00" );
	                        timeLabel.setText( timeFormat.format( 0 ) );
	                    } else {
	                        timeLabel.setText( timeFormat.format( diff ) );
	                    }
	                }
	            )
	        );
	        timeline.setCycleCount( Animation.INDEFINITE );
	        timeline.play();

			
			
		//	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			window.setScene(scene);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}




