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
public class PassengerController implements Initializable {

    @FXML
    private Button loadCreditBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadCreditBtnOnClick(MouseEvent event) throws IOException{
        Parent newScene = FXMLLoader.load(getClass().getResource("LoadCredit.fxml"));
        Scene newStage = new Scene(newScene, 1000, 800);
        Stage s4 = new Stage(); s4.setScene(newStage);  s4.show();
    }
    
}
