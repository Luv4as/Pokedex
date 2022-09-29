package com.pokedex.pokedex.controllers;

import java.io.IOException;
import java.security.SignedObject;

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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;

public class PokedexController extends PokemonData {

    @FXML
    private Button btPerfil;

    @FXML
    private Button btRegBattle;

    @FXML
    private Label nAttackPoints;

    @FXML
    private Label nDefensePoints;

    @FXML
    private Label nHealthPoints;

    @FXML
    private Label nSpecialAPoints;

    @FXML
    private Label nSpecialDPoints;

    @FXML
    private Label nSpeedPoints;

    @FXML
    private ImageView pokeImg;

    @FXML
    private Label pokeName;

    @FXML
    private Label pokeType1;

    @FXML
    private Label pokeType2;

    @FXML
    private TextField txtPokeNumber;

    @FXML
    private Button btPokeball;

    @FXML
    private ImageView imgPokeball;

    @FXML
    void choosePokemon(ActionEvent event) {

        Integer n = 1;

        try {

            n = Integer.valueOf(txtPokeNumber.getText());

            System.out.print(n);

            pokeName.setText(PokemonData.getInstance().getPokemonInListById(n).getName().toUpperCase());
            pokeType1.setText(PokemonData.getInstance().getPokemonInListById(n).getType().get(0).getType().getName().toUpperCase());

            if (PokemonData.getInstance().getPokemonInListById(n).getType().get(1).getType().getName().equals(PokemonData.getInstance().getPokemonInListById(n).getType().get(0).getType().getName())) {
                pokeType2.setVisible(false);
            } else {
                pokeType2.setVisible(true);
                pokeType2.setText(PokemonData.getInstance().getPokemonInListById(n).getType().get(1).getType().getName().toUpperCase());
            }

            if (String.valueOf(PokemonData.getInstance().getPokemonInListById(n).getStats().get(0).getBase_stat()).equals("1")) {
                nHealthPoints.setText("61");
            } else {
                nHealthPoints.setText(String.valueOf(PokemonData.getInstance().getPokemonInListById(n).getStats().get(0).getBase_stat()));
            }

            if (String.valueOf(PokemonData.getInstance().getPokemonInListById(n).getStats().get(1).getBase_stat()).equals("2")) {
                nAttackPoints.setText("40");
            } else {
                nAttackPoints.setText(String.valueOf(PokemonData.getInstance().getPokemonInListById(n).getStats().get(1).getBase_stat()));
            }

            nDefensePoints.setText(String.valueOf(PokemonData.getInstance().getPokemonInListById(n).getStats().get(2).getBase_stat()));
            nSpecialAPoints.setText(String.valueOf(PokemonData.getInstance().getPokemonInListById(n).getStats().get(3).getBase_stat()));
            nSpecialDPoints.setText(String.valueOf(PokemonData.getInstance().getPokemonInListById(n).getStats().get(4).getBase_stat()));
            nSpeedPoints.setText(String.valueOf(PokemonData.getInstance().getPokemonInListById(n).getStats().get(5).getBase_stat()));

            Image imgP = new Image(PokemonData.getInstance().getPokemonInListById(n).getSprite());
            pokeImg.setImage(imgP);

            txtPokeNumber.clear();

        }
        catch (Exception ex) {

            n = 1;

            System.out.print(n);

            pokeName.setText(PokemonData.getInstance().getPokemonInListById(n).getName().toUpperCase());
            pokeType1.setText(PokemonData.getInstance().getPokemonInListById(n).getType().get(0).getType().getName().toUpperCase());

            if (PokemonData.getInstance().getPokemonInListById(n).getType().get(1).getType().getName().equals(PokemonData.getInstance().getPokemonInListById(n).getType().get(0).getType().getName())) {
                pokeType2.setVisible(false);
            } else {
                pokeType2.setVisible(true);
                pokeType2.setText(PokemonData.getInstance().getPokemonInListById(n).getType().get(1).getType().getName().toUpperCase());
            }

            if (String.valueOf(PokemonData.getInstance().getPokemonInListById(n).getStats().get(0).getBase_stat()).equals("1")) {
                nHealthPoints.setText("61");
            } else {
                nHealthPoints.setText(String.valueOf(PokemonData.getInstance().getPokemonInListById(n).getStats().get(0).getBase_stat()));
            }

            if (String.valueOf(PokemonData.getInstance().getPokemonInListById(n).getStats().get(1).getBase_stat()).equals("2")) {
                nAttackPoints.setText("40");
            } else {
                nAttackPoints.setText(String.valueOf(PokemonData.getInstance().getPokemonInListById(n).getStats().get(1).getBase_stat()));
            }

            nDefensePoints.setText(String.valueOf(PokemonData.getInstance().getPokemonInListById(n).getStats().get(2).getBase_stat()));
            nSpecialAPoints.setText(String.valueOf(PokemonData.getInstance().getPokemonInListById(n).getStats().get(3).getBase_stat()));
            nSpecialDPoints.setText(String.valueOf(PokemonData.getInstance().getPokemonInListById(n).getStats().get(4).getBase_stat()));
            nSpeedPoints.setText(String.valueOf(PokemonData.getInstance().getPokemonInListById(n).getStats().get(5).getBase_stat()));

            Image imgP = new Image(PokemonData.getInstance().getPokemonInListById(n).getSprite());
            pokeImg.setImage(imgP);

            txtPokeNumber.clear();

        }

    }

    @FXML
    void btCaptureEnter(MouseEvent event) {
        imgPokeball.setOpacity(1);
    }

    @FXML
    void btCaptureExit(MouseEvent event) {
        imgPokeball.setOpacity(0.4);
    }

    @FXML
    void capturePokemon(ActionEvent event) {

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
