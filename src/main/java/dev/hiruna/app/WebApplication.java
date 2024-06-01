package dev.hiruna.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WebApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(WebApplication.class.getResource("web-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle("GD Hiruna");
        stage.setMaximized(true); // Set the stage to be maximized
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}