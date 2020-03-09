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


public class TimeAdjust{
	final static int width = 54;
	final static int height = 150;
	
	public static void TimeAdjust() {
		try {
			Stage window = new Stage();
			window.setTitle("TimeAdjust");
			StackPane p = new StackPane();
			Scene scene = new Scene(p,width,height,Color.AZURE);
			String minTxt = Integer.toString(ClockFace.sysMin);
			String hourTxt = Integer.toString(ClockFace.sysHour);
			Text t1 = new Text (minTxt);
			Text t2 = new Text (hourTxt);
			Text t3 = new Text (":");
			Text t4 = new Text ("\n\nAm");
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
			back.setOnAction(e -> window.close());		
			
			p.getChildren().add(hrDown);
			p.getChildren().add(hrUp);
			p.getChildren().add(minDown);
			p.getChildren().add(minUp);
			p.getChildren().add(t1);
			p.getChildren().add(t2);
			p.getChildren().add(t3);
			p.getChildren().add(t4);
			p.getChildren().add(back);
			
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			window.setScene(scene);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
