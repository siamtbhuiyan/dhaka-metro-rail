/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakametrorail;

import java.io.Serializable;

/**
 *
 * @author siamb
 */
public class Request implements Serializable {
    // fields
    private String requestFrom;
    private String type;
    private String body;
    private boolean isApproved;

    public Request(String requestFrom, String type, String body, boolean isApproved) {
        this.requestFrom = requestFrom;
        this.type = type;
        this.body = body;
        this.isApproved = isApproved;
    }

    public String getRequestFrom() {
        return requestFrom;
    }

    public void setRequestFrom(String requestFrom) {
        this.requestFrom = requestFrom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean isIsApproved() {
        return isApproved;
    }

    public void setIsApproved(boolean isApproved) {
        this.isApproved = isApproved;
    }

    // methods
    public void addRequest() {
        //
    }
    public void approveRequest() {
        //
    }
}
