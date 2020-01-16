package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MultiplicationController {
	private Stage primaryStage;
	public TextField textField;
	public Button Multiply;
	public Label textLabel;
	public TextField num1;
	public TextField num2;
	public TextField num3;
	public TextField num4;
	public TextField mnum1;
	public TextField mnum2;
	public TextField mnum3;
	public TextField mnum4;

	public Label isConnected;
	Stage dialogStage = new Stage();
	Scene scene;

	public static void result(String num1, String num2, String title, String num3, String num4) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText(
				"\t\t\t\t\t[ " + num1 + "      " + num2 + " ]" + "\n\n\t\t\t\t\t[ " + num3 + "      " + num4 + " ]");

		alert.setTitle(title);
		alert.setHeaderText(null);
		alert.showAndWait();

	}

	private void checkIfAllInputesAreEntered() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Faild");

		// Header Text: null
		alert.setHeaderText(null);
		alert.setContentText("You need to enter all the inputes");

		alert.showAndWait();
	}

	public void button(ActionEvent actionEvent) throws SQLException {
		textLabel.setText(textField.getText());
		System.out.println("Program is running");
	}

	public void Multiply(ActionEvent event) throws IOException {
		System.out.println("This is the value " + num1.getText());
		if (!num1.getText().equals("") && !num2.getText().equals("") && !num3.getText().equals("")
				&& !num4.getText().equals("") &&

				!mnum1.getText().equals("") && !mnum2.getText().equals("") && !mnum3.getText().equals("")
				&& !mnum4.getText().equals("")) {

			String n1 = num1.getText();
			String mn1 = mnum1.getText();
			String n2 = num2.getText();
			String mn3 = mnum3.getText();
			String mn2 = mnum2.getText();
			String mn4 = mnum4.getText();
			String n3 = num3.getText();
			String n4 = num4.getText();

			int num1 = (Integer.parseInt(n1) * Integer.parseInt(mn1)) + (Integer.parseInt(n2) * Integer.parseInt(mn3));
			int num2 = (Integer.parseInt(n1) * Integer.parseInt(mn2)) + (Integer.parseInt(n2) * Integer.parseInt(mn4));
			int num3 = (Integer.parseInt(n3) * Integer.parseInt(mn1)) + (Integer.parseInt(n4) * Integer.parseInt(mn3));
			int num4 = (Integer.parseInt(n3) * Integer.parseInt(mn2)) + (Integer.parseInt(n4) * Integer.parseInt(mn4));

			result(Integer.toString(num1), Integer.toString(num2), "Result", Integer.toString(num3),
					Integer.toString(num4));
		} else {
			checkIfAllInputesAreEntered();

		}

	}
}
