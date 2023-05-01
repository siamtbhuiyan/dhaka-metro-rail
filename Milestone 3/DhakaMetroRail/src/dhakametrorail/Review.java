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
public class Review {
    private String reviewFrom;
    private int numberOfStars;
    private String comment;
    private Date dateAndTime;

    public Review(String reviewFrom, int numberOfStars, String comment, Date dateAndTime) {
        this.reviewFrom = reviewFrom;
        this.numberOfStars = numberOfStars;
        this.comment = comment;
        this.dateAndTime = dateAndTime;
    }

    public String getReviewFrom() {
        return reviewFrom;
    }

    public void setReviewFrom(String reviewFrom) {
        this.reviewFrom = reviewFrom;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(Date dateAndTime) {
        this.dateAndTime = dateAndTime;
    }
}
