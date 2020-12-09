package com.example.todolist;

import com.example.todolist.datamodel.TodoData;
import com.example.todolist.datamodel.TodoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<TodoItem> todoItems;

    @FXML //annotate it with @FXML
    private ListView<TodoItem> todoListView;
    @FXML
    private TextArea itemsDetailsTextArea;
    @FXML
    private Label deadlineLabel;

    public void initialize() {
//        TodoItem item1 = new TodoItem("Mail birthday card", "Buy a 30th birthday card for John",
//                LocalDate.of(2020, Month.FEBRUARY, 7));
//        TodoItem item2 = new TodoItem("Doctor's appointment", "See doctor Smith at 123 Main Street",
//                LocalDate.of(2020, Month.MARCH, 23));
//        TodoItem item3 = new TodoItem("Finish design proposal for client", "I promised Mike I'd email website by Friday 22nd April",
//                LocalDate.of(2020, Month.APRIL, 3));
//        TodoItem item4 = new TodoItem("Pick up Doug at train station", "Doug is arriving on March 23 on the 5:00 train",
//                LocalDate.of(2020, Month.JANUARY, 1));
//        TodoItem item5 = new TodoItem("Pick up dry cleaning", "Clothes should be ready by wednesday",
//                LocalDate.of(2020, Month.APRIL, 20));
//
//        todoItems = new ArrayList<>();
//        todoItems.add(item1);
//        todoItems.add(item2);
//        todoItems.add(item3);
//        todoItems.add(item4);
//        todoItems.add(item5);
//
//        TodoData.getInstance().setTodoItems(todoItems);

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

    public void handleClickListView(){
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
        itemsDetailsTextArea.setText(item.getDetails());
        deadlineLabel.setText(item.getDeadLine().toString());
//        System.out.println("The selected item is " + item);
//        StringBuilder sb = new StringBuilder(item.getDetails());
//        sb.append("\n\n\n");
//        sb.append("Due: ");
//        sb.append(item.getDeadLine().toString());
//        itemsDetailsTextArea.setText(sb.toString());

    }
}
