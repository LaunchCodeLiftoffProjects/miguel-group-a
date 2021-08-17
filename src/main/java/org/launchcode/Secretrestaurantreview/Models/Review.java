package org.launchcode.Secretrestaurantreview.Models;

public class Review {

    private int id;
    private static int nextId = 1;

    private String restaurantName;

    public Review (String restaurantName){
        this.restaurantName = restaurantName;
        this.id = nextId;
        nextId++;
    }

    public Review (){}

    public int getId() {
        return id;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
}
