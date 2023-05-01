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
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button passengerBtn;
    @FXML
    private Button financeBtn;
    @FXML
    private Button hrBtn;
    @FXML
    private Button stationManagerBtn;
    @FXML
    private Button securityHeadBtn;
    @FXML
    private Button projectDirectorBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void passengerBtnOnClick(MouseEvent event) throws IOException {
        Parent newScene = FXMLLoader.load(getClass().getResource("Passenger.fxml"));
        Scene newStage = new Scene(newScene, 1000, 800);
        Stage s4 = new Stage(); s4.setScene(newStage);  s4.show();
    }

    @FXML
    private void financeBtnOnClick(MouseEvent event) throws IOException {
        Parent newScene = FXMLLoader.load(getClass().getResource("FinanceManager.fxml"));
        Scene newStage = new Scene(newScene, 1000, 800);
        Stage s4 = new Stage(); s4.setScene(newStage);  s4.show();
    }

    @FXML
    private void hrBtnOnclick(MouseEvent event) throws IOException {
        Parent newScene = FXMLLoader.load(getClass().getResource("HRManager.fxml"));
        Scene newStage = new Scene(newScene, 1000, 800);
        Stage s4 = new Stage(); s4.setScene(newStage);  s4.show();
    }

    @FXML
    private void stationManagerBtnOnClick(MouseEvent event) throws IOException{
        Parent newScene = FXMLLoader.load(getClass().getResource("StationManager.fxml"));
        Scene newStage = new Scene(newScene, 1000, 800);
        Stage s4 = new Stage(); s4.setScene(newStage);  s4.show();
    }

    @FXML
    private void securityHeadBtnOnClick(MouseEvent event) throws IOException {
        Parent newScene = FXMLLoader.load(getClass().getResource("SecurityHead.fxml"));
        Scene newStage = new Scene(newScene, 1000, 800);
        Stage s4 = new Stage(); s4.setScene(newStage);  s4.show();
    }

    @FXML
    private void projectDirectorBtnOnClick(MouseEvent event) throws IOException {
        Parent newScene = FXMLLoader.load(getClass().getResource("ProjectDirector.fxml"));
        Scene newStage = new Scene(newScene, 1000, 800);
        Stage s4 = new Stage(); s4.setScene(newStage);  s4.show();
    }  
    
    @FXML
    private void attendanceBtnOnClick (MouseEvent event) throws IOException {
        Parent newScene = FXMLLoader.load(getClass().getResource("GiveAttendance.fxml"));
        Scene newStage = new Scene(newScene, 1000, 800);
        Stage s4 = new Stage(); s4.setScene(newStage);  s4.show();
    }
}
