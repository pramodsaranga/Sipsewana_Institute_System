package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginFormController {
    public TextField txtUserName;
    public PasswordField txtPassword;
    public AnchorPane loginContext;


    public void openAdminForm(ActionEvent actionEvent) throws IOException {
        if (txtUserName.getText().equalsIgnoreCase("Saranga") && txtPassword.getText().equals("1998")) {
            URL resource = getClass().getResource("../view/AdminForm.fxml");
            Parent load = FXMLLoader.load(resource);
            loginContext.getChildren().clear();
            loginContext.getChildren().add(load);
        } else if(txtUserName.getText().equalsIgnoreCase("Sathya") && txtPassword.getText().equals("1999")){
            URL resource = getClass().getResource("../view/AdminForm.fxml");
            Parent load = FXMLLoader.load(resource);
            loginContext.getChildren().clear();
            loginContext.getChildren().add(load);
        }
    }

    public void openHomeFormOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) loginContext.getScene().getWindow();
        window.setScene(new Scene(load));

    }

    public void openAboutFormOnAction(ActionEvent actionEvent) {
    }
}
