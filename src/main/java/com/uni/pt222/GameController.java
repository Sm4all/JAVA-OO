package com.uni.pt222;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;

public class GameController {
    @FXML
    private Label locationLabel;
    @FXML
    private Button northButton;
    @FXML
    private Button southButton;
    @FXML
    private Button eastButton;
    @FXML
    private Button westButton;

    private String characterName;
    private Game game; // Initialize this with your game logic

    public void initGame() {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Character Name");
        dialog.setHeaderText(null);
        dialog.setContentText("Enter your character's name:");
        dialog.showAndWait().ifPresent(name -> {
            characterName = name;
            game = new Game(characterName); // Initialize the game with the character name
            updateLocationDescription();
        });

        // Set up button handlers
        northButton.setOnAction(event -> move("North"));
        southButton.setOnAction(event -> move("South"));
        eastButton.setOnAction(event -> move("East"));
        westButton.setOnAction(event -> move("West"));
    }

    private void updateLocationDescription() {
        locationLabel.setText(game.getCurrentLocationDescription());
        if (game.isGameOver()) {
            // Display game outcome using character name
            // You can show a dialog or update the label here
        }
    }

    private void move(String direction) {
        game.movePlayer(direction);
        updateLocationDescription();
    }
}
