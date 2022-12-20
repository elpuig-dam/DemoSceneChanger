package uf5.mp3.dam.demoscenechanger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        BorderPane bp = fxmlLoader.load();
        HelloController helloController = fxmlLoader.getController();
        Scene scene = new Scene(bp);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        Label label = new Label("NEW LABEL");
        bp.getChildren().add(label);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}