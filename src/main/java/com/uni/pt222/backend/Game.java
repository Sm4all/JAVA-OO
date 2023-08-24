package com.uni.pt222.Backend;

import javafx.scene.control.TextInputDialog;

import java.util.HashMap;
import java.util.Map;

public class Game {
    public Player getPlayer() {
        return player;
    }

    public Map<String, Location> getLocations() {
        return locations;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setLocations(Map<String, Location> locations) {
        this.locations = locations;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

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

    public void initialize() {
        //updateName();
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void movePlayer(String direction) {
        // Implement logic to move the player and update location
        // Also, set gameOver to true if win/lose condition is met
    }

    /*
    private void updateName() {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Character Name");
        dialog.setHeaderText(null);
        dialog.setContentText("Enter your character's name:");
        dialog.showAndWait().ifPresent(name -> {
            characterName = name;
            System.out.println(characterName);
            game = new Game(characterName); // Initialize the game with the character name
            updateLocationDescription();
            nameEntered = true;
            updateUsernameLabel();
        });
    }

     */


}