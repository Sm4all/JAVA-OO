package com.uni.pt222;

import java.util.HashMap;
import java.util.Map;

public class Game {
    private Player player;
    private Map<String, Location> locations;
    private boolean gameOver;

    public Game(String characterName) {
        player = new Player(characterName);
        // Initialize locations
        locations = new HashMap<>();
        // Add your locations to the map
    }

    public String getCurrentLocationDescription() {
        Location currentLocation = locations.get(player.getCurrentLocation());
        if (currentLocation != null) {
            return currentLocation.getDescription();
        } else {
            return "Unknown Location"; // Provide a default description or error message
        }
    }


    public boolean isGameOver() {
        return gameOver;
    }

    public void movePlayer(String direction) {
        // Implement logic to move the player and update location
        // Also, set gameOver to true if win/lose condition is met
    }
}
