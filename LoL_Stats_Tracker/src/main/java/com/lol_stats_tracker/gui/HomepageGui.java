package com.lol_stats_tracker.gui;

import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HomepageGui {

    private Stage primaryStage;

    public HomepageGui(Stage primaryStage) {
        this.primaryStage = primaryStage;
        initializeHomepage();
    }

    private void initializeHomepage() {

        VBox layout = new VBox();


        Scene scene = new Scene(layout, 800, 600);
        primaryStage.setTitle("LoL Stats Tracker");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}