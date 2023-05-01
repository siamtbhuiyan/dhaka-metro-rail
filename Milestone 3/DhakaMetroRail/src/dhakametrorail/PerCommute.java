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
public class PerCommute {
    private String origin;
  private String destinaion;
  private String passenger;
  private Date dateAndTimeOfDeparture;
  private Date dateAndTimeOfArrival;
  private int cost;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestinaion() {
        return destinaion;
    }

    public void setDestinaion(String destinaion) {
        this.destinaion = destinaion;
    }

    public String getPassenger() {
        return passenger;
    }

    public void setPassenger(String passenger) {
        this.passenger = passenger;
    }

    public Date getDateAndTimeOfDeparture() {
        return dateAndTimeOfDeparture;
    }

    public void setDateAndTimeOfDeparture(Date dateAndTimeOfDeparture) {
        this.dateAndTimeOfDeparture = dateAndTimeOfDeparture;
    }

    public Date getDateAndTimeOfArrival() {
        return dateAndTimeOfArrival;
    }

    public void setDateAndTimeOfArrival(Date dateAndTimeOfArrival) {
        this.dateAndTimeOfArrival = dateAndTimeOfArrival;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public PerCommute(String origin, String destinaion, String passenger, Date dateAndTimeOfDeparture, Date dateAndTimeOfArrival, int cost) {
        this.origin = origin;
        this.destinaion = destinaion;
        this.passenger = passenger;
        this.dateAndTimeOfDeparture = dateAndTimeOfDeparture;
        this.dateAndTimeOfArrival = dateAndTimeOfArrival;
        this.cost = cost;
    }
}
