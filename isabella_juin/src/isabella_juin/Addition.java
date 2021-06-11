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
		
		TextField txt1 = new TextField("0");
		TextField txt2 = new TextField("0");
		Label lbl1 = new Label("0");
		Label lblPlus = new Label("+");
		Label lbl2 = new Label("0");
		Label lblEgale = new Label("=");
		Label lblRep = new Label("0");
		

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
		
		
		
		lbl1.textProperty().bind(txt1.textProperty());
		lbl2.textProperty().bind(txt2.textProperty());
		
		
		
		lbl2.textProperty().addListener((observable,oldValue,newValue)->
		{
			if(!newValue.matches("^[0-9](\\.[0-9]+)?$"))
			{
				txt2.setText(newValue.replaceAll("[^\\d\\.]",""));
			}
			
			lblRep.setText(Integer.toString((checkLabel(lbl1))+checkLabel(lbl2)));
			
		});
		
		lbl1.textProperty().addListener((observable,oldValue,newValue)->
		{
			if(!newValue.matches("^[0-9](\\.[0-9]+)?$"))
			{
				txt1.setText(newValue.replaceAll("[^\\d\\.]",""));
			}
			
			lblRep.setText(Integer.toString((checkLabel(lbl1))+checkLabel(lbl2)));
			
		});
		

		// Afficher
		group.getChildren().add(txt1);
		group.getChildren().add(txt2);
		group.getChildren().add(lbl1);
		group.getChildren().add(lblPlus);
		group.getChildren().add(lbl2);
		group.getChildren().add(lblEgale);
		group.getChildren().add(lblRep);
		//group.getChildren().addAll(txt1,txt2,lbl2);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	int checkLabel(Label a)
	{
		int val;
		if(a.getText().equals(""))
			val=0;
		else
			val=Integer.parseInt(a.getText());
		return val;

	}

	public static void main(String[] args) {
		launch(args);
	}
}

