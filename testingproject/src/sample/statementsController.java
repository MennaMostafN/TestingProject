package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import javax.swing.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class statementsController {
    @FXML
    private Label Amount1;

    @FXML
    private Label Amount2;

    @FXML
    private Label Amount3;
    @FXML
    private Button back7;

    @FXML
    private Label s1;

    @FXML
    private Label s2;

    @FXML
    private Label s3;
    @FXML
    private Button showstatements;

    @FXML
    void pressStatements(MouseEvent event) {
        long startTime = System.currentTimeMillis();
        Amount1.setVisible(true);
        Amount2.setVisible(true);
        Amount3.setVisible(true);
        s1.setVisible(true);
        s2.setVisible(true);
        s3.setVisible(true);
        if(test.ShowPoints(showstatements,s1,s2,s3,Amount1,Amount2,Amount3))
        {
            viewtest.createAlert(Alert.AlertType.INFORMATION,"Expected show statements: Output" + showstatements.getText()  + "\nExpected Visible : Output: " + s1.getText() + "\nExpected Visible : Output: " + s2.getText()  + "\nExpected Visible : Output: " + s3.getText()  + "\nExpected Visible : Output: " + Amount1.getText()  + "\nExpected Visible : Output: " + Amount2.getText()  + "\nExpected Visible : Output: " + Amount3.getText() +  "\nTest passed").showAndWait();

        }else {
            viewtest.createAlert(Alert.AlertType.ERROR,"Expected show statements: Output" + showstatements.getText()  + "\nExpected Visible : Output: " + s1.getText() + "\nExpected Visible : Output: " + s2.getText()  + "\nExpected Visible : Output: " + s3.getText()  + "\nExpected Visible : Output: " + Amount1.getText()  + "\nExpected Visible : Output: " + Amount2.getText()  + "\nExpected Visible : Output: " + Amount3.getText() +  "\nInvalid Test").showAndWait();
        }
        long stopTime = System.currentTimeMillis();
        long reactionTime = stopTime - startTime;
        System.out.println("Time Taken by press statements button is " + reactionTime + " ms");
    }
    @FXML
    void pressback7(MouseEvent event) throws IOException {
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

}
