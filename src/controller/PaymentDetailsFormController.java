package controller;

import bo.BoFactory;
import bo.custom.ProgramBO;
import bo.custom.RegisterBO;
import bo.custom.StudentBO;
import entity.Registration;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import view.tm.RegisterTM;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class PaymentDetailsFormController {

    private final RegisterBO registerBO = (RegisterBO) BoFactory.getBOFactory().getBO(BoFactory.BoTypes.REGISTER);
    private final StudentBO studentBO = (StudentBO) BoFactory.getBOFactory().getBO(BoFactory.BoTypes.STUDENT);
    private final ProgramBO programBO = (ProgramBO) BoFactory.getBOFactory().getBO(BoFactory.BoTypes.PROGRAM);

    public AnchorPane paymentDetailsContext;
    public TableColumn colRegisterId;
    public TableColumn colStudentId;
    public TableColumn colStudentName;
    public TableColumn colPayment;

    public Label txtDate;

    public Label txtTime;
    public TableView tblRegisterList;
    public TableColumn colAddress;

    public void initialize() {
        loadDateAndTime();

        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colRegisterId.setCellValueFactory(new PropertyValueFactory<>("registerId"));
        colStudentId.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        colStudentName.setCellValueFactory(new PropertyValueFactory<>("studentName"));
        colPayment.setCellValueFactory(new PropertyValueFactory<>("payment"));

        colAddress.setStyle("-fx-border-color: #58B19F;-fx-table-cell-border-color:#58B19F;");
        colRegisterId.setStyle("-fx-border-color: #58B19F;-fx-table-cell-border-color:#58B19F;");
        colPayment.setStyle("-fx-border-color: #58B19F;-fx-table-cell-border-color:#58B19F;");
        colStudentId.setStyle("-fx-border-color: #58B19F;-fx-table-cell-border-color:#58B19F;");
        colStudentName.setStyle("-fx-border-color: #58B19F;-fx-table-cell-border-color:#58B19F;");
        try {
            loadAllDetails();
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }

    private void loadAllDetails() throws SQLException, ClassNotFoundException {
        tblRegisterList.getItems().clear();
        ObservableList<RegisterTM> observableList= FXCollections.observableArrayList();
        List<Registration> allRegisters = registerBO.getAllForAll();

        for (Registration temp : allRegisters){
            observableList.add(new RegisterTM(
                    temp.getRegisterId(),
                    temp.getStudent().getStudentId(),
                    temp.getStudent().getStudentName(),
                    temp.getStudent().getAddress(),
                    temp.getPayment()
            ));
        }
        tblRegisterList.setItems(observableList);
    }

    private void loadDateAndTime() {
        Date date = new Date();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        txtDate.setText(f.format(date));

        Timeline time = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            LocalTime currentTime = LocalTime.now();
            txtTime.setText(
                    currentTime.getHour() + " : " + currentTime.getMinute() + " : " + currentTime.getSecond()
            );
        }),
                new KeyFrame(Duration.seconds(1))
        );
        time.setCycleCount(Animation.INDEFINITE);
        time.play();
    }
    public void openAdminFormOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) paymentDetailsContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
