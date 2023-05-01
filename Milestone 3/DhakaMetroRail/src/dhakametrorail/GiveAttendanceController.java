/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakametrorail;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Siam
 */
public class GiveAttendanceController implements Initializable {

    @FXML
    private TextField idText;
    @FXML
    private Button giveBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void giveBtnOnClick(MouseEvent event) {
    Employee.giveAttendance(idText.getText());
    Stage stage = (Stage) giveBtn.getScene().getWindow();
    stage.close();
    }
    
}
