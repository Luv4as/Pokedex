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

public class BattleController {

    @FXML
    private Button btAdd1;

    @FXML
    private Button btAdd10;

    @FXML
    private Button btAdd11;

    @FXML
    private Button btAdd12;

    @FXML
    private Button btAdd2;

    @FXML
    private Button btAdd3;

    @FXML
    private Button btAdd4;

    @FXML
    private Button btAdd5;

    @FXML
    private Button btAdd6;

    @FXML
    private Button btAdd7;

    @FXML
    private Button btAdd8;

    @FXML
    private Button btAdd9;

    @FXML
    private Button btGanhei;

    @FXML
    private Button btOponentefugiu;

    @FXML
    private Button btPerdi;

    @FXML
    private Button btSair;

    @FXML
    void escolherPokemon(ActionEvent event) {

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
