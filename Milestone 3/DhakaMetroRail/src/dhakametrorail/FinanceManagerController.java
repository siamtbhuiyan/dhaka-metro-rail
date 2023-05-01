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
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author siamb
 */
public class FinanceManagerController implements Initializable {

    @FXML
    private Button generateAttendanceBtn;
    @FXML
    private Button sendReportBtn;
    @FXML
    private Button leaveBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void generateAttendanceBtnOnClick(MouseEvent event) throws IOException {
        Parent attendanceReportScene = FXMLLoader.load(getClass().getResource("AttendanceReport.fxml"));
        Scene newAttendanceStage = new Scene(attendanceReportScene, 1000, 800);
        Stage s2 = new Stage(); s2.setScene(newAttendanceStage);  s2.show();
    }

    @FXML
    private void sendReportBtnOnClick(MouseEvent event) throws IOException {
        Parent newScene = FXMLLoader.load(getClass().getResource("WriteLeave.fxml"));
        Scene newStage = new Scene(newScene, 1000, 800);
        Stage s4 = new Stage(); s4.setScene(newStage);  s4.show();
        
    }

    @FXML
    private void leaveBtnOnClick(MouseEvent event) throws IOException {
        Parent writeReportScene = FXMLLoader.load(getClass().getResource("WriteReport.fxml"));
        Scene newReportStage = new Scene(writeReportScene, 1000, 800);
        Stage s4 = new Stage(); s4.setScene(newReportStage);  s4.show();
    }
    
}
