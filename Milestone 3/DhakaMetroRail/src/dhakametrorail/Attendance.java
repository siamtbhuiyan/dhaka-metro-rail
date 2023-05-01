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
public class Attendance implements Serializable {
    private String id;
    private Date date;

    public Attendance(String id, Date date, boolean isPresent) {
        this.id = id;
        this.date = date;
        this.isPresent = isPresent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isIsPresent() {
        return isPresent;
    }

    public void setIsPresent(boolean isPresent) {
        this.isPresent = isPresent;
    }
    private boolean isPresent;
}
