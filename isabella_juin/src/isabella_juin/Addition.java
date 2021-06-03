/*
* Author : isabella
* Date : Jun. 2, 2021
* Description :
*/

package isabella_juin;


import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Addition extends Application {

	@Override
	public void start(Stage primaryStage) 
	{
		Group group = new Group();
		Scene scene = new Scene(group,400,400);
		
		TextField txt1 = new TextField();
		TextField txt2 = new TextField();
		Label lbl1 = new Label();
		Label lblPlus = new Label();
		Label lbl2 = new Label();
		Label lblEgale = new Label();
		Label lblRep = new Label();
		
		 IntegerProperty b = new SimpleIntegerProperty();
		
		txt1.textProperty().addListener((observable,oldValue,newValue)->
		{
			lbl1.setText(newValue);
		}
		
		);
		
		
		lblPlus.setText("+");
		lblEgale.setText("=");
		
		txt2.textProperty().addListener((observable,oldValue,newValue)->
		{
			lbl2.setText(newValue);
		}
		
		);
		
	
		// Location
		txt1.setLayoutX(120);
		txt1.setLayoutY(100);
		txt2.setLayoutX(120);
		txt2.setLayoutY(160);
		lbl1.setLayoutX(120);
		lbl1.setLayoutY(220);
		lblPlus.setLayoutX(160);
		lblPlus.setLayoutY(220);
		lbl2.setLayoutX(200);
		lbl2.setLayoutY(220);
		lblEgale.setLayoutX(240);
		lblEgale.setLayoutY(220);
		lblRep.setLayoutX(280);
		lblRep.setLayoutY(220);
		
		// Afficher
		group.getChildren().add(txt1);
		group.getChildren().add(txt2);
		group.getChildren().add(lbl1);
		group.getChildren().add(lblPlus);
		group.getChildren().add(lbl2);
		group.getChildren().add(lblEgale);
		group.getChildren().add(lblRep);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}

