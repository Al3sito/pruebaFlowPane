module com.example.pruebaflowpane {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pruebaflowpane to javafx.fxml;
    exports com.example.pruebaflowpane;
}