/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakametrorail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javafx.stage.Stage;

/**
 *
 * @author siamb
 */
public class Employee extends User implements Serializable {
    private int bankAcountId;
    private final String employeeType;
    private int salary;
    private int currentMonthDue;
    private int durationOfEmployment;
    private String designation;

//    Constructor

    public Employee(int bankAcountId, String employeeType, int salary, int currentMonthDue, int durationOfEmployment, String designation, String id, String username, String userType, String password, String firstName, String lastname, String email, String mobile) {
        super(id, username, userType, password, firstName, lastname, email, mobile);
        this.bankAcountId = bankAcountId;
        this.employeeType = employeeType;
        this.salary = salary;
        this.currentMonthDue = currentMonthDue;
        this.durationOfEmployment = durationOfEmployment;
        this.designation = designation;
    }
    
    
//    Getters

    public int getBankAcountId() {
        return bankAcountId;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public int getSalary() {
        return salary;
    }

    public int getCurrentMonthDue() {
        return currentMonthDue;
    }

    public int getDurationOfEmployment() {
        return durationOfEmployment;
    }

    public String getDesignation() {
        return designation;
    }
    
//    Setters

    public void setBankAcountId(int bankAcountId) {
        this.bankAcountId = bankAcountId;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCurrentMonthDue(int currentMonthDue) {
        this.currentMonthDue = currentMonthDue;
    }

    public void setDurationOfEmployment(int durationOfEmployment) {
        this.durationOfEmployment = durationOfEmployment;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
//    Main Methods
    public static ArrayList<String> generateAttendenceReport() {
        ArrayList<String> att = new ArrayList<String>();
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("Attendance.bin");
            ois = new ObjectInputStream(fis);
            Attendance emp;
            try{
                while(true){
                    System.out.println("Printing objects.");
                    emp = (Attendance)ois.readObject();
                    System.out.println(emp.getId());
                    att.add(emp.getId() + " " + emp.getDate() + "\n");
                }
            }//end of nested try
            catch(Exception e){
                System.out.println("ERROR 1");
            }//nested catch              
        } catch (IOException ex) { 
            System.out.println("ERROR 2" + ex);
        } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) {
                System.out.println("ERROR 3");
            }
        }
        return att;
    }
    
    public static void sendReport(String subject, String body, String letterFrom) {
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        try {
            f = new File("Letter.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);  
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            Letter l = new Letter(
                subject,
                new Date(),
                body,
                "Report",
                letterFrom,
                "Project Director"
            );
            oos.writeObject(l);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void requestLeave(String subject, String body, String letterFrom) {
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        try {
            f = new File("Letter.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);  
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            LeaveOfAbsence l = new LeaveOfAbsence(
                false,
                subject,
                new Date(),
                body,
                "Leave",
                letterFrom,
                "HR Manager"
            );
            oos.writeObject(l);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void giveAttendance (String id) {
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        try {
            f = new File("Attendance.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);  
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            Date curr = new Date();
            Attendance l = new Attendance(
                id,
                curr,
                true
            );
            oos.writeObject(l);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
