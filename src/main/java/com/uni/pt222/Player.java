package com.uni.pt222;

public class Player {
    private String name;
    private String currentLocation;

    public Player(String name) {
        this.name = name;
        this.currentLocation = "start"; // Set the initial location
    }

    public String getName() {
        return name;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String location) {
        this.currentLocation = location;
    }
}
