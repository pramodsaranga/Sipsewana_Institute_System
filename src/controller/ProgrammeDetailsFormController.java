package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class ProgrammeDetailsFormController {
    public AnchorPane programDetailsContext;
    public TableView tblProgram;
    public TableColumn colProgramId;
    public TableColumn colProgramName;
    public TableColumn colDuration;
    public TableColumn colFee;
    public Label txtDate;
    public Label txtTime;

    public void openAdminFormOnAction(ActionEvent actionEvent) {
    }
}
