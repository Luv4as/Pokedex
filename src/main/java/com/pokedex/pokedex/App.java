package com.pokedex.pokedex;

import com.pokedex.pokedex.api.ApiClient;
import com.pokedex.pokedex.api.ApiInterface;
import com.pokedex.pokedex.data.PokemonData;
import com.pokedex.pokedex.model.pkm.Pokemon;
import com.pokedex.pokedex.model.pkm.PokemonMovement;
import com.pokedex.pokedex.model.pkm.PokemonType;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import retrofit2.Call;

public class App extends Application {

    public static void main(String[] args) throws Exception {
//        FirebaseInstance.init();
//        DatabaseInstance.Set("22", "2");
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        PokemonData pkData = PokemonData.getInstance();

        //Tela login
        FXMLLoader loader = new FXMLLoader(App.class.getResource("fxml/layoutLogin.fxml"));
        Parent root = loader.load();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        primaryStage.setResizable(false);
    }
}
