module com.example.pokedexip2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.pokedexip2 to javafx.fxml;
    exports com.example.pokedexip2;
}