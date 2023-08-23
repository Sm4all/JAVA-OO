package com.uni.pt222.Backend;

public class Player {

    //OBJECTS
    private String name;
    private String currentLocation;

    //SETTERS
    public void setName(String name) {
        this.name = name;
    }
    public void setCurrentLocation(String location) {
        this.currentLocation = location;
    }

    //GETTERS
    public String getName() {
        return name;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    //METHODS
    public Player(String name) {
        this.setName(name);
        this.currentLocation = "start"; // Set the initial location
    }
}
