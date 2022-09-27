package com.pokedex.pokedex.controllers;

import java.io.IOException;

import com.pokedex.pokedex.App;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
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

    private GridPane grid;


    private Parent root;

    private Button[][] gridButtons;


    @FXML
    private GridPane gridPane;

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
        String css = App.class.getResource("css/layoutPerfil.css").toExternalForm();
        root.getStylesheets().add(css);
        stage.setTitle("Perfil");
        stage.setScene(tela);
        stage.show();
    }

    @FXML
    void changeToPokedex(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(App.class.getResource("fxml/layoutPokedex.fxml"));
        Scene tela = new Scene(root);


        gridButtons = new Button[38][4];
        for (int x = 0; x < 38; x++) {
            for (int y = 0; y < 4; y++) {
                gridButtons[x][y] = new Button("n");
                grid.add(gridButtons[x][y], y, x);
            }
        }

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        String css = App.class.getResource("css/layoutPokedex.css").toExternalForm();
        root.getStylesheets().add(css);
        stage.setTitle("Pokedex");
        stage.setScene(tela);
        stage.show();
    }

        final String IDLE_BUTTON_STYLE = "-fx-background-color: #F0AAA6; -fx-background-radius: 10px;";
        final String HOVERED_BUTTON_STYLE = "-fx-background-color: #FA7B7B; -fx-background-radius: 10px;";

        @FXML
        void addHover1 () {
            btPerfil.setStyle(HOVERED_BUTTON_STYLE);
        }

        @FXML
        void removeHover1 () {
            btPerfil.setStyle(IDLE_BUTTON_STYLE);
        }

        @FXML
        void addHover2 () {
            btPokedex.setStyle(HOVERED_BUTTON_STYLE);
        }

        @FXML
        void removeHover2 () {
            btPokedex.setStyle(IDLE_BUTTON_STYLE);
        }

    }