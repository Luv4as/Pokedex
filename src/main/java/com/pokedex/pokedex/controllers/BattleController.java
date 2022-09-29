package com.pokedex.pokedex.controllers;

import com.pokedex.pokedex.App;
import com.pokedex.pokedex.data.PokemonData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class BattleController {

    @FXML
    private Button btGanhei;

    @FXML
    private Button btOponentefugiu;

    @FXML
    private Button btPerdi;

    @FXML
    private Button btSair;

    @FXML
    private MenuButton btSelectPoke1;

    @FXML
    private MenuButton btSelectPoke7;

    @FXML
    private ImageView imgPoke1;

    @FXML
    private ImageView imgPoke7;

    @FXML
    private ImageView pkb1;

    @FXML
    private ImageView pkb2;

    @FXML
    private TextField pokeId1;

    @FXML
    private TextField pokeId2;

    @FXML
    void action1(ActionEvent event) {
        choosePokemon(1);
    }

    @FXML
    void action2(ActionEvent event) {
        choosePokemon(2);
    }

    @FXML
    void ganhei(ActionEvent event) {

    }

    @FXML
    void oponentefugiu(ActionEvent event) {

    }

    @FXML
    void perdi(ActionEvent event) {

    }

    void choosePokemon(int n) {

            switch(n){
                case 1:
                    Integer poke = Integer.valueOf(pokeId1.getText());
                    Image imgP = new Image(PokemonData.getInstance().getPokemonInListById(poke).getSprite());
                    System.out.println(imgP);
                    pkb1.setImage(imgP);
                    pokeId1.clear();
                    break;
                case 2:
                    Integer poke2 = Integer.valueOf(pokeId2.getText());
                    Image imgP2 = new Image(PokemonData.getInstance().getPokemonInListById(poke2).getSprite());
                    System.out.println(imgP2);
                    pkb2.setImage(imgP2);
                    pokeId2.clear();
                    break;
            }

        }


    @FXML
    void sair(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(App.class.getResource("fxml/layoutRegBattle.fxml"));
        Scene tela = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Perfil");
        stage.setScene(tela);
        stage.show();
    }

}
