package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class StudentDetailsFormController {
    public AnchorPane studentDetailsContext;
    public TableView tblStudent;
    public TableColumn colStudentId;
    public TableColumn colFullName;
    public TableColumn colAddress;
    public TableColumn coBirthday;
    public TableColumn colAge;
    public TableColumn colGender;
    public TableColumn colPhoneNumber;
    public TableColumn colEducation;
    public Label txtDate;
    public Label txtTime;

    public void openAdminFormOnAction(ActionEvent actionEvent) {
    }
}
