package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class BullsAndCows extends Application {

    @Override
    public void start(Stage mainStage) throws Exception{
        startGame(mainStage);
    }


    public static void main(String[] args) {
        launch(args);
    }

    public static void startGame(Stage mainStage) throws IOException {
        Game currentGame = new Game();
        currentGame.start(mainStage);
    }
}
