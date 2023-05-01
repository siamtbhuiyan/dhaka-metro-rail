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
public class Letter implements Serializable {
    private String subject;
    private Date dateAndTime;
    private String body;
    private String type;
    private String letterFrom;
    private String letterTo;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(Date dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLetterFrom() {
        return letterFrom;
    }

    public void setLetterFrom(String letterFrom) {
        this.letterFrom = letterFrom;
    }

    public String getLetterTo() {
        return letterTo;
    }

    public void setLetterTo(String letterTo) {
        this.letterTo = letterTo;
    }

    public Letter(String subject, Date dateAndTime, String body, String type, String letterFrom, String letterTo) {
        this.subject = subject;
        this.dateAndTime = dateAndTime;
        this.body = body;
        this.type = type;
        this.letterFrom = letterFrom;
        this.letterTo = letterTo;
    }
    // methods
    public void addLetter() {
        //
    }
}
