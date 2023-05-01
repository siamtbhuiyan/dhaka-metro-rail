/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakametrorail;

/**
 *
 * @author siamb
 */
public class ProjectDirector extends Employee {

    public ProjectDirector(int bankAcountId, String employeeType, int salary, int currentMonthDue, int durationOfEmployment, String designation, String id, String username, String userType, String password, String firstName, String lastname, String email, String mobile) {
        super(bankAcountId, employeeType, salary, currentMonthDue, durationOfEmployment, designation, id, username, userType, password, firstName, lastname, email, mobile);
    }
    
    public void sendAnnouncement(String body) {
         
    }
    public void approveBudget() {
    //      
    }
    public void viewCustomerReview() {
        //
    }
    public void updateFair(int amount) {
        //
    }
    public void callForMeeting(String body) {
      //
    }
    public void updateTrainSchedule() {
        // 
    }
    public void updateRules(String body) {
        //
    }
}
