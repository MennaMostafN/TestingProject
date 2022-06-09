package sample;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javax.swing.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BuyItemsController {
    @FXML
    private Button back3;

    @FXML
    private Label p;

    @FXML
    private RadioButton radio1;

    @FXML
    private RadioButton radio2;

    @FXML
    private RadioButton radio3;

    @FXML
    private Button redeem;

    @FXML
    private Button showpoints;
    @FXML
    private RadioButton c1;

    @FXML
    private RadioButton c2;
    @FXML
    private TextField certificateAmount;


    @FXML
    private Button confirm;
    @FXML
    void pressconfirm(MouseEvent event) {
        long startTime = System.currentTimeMillis();
        if(test.Certificates(confirm,certificateAmount))
        {
            viewtest.createAlert(Alert.AlertType.INFORMATION,"Expected Confirm Output: " + confirm.getText() + "\n Expected 500  Output: " + certificateAmount.getText() + "\nTest passed").showAndWait();

        }else {
            viewtest.createAlert(Alert.AlertType.ERROR,"invalid test").showAndWait();
        }
        if (c1.isSelected())
        {
            JOptionPane.showMessageDialog(null, "Your " + c1.getText() + " purchase is confirmed", "confirmation", JOptionPane.PLAIN_MESSAGE);
        }
        if (c2.isSelected())
        {
            JOptionPane.showMessageDialog(null, "Your " + c2.getText() + " purchase is confirmed", "confirmation", JOptionPane.PLAIN_MESSAGE);
        }
        String Username = certificateAmount.getText();

        long stopTime = System.currentTimeMillis();
        long reactionTime = stopTime - startTime;
        System.out.println("Time Taken by confirm button is " + reactionTime + " ms");
    }
    @FXML
    void pressback3(MouseEvent event) throws IOException {
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
    void pressredeem(MouseEvent event) {
        long startTime = System.currentTimeMillis();
        if (radio1.isSelected())
        {

            if(Integer.parseInt(p.getText())>5000)
            {
                try {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "123456");
                    Statement stmt = con.createStatement();
                    stmt.executeUpdate("update client set points = points - '"+5000+"' where id = '1'");
                    JOptionPane.showMessageDialog(null, "Your purchase is confirmed", "Confirmation", JOptionPane.PLAIN_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }else if(Integer.parseInt(p.getText())<=5000)
            {
                JOptionPane.showMessageDialog(null, "Sorry, you don't have enough points", "confirmation", JOptionPane.PLAIN_MESSAGE);

            }
        }
        if (radio2.isSelected())

            if(Integer.parseInt(p.getText())>=1400)
            {
                try {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "123456");
                    Statement stmt = con.createStatement();
                    stmt.executeUpdate("update client set points = points - '"+1400+"' where id = '1'");
                    JOptionPane.showMessageDialog(null, "Your purchase is confirmed", "Confirmation", JOptionPane.PLAIN_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }else if(Integer.parseInt(p.getText())<=1400)
            {
                JOptionPane.showMessageDialog(null, "Sorry, you don't have enough points", "confirmation", JOptionPane.PLAIN_MESSAGE);

            }
        if (radio3.isSelected())
        {
            if(Integer.parseInt(p.getText())>=950)
            {
                try {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "123456");
                    Statement stmt = con.createStatement();
                    stmt.executeUpdate("update client set points = points - '"+950+"' where id = '1'");
                    JOptionPane.showMessageDialog(null, "Your purchase is confirmed", "Confirmation", JOptionPane.PLAIN_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }else if(Integer.parseInt(p.getText())<=950)
            {
                JOptionPane.showMessageDialog(null, "Sorry, you don't have enough points", "confirmation", JOptionPane.PLAIN_MESSAGE);

            }
        }
        if(test.Redeem(redeem))
        {
            viewtest.createAlert(Alert.AlertType.INFORMATION,"Expected Redeem: Output: " + redeem.getText() + " Test passed" ).showAndWait();

        }else {
            viewtest.createAlert(Alert.AlertType.ERROR,"invalid").showAndWait();
        }
        long stopTime = System.currentTimeMillis();
        long reactionTime = stopTime - startTime;
        System.out.println("Time Taken by redeem button is " + reactionTime + " ms");
        }
    @FXML
    void pressr1(MouseEvent event) {
        radio2.setSelected(false);
        radio3.setSelected(false);
    }

    @FXML
    void pressr2(MouseEvent event) {
        radio1.setSelected(false);
        radio2.setSelected(false);
    }

    @FXML
    void pressr3(MouseEvent event) {
        radio1.setSelected(false);
        radio2.setSelected(false);
    }


    @FXML
    void pressc1(MouseEvent event) {
c2.setSelected(false);
    }

    @FXML
    void pressc2(MouseEvent event) {
        c1.setSelected(false);
    }
    @FXML
    void pressshowpoints(MouseEvent event) {
        long startTime = System.currentTimeMillis();
        p.setVisible(true);
        try {
            ResultSet rs = null;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "123456");
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery("select* from client points where ID = '1'");
            while (rs.next()) {
                p.setText(String.valueOf((rs.getString("points"))));
                //p.setText("marioooooooooooooo");
            }
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        if(test.ShowPoints(showpoints, p))
            {
                viewtest.createAlert(Alert.AlertType.INFORMATION,"Expected Show Points: Output" + showpoints.getText() + "Test passed" + "\nExpected Visible : Output: " + p.isVisible()).showAndWait();

            }else {
                viewtest.createAlert(Alert.AlertType.ERROR,"invalid").showAndWait();
            }
        long stopTime = System.currentTimeMillis();
        long reactionTime = stopTime - startTime;
        System.out.println("Time Taken by show points button is " + reactionTime + " ms");
        }

//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "123456");
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("select* from client where id = '1'");
//            while (rs.next()) {
//                points.setText(String.valueOf((rs.getString("points"))));
//            }
//            con.close();
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage());
//        }
    }

