package sample;
import javafx.scene.control.Alert;
public class viewtest {
    public static Alert createAlert(Alert.AlertType type,String content)
    {
        Alert alert = new Alert(type);
        alert.setContentText(content);
        return alert;
    }
}
