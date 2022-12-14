package com.pokedex.pokedex.controllers;

import java.io.IOException;

import com.pokedex.pokedex.App;

import com.pokedex.pokedex.data.UsersData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private Button btLogin;

    @FXML
    private TextField textID;

    @FXML
    void logar(ActionEvent event) throws IOException {

        try {
            UsersData.getInstance().setCurrentUserId(textID.getText());

            Parent root = FXMLLoader.load(App.class.getResource("fxml/layoutPerfil.fxml"));
            Scene tela = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            String css = App.class.getResource("css/layoutPerfil.css").toExternalForm();
            root.getStylesheets().add(css);
            stage.setTitle("Perfil");
            stage.setScene(tela);
            stage.show();
        }
        catch (Exception ex) {
            textID.setText("ID ERRADO!");
        }
    }

}
