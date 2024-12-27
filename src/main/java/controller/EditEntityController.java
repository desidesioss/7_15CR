package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class EditEntityController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField descriptionField;

    private int entityId;

    @FXML
    private void handleSave() {
        // Валидация
        if (nameField.getText().isEmpty() || descriptionField.getText().isEmpty()) {
            Alert alert = new Alert(AlertType.ERROR, "Please fill in all fields");
            alert.show();
        } else {
            // Логика обновления
            System.out.println("Entity updated: " + nameField.getText());
        }
    }

    @FXML
    private void handleCancel() {
        System.out.println("Edit cancelled");
    }
}
