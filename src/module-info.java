module CowsAndBulls {
    requires  javafx.controls;
    requires  javafx.fxml;
    exports  game to javafx.graphics, javafx.fxml;
    opens game to javafx.fxml;
}