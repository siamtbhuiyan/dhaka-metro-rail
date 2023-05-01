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
public class FinanceManager extends Employee {

    public FinanceManager(int bankAcountId, String employeeType, int salary, int currentMonthDue, int durationOfEmployment, String designation, String id, String username, String userType, String password, String firstName, String lastname, String email, String mobile) {
        super(bankAcountId, employeeType, salary, currentMonthDue, durationOfEmployment, designation, id, username, userType, password, firstName, lastname, email, mobile);
    }
    
    
    public void approveEquipmentRequest(boolean isApproved) {
    
    }
    public void requestBudget(int amount) {

    }
    public void payBill(String sendTo, int amount) {

    }
    public void sendSalary(Employee[] employeeList) {

    }
    public void sendReport(String subject, String body) {

    }
    public void createBankAccount(Employee employee) {

    }
    public void requestleaveOfAbsence(String subject, String body) {

    }
}
