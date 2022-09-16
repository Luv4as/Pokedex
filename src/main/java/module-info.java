module com.pokedex.pokedex {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.pokedex.pokedex to javafx.fxml;
    exports com.pokedex.pokedex;
}