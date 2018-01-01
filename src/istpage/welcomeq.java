package istpage;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
//1.2 page
//contains sign in button and move to 
//next cust_entry.java
public class welcomeq {

    public static GridPane addWelcome( Stage primaryStage){
 
GridPane welcome = new GridPane();
welcome.setAlignment(Pos.CENTER_LEFT);
welcome.setHgap(10);
welcome.setVgap(10);
welcome.setPadding(new Insets(2, 2, 2, 2));

//welcome.setGridLinesVisible(true);
 int i=25;
 int j=23;
int a=2,b=1;
Text scenetitle = new Text("Welcome");
scenetitle.setFont(Font.font("Tahoma", FontWeight.BOLD, 50));
welcome.add(scenetitle,i,j+2, 3,8 );

//......................................................username label and textfield
Label userName = new Label("User Name:");
welcome.add(userName, i+0, j+10);

TextField name = new TextField();
welcome.add(name, i+1, j+10,a,b);
name.setPromptText("Enter user name.");
name.setPrefColumnCount(10);
name.setFont(Font.font("SanSerif",10)); //10= textfieldsize
name.setText("aman");
//........................................................password label and password field
Label pw = new Label(" Password: ");
welcome.add(pw, i+0,j+ 12);
PasswordField pwBox = new PasswordField();
welcome.add(pwBox,i+1, j+12,a,b);
pwBox.setText("@aman");
//......................................."..........Technician Window in button
Button techbtn = new Button("Technician Window");
HBox hbBtn = new HBox(10);
hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
techbtn.setCancelButton(true); 
hbBtn.getChildren().add(techbtn);
//welcome.add(techbtn, 2+i, 14+j);    
//.......................................".................sign in button
Button btn = new Button("Sign in");
hbBtn.getChildren().add(btn);
 btn.setDefaultButton(true); 
welcome.add(btn, 1+i, 14+j);                //System.out.println(1+i+" "+(14+j));
//..............................................................................
Label unNamed = new Label();
welcome.add(unNamed, i+1, j+20);

//....................................................................................
buttons sign_in=new buttons();                         //go to buton class for detail, adding functionality to sign in button using database 
sign_in.signbtn(btn,primaryStage,name,pwBox,welcome);  // create scene2 for next page
sign_in.technician(techbtn,primaryStage,welcome);
    return welcome;
}
    
        }



