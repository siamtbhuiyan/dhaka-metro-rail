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
public class HRManager extends Employee {

    public HRManager(int bankAcountId, String employeeType, int salary, int currentMonthDue, int durationOfEmployment, String designation, String id, String username, String userType, String password, String firstName, String lastname, String email, String mobile) {
        super(bankAcountId, employeeType, salary, currentMonthDue, durationOfEmployment, designation, id, username, userType, password, firstName, lastname, email, mobile);
    }
    
    public void reviewJobApplications(boolean isAccepted) {
        
    }
    public void processPayroll(int amount){

    }
    public void createTrainingSchedule(Employee employee, Date trainingDate) {

    }
    public void recruit(Application acceptedApplicant, String username, String password, String firstName, String lastName, String email, String mobile, String type, int salary) {

    }
    public void reviewLeaveOfAbsenceApplications(boolean isAccepted) {

    }
    public void promote(Employee employee, int updatedSalary, String updatedDesignation) {

    }
    public void layoff(Employee employee, String subject, String body) {

    }
}
