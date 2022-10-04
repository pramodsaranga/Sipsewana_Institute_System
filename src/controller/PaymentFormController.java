package controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class PaymentFormController {
    public AnchorPane paymentContext;
    public TableColumn colRegisterId;
    public TableColumn colStudentId;
    public TableColumn colProgramId;
    public TableColumn colStudentName;
    public TableColumn colProgramName;
    public TableColumn colPayment;
    public TableView tblList;
    public Label lblTotal;
    public TextField txtRegisterId;
    public JFXComboBox cmbStudentId;
    public JFXTextField txtStudentName;
    public JFXTextField txtAddress;
    public JFXTextField txtEducation;
    public JFXTextField txtBirthday;
    public JFXTextField txtAge;
    public JFXTextField txtGender;
    public JFXTextField txtPhoneNumber;
    public JFXComboBox cmbProgramId;
    public JFXTextField txtProgramName;
    public JFXTextField txtDuration;
    public JFXTextField txtFee;
    public Label txtDate;
    public Label txtTime;

    public void addToTableOnAction(ActionEvent actionEvent) {
    }

    public void confirmOnAction(ActionEvent actionEvent) {
    }

    public void openAdminFormOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) paymentContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
