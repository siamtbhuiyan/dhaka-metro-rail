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
public class Announcement {
    private String body;
    private Date dateAndTime;
    private boolean isApproved;

    public Announcement(String body, Date dateAndTime, boolean isApproved) {
        this.body = body;
        this.dateAndTime = dateAndTime;
        this.isApproved = isApproved;
    }

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

    public boolean isIsApproved() {
        return isApproved;
    }

    public void setIsApproved(boolean isApproved) {
        this.isApproved = isApproved;
    }
    
    public void addAnnouncement() {
        //
    }
    public void approveAnnouncement() {
        //
    }
}
