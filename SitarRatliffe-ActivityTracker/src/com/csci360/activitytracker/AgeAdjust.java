package com.csci360.activitytracker;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
public class AgeAdjust{
	public static void AgeAdjust() {
		try {
			// create a window for the AgeAdjust scene
			// set up text and translate to correct location 			
			Stage window = new Stage();
			window.setTitle("AgeAdjust");
			StackPane p = new StackPane();
			Scene scene = new Scene(p,Controller.width,Controller.height);
			String ageTxt = Integer.toString(Controller.age);
			Text t = new Text (Controller.width/2, Controller.height/2, " Age:\n  "+ageTxt);
			t.setTranslateY((-Controller.height/8));
			
			// create a button to increment the users age
			Button up = new Button("    ^   ");
			up.setMaxSize(Controller.width, Controller.height/4);
			up.setTranslateY((-Controller.height/8)*3);
			up.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					Controller.age += 1;
					String ageTxt = Integer.toString(Controller.age);
					t.setText(" Age:\n  " + ageTxt);
				}
			});
			// create a button to decrement the users age			
			Button down = new Button("   v   ");
			down.setMaxSize(Controller.width, Controller.height/4);
			down.setTranslateY(Controller.height/8);
			down.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					Controller.age -= 1;
					String ageTxt = Integer.toString(Controller.age);
					t.setText(" Age:\n  " + ageTxt);
				}
			});
			// create a button to return to the previous window
			// and close the current window
			Button back = new Button("Back");
			back.setMaxSize(Controller.width, Controller.height/4);
			back.setTranslateY((Controller.height/8)*3);
			back.setOnAction(e -> window.close());

			// add the buttons and text to the stack pane
			p.getChildren().add(up);
			p.getChildren().add(down);
			p.getChildren().add(t);
			p.getChildren().add(back);
			window.setScene(scene);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}