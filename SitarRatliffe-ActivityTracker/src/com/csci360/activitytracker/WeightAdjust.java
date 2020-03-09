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


public class WeightAdjust{
	
	final static int tallness = 500;
	final static int width = 54;
	final static int height = 160;
	
	public static void WeightAdjust() {
		try {
			Stage window = new Stage();
			window.setTitle("AgeAdjust");
			StackPane p = new StackPane();
			Scene scene = new Scene(p,width,height,Color.AZURE);
			String heightTxt = Integer.toString(tallness);
			Text t = new Text (width/2, height/2, "Weight:\n  "+heightTxt+ " in.");
			t.setTranslateY((-height/8));
			
			Button up = new Button("    ^   ");
			up.setMaxSize(width, height/4);
			up.setTranslateY((-height/8)*3);
			
			Button down = new Button("   v   ");
			down.setMaxSize(width, height/4);
			down.setTranslateY(height/8);

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
