package com.pokedex.pokedex.controllers;

import java.io.IOException;

import com.pokedex.pokedex.App;

import com.pokedex.pokedex.data.UsersData;
import com.pokedex.pokedex.model.trainer.PokemonTrainer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Node;

public class PerfilController {

    @FXML
    private Button btPerfil;

    @FXML
    private Button btPokedex;

    @FXML
    private Button btRegBattle;

    @FXML
    private Button btSwitchPKC;

    @FXML
    private Button btSwitchTRN;

    @FXML
    private Label nBatFeitas;

    @FXML
    private Label nDer;

    @FXML
    private Label nFugas;

    @FXML
    private Label nInsignias;

    @FXML
    private Label nPokCapt;

    @FXML
    private Label nVit;
    @FXML
    private Label nomeUser;

    @FXML
    void change(ActionEvent event) {

    }

    @FXML
    void changeToPokedex(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(App.class.getResource("fxml/layoutPokedex.fxml"));
        Scene tela = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        String css = App.class.getResource("css/layoutPokedex.css").toExternalForm();
        root.getStylesheets().add(css);
        stage.setTitle("Pokedex");
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

    public void initialize() throws Exception {
        PokemonTrainer trn = UsersData.getInstance().getUsersInListById(UsersData.getInstance().getCurrentUserId());
        nomeUser.setText(trn.getNickname());
        nDer.setText(String.valueOf(trn.getnDer()));
        nFugas.setText(String.valueOf(trn.getnFugas()));
        nVit.setText(String.valueOf(trn.getnVit()));
        nBatFeitas.setText(String.valueOf(trn.getnBatFeitas()));
    }

    final String IDLE_BUTTON_STYLE = "-fx-background-color: #F0AAA6; -fx-background-radius: 10px;";
    final String HOVERED_BUTTON_STYLE = "-fx-background-color: #FA7B7B; -fx-background-radius: 10px;";

    @FXML
    void addHover1() {
        btPokedex.setStyle(HOVERED_BUTTON_STYLE);
    }

    @FXML
    void removeHover1() {
        btPokedex.setStyle(IDLE_BUTTON_STYLE);
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
