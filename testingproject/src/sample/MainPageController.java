package sample;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.io.IOException;

public class MainPageController {
    @FXML
    private Button Back5;

    @FXML
    private Button buyitems;

    @FXML
    private Button paybills;

    @FXML
    private Button showstatements;

    @FXML
    private Button transfermoney;

    @FXML
    void pressback5(MouseEvent event) throws IOException {
        long startTime = System.currentTimeMillis();
        String H = "Home.fxml";
        if(test.back(H))
        {
            viewtest.createAlert(Alert.AlertType.INFORMATION, "\nExpected switching scene to 'Home' Output: " + H  + "\nTest passed").showAndWait();

        }else {
            viewtest.createAlert(Alert.AlertType.ERROR,"\nExpected switching scene to 'Home' Output: " + H  + "\nInvalid Test").showAndWait();
        }
        Main m = new Main();
        m.changeScene("Home.fxml");
        long stopTime = System.currentTimeMillis();
        long reactionTime = stopTime - startTime;
        System.out.println("Time Taken by back button is " + reactionTime + " ms");
    }

    @FXML
    void pressbuyitems(MouseEvent event) throws IOException {
        long startTime = System.currentTimeMillis();
        String H = "BuyItem.fxml";
        String text1 = buyitems.getText();
        if(test.BuyItems(text1,H))
        {
            viewtest.createAlert(Alert.AlertType.INFORMATION,"Expected buy items Output " + text1 + "\nExpected switching scene to 'BuyItem' Output: " + H  + "\nTest passed").showAndWait();

        }else {
            viewtest.createAlert(Alert.AlertType.ERROR,"Expected buy items  Output " + text1 + "\nExpected switching scene to 'BuyItem' Output: " + H  + "\nInvalid Test").showAndWait();
        }
        Main m = new Main();
        m.changeScene("BuyItem.fxml");
        long stopTime = System.currentTimeMillis();
        long reactionTime = stopTime - startTime;
        System.out.println("Time Taken by buy items button is " + reactionTime + " ms");
    }

    @FXML
    void presspaybills(MouseEvent event) throws IOException {
        long startTime = System.currentTimeMillis();
        String H = "PayBills.fxml";
        String text1 = paybills.getText();
        if(test.PayBills(text1,H))
        {
            viewtest.createAlert(Alert.AlertType.INFORMATION,"Expected pay bills  Output " + text1 + "\nExpected switching scene to 'PayBill' Output: " + H + "\nTest passed").showAndWait();

        }else {
            viewtest.createAlert(Alert.AlertType.ERROR,"Expected pay bills  Output " + text1 + "\nExpected switching scene to 'PayBill' Output: " + H + "\nInvalid Test").showAndWait();
        }
        Main m = new Main();
        m.changeScene("PayBills.fxml");
        long stopTime = System.currentTimeMillis();
        long reactionTime = stopTime - startTime;
        System.out.println("Time Taken by pay bills button is " + reactionTime + " ms");
    }

    @FXML
    void pressshowstatements(MouseEvent event) throws IOException {
        long startTime = System.currentTimeMillis();
        String H = "showstatements.fxml";
        String text1 = showstatements.getText();
        if(test.ShowStatements(text1,H))
        {
            viewtest.createAlert(Alert.AlertType.INFORMATION,"Expected show statements Output " + text1 +"\nExpected switching scene to 'showstatements' \nOutput: " + H + "\nTest passed").showAndWait();

        }else {
            viewtest.createAlert(Alert.AlertType.ERROR,"Expected show statements Output " + text1 +"\nExpected switching scene to 'showstatements' \nOutput: " + H + "\nInvalid Test").showAndWait();
        }
        Main m = new Main();
        m.changeScene("showstatements.fxml");
        long stopTime = System.currentTimeMillis();
        long reactionTime = stopTime - startTime;
        System.out.println("Time Taken by show statements button is " + reactionTime + " ms");
    }

    @FXML
    void presstransfermoney(MouseEvent event) throws IOException {
        long startTime = System.currentTimeMillis();
        String H = "TransferMoney.fxml";
        String text1 = transfermoney.getText();
        if(test.TransferMoney(text1,H))
        {
            viewtest.createAlert(Alert.AlertType.INFORMATION,"Expected transfer money Output " + text1 + "\nExpected switching scene to 'TransferMoney' \nOutput: " + H + "\nTest passed").showAndWait();

        }else {
            viewtest.createAlert(Alert.AlertType.ERROR,"Expected transfer money \nOutput " + text1 + "\nExpected switching scene to 'TransferMoney' \nOutput: " + H + "\nInvalid Test").showAndWait();
        }
        Main m = new Main();
        m.changeScene("TransferMoney.fxml");
        long stopTime = System.currentTimeMillis();
        long reactionTime = stopTime - startTime;
        System.out.println("Time Taken by transfer money button is " + reactionTime + " ms");
    }

}
