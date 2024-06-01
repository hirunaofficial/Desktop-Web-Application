module dev.hiruna.app {
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.hiruna.app to javafx.fxml;
    exports dev.hiruna.app;
}