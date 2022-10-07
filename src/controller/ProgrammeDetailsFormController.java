package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ProgrammeDetailsFormController {
    public AnchorPane programDetailsContext;
    public TableView tblProgram;
    public TableColumn colProgramId;
    public TableColumn colProgramName;
    public TableColumn colDuration;
    public TableColumn colFee;
    public Label txtDate;
    public Label txtTime;

    public void openAdminFormOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) programDetailsContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
