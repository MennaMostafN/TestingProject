package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javax.swing.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PayBillsController {
    @FXML
    private Button back;

    @FXML
    private Label bill1;

    @FXML
    private Label bill2;

    @FXML
    private Label bill3;

    @FXML
    private Label bill4;

    @FXML
    private TextField P1;

    @FXML
    private TextField P2;

    @FXML
    private RadioButton r1;

    @FXML
    private RadioButton r2;

    @FXML
    private RadioButton r3;

    @FXML
    private RadioButton r4;

    @FXML
    void pressback(MouseEvent event) throws IOException {
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
    void pressbills(MouseEvent event) throws IOException {
        long startTime = System.currentTimeMillis();

        if(test.ConfirmPay(P1.getText(),P2.getText()))
        {
            viewtest.createAlert(Alert.AlertType.INFORMATION,"Expected 123 Output " + P1.getText() + "\nExpected 456 Output " + P2.getText() + "\nTest passed").showAndWait();

        }else {
            viewtest.createAlert(Alert.AlertType.ERROR,"Expected 123 Output " + P1.getText() + "\nExpected 456 Output " + P2.getText() + "\nInvalid Test").showAndWait();
        }
        if (r1.isSelected())
        {
            r1.setVisible(false);
            bill1.setVisible(false);
            JOptionPane.showMessageDialog(null, "Your Installment loans payment is confirmed", "Confirmation", JOptionPane.PLAIN_MESSAGE);
        }
        if (r2.isSelected())
        {
            r2.setVisible(false);
            bill2.setVisible(false);
            JOptionPane.showMessageDialog(null, "Your Installment loans payment is confirmed", "Confirmation", JOptionPane.PLAIN_MESSAGE);

        }
        if (r3.isSelected())
        {
            r3.setVisible(false);
            bill3.setVisible(false);
            JOptionPane.showMessageDialog(null, "Your Cable bills payment is confirmed", "Confirmation", JOptionPane.PLAIN_MESSAGE);

        }
        if (r4.isSelected())
        {
            r4.setVisible(false);
            bill4.setVisible(false);
            JOptionPane.showMessageDialog(null, "Your Cable bills payment is confirmed", "Confirmation", JOptionPane.PLAIN_MESSAGE);

        }
          long stopTime = System.currentTimeMillis();
        long reactionTime = stopTime - startTime;
        System.out.println("Time Taken by press bills button is " + reactionTime + " ms");
    }

}
