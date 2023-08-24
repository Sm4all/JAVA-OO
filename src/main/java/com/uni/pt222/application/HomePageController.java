package com.uni.pt222.application;

import java.net.URL;
import java.util.ResourceBundle;

import com.uni.pt222.Backend.GameFacade;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.*;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;

public class HomePageController {

    private GameFacade facade;
    // receive a reference to the second scene
    // ... we can retrieve any of its inputs if we need to
    private Scene secondScene;

    private Scene thirdScene;
    private HowToPlayController htp2c;

    private AboutPageController apc;

    public void setAboutPageController(AboutPageController controller) {apc = controller;}
    public void setFacade(GameFacade facade) {
        this.facade = facade;
    }

    public void setSecondScene(Scene secondScene) {
        this.secondScene = secondScene;
    } //How to play

    public void setThirdScene(Scene secondScene) {
        this.thirdScene = thirdScene;
    } //About

    public void setHowToPlayController(HowToPlayController controller) {
        htp2c = controller;
    }

    // get the contents of the input-capable text field


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAbout;

    @FXML
    private Button btnChangeName;

    @FXML
    private Button btnHowToPlay;

    @FXML
    private Button btnStartGame;

    @FXML
    private ImageView imgBackgroundImage;

    @FXML
    private Label lblTitleText;

    @FXML
    private Label lblusername;

    @FXML
    private Label lblyourname;

    @FXML
    void initialize() {
        assert btnAbout != null : "fx:id=\"btnAbout\" was not injected: check your FXML file 'Home_screen.fxml'.";
        assert btnChangeName != null : "fx:id=\"btnChangeName\" was not injected: check your FXML file 'Home_screen.fxml'.";
        assert btnHowToPlay != null : "fx:id=\"btnHowToPlay\" was not injected: check your FXML file 'Home_screen.fxml'.";
        assert btnStartGame != null : "fx:id=\"btnStartGame\" was not injected: check your FXML file 'Home_screen.fxml'.";
        assert imgBackgroundImage != null : "fx:id=\"imgBackgroundImage\" was not injected: check your FXML file 'Home_screen.fxml'.";
        assert lblTitleText != null : "fx:id=\"lblTitleText\" was not injected: check your FXML file 'Home_screen.fxml'.";
        assert lblusername != null : "fx:id=\"lblusername\" was not injected: check your FXML file 'Home_screen.fxml'.";
        assert lblyourname != null : "fx:id=\"lblyourname\" was not injected: check your FXML file 'Home_screen.fxml'.";


        btnHowToPlay.setOnAction(this::proceedToHowToPlay);
        btnAbout.setOnAction((this::proceedToAbout));
    }

    public void proceedToHowToPlay(ActionEvent ae) {
        // get hold of the stage
        Node node = (Node) ae.getSource();
        Stage primaryStage = (Stage) node.getScene().getWindow();
        // we need to hide the stage, set an event handler, change the scene, then show the stage once more:
        primaryStage.hide();

        // if we need setup code to run (even though the second controller initialize() ran earlier), do this:
        htp2c.doExtraSetup();
        //primaryStage.setOnShown(e -> s2c.doExtraSetup());
        // set the scene
        primaryStage.setScene(secondScene);
        primaryStage.show();
    }

    public void proceedToAbout(ActionEvent ae) {
        // get hold of the stage
        Node node = (Node) ae.getSource();
        Stage primaryStage = (Stage) node.getScene().getWindow();
        // we need to hide the stage, set an event handler, change the scene, then show the stage once more:
        primaryStage.hide();

        // if we need setup code to run (even though the second controller initialize() ran earlier), do this:
        apc.doExtraSetup();
        //primaryStage.setOnShown(e -> s2c.doExtraSetup());
        // set the scene
        primaryStage.setScene(thirdScene);
        primaryStage.show();
    }
}
