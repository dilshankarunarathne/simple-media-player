package sample;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 * @author Sean M. Wader
 * All rights reserved (C) zeeka LLC.
 * 2020 November
 * Kandy, Sri Lanka
 */
public class Player extends BorderPane {

    Media media;
    MediaPlayer player;
    MediaView view;
    Pane mpane;
    MediaBar bar;

    public Player(String file) {
        media = new Media(file);
        player = new MediaPlayer(media);
        view = new MediaView(player);

        mpane = new Pane();

        mpane.getChildren().add(view);

        setCenter(mpane);

        bar = new MediaBar(player);
        setBottom(bar);

        setStyle("-fx-background-color: darkgrey");

        player.play();
    }
}
