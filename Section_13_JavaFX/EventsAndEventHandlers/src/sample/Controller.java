package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
//handles user input
public class Controller {
    @FXML
    private TextField nameField;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;

    @FXML
    public void initialize() {
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }

    @FXML
    public void onButtonClicked(ActionEvent e){
        if (e.getSource().equals(helloButton)) {
            System.out.println("Hello, " + nameField.getText());
        } else if (e.getSource().equals(byeButton)) {
            System.out.println("Bye, " + nameField.getText());
        }
//        System.out.println("Hello, " + nameField.getText());
//        System.out.println("The following button was pressed: " + e.getSource());
    }

    @FXML
    public void handleKeyReleased(){
        String text = nameField.getText();
        boolean disableButton = text.isBlank() || text.trim().isEmpty();
        helloButton.setDisable(disableButton);
        byeButton.setDisable(disableButton);
    }
}
