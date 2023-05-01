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
import java.util.Date;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author siamb
 */
public class WriteLeaveController implements Initializable {

    @FXML
    private TextField letterFromText;
    @FXML
    private TextField subjectText;
    @FXML
    private TextArea bodyText;
    @FXML
    private Button sendBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sendBtnOnClick(MouseEvent event) {
        Employee.requestLeave(subjectText.getText(), bodyText.getText(), letterFromText.getText());
        subjectText.setText("");
            bodyText.setText("");
            letterFromText.setText("");
            Stage stage = (Stage) sendBtn.getScene().getWindow();
            stage.close();
    }
    
}
