package controller;

import bo.BoFactory;
import bo.custom.ProgramBO;
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
import view.tm.ProgramTM;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProgrammeDetailsFormController {

    private final ProgramBO programBO = (ProgramBO) BoFactory.getBOFactory().getBO(BoFactory.BoTypes.PROGRAM);
    public AnchorPane programDetailsContext;
    public TableView tblProgram;
    public TableColumn colProgramId;
    public TableColumn colProgramName;
    public TableColumn colDuration;
    public TableColumn colFee;
    public Label txtDate;
    public Label txtTime;

    public void initialize() throws SQLException, ClassNotFoundException {

        colProgramId.setCellValueFactory(new PropertyValueFactory<>("programId"));
        colProgramName.setCellValueFactory(new PropertyValueFactory<>("programName"));
        colDuration.setCellValueFactory(new PropertyValueFactory<>("duration"));
        colFee.setCellValueFactory(new PropertyValueFactory<>("fee"));

        colProgramId.setStyle("-fx-border-color: #58B19F;-fx-table-cell-border-color:#58B19F;");
        colProgramName.setStyle("-fx-border-color: #58B19F;-fx-table-cell-border-color:#58B19F;");
        colDuration.setStyle("-fx-border-color: #58B19F;-fx-table-cell-border-color:#58B19F;");
        colFee.setStyle("-fx-border-color: #58B19F;-fx-table-cell-border-color:#58B19F;");


        setItemsToTable(programBO.getAll());
    }

    private void setItemsToTable(ArrayList<ProgramTM> program) {
        ObservableList<ProgramTM> obList = FXCollections.observableArrayList();
        program.forEach(e -> {
            obList.add(
                    new ProgramTM(e.getProgramId(),e.getProgramName(),e.getDuration(),e.getFee()));
        });
        tblProgram.setItems(obList);
    }

    public void openAdminFormOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) programDetailsContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
