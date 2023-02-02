module com.example.comp1008200503435test1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.comp1008200503435test1 to javafx.fxml;
    exports com.example.comp1008200503435test1;
}