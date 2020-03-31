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
	public static void TimeAdjust() {
		try {
			Stage window = new Stage();
			window.setTitle("TimeAdjust");
			StackPane p = new StackPane();
			Scene scene = new Scene(p,Controller.width,Controller.height,Color.AZURE);
			String minTxt = Integer.toString(Controller.sysMin);
			String hourTxt = Integer.toString(Controller.sysHour);
			Text t1 = new Text (minTxt);
			Text t2 = new Text (hourTxt);
			Text t3 = new Text (":");
			Text t4 = new Text ("\n\nAm");
			t2.setTranslateX(-Controller.width/3);
			t1.setTranslateX(Controller.width/3);
			t2.setTranslateY(-Controller.height/8);
			t1.setTranslateY(-Controller.height/8);
			t3.setTranslateY(-Controller.height/8);
			t4.setTranslateY(-Controller.height/7);
			
			
			Button hrUp = new Button("^");
			hrUp.setMaxSize(Controller.width/2, Controller.height/4);
			hrUp.setTranslateY((-Controller.height/8)*3);
			hrUp.setTranslateX(-Controller.width/4);
			hrUp.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					if (Controller.sysHour == 12) {
						Controller.sysHour = 1;
						String hourTxt = Integer.toString(Controller.sysHour);
						t2.setText(hourTxt);
						Controller.hourDisplay.setText(Controller.sysHour+"   :");	
						Controller.minDisplay.setText(Controller.sysMin+"");						

					}
					else {
						Controller.sysHour += 1;
						String hourTxt = Integer.toString(Controller.sysHour);
						t2.setText(hourTxt);
						Controller.hourDisplay.setText(Controller.sysHour+"   :");	
						Controller.minDisplay.setText(Controller.sysMin+"");
					}
				}
			});
			
			Button hrDown = new Button("v");
			hrDown.setMaxSize(Controller.width/2, Controller.height/4);
			hrDown.setTranslateY((Controller.height/8));
			hrDown.setTranslateX(-Controller.width/4);
			hrDown.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					if (Controller.sysHour == 1) {
						Controller.sysHour = 12;
						String hourTxt = Integer.toString(Controller.sysHour);
						t2.setText(hourTxt);
						Controller.hourDisplay.setText(Controller.sysHour+"   :");	
						Controller.minDisplay.setText(Controller.sysMin+"");
					}
					else {
						Controller.sysHour -= 1;
						String hourTxt = Integer.toString(Controller.sysHour);
						t2.setText(hourTxt);
						Controller.hourDisplay.setText(Controller.sysHour+"   :");	
						Controller.minDisplay.setText(Controller.sysMin+"");
					}
				}
			});
			
			Button minUp = new Button("^");
			minUp.setMaxSize(Controller.width/2, Controller.height/4);
			minUp.setTranslateY((-Controller.height/8)*3);
			minUp.setTranslateX(Controller.width/4);
			minUp.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					if (Controller.sysMin == 59) {
						Controller.sysMin = 0;
						Controller.sysHour += 1;
						String minTxt = Integer.toString(Controller.sysMin);
						String hourTxt = Integer.toString(Controller.sysHour);
						t1.setText(minTxt);
						t2.setText(hourTxt);
						Controller.hourDisplay.setText(Controller.sysHour+"   :");	
						Controller.minDisplay.setText(Controller.sysMin+"");
					}
					else {
						Controller.sysMin += 1;
						String minTxt = Integer.toString(Controller.sysMin);
						t1.setText(minTxt);
						Controller.hourDisplay.setText(Controller.sysHour+"   :");	
						Controller.minDisplay.setText(Controller.sysMin+"");
					}
				}
			});
			
			Button minDown = new Button("v");
			minDown.setMaxSize(Controller.width/2, Controller.height/4);
			minDown.setTranslateY((Controller.height/8));
			minDown.setTranslateX(Controller.width/4);
			minDown.setMaxSize(Controller.width/2, Controller.height/4);
			minDown.setTranslateY((Controller.height/8));
			minDown.setTranslateX(Controller.width/4);
			minDown.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					if (Controller.sysMin == 0) {
						Controller.sysMin = 59;
						Controller.sysHour -= 1;
						String minTxt = Integer.toString(Controller.sysMin);
						String hourTxt = Integer.toString(Controller.sysHour);
						t1.setText(minTxt);
						t2.setText(hourTxt);
						Controller.hourDisplay.setText(Controller.sysHour+"   :");	
						Controller.minDisplay.setText(Controller.sysMin+"");
					}
					else {
						Controller.sysMin -= 1;
						String minTxt = Integer.toString(Controller.sysMin);
						t1.setText(minTxt);
						Controller.hourDisplay.setText(Controller.sysHour+"   :");	
						Controller.minDisplay.setText(Controller.sysMin+"");
					}
				}
			});
			
			Button back = new Button("Back");
			back.setMaxSize(Controller.width, Controller.height/4);
			back.setTranslateY((Controller.height/8)*3);
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
