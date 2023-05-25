module com.nazari.chatapp {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.nazari.chatapp to javafx.fxml;
    exports com.nazari.chatapp;
}