package main;

//import com.sun.org.apache.xpath.internal.operations.String;
import javafx.beans.NamedArg;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 * Created by quentin on 10/12/2016.
 */
public class MainView extends Scene {
   // private Player player;
    private Group group;
    private String title;
    private TitleCase titleCase;


    public MainView(@NamedArg("root") Parent root, @NamedArg("width") double width, @NamedArg("height") double height) {
        super(root, width, height);
        WebView browser = new WebView();
        WebEngine webEngine = browser.getEngine();
        webEngine.load("https://google.com");

        // create the Desktop
        Stage stage= new Stage();
        stage.setTitle("Youtube Desktop");

        //Création du rectangle rouge
        Rectangle rectangleRed= new Rectangle();
        rectangleRed.setTranslateX(0);
        rectangleRed.setTranslateX(0);
        rectangleRed.setWidth(250);
        rectangleRed.setHeight(height);
        rectangleRed.setFill(Color.RED);
        group= (Group)root;
        group.getChildren().add(rectangleRed);

        //Création bouton home
        Bouton home= new Bouton("Home",20,40,210,50,Color.WHITE);
        group.getChildren().add(home);

        //Création bouton My Videos
        Bouton myVideos= new Bouton("My Videos",20,110,210,50,Color.WHITE);
        group.getChildren().add(myVideos);

        //Création bouton Connection
        Bouton connection= new Bouton("Connection",1100,40,210,50,Color.WHITE);
        group.getChildren().add(connection);

        //intégration player
        group.autoSizeChildrenProperty();
        //Player player= new Player("M7lc1UVf-VE");
        //group.getChildren().add(player);


    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title=title;
        titleCase=new TitleCase(this.title,10,10);
        group.getChildren().add(titleCase);
    }
    /*public void updateTitle(){
        TitleCase titlecase=new TitleCase(this.title,10,10);
        group.getChildren().add(titlecase);
    }*/


   /* public Player getPlayer(){
        return this.player;
    }
    public void addPlayer(){
        group.getChildren().add(player);
    }
    public void removePlayer(){

    }*/



}
