package sample;

import javafx.fxml.FXML;

import javax.swing.*;

import java.io.IOException;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;



public class TransferMoneyController implements Initializable {
    @FXML
    private TextField amount;

    @FXML
    private Button back1;

    @FXML
    private Button confirmButton;

    @FXML
    private DatePicker date;

    @FXML
    private TextField pay;

    @FXML
    private TextField payto;
private test t;
    @FXML
    void pressback1(MouseEvent event) throws IOException {
        long startTime = System.currentTimeMillis();
        String H = "MainPage.fxml";
        if(test.back1(H))
        {
            viewtest.createAlert(Alert.AlertType.INFORMATION, "\nExpected switching scene to 'MainPage' Output: " + H  + "\nTest passed").showAndWait();

        }else {
            viewtest.createAlert(Alert.AlertType.ERROR,"\nExpected switching scene to 'MainPage' Output: " + H  + "\nInvalid Test").showAndWait();
        }
        Main m = new Main();
        m.changeScene("MainPage.fxml");
        long stopTime = System.currentTimeMillis();
        long reactionTime = stopTime - startTime;
        System.out.println("Time Taken by back button is " + reactionTime + " ms");
    }
    @FXML
    void pressconfirmButton(MouseEvent event) {
        long startTime = System.currentTimeMillis();
        System.out.println(pay.getText());
        if(t.pay1(pay,payto,amount))
        {
            viewtest.createAlert(Alert.AlertType.INFORMATION,"Expected 123 : Output" + pay.getText() + "\nExpected 456  Output " + payto.getText() + "\nExpected 2500 Output " + pay.getText() + "\nTest passed").showAndWait();

        }else {
            viewtest.createAlert(Alert.AlertType.ERROR,"Expected 123 : Output" + pay.getText() + "\nExpected 456  Output " + payto.getText() + "\nExpected 2500 Output " + pay.getText() + "\nInvalid Test").showAndWait();
        }
        JOptionPane.showMessageDialog(null, "Your transfer is confirmed", "confirmation", JOptionPane.PLAIN_MESSAGE);
        if(t.Confirm1(confirmButton))
        {
            viewtest.createAlert(Alert.AlertType.INFORMATION,"Expected Confirm: Output: " + confirmButton.getText() + " Test passed" ).showAndWait();

        }else {
            viewtest.createAlert(Alert.AlertType.ERROR,"invalid").showAndWait();
        }
        long stopTime = System.currentTimeMillis();
        long reactionTime = stopTime - startTime;
        System.out.println("Time Taken by confirm button is " + reactionTime + " ms");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        t = new test();
    }
}
