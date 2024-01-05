module com.example.space_invaders_partial {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.space_invaders_partial to javafx.fxml;
    exports com.example.space_invaders_partial;
}