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
public class Message {
    private String body;
    private Date dateAndTime;
    private String messageFrom;
    private String messageTo;

    public Message(String body, Date dateAndTime, String messageFrom, String messageTo) {
        this.body = body;
        this.dateAndTime = dateAndTime;
        this.messageFrom = messageFrom;
        this.messageTo = messageTo;
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

    public String getMessageFrom() {
        return messageFrom;
    }

    public void setMessageFrom(String messageFrom) {
        this.messageFrom = messageFrom;
    }

    public String getMessageTo() {
        return messageTo;
    }

    public void setMessageTo(String messageTo) {
        this.messageTo = messageTo;
    }
    // methods
    public void addMessage() {
        //
    }
}
