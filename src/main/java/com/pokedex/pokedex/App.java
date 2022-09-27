package com.pokedex.pokedex;

import com.google.auth.oauth2.OAuth2Credentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.OidcProviderConfig;
import com.google.firebase.auth.UserRecord;
import com.pokedex.pokedex.api.ApiClient;
import com.pokedex.pokedex.api.ApiInterface;
import com.pokedex.pokedex.data.PokemonData;
import com.pokedex.pokedex.firebase.FirebaseInstance;
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
        FirebaseInstance.init();
        FirebaseAuth.getInstance();

        UserRecord.CreateRequest request = new UserRecord.CreateRequest()
                .setEmail("hcs.caue@gmail.com")
                .setEmailVerified(true)
                .setPassword("2412421412421421")
                .setPhoneNumber("+81983080058")
                .setDisplayName("Deide Costa")
                .setDisabled(false);
        FirebaseAuth.getInstance().createUser(request);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//        PokemonData pkData = PokemonData.getInstance();

        //Tela login
        FXMLLoader loader = new FXMLLoader(App.class.getResource("fxml/layoutLogin.fxml"));
        Parent root = loader.load();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        primaryStage.setResizable(false);
    }
}
