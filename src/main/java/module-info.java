module uf5.mp3.dam.demoscenechanger {
    requires javafx.controls;
    requires javafx.fxml;


    opens uf5.mp3.dam.demoscenechanger to javafx.fxml;
    exports uf5.mp3.dam.demoscenechanger;
}