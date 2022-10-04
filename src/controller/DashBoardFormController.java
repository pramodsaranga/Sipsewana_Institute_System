package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class DashBoardFormController {
    public AnchorPane DashBoardContext;
    public AnchorPane lodeContext;

    public void openLoginFormOnAction(ActionEvent actionEvent) throws IOException {
            URL resource = getClass().getResource("../view/LoginForm.fxml");
            Parent load = FXMLLoader.load(resource);
            lodeContext.getChildren().clear();
            lodeContext.getChildren().add(load);
        }


    public void openHomeFormOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) DashBoardContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void openAboutFormOnAction(ActionEvent actionEvent) {
    }
}
