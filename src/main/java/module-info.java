module com.pokedex.pokedex {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.pokedex.pokedex to javafx.fxml;

    opens com.pokedex.pokedex.data to javafx.fxml;

    exports com.pokedex.pokedex;
}