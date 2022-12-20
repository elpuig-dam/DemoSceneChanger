package uf5.mp3.dam.demoscenechanger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML BorderPane bpMain;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML public void onItemMenuHelpAboutClick(ActionEvent actionEvent) throws IOException {
        welcomeText.setText("Click help");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("help-view.fxml"));
        HBox hBox = fxmlLoader.load();
        Stage stage1 = (Stage)bpMain.getScene().getWindow();
        stage1.setScene(new Scene(hBox));
    }


}