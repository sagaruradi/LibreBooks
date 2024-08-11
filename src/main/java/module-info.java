module com.librebooks {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.librebooks to javafx.fxml;
    exports com.librebooks;
}
