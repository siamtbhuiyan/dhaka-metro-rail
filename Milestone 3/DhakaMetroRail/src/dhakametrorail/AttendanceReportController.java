/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakametrorail;

import java.util.ArrayList;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author siamb
 */
public class AttendanceReportController implements Initializable {

    @FXML
    private TextArea outputArea;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArrayList<String> att = Employee.generateAttendenceReport();
        for (int i = 0; i < att.size(); i++) {
            outputArea.appendText(att.get(i));
        }
    }    
}
