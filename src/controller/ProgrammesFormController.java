package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ProgrammesFormController {
    public AnchorPane programmeContext;
    public TextField txtProgramName;
    public Button btnAdd;
    public TableView tblProgram;
    public TableColumn colProgramId;
    public TableColumn colProgramName;
    public TableColumn colDuration;
    public TableColumn colFee;
    public Button btnUpdate;
    public Button btnRemove;
    public TextField txtId;
    public Label txtDate;
    public Label txtTime;
    public TextField txtDuration;
    public TextField txtFee;
    public JFXTextField txtSearch;

    public void programNameOnAction(ActionEvent actionEvent) {
    }

    public void addOnAction(ActionEvent actionEvent) {
    }

    public void UpdateOnAction(ActionEvent actionEvent) {
    }

    public void removeOnAction(ActionEvent actionEvent) {
    }

    public void idOnAction(ActionEvent actionEvent) {
    }

    public void openAdminFormOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) programmeContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void durationOnAction(ActionEvent actionEvent) {
    }

    public void feeOnAction(ActionEvent actionEvent) {
    }

    public void Student_KeyReleased(KeyEvent keyEvent) {
    }
}
