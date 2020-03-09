package com.csci360.activitytracker;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class PersonalInfoMenu2{
	
	final static int width = 54;
	final static int height = 160;
	
	public static void PersonalInfoMenu2() {
		try {
			Stage window = new Stage();
			window.setTitle("Personal Info Menu 2");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,width,height);
			Button userage = new Button("Age"); 
			Button userweight = new Button("Weight");
			Button userheight = new Button("Height"); 
			Button back = new Button("Back"); 

			userage.setTranslateY((-height/8)*3);
			userage.setMaxSize(width, height/4);
			sp.getChildren().add(userage);
			userage.setOnAction(e -> AgeAdjust.AgeAdjust());
			
			userweight.setTranslateY(-height/8);
			userweight.setMaxSize(width, height/4);
			sp.getChildren().add(userweight);
			userweight.setOnAction(e -> WeightAdjust.WeightAdjust());
			
			userheight.setTranslateY(height/8);
			userheight.setMaxSize(width, height/4);
			sp.getChildren().add(userheight);
			userheight.setOnAction(e -> HeightAdjust.HeightAdjust());
			
			back.setTranslateY((height/8)*3);
			back.setMaxSize(width, height/4);
			sp.getChildren().add(back);	
			back.setOnAction(e -> window.close());
			
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			window.setScene(scene);
			window.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
