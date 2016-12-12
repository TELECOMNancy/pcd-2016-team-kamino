package sample;

import javafx.application.Application;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import main.MainView;

public class Main extends Application {
    private Scene scene;
    @Override public void start(Stage stage) {

        /*// create the scene
        stage.setTitle("Web MainView");
        scene = new Scene(new Browser(),750,500, Color.web("#666970"));
        stage.setScene(scene);
        scene.getStylesheets().add("webviewsample/BrowserToolbar.css");
        stage.show();*/


        WebView webview = new WebView();
        webview.getEngine().load(
                Main.class.getResource("/player.html").toExternalForm()
        );
        stage.setScene(new Scene(webview));
        stage.show();

        //create Desktop
        Group root2 = new Group();
        //MainView mainView= new MainView(root2,300,200);
        Stage stage1 = new Stage();
        stage1.setScene(new MainView(root2,1280,800));
        stage1.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
