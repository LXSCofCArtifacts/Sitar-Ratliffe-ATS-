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


public class MonthAdjust{
	public static void MonthAdjust() {
		try {
			// create a window for the MonthAdjust scene
			// set up text and translate to correct location 
			Stage window = new Stage();
			window.setTitle("MonthAdjust");
			StackPane p = new StackPane();
			Scene scene = new Scene(p,Controller.width,Controller.height,Color.AZURE);
			String monthTxt = Integer.toString(Controller.sysMonth);
			Text t = new Text (Controller.width/2, Controller.height/2, " Month:\n  "+monthTxt);
			t.setTranslateY(-Controller.height/8);
			
			// button to increment the month
			Button up = new Button("    ^   ");
			up.setMaxSize(Controller.width, Controller.height/4);
			up.setTranslateY((-Controller.height/8)*3);
			up.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					if (Controller.sysMonth == 12) {
						Controller.sysMonth = 1;
						String monthTxt = Integer.toString(Controller.sysMonth);
						t.setText(" Month:\n  "+monthTxt);
					}
					else {
						Controller.sysMonth += 1;
						Controller.sysMonthInc += 1;
						String monthTxt = Integer.toString(Controller.sysMonth);
						t.setText(" Month:\n  "+monthTxt);
					}
				}
			});	
			
			// button to decrement the month
			Button down = new Button("   v   ");
			down.setMaxSize(Controller.width, Controller.height/4);
			down.setTranslateY(Controller.height/8);
			down.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					if (Controller.sysMonth == 1) {
						Controller.sysMonth = 12;
						String monthTxt = Integer.toString(Controller.sysMonth);
						t.setText(" Month:\n  "+monthTxt);
					}
					else {
						Controller.sysMonth -= 1;
						Controller.sysMonthInc -= 1;
						String monthTxt = Integer.toString(Controller.sysMonth);
						t.setText(" Month:\n  "+monthTxt);
					}
				}
			});	
			
			// button to go back
			Button back = new Button("Back");
			back.setMaxSize(Controller.width, Controller.height/4);
			back.setTranslateY((Controller.height/8)*3);
			
			p.getChildren().add(up);
			p.getChildren().add(down);
			p.getChildren().add(t);
			p.getChildren().add(back);
			back.setOnAction(e -> window.close());

			window.setScene(scene);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
