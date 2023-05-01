/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakametrorail;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author siamb
 */
public class StationManagerController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // todo
    }    

    @FXML
    private void genrateAttendanceBtnOnClick(MouseEvent event) throws IOException {
        Parent attendanceReportScene = FXMLLoader.load(getClass().getResource("AttendanceReport.fxml"));
        Scene newAttendanceStage = new Scene(attendanceReportScene, 1000, 800);
        Stage s2 = new Stage(); s2.setScene(newAttendanceStage);  s2.show();
    }
@FXML
    private void reportBtnOnClick(MouseEvent event) throws IOException {
        Parent writeReportScene = FXMLLoader.load(getClass().getResource("WriteReport.fxml"));
        Scene newReportStage = new Scene(writeReportScene, 1000, 800);
        Stage s4 = new Stage(); s4.setScene(newReportStage);  s4.show();
    }

    @FXML
    private void loadCreditBtnOnClick(MouseEvent event) throws IOException {
        Parent newScene = FXMLLoader.load(getClass().getResource("STManagerLoadCredit.fxml"));
        Scene newStage = new Scene(newScene, 1000, 800);
        Stage s4 = new Stage(); s4.setScene(newStage);  s4.show();
    }
@FXML
    private void requestEqipBtnOnClick(MouseEvent event) throws IOException {
        Parent newScene = FXMLLoader.load(getClass().getResource("MakeRequest.fxml"));
        Scene newStage = new Scene(newScene, 1000, 800);
        Stage s4 = new Stage(); s4.setScene(newStage);  s4.show();
    }

@FXML
    private void leaveRequestBtnOnClick(MouseEvent event) throws IOException {
        Parent newScene = FXMLLoader.load(getClass().getResource("WriteLeave.fxml"));
        Scene newStage = new Scene(newScene, 1000, 800);
        Stage s4 = new Stage(); s4.setScene(newStage);  s4.show();
    }
}
