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
public class Shift {
        private final int employee_id;
        private Date date;
        private String shiftType;

    public Shift(int employee_id, Date date, String shiftType) {
        this.employee_id = employee_id;
        this.date = date;
        this.shiftType = shiftType;
    }

    

    public int getEmployee_id() {
        return employee_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getShiftType() {
        return shiftType;
    }

    public void setShiftType(String shiftType) {
        this.shiftType = shiftType;
    }
    
    public void addShift() {
        // 
    }
}
