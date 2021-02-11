package Main;

import Controllers.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends MainController {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        primaryStage.setTitle("Risk");
        primaryStage.setScene(new Scene(root, 1000, 800));
        primaryStage.show();

    }




    public static void main(String[] args) {
        launch(args);
    }
}