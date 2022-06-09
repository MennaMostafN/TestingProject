package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import javax.swing.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class signupController
{
    @FXML
    private Button back4;

    @FXML
    private Button confirmsignup;

    @FXML
    private TextField accountnumber;

    @FXML
    private TextField age;

    @FXML
    private TextField password;

    @FXML
    private Label points;
    @FXML
    private TextField username;
    @FXML
    private TextField a1;

    @FXML
    private TextField age1;
    @FXML
    private TextField password1;

    @FXML
    private TextField username1;
    @FXML
    private TextField balance;


    @FXML
    void pressback4(MouseEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("Home.fxml");
    }

    @FXML
    void pressconfirmsignup(MouseEvent event) {
        long startTime = System.currentTimeMillis();
        if(test.PressConfirm(username1.getText(),age1.getText(),a1.getText(),password1.getText(),balance.getText()))
        {
            viewtest.createAlert(Alert.AlertType.INFORMATION,"Expected Andrew  Output" + username1.getText() + "\nExpected 20 : Output: " + age1.getText() + "\nExpected 456 : Output: " + a1.getText() +  "\nExpected 456 : Output: " + password1.getText()  + "\nExpected 6000 : Output: " + balance.getText() + "\nTest passed" ).showAndWait();

        }else {
            viewtest.createAlert(Alert.AlertType.ERROR,"Expected Andrew  Output" + username1.getText() + "\nExpected 20 : Output: " + age1.getText() + "\nExpected 456 : Output: " + a1.getText() +  "\nExpected 456 : Output: " + password1.getText()  + "\nExpected 6000 : Output: " + balance.getText() + "\nInvalid Test" ).showAndWait();
        }
        Main m = new Main();
        try {
            ResultSet rs = null;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "123456");
            Statement stmt = con.createStatement();
            String sql = "INSERT IGNORE INTO client (name, Password, age, AccountNumber, points , ID) VALUES('" + username1.getText() + "','" + password1.getText() + "','" + age1.getText() + "','" + a1.getText() + "','" + 0 + "','0')";
            stmt.executeUpdate(sql);
            m.changeScene("MainPage.fxml");
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Your Account is ready", "confirmation", JOptionPane.PLAIN_MESSAGE);
        long stopTime = System.currentTimeMillis();
        long reactionTime = stopTime - startTime;
        System.out.println("Time Taken by confirm button is " + reactionTime + " ms");
    }


}
