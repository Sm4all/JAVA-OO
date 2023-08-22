package com.uni.pt222;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class HowToPlayController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnBack;

    @FXML
    private ImageView imgBackground;

    @FXML
    private Label lblHowToPlay;

    @FXML
    private Label lblTitleText;

    @FXML
    void initialize() {
        assert btnBack != null : "fx:id=\"btnBack\" was not injected: check your FXML file 'How-to-play.fxml'.";
        assert imgBackground != null : "fx:id=\"imgBackground\" was not injected: check your FXML file 'How-to-play.fxml'.";
        assert lblHowToPlay != null : "fx:id=\"lblHowToPlay\" was not injected: check your FXML file 'How-to-play.fxml'.";
        assert lblTitleText != null : "fx:id=\"lblTitleText\" was not injected: check your FXML file 'How-to-play.fxml'.";

    }

}