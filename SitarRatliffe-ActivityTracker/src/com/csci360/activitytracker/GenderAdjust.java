package com.csci360.activitytracker;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
public class GenderAdjust{
	public static void GenderAdjust() {
		try {
			Stage window = new Stage();
			window.setTitle("Gender");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,Controller.width,Controller.height);
			Button male = new Button("Male"); 
			Button female = new Button("Female");
			Button other = new Button("Other"); 
			Button back = new Button("Back"); 
			male.setTranslateY((-Controller.height/8)*3);
			male.setMaxSize(Controller.width, Controller.height/4);
			sp.getChildren().add(male);
			male.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					Controller.gender = true;
				}
			});
			female.setTranslateY(-Controller.height/8);
			female.setMaxSize(Controller.width, Controller.height/4);
			sp.getChildren().add(female);
			female.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					Controller.gender = true;
				}
			});
			other.setTranslateY(Controller.height/8);
			other.setMaxSize(Controller.width, Controller.height/4);
			sp.getChildren().add(other);
			other.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					Controller.gender = false;
				}
			});
			back.setTranslateY((Controller.height/8)*3);
			back.setMaxSize(Controller.width, Controller.height/4);
			sp.getChildren().add(back);
			back.setOnAction(e -> window.close());
			window.setScene(scene);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
