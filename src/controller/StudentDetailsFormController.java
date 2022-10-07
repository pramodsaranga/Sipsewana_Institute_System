package controller;

import bo.BoFactory;
import bo.custom.StudentBO;
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
import view.tm.StudentTM;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class StudentDetailsFormController {

    private final StudentBO studentBO = (StudentBO) BoFactory.getBOFactory().getBO(BoFactory.BoTypes.STUDENT);
    public AnchorPane studentDetailsContext;
    public TableView tblStudent;
    public TableColumn colStudentId;
    public TableColumn colFullName;
    public TableColumn colAddress;
    public TableColumn colBirthday;
    public TableColumn colAge;
    public TableColumn colGender;
    public TableColumn colPhoneNumber;
    public TableColumn colEducation;

    public Label txtDate;

    public Label txtTime;

    public void initialize() throws SQLException, ClassNotFoundException {
        setItemsToTable(studentBO.getAll());
        loadDateAndTime();

        colStudentId.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        colFullName.setCellValueFactory(new PropertyValueFactory<>("studentName"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colBirthday.setCellValueFactory(new PropertyValueFactory<>("birthday"));
        colAge.setCellValueFactory(new PropertyValueFactory<>("age"));
        colGender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        colPhoneNumber.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        colEducation.setCellValueFactory(new PropertyValueFactory<>("education"));

        colStudentId.setStyle("-fx-border-color:  #58B19F;-fx-table-cell-border-color: #58B19F;");
        colFullName.setStyle("-fx-border-color:  #58B19F;-fx-table-cell-border-color: #58B19F;");
        colAddress.setStyle("-fx-border-color:  #58B19F;-fx-table-cell-border-color: #58B19F;");
        colBirthday.setStyle("-fx-border-color:  #58B19F;-fx-table-cell-border-color: #58B19F;");
        colAge.setStyle("-fx-border-color:  #58B19F;-fx-table-cell-border-color: #58B19F;");
        colGender.setStyle("-fx-border-color:  #58B19F;-fx-table-cell-border-color: #58B19F;");
        colPhoneNumber.setStyle("-fx-border-color:  #58B19F;-fx-table-cell-border-color: #58B19F;");
        colEducation.setStyle("-fx-border-color:  #58B19F;-fx-table-cell-border-color: #58B19F;");
    }

    private void setItemsToTable(ArrayList<StudentTM> student) {
        ObservableList<StudentTM> obList = FXCollections.observableArrayList();
        student.forEach(e -> {
            obList.add(
                    new StudentTM(e.getStudentId(),e.getStudentName(),e.getAddress(),e.getBirthday(),e.getAge(),e.getGender(),e.getPhoneNumber(),e.getEducation()));
        });
        tblStudent.setItems(obList);
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
        Stage window = (Stage) studentDetailsContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
