module com.librebooks {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.librebooks to javafx.fxml;
    exports com.librebooks;
}
