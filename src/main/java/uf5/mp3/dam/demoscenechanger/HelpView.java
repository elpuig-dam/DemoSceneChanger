package uf5.mp3.dam.demoscenechanger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelpView {

    @FXML
    Button btnAbout;
    @FXML
    HBox hboxMain;


    @FXML
    public void onbtnBackStageclick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("hello-view.fxml"));
        BorderPane bp = fxmlLoader.load();

        Stage stage1 = (Stage)hboxMain.getScene().getWindow();
        stage1.setScene(new Scene(bp));

    }
}
