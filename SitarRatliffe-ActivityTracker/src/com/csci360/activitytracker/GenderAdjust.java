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
			// create a window for the GenderAdjust scene
			// set up text  and buttons and translate to correct location 
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
			// male button to set gender boolean to true
			male.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					Controller.gender = true;
				}
			});
			
			// female and other button to set gender boolean to false
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
			
			// create a back button
			back.setTranslateY((Controller.height/8)*3);
			back.setMaxSize(Controller.width, Controller.height/4);
			sp.getChildren().add(back);
			//back.setOnAction(e -> window.close());
			back.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					PersonalInfoMenu.PersonalInfoMenu();
					window.close();
				} 
			});
			window.setScene(scene);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
