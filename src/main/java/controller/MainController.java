package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MainController {

    @FXML
    private TableView<?> tableView;

    @FXML
    private TableColumn<?, ?> nameColumn;

    @FXML
    private TableColumn<?, ?> descriptionColumn;

    @FXML
    private Button createButton;

    @FXML
    private Button editButton;

    @FXML
    private Button deleteButton;

    // Логика для обработки кнопок
    @FXML
    private void handleCreate() {
        System.out.println("Create button clicked");
    }

    @FXML
    private void handleEdit() {
        System.out.println("Edit button clicked");
    }

    @FXML
    private void handleDelete() {
        System.out.println("Delete button clicked");
    }
}
