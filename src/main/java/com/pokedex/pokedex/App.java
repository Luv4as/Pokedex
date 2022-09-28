package com.pokedex.pokedex;

import com.google.auth.oauth2.OAuth2Credentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.OidcProviderConfig;
import com.google.firebase.auth.UserRecord;
import com.pokedex.pokedex.api.ApiClient;
import com.pokedex.pokedex.api.ApiInterface;
import com.pokedex.pokedex.data.PokemonData;
import com.pokedex.pokedex.data.UsersData;
import com.pokedex.pokedex.firebase.DatabaseInstance;
import com.pokedex.pokedex.firebase.FirebaseInstance;
import com.pokedex.pokedex.model.pkm.CapturedPokemon;
import com.pokedex.pokedex.model.pkm.Pokemon;
import com.pokedex.pokedex.model.pkm.PokemonMovement;
import com.pokedex.pokedex.model.pkm.PokemonType;
import com.pokedex.pokedex.model.trainer.PokemonTrainer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import retrofit2.Call;

import java.util.ArrayList;

public class App extends Application {

    public static void main(String[] args) throws Exception {
        FirebaseInstance.init();
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//        ArrayList<Boolean> badges = new ArrayList<Boolean>();
//        badges.add(false); badges.add(false);
//        badges.add(false); badges.add(false);
//        badges.add(false); badges.add(false);
//        badges.add(false); badges.add(false);
//        PokemonTrainer user = new PokemonTrainer(0, 0, 0, 0, 0, "", "", "", null, badges);
//        UsersData.getInstance().addUserInList(user);

        PokemonData pkData = PokemonData.getInstance();
//        UsersData trainerData = UsersData.getInstance();

        //Tela login
        FXMLLoader loader = new FXMLLoader(App.class.getResource("fxml/layoutLogin.fxml"));
        Parent root = loader.load();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        primaryStage.setResizable(false);
    }
}
