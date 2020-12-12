package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

// The event handler runs on the UI thread
public class Controller {
    @FXML
    private TextField nameField;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;
    @FXML
    private CheckBox ourCheckBox;
    @FXML
    private Label ourLabel;

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

        Runnable task = new Runnable() { // Runnable is an
            // interface classes implement when their instances will be executed on a thread
            @Override
            public void run() { //setting up and running the code on the background(no longer on the UI thread)
                try {
                    String s = Platform.isFxApplicationThread() ? "UI Thread" : "Background Thread";
                    System.out.println("I'm going to sleep on the " + s);
                    Thread.sleep(10000);
                    Platform.runLater(new Runnable() { // forcing the application to run the code on the same UI thread
                        @Override
                        public void run() {
                            String s = Platform.isFxApplicationThread() ? "UI Thread" : "Background Thread";
                            System.out.println("I'm updating the label on the " + s);
                            ourLabel.setText("We did something!");
                        }
                    });
                } catch (InterruptedException event) {
                    //we don't care about this
                }
            }
        }; //code to define the task

        new Thread(task).start(); // code to run the task
//        try{
//            Thread.sleep(10000); // making the UI thread sleep for 10 seconds to simulate the Lockup Situation(ui freezing)
//        } catch (InterruptedException event) {
//            // we don't care about this
//        }
        if (ourCheckBox.isSelected()) { // if the CheckBox is selected
            nameField.clear(); // clear the TextField
            helloButton.setDisable(true);
            byeButton.setDisable(true);
        }
    }

    @FXML
    public void handleKeyReleased(){
        String text = nameField.getText();
        boolean disableButton = text.isBlank() || text.trim().isEmpty();
        helloButton.setDisable(disableButton);
        byeButton.setDisable(disableButton);
    }

    public void handleChange() {
        System.out.println("The checkbox is " + (ourCheckBox.isSelected() ? "checked" : "not checked"));
    }
















}
