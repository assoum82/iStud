package iStud.view.Menu;

import Main.Connexion;
import Main.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

/**
 * Created by chawki on 07/12/16.
 */
public class RootLayoutControl {

    private Connexion cnx = new Connexion();
    private static BorderPane rootLayout;


    public static BorderPane getRootLayout() {
        return rootLayout;
    }

    public static void setRootLayout(BorderPane rootLayout) {
        RootLayoutControl.rootLayout = rootLayout;
    }

    public static void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(RootLayoutControl.class.getResource("RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            Main.getPrimaryStage().setScene(scene);
            Main.getPrimaryStage().show();
            Main.getPrimaryStage().setAlwaysOnTop(true);
            Main.getPrimaryStage().centerOnScreen();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void creatBDD() {
        cnx.creation();
    }

    @FXML
    private void supBDD() {
        cnx.viderbdd();
    }
}
