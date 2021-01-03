package org.itstep;

import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        Pane rootNode = new Pane();

        Rectangle rectangleBlack = new Rectangle(1920, 1080);
        rectangleBlack.setFill(Paint.valueOf("#000000"));
        Rectangle rectangleGreen = new Rectangle(1330, 1080);
        rectangleGreen.setFill(Paint.valueOf("#12725B"));

        Label labelDealer = new Label("Dealer: 0");
        labelDealer.setFont(Font.font("Verdana", 45));
        labelDealer.setTextFill(Paint.valueOf("white"));
        labelDealer.relocate(600, 10);

        Label labelPlayer = new Label("Player: 0");
        labelPlayer.setFont(Font.font("Verdana", 45));
        labelPlayer.setTextFill(Paint.valueOf("white"));
        labelPlayer.relocate(600, 920);

        Label labelBlackjack = new Label("Black Jack");
        labelBlackjack.setFont(Font.font("TimesRoman", 140));
        labelBlackjack.setTextFill(Paint.valueOf("white"));
        labelBlackjack.relocate(350, 400);

        Label labelCash = new Label("Cash: 100");
        labelCash.setFont(Font.font("Verdana", 60));
        labelCash.setTextFill(Paint.valueOf("white"));
        labelCash.relocate(1400, 10);

        Label labelBet = new Label("BET");
        labelBet.setFont(Font.font("Verdana", 60));
        labelBet.setTextFill(Paint.valueOf("white"));
        labelBet.relocate(1630, 530);


        TextField textField = new TextField();
        textField.setFont(Font.font("Verdana", 30));
        textField.relocate(1430, 580);


        Button buttonHit = new Button("HIT");
        buttonHit.setPrefHeight(50);
        buttonHit.setPrefWidth(350);
        buttonHit.setFont(Font.font("Verdana", 55));
        buttonHit.relocate(1450, 180);
        Button buttonStand = new Button("STAND");
        buttonStand.setPrefHeight(50);
        buttonStand.setPrefWidth(350);
        buttonStand.setFont(Font.font("Verdana", 55));
        buttonStand.relocate(1450, 360);
        Button buttonPlay = new Button("PLAY");
        buttonPlay.setPrefHeight(50);
        buttonPlay.setPrefWidth(350);
        buttonPlay.setFont(Font.font("Verdana", 55));
        buttonPlay.relocate(1450, 800);



        rootNode.getChildren().add(rectangleBlack);
        rootNode.getChildren().add(rectangleGreen);
        rootNode.getChildren().add(labelDealer);
        rootNode.getChildren().add(labelPlayer);
        rootNode.getChildren().add(labelBlackjack);
        rootNode.getChildren().add(labelCash);
        rootNode.getChildren().add(labelBet);
        rootNode.getChildren().add(buttonHit);
        rootNode.getChildren().add(buttonStand);
        rootNode.getChildren().add(buttonPlay);
        rootNode.getChildren().add(textField);

        Scene scene = new Scene(rootNode, 1920, 1010);
        stage.setScene(scene);
        stage.setTitle("Simple application in JavaFX");
        stage.getIcons().add(new Image("icon.png"));
        stage.show();
    }


    public static void main(String[] args) throws URISyntaxException {
        launch();
    }

}