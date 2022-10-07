package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AdminFormController {
    public AnchorPane adminContext;


    public void openHomeFormOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) adminContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void openAboutFormOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AboutForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) adminContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void openStudentFormOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/StudentForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) adminContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void openProgrammesFormOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ProgrammesForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) adminContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void openPaymentFormOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/PaymentForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) adminContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }


    public void openProgrammeDetailsForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ProgrammeDetailsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) adminContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void openPaymentDetailsForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/PaymentDetailsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) adminContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void openStudentDetailsForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/StudentDetailsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) adminContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
