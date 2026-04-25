package com.example.pizzacaculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PizzaApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PizzaApp.class.getResource("pizza-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 320);
        stage.setTitle("Pizza Calculator");
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(280);
        stage.setMinWidth(320);
    }

    public static void main(String[] args) {
        launch();
    }
}