package com.isPrime;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

//Author Name: Brian Martin

//Date: 4/25/2019
//Program Name: client/server Is Prime Application
//Purpose: The program should do spell checking

public class Client extends Application {
	// IO streams
	DataOutputStream toServer = null;
	DataInputStream fromServer = null;

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Panel p to hold the label and text field
		BorderPane paneForTextField = new BorderPane();
		paneForTextField.setPadding(new Insets(5, 5, 5, 5));
		paneForTextField.setStyle(STYLESHEET_MODENA);
		paneForTextField.setLeft(new Label("Enter a number: "));

		TextField tf = new TextField();
		tf.setAlignment(Pos.BOTTOM_RIGHT);
		paneForTextField.setCenter(tf);

		BorderPane mainPane = new BorderPane();
		// Text area to display contents
		TextArea ta = new TextArea();
		mainPane.setCenter(new ScrollPane(ta));
		mainPane.setTop(paneForTextField);

		// Create a scene and place it in the stage
		Scene scene = new Scene(mainPane, 450, 200);
		primaryStage.setTitle("Client"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

		tf.setOnAction(e -> {
			try {

				// Get the radius from the text field
				int clientInput = Integer.parseInt(tf.getText().trim());

				// Display to the text area
				ta.appendText("Number is: " + clientInput + "\n");

				// Send the radius to the server
				toServer.writeInt(clientInput);
				toServer.flush();

				// If Prime Logic
				int numberFromClientInput = clientInput;
				boolean prime = false;

				for (int i = 2; i <= numberFromClientInput / 2; ++i) {
					if (numberFromClientInput % i == 0) {
						prime = true;
						break;

					}

				}

				if (prime) {
					ta.appendText(numberFromClientInput + " Is not Prime." + '\n');


				} else {
					ta.appendText(numberFromClientInput + " Is Prime." + '\n');


				}

			} catch (IOException ex) {
				System.err.println(ex);
			}
		});

		try {
			// Create a socket to connect to the server
			Socket socket = new Socket("localhost", 8000);

			// Create an input stream to receive data from the server
			fromServer = new DataInputStream(socket.getInputStream());

			// Create an output stream to send data to the server
			toServer = new DataOutputStream(socket.getOutputStream());
		} catch (IOException ex) {
			ta.appendText(ex.toString() + '\n');
		}
	}

	/**
	 * The main method is only needed for the IDE with limited JavaFX support. Not
	 * needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
