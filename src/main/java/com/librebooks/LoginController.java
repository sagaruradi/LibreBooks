/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.librebooks;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 * FXML Controller class
 *
 * @author bhavy
 */
public class LoginController implements Initializable {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Add event listeners to trigger login on Enter key press
        usernameField.setOnKeyPressed(this::handleEnterKeyPressed);
        passwordField.setOnKeyPressed(this::handleEnterKeyPressed);
    }

    @FXML
    private void handleLoginButtonAction() {
        // Retrieve the text from the text fields
        String username = usernameField.getText();
        String password = passwordField.getText();
           
         // Check if any field is empty
        if (username.isEmpty() || password.isEmpty()) {
        // Determine which field is empty and show appropriate alert
        String message = "";
        if (username.isEmpty() && password.isEmpty()) {
            message = "Username and password fields cannot be empty.";
        } else if (username.isEmpty()) {
            message = "Username field cannot be empty.";
        } else {
            message = "Password field cannot be empty.";
        }

        // Show an alert if any field is empty
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Login Warning");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
        return; // Exit the method, so login logic is not processed
    }
        

        // Proceed with login logic if both fields are filled
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        // Add your login logic here
    }

    private void handleEnterKeyPressed(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            handleLoginButtonAction();
        }
    }
}

