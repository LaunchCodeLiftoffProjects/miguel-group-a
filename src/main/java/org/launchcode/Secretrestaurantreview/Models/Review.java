package org.launchcode.Secretrestaurantreview.Models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Review extends AbstractEntity{

    private String restaurantName;

    public Review (String restaurantName){
        this.restaurantName = restaurantName;
    }

    public Review (){}

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
}
