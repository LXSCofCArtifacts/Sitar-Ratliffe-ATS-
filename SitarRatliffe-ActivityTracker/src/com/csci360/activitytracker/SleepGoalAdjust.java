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


public class SleepGoalAdjust extends Application  {
	protected int width = 54;
	protected int height = 150;
	protected static int min = 50;
	protected static int hour = 5;
	
	@Override
	public void start (Stage primaryStage) {
		try {
			primaryStage.setTitle("TimeAdjust");
			StackPane p = new StackPane();
			Scene scene = new Scene(p,width,height,Color.AZURE);
			String minTxt = Integer.toString(min);
			String hourTxt = Integer.toString(hour);
			Text t1 = new Text (minTxt);
			Text t2 = new Text (hourTxt);
			Text t3 = new Text (":");
			Text t4 = new Text ("\n\nHours");
			t2.setTranslateX(-width/3);
			t1.setTranslateX(width/3);
			t2.setTranslateY(-height/8);
			t1.setTranslateY(-height/8);
			t3.setTranslateY(-height/8);
			t4.setTranslateY(-height/7);
			
			
			Button hrUp = new Button("^");
			hrUp.setMaxSize(width/2, height/4);
			hrUp.setTranslateY((-height/8)*3);
			hrUp.setTranslateX(-width/4);
			
			Button hrDown = new Button("v");
			hrDown.setMaxSize(width/2, height/4);
			hrDown.setTranslateY((height/8));
			hrDown.setTranslateX(-width/4);
			
			Button minUp = new Button("^");
			minUp.setMaxSize(width/2, height/4);
			minUp.setTranslateY((-height/8)*3);
			minUp.setTranslateX(width/4);
			
			Button minDown = new Button("v");
			minDown.setMaxSize(width/2, height/4);
			minDown.setTranslateY((height/8));
			minDown.setTranslateX(width/4);
			
			Button back = new Button("Back");
			back.setMaxSize(width, height/4);
			back.setTranslateY((height/8)*3);
		
			
			p.getChildren().add(hrDown);
			p.getChildren().add(hrUp);
			p.getChildren().add(minDown);
			p.getChildren().add(minUp);
			p.getChildren().add(t1);
			p.getChildren().add(t2);
			p.getChildren().add(t3);
			p.getChildren().add(t4);
			p.getChildren().add(back);
			
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
