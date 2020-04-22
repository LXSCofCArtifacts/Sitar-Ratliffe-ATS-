package com.csci360.activitytracker;
	
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;


public class DateAdjustMenu{	
	public static void DateAdjustMenu() {
		try {
			// create a window for the DateAdjustMenu scene
			// set up text and translate to correct location 
			Stage window = new Stage();
			window.setTitle("DateAdjustMenu");
			StackPane p = new StackPane();
			Scene scene = new Scene(p,Controller.width,Controller.height,Color.AZURE);
			String monthTxt = Integer.toString(Controller.sysMonth);
			String dayTxt = Integer.toString(Controller.sysDay);
			String yearTxt = Integer.toString(Controller.sysYear);

			// create back button
			Button back = new Button("Back"); 
			back.setTranslateY((Controller.height/8)*3);
			back.setMaxSize(Controller.width, Controller.height/4);
			
			// create button to access the day
			Button day = new Button("Day");
			day.setTranslateY((-Controller.height/8)*3);
			day.setMaxSize(Controller.width, Controller.height/4);
			
			// create button to access the month
			Button month = new Button("Month");
			month.setTranslateY(-Controller.height/8);
			month.setMaxSize(Controller.width, Controller.height/4);
			
			// create button to access the year
			Button year = new Button("Year");
			year.setTranslateY(Controller.height/8);
			year.setMaxSize(Controller.width, Controller.height/4);
			
			day.setOnAction(e -> DayAdjust.DayAdjust());
			month.setOnAction(e -> MonthAdjust.MonthAdjust());
			year.setOnAction(e -> YearAdjust.YearAdjust());
			
			p.getChildren().add(day);
			p.getChildren().add(month);
			p.getChildren().add(year);
			p.getChildren().add(back);
			
			back.setOnAction(e -> window.close());
			
			window.setScene(scene);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
