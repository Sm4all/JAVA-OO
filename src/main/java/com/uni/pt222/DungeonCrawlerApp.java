package com.uni.pt222;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DungeonCrawlerApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Home_screen.fxml"));
        AnchorPane root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Dungeon Crawler com.example.pt2.Game");
        primaryStage.show();

        GameController controller = loader.getController();
        controller.initGame(); // Initialize the game in the controller
    }

    public static void main(String[] args) {
        launch(args);
    }
}
