package com.pokedex.pokedex.controllers;

import java.io.IOException;

import com.pokedex.pokedex.App;

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

}
