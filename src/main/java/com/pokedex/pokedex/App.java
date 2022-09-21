package com.pokedex.pokedex;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override


    public void start(Stage primaryStage) throws Exception {

        //Tela login
        FXMLLoader loader = new FXMLLoader(App.class.getResource("fxml/layoutLogin.fxml"));
        Parent root = loader.load();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        primaryStage.setResizable(false);

    }

}
