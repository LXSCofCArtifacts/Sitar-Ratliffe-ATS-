package com.csci360.activitytracker;
	
import javafx.application.Application;
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


public class DateAdjust extends Application  {
	protected int width = 54;
	protected int height = 150;

	
	@Override
	public void start (Stage primaryStage) {
		try {
			primaryStage.setTitle("TimeAdjust");
			StackPane p = new StackPane();
			Scene scene = new Scene(p,width,height,Color.AZURE);
			String monthTxt = Integer.toString(ClockFace.sysMonth);
			String dayTxt = Integer.toString(ClockFace.sysDay);
			String yearTxt = Integer.toString(ClockFace.sysYear);

			Button decrement = new Button("v");
			decrement.setTranslateY((height/8)*3);
			decrement.setTranslateX(-width/4);
			decrement.setMaxSize(width/2, height/4);
			
			Button increment = new Button("^");
			increment.setTranslateY((height/8)*3);
			increment.setTranslateX(width/4);
			increment.setMaxSize(width/2, height/4);
			
			Button day = new Button("D:"+dayTxt);
			day.setTranslateY((-height/8)*3);
			day.setMaxSize(width, height/4);
			
			Button month = new Button("M:"+monthTxt);
			month.setTranslateY(-height/8);
			month.setMaxSize(width, height/4);
			
			Button year = new Button("Y:"+yearTxt);
			year.setTranslateY(height/8);
			year.setMaxSize(width, height/4);
			
			p.getChildren().add(increment);
			p.getChildren().add(decrement);
			p.getChildren().add(day);
			p.getChildren().add(month);
			p.getChildren().add(year);

			
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
