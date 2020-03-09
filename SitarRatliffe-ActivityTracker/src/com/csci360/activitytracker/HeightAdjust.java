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


public class HeightAdjust{
	
	final static int width = 54;
	final static int height = 150;
	final static int tallness = 20;
	
	public static void HeightAdjust() {
		try {
			Stage window = new Stage();
			window.setTitle("AgeAdjust");
			StackPane p = new StackPane();
			Scene scene = new Scene(p,width,height,Color.AZURE);
			String tallnessTxt = Integer.toString(tallness);
			Text t = new Text (width/2, height/2, " Age:\n  "+tallnessTxt);
			
			Button up = new Button("    ^   ");
			up.setTranslateY(-height/4);
			
			Button down = new Button("   v   ");
			down.setTranslateY(height/4);
			
			Button back = new Button("Back");
			back.setMaxSize(width, height/4);
			back.setTranslateY((height/8)*3);
			back.setOnAction(e -> window.close());
			
			p.getChildren().add(up);
			p.getChildren().add(down);
			p.getChildren().add(t);
			p.getChildren().add(back);
			
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			window.setScene(scene);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
