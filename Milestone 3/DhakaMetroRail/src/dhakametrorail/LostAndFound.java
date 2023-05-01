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
public class LostAndFound {
    private String id;
    private String name;
    public boolean isFound;

    public LostAndFound(String id, String name, boolean isFound) {
        this.id = id;
        this.name = name;
        this.isFound = isFound;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsFound() {
        return isFound;
    }

    public void setIsFound(boolean isFound) {
        this.isFound = isFound;
    }
    
    public void addLostAndFound() {
        //
    }
    
    public void updateFound() {
        //
    }
}
