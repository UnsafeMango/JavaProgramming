package com.example.todolist;

import com.example.todolist.datamodel.TodoData;
import com.example.todolist.datamodel.TodoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Controller {
    private List<TodoItem> todoItems;

    @FXML //annotate it with @FXML
    private ListView<TodoItem> todoListView;

    @FXML
    private TextArea itemsDetailsTextArea;

    @FXML
    private Label deadlineLabel;

    @FXML
    private BorderPane mainBorderPane;

    public void initialize() {
//        Adding an event listener
        todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TodoItem>() {
            @Override
            public void changed(ObservableValue<? extends TodoItem> observableValue, TodoItem todoItem, TodoItem t1) {
                if (t1 != null) {
                    TodoItem item = todoListView.getSelectionModel().getSelectedItem();
                    itemsDetailsTextArea.setText(item.getDetails());
                    DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM d, yyyy");
                    deadlineLabel.setText(df.format(item.getDeadLine()));
                }
            }
        });

        todoListView.getItems().setAll(TodoData.getInstance().getTodoItems());
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE); // ensures we can only select one item at a time
        //SelectionModel class tracks which item is selected in a control

        todoListView.getSelectionModel().selectFirst();//selects the first item in the todolist
    }

    public void showNewItemDialog() {
        Dialog<ButtonType> dialog = new ChoiceDialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        try {
            Parent root = FXMLLoader.load(getClass().getResource("todoItemDialog.fxml"));
            dialog.getDialogPane().setContent(root);
        } catch (IOException e) {
            System.out.println("Couldn't load the dialog");
            e.printStackTrace();
            return;
        }
    }

    @FXML
    public void handleClickListView(){
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
        itemsDetailsTextArea.setText(item.getDetails());
        deadlineLabel.setText(item.getDeadLine().toString());
    }
}
