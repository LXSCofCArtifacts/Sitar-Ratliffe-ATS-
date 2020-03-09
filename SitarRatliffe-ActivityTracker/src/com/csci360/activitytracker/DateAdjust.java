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


public class DateAdjust{
	final static int width = 54;
	final static int height = 150;

	
	public static void DateAdjustMenu() {
		try {
			Stage window = new Stage();
			window.setTitle("TimeAdjust");
			StackPane p = new StackPane();
			Scene scene = new Scene(p,width,height,Color.AZURE);
			String monthTxt = Integer.toString(ClockFace.sysMonth);
			String dayTxt = Integer.toString(ClockFace.sysDay);
			String yearTxt = Integer.toString(ClockFace.sysYear);

			Button back = new Button("Back"); 
			back.setTranslateY((height/8)*3);
			back.setMaxSize(width, height/4);
			
			Button day = new Button("D:"+dayTxt);
			day.setTranslateY((-height/8)*3);
			day.setMaxSize(width, height/4);
			
			Button month = new Button("M:"+monthTxt);
			month.setTranslateY(-height/8);
			month.setMaxSize(width, height/4);
			
			Button year = new Button("Y:"+yearTxt);
			year.setTranslateY(height/8);
			year.setMaxSize(width, height/4);
			
			day.setOnAction(e -> MainMenu.MainMenu());
			month.setOnAction(e -> MainMenu.MainMenu());
			year.setOnAction(e -> MainMenu.MainMenu());
			
			p.getChildren().add(day);
			p.getChildren().add(month);
			p.getChildren().add(year);
			p.getChildren().add(back);
			
			back.setOnAction(e -> window.close());
			
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			window.setScene(scene);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
