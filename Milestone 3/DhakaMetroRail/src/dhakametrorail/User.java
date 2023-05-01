/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakametrorail;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date; 

/**
 *
 * @author siamb
 */
public class User implements Serializable {
    private final String id;
    private final String username;
    private final String userType;
    private String password;
    private String firstName;
    private String lastname;
    private String email;
    private String mobile;

//    Constructor
    public User(String id, String username, String userType, String password, String firstName, String lastname, String email, String mobile) {
        this.id = id;
        this.username = username;
        this.userType = userType;
        this.password = password;
        this.firstName = firstName;
        this.lastname = lastname;
        this.email = email;
        this.mobile = mobile;
    }

//    Getters
    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getUserType() {
        return userType;
    }

    public String getPassword() {
        return password;
    }
    
//    Setters

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
//    Main Methods
    public static void login() {
//        if (type.equals("Passenger")) {
//            File f = null;
//            FileInputStream fis = null;      
//            ObjectInputStream ois = null;
//            try {
//                fis = new FileInputStream("Passenger.bin");
//                ois = new ObjectInputStream(fis);
//                Passenger emp;
//                try{
//                    while(true){
//                        System.out.println("Printing objects.");
//                        emp = (Passenger) ois.readObject();
//                        if (emp.getId().equals(id)) {
//                            return emp;
//                        } else {
//                            return null;
//                        }
//                    }
//                }//end of nested try
//                catch(Exception e){
//                    System.out.println("ERROR 1");
//                }//nested catch                
//            } catch (IOException ex) { 
//                System.out.println("ERROR 2" + ex);
//            } 
//            finally {
//                try {
//                    if(ois != null) ois.close();
//                } catch (IOException ex) {
//                    System.out.println("ERROR 3");
//                }
//            }
//        }
//        return null;
    }
    public void logout() {
        
    }
    public void addToFile() {
        
    }
}
