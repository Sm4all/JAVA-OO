package com.uni.pt222.Backend;


import javafx.stage.Stage;

public class GameFacade {
    //OBJECTS
    private String characterName;
    private Game game; // Initialize
    private Stage primaryStage;

    //SETTERS
    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    //GETTERS
    public String getCharacterName() {
        return characterName;
    }

    public Game getGame() {
        return game;
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

}
