module com.example.pizzacaculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pizzacaculator to javafx.fxml;
    exports com.example.pizzacaculator;
}