/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakametrorail;

import java.util.Date; 

/**
 *
 * @author siamb
 */
public class Notification {
    private String body;
    private Date dateAndTime;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(Date dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public Notification(String body, Date dateAndTime) {
        this.body = body;
        this.dateAndTime = dateAndTime;
    }
    
    // methods
    public void addNotification() {
    
    }
}
