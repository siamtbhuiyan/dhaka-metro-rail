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
public class Budget {
    private int amount;
    private Date dateAndTime;
    private boolean isApproved;

    public Budget(int amount, Date dateAndTime, boolean isApproved) {
        this.amount = amount;
        this.dateAndTime = dateAndTime;
        this.isApproved = isApproved;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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
    
    public void addBudget() {
        //
    }
    public void approveBudget() {
        //
    }
}
