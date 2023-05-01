/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakametrorail;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author siamb
 */
public class MakeRequestController implements Initializable {

    @FXML
    private TextArea textArea;
    @FXML
    private Button requestBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void requestBtnOnClick(MouseEvent event) {
        StationManager.requestEquipment(textArea.getText());
        textArea.setText("");
        Stage stage = (Stage) requestBtn.getScene().getWindow();
        stage.close();
    }
}
