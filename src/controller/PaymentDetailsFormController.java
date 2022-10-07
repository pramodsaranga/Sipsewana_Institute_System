package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class PaymentDetailsFormController {
    public AnchorPane paymentDetailsContext;
    public TableView tblList;
    public TableColumn colRegisterId;
    public TableColumn colStudentId;
    public TableColumn colProgramId;
    public TableColumn colStudentName;
    public TableColumn colProgramName;
    public TableColumn colPayment;

    public Label txtDate;

    public Label txtTime;

    public void openAdminFormOnAction(ActionEvent actionEvent) {
    }
}
