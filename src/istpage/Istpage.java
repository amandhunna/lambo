/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package istpage;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
//1.1 page
//istpage.java and welcomeq.java combines to form istpage 
//next goto  welcomeq

public class Istpage extends Application            
{
   static  Scene scene1;
   static  Stage window;
 @Override
 public void start(Stage primaryStage)
 {          
  BorderPane border = new BorderPane();
  border.setLeft(addGridPane());                  
 border.setCenter(welcomeq.addWelcome(primaryStage));  
 primaryStage.setTitle(" WELCOME ");
 Scene scene = new Scene(border,2500 ,2100);        //step 1 add scene
 primaryStage.setScene(scene);                     //step 2 add scene to stage
 primaryStage.show();                              //step 3 show stage
 scene1=scene; 
 window=primaryStage;
 }

    public  GridPane addGridPane() {
    GridPane grid = new GridPane();
    grid.setPadding(new Insets(10, 10, 10, 10));
    //grid.setGridLinesVisible(true);
     ImageView bg = new ImageView(new Image(Istpage.class.getResourceAsStream("images.jpg")));
  
    // new Image(Istpage.class.getResourceAsStream("icon.jpg")));
     grid.add(bg, 0, 0);//, 1, 2); 
     return grid;
}
    public static void main(String[] args) {
        launch(args);
    }
   
}
