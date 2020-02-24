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


public class StepGoalAdjust extends Application  {
	protected int width = 54;
	protected int height = 150;
	protected static int stepGoal = 2000;
	@Override
	public void start (Stage primaryStage) {
		try {
			primaryStage.setTitle("AgeAdjust");
			StackPane p = new StackPane();
			Scene scene = new Scene(p,width,height,Color.AZURE);
			String heightTxt = Integer.toString(stepGoal);
			Text t = new Text (width/2, height/2, " Steps:\n  "+heightTxt);
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
			
			p.getChildren().add(up);
			p.getChildren().add(down);
			p.getChildren().add(t);
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
