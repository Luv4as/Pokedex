package com.pokedex.pokedex.controllers;

import java.io.IOException;

import com.pokedex.pokedex.App;

import com.pokedex.pokedex.data.PokemonData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Node;

public class PokedexController extends PokemonData {

    @FXML
    private Button btPerfil;

    @FXML
    private Button btPokedex;

    @FXML
    private Button btRegBattle;

    @FXML
    private ImageView pokeImg;

    @FXML
    private Label pokeName;

    @FXML
    private Label pokeType;

    @FXML
    private TextField txtPokeNumber;

    @FXML
    void choosePokemon(ActionEvent event) {

        Integer n = Integer.valueOf(txtPokeNumber.getText());
        System.out.print(n);

        pokeName.setText(PokemonData.getInstance().getPokemonInListById(n).getName());
        pokeType.setText(PokemonData.getInstance().getPokemonInListById(n).getType().get(0).getType().getName());
//        pokeImg.setImage(getPokemonInList(n).getSprite());

    }


    @FXML
    void changeToPerfil(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(App.class.getResource("fxml/layoutPerfil.fxml"));
        Scene tela = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        String css = App.class.getResource("css/layoutPerfil.css").toExternalForm();
        root.getStylesheets().add(css);
        stage.setTitle("Perfil");
        stage.setScene(tela);
        stage.show();
    }

    @FXML
    void changeToRegBattle(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(App.class.getResource("fxml/layoutRegBattle.fxml"));
        Scene tela = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        String css = App.class.getResource("css/layoutRegBattle.css").toExternalForm();
        root.getStylesheets().add(css);
        stage.setTitle("Registro de Batalhas");
        stage.setScene(tela);
        stage.show();
    }
    void initialize() {

    }

    final String IDLE_BUTTON_STYLE = "-fx-background-color: #F0AAA6; -fx-background-radius: 10px;";
    final String HOVERED_BUTTON_STYLE = "-fx-background-color: #FA7B7B; -fx-background-radius: 10px;";

    @FXML
    void addHover1() {
        btPerfil.setStyle(HOVERED_BUTTON_STYLE);
    }

    @FXML
    void removeHover1() {
        btPerfil.setStyle(IDLE_BUTTON_STYLE);
    }

    @FXML
    void addHover2() {
        btRegBattle.setStyle(HOVERED_BUTTON_STYLE);
    }

    @FXML
    void removeHover2() {
        btRegBattle.setStyle(IDLE_BUTTON_STYLE);
    }

    
}
