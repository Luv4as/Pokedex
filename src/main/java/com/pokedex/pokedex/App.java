package com.pokedex.pokedex;


import com.google.firebase.database.FirebaseDatabase;
import com.pokedex.pokedex.firebase.DatabaseInstance;
import com.pokedex.pokedex.firebase.FirebaseInstance;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application {

    public static void main(String[] args) throws Exception {
        FirebaseInstance.init();
        DatabaseInstance.Set("22", "2");
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //Tela login
        FXMLLoader loader = new FXMLLoader(App.class.getResource("fxml/layoutLogin.fxml"));
        Parent root = loader.load();
        String css = App.class.getResource("css/layoutPerfil.css").toExternalForm();
        primaryStage.setScene(new Scene(root));
        root.getStylesheets().add(css);
        primaryStage.show();
        primaryStage.setResizable(false);

    }

}
