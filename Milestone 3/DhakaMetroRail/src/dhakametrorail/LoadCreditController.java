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
 * @author siamb
 */
public class LoadCreditController implements Initializable {

    @FXML
    private TextField idText;
    @FXML
    private TextField amountText;
    @FXML
    private Button loadBtn;
    @FXML
    private Button cancelBtn;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadBtnOnClick(MouseEvent event) {
        Passenger.loadCredit(Integer.parseInt(amountText.getText()), idText.getText());
        Stage stage = (Stage) cancelBtn.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void cancelBtnOnClick(MouseEvent event) {
        Stage stage = (Stage) cancelBtn.getScene().getWindow();
        stage.close();
    }
}
