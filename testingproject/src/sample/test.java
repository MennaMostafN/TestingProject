package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.util.Date;

public class test {
    public static boolean login(String username, String password,String text, String H) {
        return username.equals("Mai") && password.equals("123") && text.equals("Login")  && H.equals("MainPage.fxml") ; }
    ;

    public static boolean signup(String text) {
        return text.equals("Sign Up");
    }
    public static boolean PressConfirm(String t1,String t2, String t3,String t4,String t5) {
        return t1.equals("Andrew") && t2.equals("20") && t3.equals("456") && t4.equals("456") && t5.equals("6000") ;
    }

    ;

    public static boolean BuyItems(String text, String H) {
        return text.equals("Buy Items") && H.equals("BuyItem.fxml");
    }


    public static boolean PayBills(String text, String H) {
        return text.equals("Pay Bills")  && H.equals("PayBills.fxml");
    }


    public static boolean ShowStatements(String text, String H) {
        return text.equals("Show Statements") && H.equals("showstatements.fxml");
    }


    public static boolean TransferMoney(String text, String H) {
        return text.equals("Transfer Money") && H.equals("TransferMoney.fxml");
    }


    public static boolean ShowPoints(Button b1, Label l1) {
        return b1.getText().equals("Show points") && l1.isVisible() && l1.getText().equals("6000");
    }


    public static boolean Certificates(Button b1, TextField b2) {
        return b1.getText().equals("Confirm") && b2.getText().equals("500");
    }


    public static boolean ConfirmPay(String t1, String t2) {
        return t1.equals("123") && t2.equals("456");
    }

    ;

    public static boolean Redeem(Button b1) {
        return b1.getText().equals("Redeem");
    }

    public static boolean ShowPoints(Button b1, Label s1, Label s2, Label s3, Label amount1, Label amount2, Label amount3) {
        return b1.getText().equals("show statements") && s1.isVisible() && s1.getText().equals("Statement Saving Account") && s2.isVisible() && s2.getText().equals("Credit Card") && s3.isVisible() && s3.getText().equals("Saving Certificate") && amount1.isVisible() && amount1.getText().equals("4000") && amount2.isVisible() && amount2.getText().equals("3690") && amount3.isVisible() && amount3.getText().equals("10,000");
    }

    ;

    public static boolean Confirm1(Button b1) {
        return b1.getText().equals("Confirm");
    }

    ;

    public static boolean pay1(TextField text, TextField text2, TextField text3) {
        return text.getText().equals("123") && text2.getText().equals("456") && text3.getText().equals("2500");
    }
//    public static boolean Login1(Button b1) {
//        return
//    }



    public void start(Stage stage) throws Exception {
        Parent mainNode = FXMLLoader.load(Main.class.getClassLoader().getResource("Home.fxml"));
        stage.setScene(new Scene(mainNode));
        stage.show();
        stage.toFront();
    }
    public static boolean testna2la(Button b1,Button b2)
    {
        Scene  s = b1.getScene();
        Scene  s2 = b2.getScene();
        System.out.println(s);
        System.out.println(s2);
        return s.equals(s2);
    }
    public static boolean trial(String h)
    {
        return h.equals("MainPage.fxml");
    }
    public static boolean back(String h)
    {
        return h.equals("Home.fxml");
    }
    public static boolean back1(String h)
    {
        return h.equals("MainPage.fxml");
    }




}

