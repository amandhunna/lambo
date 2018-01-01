

package istpage;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
//in use
// this class called in signin_conn() of buttons class
// next class cust_detail_form  
public class cust_entry {
    static Scene scene2;
public void secpage(Stage primaryStage){
primaryStage.setTitle("Enter Details");
   
GridPane grid = new GridPane();     //declaring the layout of second page
grid.setAlignment(Pos.TOP_LEFT);
grid.setHgap(10);
grid.setVgap(10);
grid.setPadding(new Insets(10,10,10,10));

 scene2 = new Scene(grid, 2500, 2000);
primaryStage.setScene(scene2);

cust_detail_form cdf=new cust_detail_form(grid); //constructor// this class includes  ,customer deatils, product details,and other control buttons

}
}
