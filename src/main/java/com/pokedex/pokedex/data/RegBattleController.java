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

public class RegBattleController {

    @FXML
    private Button btPerfil;

    @FXML
    private Button btPokedex;

    @FXML
    private Button btRegBattle;

    @FXML
    private Button btRegistro;

    @FXML
    void adicionarRegistro(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(App.class.getResource("fxml/layoutBattle.fxml"));
        Scene tela = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Battle");
        stage.setScene(tela);
        stage.show();
    }

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
    void changeToPokedex(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(App.class.getResource("fxml/layoutPokedex.fxml"));
        Scene tela = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Pokedex");
        stage.setScene(tela);
        stage.show();
    }

}
