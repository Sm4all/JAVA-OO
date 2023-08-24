package com.uni.pt222.application;

import com.uni.pt222.Backend.GameFacade;
import com.uni.pt222.application.HomePageController;
import com.uni.pt222.application.HowToPlayController;
import com.uni.pt222.application.AboutPageController;
import com.uni.pt222.Backend.Game;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DungeonCrawlerApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            primaryStage.setOnCloseRequest(evt -> performControlledShutdown(primaryStage));

            // set up a session object
            //Game game = new Game()
            // set up a facade/controller
            GameFacade facade = new GameFacade();

            //Home page scene
            FXMLLoader loaderHome = new FXMLLoader(getClass().getResource("/com/uni/pt222/Home_Screen.fxml"));
            AnchorPane rootHome = loaderHome.load();
            Scene sceneHome = new Scene(rootHome);

            //How to play scene
            FXMLLoader loaderHowToPlay = new FXMLLoader(getClass().getResource("/com/uni/pt222/How-to-play.fxml"));
            AnchorPane rootHowToPlay = loaderHowToPlay.load();
            Scene sceneHowToPlay = new Scene(rootHowToPlay);

            //About scene
            FXMLLoader loaderAbout = new FXMLLoader(getClass().getResource("/com/uni/pt222/About-Page.fxml"));
            AnchorPane rootAbout = loaderAbout.load();
            Scene sceneAbout = new Scene(rootAbout);

            HomePageController homeController = loaderHome.getController();
            HowToPlayController htp = loaderHowToPlay.getController();
            AboutPageController apc = loaderAbout.getController();
            System.out.println(htp);

            homeController.setFacade(facade);
            homeController.setHowToPlayController(htp);
            homeController.setAboutPageController(apc);
            homeController.setSecondScene(sceneHowToPlay);
            homeController.setThirdScene(sceneAbout);

            htp.setFacade(facade);
            htp.setHomePageController(homeController);
            htp.setFirstScene(sceneHome);

            apc.setFacade(facade);
            apc.setHomePageController(homeController);
            apc.setFirstScene(sceneHome);

            primaryStage.setScene(sceneHome);
            primaryStage.setTitle("Dungeon Crawler com.example.pt2.Game");
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    private void performControlledShutdown(Stage primaryStage) {
        // close various other resources as appropriate, then...
        primaryStage.close();
    }

    public static void main(String[] args) {
        launch(args);

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
