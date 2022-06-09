package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    @FXML
    private PasswordField password;

    @FXML
    private TextField username;


    @FXML
    private Button loginbutton;
    private test userTest;

    @FXML
    private Button signupbutton;

    @FXML
    private Label L1;

    @FXML
    private Label L2;

    @FXML
    void presslogin(MouseEvent event) throws IOException {
        long startTime = System.currentTimeMillis();
        String H = "MainPage.fxml";
        String Username = username.getText();
        String Password = password.getText();
        if(test.login(Username,Password,loginbutton.getText(),H))
        {
            viewtest.createAlert(Alert.AlertType.INFORMATION,"Expected Mai  Output: " + Username + "\nExpected 123  Output: " + Password + "\nExpected Login  Output: " + loginbutton.getText() + "\nExpected Main Page Output: " + H + "\nTest passed").showAndWait();

        }else {
            viewtest.createAlert(Alert.AlertType.ERROR,"Expected Mai  Output: " + Username + "\nExpected 123  Output: " + Password + "\nExpected Login  Output: " + loginbutton.getText()+ "\nExpected Main Page Output: " + H + "\nInvalid test").showAndWait();
        }
//        if(test.testna2la(loginbutton,signupbutton))
//        {
//            viewtest.createAlert(Alert.AlertType.INFORMATION,"Expected Mai : Output Mariooooo Expected 123 : Output" + Password + "Test passed").showAndWait();
//
//        }else {
//            viewtest.createAlert(Alert.AlertType.ERROR,"Marioooooooooooooooo Birthday Boy").showAndWait();
//        }
//        if(test.trial(H))
//        {
//            viewtest.createAlert(Alert.AlertType.INFORMATION,"Expected Main Page Output: " + H + "Test passed").showAndWait();
//
//        }else {
//            viewtest.createAlert(Alert.AlertType.ERROR,"invalid").showAndWait();
//        }
        if (username.getText().isEmpty() || password.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "The username or password is empty", "Why Empty", JOptionPane.PLAIN_MESSAGE);
        }
        else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "123456");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from client where name = '" + username.getText() + "' and Password = '" + password.getText() + "'");
                while (rs.next())
                {
                    Main m = new Main();
                    m.changeScene(H);
                }
                stmt.executeUpdate("update client set id = '1' where name = '" + username.getText() + "'");
                con.close();
            }
            catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
 long stopTime = System.currentTimeMillis();
 long reactionTime = stopTime - startTime;
 System.out.println("Time Taken by login button is " + reactionTime + " ms");
    }

    @FXML
    void presssignup(MouseEvent event) throws IOException {
        long startTime = System.currentTimeMillis();
        String text1 = signupbutton.getText();
        if(test.signup(text1))
        {
            viewtest.createAlert(Alert.AlertType.INFORMATION,"Expected SignUp : Output" + text1 + "Test passed").showAndWait();

        }else {
            viewtest.createAlert(Alert.AlertType.ERROR,"invalidSignUp").showAndWait();
        }
        Main m = new Main();
        m.changeScene("SignUp.fxml");
        long stopTime = System.currentTimeMillis();
        long reactionTime = stopTime - startTime;
        System.out.println("Time Taken by sign up button is " + reactionTime + " ms");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        userTest = new test();
    }
}
