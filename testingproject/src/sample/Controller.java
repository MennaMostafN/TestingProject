package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javax.swing.*;

import java.io.IOException;

public class Controller {
    @FXML
    private Button back1;

    @FXML
    private Button confirmButton;

    @FXML
    void pressconfirmButton(MouseEvent event) {
        JOptionPane.showMessageDialog(null, "Your transfer is confirmed", "confirmation", JOptionPane.PLAIN_MESSAGE);
    }

    @FXML
    void prressback1(MouseEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("Home.fxml");
    }
}
