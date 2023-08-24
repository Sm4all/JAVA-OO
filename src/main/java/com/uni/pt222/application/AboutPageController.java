package com.uni.pt222.application;

import java.net.URL;
import java.util.ResourceBundle;

import com.uni.pt222.Backend.GameFacade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class AboutPageController {

    private GameFacade facade;
    private HomePageController hp1c;

    // receive a reference to the first scene
    // ... we can retrieve any of its inputs if we need to
    private Scene firstScene;


    public void setFacade(GameFacade facade) {
        this.facade = facade;
    }


    public void setHomePageController(HomePageController controller) {
        hp1c = controller;
    }

    public Scene getFirstScene() {
        return firstScene;
    }

    public void setFirstScene(Scene firstScene) {
        this.firstScene = firstScene;
    }
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnBack;

    @FXML
    private Label lblHowToPlay;

    @FXML
    private Label lblTitle;

    @FXML
    void initialize() {
        assert btnBack != null : "fx:id=\"btnBack\" was not injected: check your FXML file 'About-Page.fxml'.";
        assert lblHowToPlay != null : "fx:id=\"lblHowToPlay\" was not injected: check your FXML file 'About-Page.fxml'.";
        assert lblTitle != null : "fx:id=\"lblTitle\" was not injected: check your FXML file 'About-Page.fxml'.";

        btnBack.setOnAction(this::proceedToHomePage);
    }


    public void proceedToHomePage(ActionEvent ae) {
        // get hold of the stage
        Node node = (Node) ae.getSource();
        Stage primaryStage = (Stage) node.getScene().getWindow();
        // we need to hide the stage, set an event handler, change the scene, then show the stage once more:
        primaryStage.hide();

        //primaryStage.setOnShown(e -> s2c.doExtraSetup());
        // set the scene
        primaryStage.setScene(firstScene);
        primaryStage.show();
    }
    public void doExtraSetup() {

    }

}
