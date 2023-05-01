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

/**
 *
 * @author siamb
 */
public class Passenger extends User implements Serializable {
    private double metroCardId;
    private int credit;
    private int outstanding;
    private String disablity;
    private boolean isBlocked;

    public Passenger(double metroCardId, int credit, int outstanding, String disablity, boolean isBlocked, String id, String username, String userType, String password, String firstName, String lastname, String email, String mobile) {
        super(id, username, userType, password, firstName, lastname, email, mobile);
        this.metroCardId = metroCardId;
        this.credit = credit;
        this.outstanding = outstanding;
        this.disablity = disablity;
        this.isBlocked = isBlocked;
    }

    public double getMetroCardId() {
        return metroCardId;
    }

    public void setMetroCardId(double metroCardId) {
        this.metroCardId = metroCardId;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getOutstanding() {
        return outstanding;
    }

    public void setOutstanding(int outstanding) {
        this.outstanding = outstanding;
    }

    public String getDisablity() {
        return disablity;
    }

    public void setDisablity(String disablity) {
        this.disablity = disablity;
    }

    public boolean isIsBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    
    
//    Main methods
    public static void loadCredit(int amount, String passengerId) {
        ArrayList<Passenger> allP = new ArrayList<Passenger>();
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        try {
            f = new File("Passenger.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Passenger emp;
            try{
                while(true){
                    System.out.println("Printing objects.");
                    emp = (Passenger) ois.readObject();
                    if (emp.getId() == null ? passengerId == null : emp.getId().equals(passengerId)) {
                        System.out.println("CLEAR 2");
                        System.out.println(emp.getCredit());
                        emp.setCredit(emp.getCredit() + amount);
                        System.out.println(emp.getCredit());
                    }
                    allP.add(emp);
                }
            }//end of nested try
            catch(Exception e){
                System.out.println("ERROR 1" + e);
            }//nested catch  
            System.out.println("DONE");
            } catch (IOException ex) { 
                System.out.println("ERROR 2" + ex);
            } 
            finally {
                try {
                    if(ois != null) {
                        ois.close();
                        System.out.println("CLOSED");
                    }
                    if (f.delete()) { 
                        System.out.println("Deleted the file: " + f.getName());
                      } else {
                        System.out.println("Failed to delete the file.");
        }
                } catch (IOException ex) {
                    System.out.println("ERROR 3");
                }
            }
        
        for (int i = 0; i < allP.size(); i++) {
            System.out.println(allP.get(i).getUsername());
            File fO = null;
            FileOutputStream fos = null;      
            ObjectOutputStream oos = null;
            try {
                fO = new File("Passenger.bin");
                if(fO.exists()){
                    System.out.println("YES" + allP.get(i));
                    fos = new FileOutputStream(fO,true);
                    oos = new AppendableObjectOutputStream(fos);  
                }
                else{
                    fos = new FileOutputStream(fO);
                    oos = new ObjectOutputStream(fos);               
                }
                oos.writeObject(allP.get(i));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }   
    }
    
    public void contactHelpline() {
        //
    }
    
    public void giveReview() {
        // 
    }
    
    public static void register() {
        // c
    }
    
    public void requestLostAndFound() {
        //
    }
    
    public void requestUnblock() {
        //
    }
    
    public void emergencyLoan() {
        //
    }
    
    public void generateTravelReport() {
        //
    } 
}
