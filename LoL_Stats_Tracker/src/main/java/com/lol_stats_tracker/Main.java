package com.lol_stats_tracker;

import com.lol_stats_tracker.gui.HomepageGui;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        new HomepageGui(primaryStage);
    }
}