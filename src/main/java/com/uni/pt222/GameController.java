package com.uni.pt222;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;
import java.net.URL;
import java.util.ResourceBundle;

public class GameController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAbout;

    @FXML
    private Button btnHowToPlay;

    @FXML
    private Button btnStartGame;

    @FXML
    private Label lblTitleText;

    @FXML
    private Label lblyourname;

    @FXML
    private Label lblusername;

    @FXML
    private Button btnChangeName;



    private String characterName;
    private Game game; // Initialize this with your game logic

    public void initGame() {
        boolean nameEntered = false;
        while (!nameEntered) {
            try {
                updateName();
                if (characterName != null || characterName != "") {
                    nameEntered = true;
                }
            } catch(Exception e) {
                TextInputDialog dialog = new TextInputDialog();
                dialog.setTitle("Unknown Error");
                dialog.setHeaderText(null);
                dialog.setContentText("An unexpected error has occured, please try again. ");
            }
        }

        // Set up button handlers
        btnChangeName.setOnAction(event -> updateName());
        //northButton.setOnAction(event -> move("North"));
        //southButton.setOnAction(event -> move("South"));
        //eastButton.setOnAction(event -> move("East"));
        //westButton.setOnAction(event -> move("West"));
    }

    private void updateLocationDescription() {
        //locationLabel.setText(game.getCurrentLocationDescription());
        if (game.isGameOver()) {
            // Display game outcome using character name
            // You can show a dialog or update the label here
        }
    }

    private void move(String direction) {
        game.movePlayer(direction);
        updateLocationDescription();
    }

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
            lblusername.setText(characterName);
        });
    }
}
