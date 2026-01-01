module com.catcher.catchergame.lol_stats_tracker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lol_stats_tracker to javafx.fxml;
    exports com.lol_stats_tracker;
}