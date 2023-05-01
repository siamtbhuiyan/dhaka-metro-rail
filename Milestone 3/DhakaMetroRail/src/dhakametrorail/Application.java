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
public class Application {
    private int id;
  private String name;
  private String designation;
  private String cvPath;
  private Date dateAndTime;
  private boolean isAccepted;

    public Application(int id, String name, String designation, String cvPath, Date dateAndTime, boolean isAccepted) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.cvPath = cvPath;
        this.dateAndTime = dateAndTime;
        this.isAccepted = isAccepted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCvPath() {
        return cvPath;
    }

    public void setCvPath(String cvPath) {
        this.cvPath = cvPath;
    }

    public Date getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(Date dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public boolean isIsAccepted() {
        return isAccepted;
    }

    public void setIsAccepted(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }
    
    public void acceptApplicant() {
        //
    }
}
