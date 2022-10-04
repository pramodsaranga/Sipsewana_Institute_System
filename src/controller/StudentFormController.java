package controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
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

public class StudentFormController {
    public AnchorPane studentContext;
    public TextField txtAddress;
    public Button btnAdd;
    public TableView tblStudent;
    public TableColumn colStudentId;
    public TableColumn colFullName;
    public TableColumn colAddress;
    public TableColumn coBirthday;
    public TableColumn colAge;
    public TableColumn colGender;
    public TableColumn colPhoneNumber;
    public TableColumn colEducation;
    public Button btnUpdate;
    public Button btnRemove;
    public TextField txtId;
    public Label txtDate;
    public Label txtTime;
    public TextField txtFullName;
    public TextField txtPhoneNumber;
    public JFXDatePicker dpBirthday;
    public TextField txtAge;
    public JFXComboBox cmbGender;
    public JFXTextField txtSearch;
    public TextField txtEducation;

    public void addressOnAction(ActionEvent actionEvent) {
    }

    public void AddStudentOnAction(ActionEvent actionEvent) {
    }

    public void UpdateOnAction(ActionEvent actionEvent) {
    }

    public void RemoveOnAction(ActionEvent actionEvent) {
    }

    public void idOnAction(ActionEvent actionEvent) {
    }

    public void openAdminFormOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) studentContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void fullNameOnAction(ActionEvent actionEvent) {
    }

    public void phoneOnAction(ActionEvent actionEvent) {
    }

    public void birthDayOnAction(ActionEvent actionEvent) {
    }

    public void ageOnAction(ActionEvent actionEvent) {
    }

    public void genderOnAction(ActionEvent actionEvent) {
    }

    public void Student_KeyReleased(KeyEvent keyEvent) {
    }

    public void educationOnAction(ActionEvent actionEvent) {
    }
}
