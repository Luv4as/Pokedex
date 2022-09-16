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

    /* (non-Javadoc)
     * @see javafx.application.Application#start(javafx.stage.Stage)
     */
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/main/resources/layoutUsuario.fxml"));
        Parent root = loader.load();
        stage.setScene(new Scene(root));
        stage.show();
    }

//    public void start(Stage primaryStage) throws Exception {
//
//        //Tela login
//        FXMLLoader loader = new FXMLLoader(App.class.getResource("layoutUsuario.fxml"));
//        Parent root = loader.load();
//        primaryStage.setScene(new Scene(root));
//        primaryStage.show();
//
//    }

}