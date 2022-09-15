package scenes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    /* (non-Javadoc)
     * @see javafx.application.Application#start(javafx.stage.Stage)
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
       
        //Tela login
        Parent root = FXMLLoader.load(getClass().getResource("layoutLogin.fxml"));
        Scene tela = new Scene(root);
        primaryStage.setTitle("Login");
        primaryStage.setScene(tela);
        primaryStage.show();

    }

}
