package com.pokedex.pokedex.controllers;

import java.io.IOException;

import com.pokedex.pokedex.App;

import com.pokedex.pokedex.data.RegBattleData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
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
    private GridPane gridPane;

    @FXML
    private ImageView pkAlly;

    @FXML
    private ImageView pkEnemy;

    @FXML
    public static Text win1;

    @FXML
    public static Text win2;

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
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        String css = App.class.getResource("css/layoutPokedex.css").toExternalForm();
        root.getStylesheets().add(css);
        stage.setTitle("Pokedex");
        stage.setScene(tela);
        stage.show();
    }

    void initialize() {
        setBattle();
    }

    void start() {
        System.out.println(224);
    }

    public static void setBattle() {
//        win1.setVisible(RegBattleData.getInstance().getButtonsVisible().get(0));
//        win2.setVisible(RegBattleData.getInstance().getButtonsVisible().get(1));
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
        btPokedex.setStyle(HOVERED_BUTTON_STYLE);
    }

    @FXML
    void removeHover2() {
        btPokedex.setStyle(IDLE_BUTTON_STYLE);
    }

    public Button getBtPerfil() {
        return btPerfil;
    }

    public void setBtPerfil(Button btPerfil) {
        this.btPerfil = btPerfil;
    }

    public Button getBtPokedex() {
        return btPokedex;
    }

    public void setBtPokedex(Button btPokedex) {
        this.btPokedex = btPokedex;
    }

    public Button getBtRegBattle() {
        return btRegBattle;
    }

    public void setBtRegBattle(Button btRegBattle) {
        this.btRegBattle = btRegBattle;
    }

    public Button getBtRegistro() {
        return btRegistro;
    }

    public void setBtRegistro(Button btRegistro) {
        this.btRegistro = btRegistro;
    }

    public GridPane getGridPane() {
        return gridPane;
    }

    public void setGridPane(GridPane gridPane) {
        this.gridPane = gridPane;
    }

    public ImageView getPkAlly() {
        return pkAlly;
    }

    public void setPkAlly(ImageView pkAlly) {
        this.pkAlly = pkAlly;
    }

    public ImageView getPkEnemy() {
        return pkEnemy;
    }

    public void setPkEnemy(ImageView pkEnemy) {
        this.pkEnemy = pkEnemy;
    }

    public Text getWin1() {
        return win1;
    }

    public void setWin1(Text win1) {
        this.win1 = win1;
    }

    public Text getWin2() {
        return win2;
    }

    public void setWin2(Text win2) {
        this.win2 = win2;
    }
}
