package com.csci360.activitytracker;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
public class DayAdjust{
	public static void DayAdjust() {
		try {
			// create a window for the DayAdjust scene
			// set up text and translate to correct location 
			Stage window = new Stage();
			window.setTitle("AgeAdjust");
			StackPane p = new StackPane();
			Scene scene = new Scene(p,Controller.width,Controller.height,Color.AZURE);
			String dayTxt = Integer.toString(Controller.sysDay);
			Text t = new Text (Controller.width/2, Controller.height/2, " Day:\n  "+dayTxt);
			t.setTranslateY(-Controller.height/8);
			
			// create button to increment the day
			Button up = new Button("    ^   ");
			up.setMaxSize(Controller.width, Controller.height/4);
			up.setTranslateY((-Controller.height/8)*3);
			up.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					// if statements to cycle to beginning 
					// of month if reached the end
					if (Controller.sysDay == 31) {
						Controller.sysDay = 1;
						String dayTxt = Integer.toString(Controller.sysDay);
						t.setText(" Day:\n  "+dayTxt);
					}
					else {
						Controller.sysDay += 1;
						Controller.sysDayInc += 1;
						String dayTxt = Integer.toString(Controller.sysDay);
						t.setText(" Day:\n  "+dayTxt);
					}
				}
			});		
			
			// create button to decrement the day
			Button down = new Button("   v   ");
			down.setMaxSize(Controller.width, Controller.height/4);
			down.setTranslateY(Controller.height/8);
			down.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					// if statements to cycle to end 
					// of month if reached the beginning
					if (Controller.sysDay == 1) {
						Controller.sysDay = 31;
						String dayTxt = Integer.toString(Controller.sysDay);
						t.setText(" Day:\n  "+dayTxt);
					}
					else {
						Controller.sysDay -= 1;
						Controller.sysDayInc -= 1;
						String dayTxt = Integer.toString(Controller.sysDay);
						t.setText(" Day:\n  "+dayTxt);
					}
				}
			});	
			
			// create a back button
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