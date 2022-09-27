module com.pokedex.pokedex {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    requires retrofit2;
    requires retrofit2.converter.gson;
    requires google.api.client.gson;
    requires firebase.admin;
    requires com.google.auth.oauth2;
    requires com.google.auth;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.google.gson;
    requires picasso;

    opens com.pokedex.pokedex to javafx.fxml;
    opens com.pokedex.pokedex.model.pkm;
    opens com.pokedex.pokedex.enums;
    opens com.pokedex.pokedex.controllers to javafx.fxml;
    opens com.pokedex.pokedex.model.trainer;

    exports com.pokedex.pokedex.model.trainer;
    exports com.pokedex.pokedex.model.pkm;
    exports com.pokedex.pokedex.enums;
    exports com.pokedex.pokedex;
}