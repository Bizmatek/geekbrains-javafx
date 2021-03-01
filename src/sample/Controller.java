package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {
    @FXML
    public TextArea textArea;
    @FXML
    public TextField textField;

    public void onBtnClick(ActionEvent actionEvent) {
        sendMessage();
    }

    public void onPressEnter(KeyEvent keyEvent) {
        if (keyEvent.getCode().equals(KeyCode.ENTER)) {
            sendMessage();
        }
    }

    public void sendMessage() {
        if (!textField.getText().equals("")) {
            textArea.appendText(textField.getText() + "\n");
            textField.clear();
            textField.requestFocus();
        }
    }
}
