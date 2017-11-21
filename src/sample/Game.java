package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.*;
import java.util.SortedSet;
import java.util.TreeSet;

public class Game {
    private double difficulty;
    private int number;
    private Stage mainStage;
    private Players players;
    private TreeSet<String> listPlayers;

    public void start(Stage mainStage) throws IOException {
        this.mainStage = mainStage;
        Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        mainStage.setTitle("Bulls and Cows");
        Scene scene = new Scene(root);
        mainStage.setScene(scene);
        mainStage.show();

        initializePlayer();
    }

    private void initializePlayer() throws IOException {
        Parent welcomeWindows = FXMLLoader.load(getClass().getResource("WelcomeWindow.fxml"));
        Stage welcomeStage = new Stage();
        welcomeStage.initModality(Modality.APPLICATION_MODAL);
        welcomeStage.setTitle("Welcome Window");
        Scene welcomeScene = new Scene(welcomeWindows);
        welcomeStage.setScene(welcomeScene);

        TextField enterText = (TextField) welcomeScene.lookup("#enterText");
        Slider slider = (Slider) welcomeScene.lookup("#difficulty");

        listPlayers = new TreeSet<>();

        ChoiceBox player = (ChoiceBox) welcomeScene.lookup("#player");
        listPlayers.add("Nick");
        listPlayers.add("Dick");
        listPlayers.add("Anna");
        player.getItems().addAll("Nick", "Dick", "Anna");

        Button btn = (Button) welcomeScene.lookup("#enterButton");
        btn.setOnAction(e -> System.out.println("Click"));


        welcomeStage.showAndWait();
        //BullsAndCows.startGame(mainStage);
    }


}
