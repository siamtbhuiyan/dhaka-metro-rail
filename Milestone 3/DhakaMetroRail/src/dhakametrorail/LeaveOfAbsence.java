/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakametrorail;

import java.util.Date; 
import java.io.Serializable;

/**
 *
 * @author siamb
 */
public class LeaveOfAbsence extends Letter implements Serializable {
    public LeaveOfAbsence(boolean isAccepted, String subject, Date dateAndTime, String body, String type, String letterFrom, String letterTo) {
        super(subject, dateAndTime, body, type, letterFrom, letterTo);
        this.isAccepted = isAccepted;
    }
    
    public boolean isIsAccepted() {
        return isAccepted;
    }

    public void setIsAccepted(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }
    // fields
    private boolean isAccepted;
    // method
    public void acceptLeave() {
        //
    }
}
