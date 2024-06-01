package dev.hiruna.app;

import javafx.fxml.FXML;
import javafx.scene.web.WebView;

public class WebController {
    @FXML
    private WebView webView;

    @FXML
    public void initialize() {
        webView.getEngine().load("https://hiruna.dev");
    }
}
