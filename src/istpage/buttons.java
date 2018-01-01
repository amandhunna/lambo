package istpage;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
//import technician.Technician;

//all buttons called by function class 
// sqlconn class methods called in buttons
//special case signbtn
//buttons defination class
//Standard class
public class buttons extends Thread{
static Scene query;
public void signbtn(Button btn,Stage primaryStage,TextField name,PasswordField pwBox,GridPane welcome){
        btn.setOnAction((ActionEvent e) -> {
           
            sqlconn sql=new sqlconn();
            sql.signin_conn(primaryStage,welcome,name,pwBox);
       
        });
} 

public void technician(Button btn,Stage primaryStage,GridPane welcome){
        btn.setOnAction((ActionEvent e) -> {
      //      Technician tt= new Technician(primaryStage); 
         System.out.println("techwindow open") ;
        });
} 
public void savebtn(GridPane grid, int i,int j,TextField txt[],TextArea txtarea[]){ 
         
    Button savebtn=new Button("Save and Print");
     grid.add(savebtn,i,j);
    //  savebtn.setDefaultButton(true);
    savebtn.setOnAction((ActionEvent e) -> {
      
        sqlconn sql=new sqlconn();
       sql.save_conn(grid, i, j,txt,txtarea);
       
    });
} 
// print preview
public void printbtn(GridPane grid, int i,int j)  {   
    
    Button pri=new Button(" Print Preview ");
     grid.add(pri,i,j);
  //  pri.setVisible(false);
//back.setOnAction((ActionEvent e) -> {
 pri.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
         IMAGECREATOR.IMAGECREATORmain2();
    BorderPane br= new BorderPane();
    br.setPadding(new Insets(10, 20, 10, 20));
    Button backbtn = new  Button("Back");
    backbtn.setCancelButton(true);
      backbtn.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent e) {
     Istpage.window.setScene(cust_entry.scene2);    
        }
  });
      Scene printpreview = new Scene(br, 2500, 2100);
     br.setLeft(backbtn);
      br.setCenter(addpreview());
     // br.setCenter(addWelcome());
      /*
     
	public void run()
   	{
       		System.out.println("r11 ");
       		try {
        		Thread.sleep(2000);
    		}catch(InterruptedException ie){ } 
       		System.out.println("r21 ");
  	}
	public static void main(String[] args)
	{
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		t1.start(); 
		
		try{
  			t1.join();	//Waiting for t1 to finish
		}catch(InterruptedException ie){}

		t2.start();
     
     */
        Istpage.window.setScene(printpreview);
        
        }
    });
}
 public GridPane addWelcome(){
 
GridPane welcome = new GridPane();
welcome.setAlignment(Pos.CENTER_LEFT);
welcome.setHgap(10);
welcome.setVgap(10);
welcome.setPadding(new Insets(2, 2, 2, 2));

//welcome.setGridLinesVisible(true);
 int i=25;
 int j=23;
HBox hbBtn =new HBox();
Button btn = new Button("Back");
hbBtn.getChildren().add(btn);
 btn.setDefaultButton(true); 
welcome.add(btn, 1+i, 14+j);                //System.out.println(1+i+" "+(14+j));

buttons sign_in=new buttons();                         //go to buton class for detail, adding functionality to sign in button using database 
//sign_in.signbtn(btn,primaryStage,name,pwBox,welcome);  // create scene2 for next page
//sign_in.technician(techbtn,primaryStage,welcome);
    return welcome;
}
    
  public  GridPane addpreview() 
  {
    GridPane grid = new GridPane();
    grid.setPadding(new Insets(10, 10, 10, 10));
    grid.setGridLinesVisible(true);
     ImageView cloverbg = new ImageView(new 
  
  Image(Istpage.class.getResourceAsStream("icon.png")));
     grid.add(cloverbg, 0, 0, 5, 5); 
     return grid;
}
 

public void backbtn(GridPane grid, int i,int j)  {   
    
    Button back=new Button("\tBACK\t");
     grid.add(back,i,j);
    back.setCancelButton(true);
//back.setOnAction((ActionEvent e) -> {
 back.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
                Istpage.window.setScene(Istpage.scene1);
functions.txtcount=0;             

        }
    });
}
public static void statusbtn(GridPane grid,int i,int j){
    Button cs=new Button("Check status");
    grid.add(cs,i,j);
  //  cs.setDefaultButton(true);
     // Stage stage = new Stage();
     
     
     cs.setOnAction((ActionEvent e) -> {
         GridPane grid3 = new GridPane();
     grid3.setAlignment(Pos.CENTER_LEFT);
     grid3.setHgap(10);
     grid3.setVgap(10);
     grid3.setPadding(new Insets(2, 2, 2, 2));
     Istpage.window.setTitle("Status Window");
     grid3.setPadding(new Insets(100, 100, 100, 10));
     Scene scene3 = new Scene(grid3, 2500, 2100);
        //grid3.setGridLinesVisible(true);
        page3fn fn3= new page3fn();
        fn3.page3fn( Istpage.window, grid3);
       Istpage.window.setScene(scene3);
        Istpage.window.show();
        query=scene3;
        });
} 

}
    
    

