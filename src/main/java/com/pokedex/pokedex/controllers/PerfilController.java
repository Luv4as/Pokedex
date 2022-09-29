package com.pokedex.pokedex.controllers;

import java.io.IOException;

import com.pokedex.pokedex.App;

import com.pokedex.pokedex.data.UsersData;
import com.pokedex.pokedex.firebase.DatabaseInstance;
import com.pokedex.pokedex.model.trainer.PokemonTrainer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
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
    private ImageView badge1, badge2, badge3, badge4, badge5, badge6, badge7, badge8;

    @FXML
    private ImageView bg1, bg2, bg3, bg4, bg5, bg6, bg7, bg8;

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

        if(trn.getBadges().get(0).equals(true)) {
            badge1.opacityProperty().set(1);
            bg1.opacityProperty().set(1);
        } else {
            badge1.opacityProperty().set(0.3);
            bg1.opacityProperty().set(0.3);
        }

        if(trn.getBadges().get(1)) {
            badge2.opacityProperty().set(1);
            bg2.opacityProperty().set(1);
        } else {
            badge2.opacityProperty().set(0.3);
            bg2.opacityProperty().set(0.3);
        }

        if(trn.getBadges().get(2)) {
            badge3.opacityProperty().set(1);
            bg3.opacityProperty().set(1);
        } else {
            badge3.opacityProperty().set(0.3);
            bg3.opacityProperty().set(0.3);
        }

        if(trn.getBadges().get(3)) {
            badge4.opacityProperty().set(1);
            bg4.opacityProperty().set(1);
        } else {
            badge4.opacityProperty().set(0.3);
            bg4.opacityProperty().set(0.3);
        }

        if(trn.getBadges().get(4)) {
            badge5.opacityProperty().set(1);
            bg5.opacityProperty().set(1);
        } else {
            badge5.opacityProperty().set(0.3);
            bg5.opacityProperty().set(0.3);
        }

        if(trn.getBadges().get(5)) {
            badge6.opacityProperty().set(1);
            bg6.opacityProperty().set(1);
        } else {
            badge6.opacityProperty().set(0.3);
            bg6.opacityProperty().set(0.3);
        }

        if(trn.getBadges().get(6)) {
            badge7.opacityProperty().set(1);
            bg7.opacityProperty().set(1);
        } else {
            badge7.opacityProperty().set(0.3);
            bg7.opacityProperty().set(0.3);
        }

        if(trn.getBadges().get(7)) {
            badge8.opacityProperty().set(1);
            bg8.opacityProperty().set(1);
        } else {
            badge8.opacityProperty().set(0.3);
            bg8.opacityProperty().set(0.3);
        }
    }

    @FXML
    void toggleBadge1() {
        PokemonTrainer trn = UsersData.getInstance().getUsersInListById(UsersData.getInstance().getCurrentUserId());
        trn.setInBadge(0, trn.getBadges().get(0) ? false : true);
        DatabaseInstance.Set(String.format("users/%d/badges/%d", UsersData.getInstance().getCurrentUserIndex(), 0), trn.getBadges().get(0) ? false : true);
        if(trn.getBadges().get(0)) {
            badge1.opacityProperty().set(1);
            bg1.opacityProperty().set(1);
        } else {
            badge1.opacityProperty().set(0.3);
            bg1.opacityProperty().set(0.3);
        }
    }

    @FXML
    void toggleBadge2() {
        PokemonTrainer trn = UsersData.getInstance().getUsersInListById(UsersData.getInstance().getCurrentUserId());
        trn.setInBadge(1, trn.getBadges().get(1) ? false : true);
        DatabaseInstance.Set(String.format("users/%d/badges/%d", UsersData.getInstance().getCurrentUserIndex(), 1), trn.getBadges().get(0) ? false : true);
        if(trn.getBadges().get(1)) {
            badge2.opacityProperty().set(1);
            bg2.opacityProperty().set(1);
        } else {
            badge2.opacityProperty().set(0.3);
            bg2.opacityProperty().set(0.3);
        }
    }

    @FXML
    void toggleBadge3() {
        PokemonTrainer trn = UsersData.getInstance().getUsersInListById(UsersData.getInstance().getCurrentUserId());
        trn.setInBadge(2, trn.getBadges().get(2) ? false : true);
        DatabaseInstance.Set(String.format("users/%d/badges/%d", UsersData.getInstance().getCurrentUserIndex(), 2), trn.getBadges().get(0) ? false : true);
        if(trn.getBadges().get(2)) {
            badge3.opacityProperty().set(1);
            bg3.opacityProperty().set(1);
        } else {
            badge3.opacityProperty().set(0.3);
            bg3 .opacityProperty().set(0.3);
        }
    }

    @FXML
    void toggleBadge4() {
        PokemonTrainer trn = UsersData.getInstance().getUsersInListById(UsersData.getInstance().getCurrentUserId());
        trn.setInBadge(3, trn.getBadges().get(3) ? false : true);
        DatabaseInstance.Set(String.format("users/%d/badges/%d", UsersData.getInstance().getCurrentUserIndex(), 3), trn.getBadges().get(0) ? false : true);
        if(trn.getBadges().get(3)) {
            badge4.opacityProperty().set(1);
            bg4.opacityProperty().set(1);
        } else {
            badge4.opacityProperty().set(0.3);
            bg4.opacityProperty().set(0.3);
        }
    }

    @FXML
    void toggleBadge5() {
        PokemonTrainer trn = UsersData.getInstance().getUsersInListById(UsersData.getInstance().getCurrentUserId());
        trn.setInBadge(4, trn.getBadges().get(4) ? false : true);
        DatabaseInstance.Set(String.format("users/%d/badges/%d", UsersData.getInstance().getCurrentUserIndex(), 4), trn.getBadges().get(0) ? false : true);
        if(trn.getBadges().get(4)) {
            badge5.opacityProperty().set(1);
            bg5.opacityProperty().set(1);
        } else {
            badge5.opacityProperty().set(0.3);
            bg5.opacityProperty().set(0.3);
        }
    }

    @FXML
    void toggleBadge6() {
        PokemonTrainer trn = UsersData.getInstance().getUsersInListById(UsersData.getInstance().getCurrentUserId());
        trn.setInBadge(5, trn.getBadges().get(5) ? false : true);
        DatabaseInstance.Set(String.format("users/%d/badges/%d", UsersData.getInstance().getCurrentUserIndex(), 5), trn.getBadges().get(0) ? false : true);
        if(trn.getBadges().get(5)) {
            badge6.opacityProperty().set(1);
            bg6.opacityProperty().set(1);
        } else {
            badge6.opacityProperty().set(0.3);
            bg6.opacityProperty().set(0.3);
        }
    }

    @FXML
    void toggleBadge7() {
        PokemonTrainer trn = UsersData.getInstance().getUsersInListById(UsersData.getInstance().getCurrentUserId());
        trn.setInBadge(6, trn.getBadges().get(6) ? false : true);
        DatabaseInstance.Set(String.format("users/%d/badges/%d", UsersData.getInstance().getCurrentUserIndex(), 6), trn.getBadges().get(0) ? false : true);
        if(trn.getBadges().get(6)) {
            badge7.opacityProperty().set(1);
            bg7.opacityProperty().set(1);
        } else {
            badge7.opacityProperty().set(0.3);
            bg7.opacityProperty().set(0.3);
        }
    }

    @FXML
    void toggleBadge8() {
        PokemonTrainer trn = UsersData.getInstance().getUsersInListById(UsersData.getInstance().getCurrentUserId());
        trn.setInBadge(7, trn.getBadges().get(7) ? false : true);
        DatabaseInstance.Set(String.format("users/%d/badges/%d", UsersData.getInstance().getCurrentUserIndex(), 7), trn.getBadges().get(0) ? false : true);
        if(trn.getBadges().get(7)) {
            badge8.opacityProperty().set(1);
            bg8.opacityProperty().set(1);
        } else {
            badge8.opacityProperty().set(0.3);
            bg8.opacityProperty().set(0.3);
        }
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
