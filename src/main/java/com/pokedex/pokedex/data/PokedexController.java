package com.pokedex.pokedex.data;

import java.io.IOException;

import com.pokedex.pokedex.App;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Node;

public class PokedexController {

    @FXML
    private Button btPerfil;

    @FXML
    private Button btPokedex;

    @FXML
    private Button btRegBattle;


    @FXML
    void changeToPerfil(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(App.class.getResource("fxml/layoutPerfil.fxml"));
        Scene tela = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Perfil");
        stage.setScene(tela);
        stage.show();
    }

    @FXML
    void changeToRegBattle(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(App.class.getResource("fxml/layoutRegBattle.fxml"));
        Scene tela = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Registro de Batalhas");
        stage.setScene(tela);
        stage.show();
    }

}