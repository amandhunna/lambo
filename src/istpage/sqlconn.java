package istpage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Amanjot Singh
 */
public class sqlconn {
 
public void signin_conn(Stage primaryStage,GridPane welcome,TextField name,PasswordField pwBox){
 boolean bool=true;
try {
  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","C@t143:)");  
Statement stmt=con.createStatement();  

ResultSet rs=stmt.executeQuery("select * from emp where   empname='"+name.getText()+"'  AND pass='"+pwBox.getText()+"'"); 

while(rs.next())
{           
          bool= false;
          System.out.println("login successful");
          System.out.println("verified");
           
              cust_entry ce= new cust_entry();
              ce.secpage(primaryStage);
              primaryStage.show(); 
 }
      if(bool){
      Label warn=new Label("username or password incorrect");
              welcome.add(warn,25,38,4,4);
              warn.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
              System.out.println("login unsuccessful");
        }
          
   
 
con.close();  
}
catch(Exception et)
        { System.out.println(et);
        
              Label warn=new Label("database is not accessible");
              welcome.add(warn,25,40,5,5);
              warn.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
              System.out.println("login unsuccessful");
        
        }
}

public void   save_conn(GridPane grid,int i,int j,TextField txt[],TextArea txtarea[])
{
try {  
System.out.println("txt sql"+txt.length);
Class.forName("com.mysql.jdbc.Driver");  
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","C@t143:)");{
        Statement st = con.createStatement();
        System.out.println("Connected to the database");
       String q2="                  VALUES ('"+txt[0].getText()+"','"+txt[1].getText()+"','"+txt[2].getText()+"', '"+txt[3].getText()+"', '"+txt[4].getText()+"','"+txt[5].getText()+"', '"+txt[6].getText()+"','"+txt[7].getText()+"', '"+txt[8].getText()+"','"+txt[9].getText()+"','"+txt[10].getText()+"','"+txt[11].getText()+"','"+txt[12].getText()+"','"+txt[13].getText()+"', '"+txt[14].getText()+"', '"+txt[15].getText()+"', '"+txt[16].getText()+"', '"+txt[17].getText()+"', '"+txt[18].getText()+"', '"+txt[19].getText()+"', '"+txt[20].getText()+"', '"+txt[21].getText()+"', '"+txt[22].getText()+"', '"+txt[23].getText()+"', '"+txt[24].getText()+"', '"+txt[25].getText()+"', '"+txt[26].getText()+"', '"+txt[27].getText()+"', '"+txt[28].getText()+"', '"+txt[29].getText()+"', '"+txt[30].getText()+"', '"+txt[31].getText()+"','"+txt[32].getText()+"', '"+txt[33].getText()+"', '"+txt[34].getText()+"', '"+txt[35].getText()+"',  '"+txtarea[0].getText()+"','"+txtarea[1].getText()+"', '"+txt[1].getText()+txt[0].getText()+"');";        
       String self="INSERT INTO `db1`.`details` (`fdate`, `jobno`, `token`, `caseno`, `obligation`, `commitment`, `cust_name`, `com_name`, `address`, `pin`, `phone1`, `phone2`, `email`, `mod_no`, `pro_no`, `serial_no`, `pass`, `os`, `cos`, `ac_adapter`, `driver_cd`, `bag`, `hdd`, `power_cord`, `cc_belt`, `optical_drive`, `fac_mc`, `toner`, `mem_cap`, `tray`, `battery`, `stylus`, `cradle`, `fdd`, `itb`, `wireless_lan`, `issue`, `diagnosis`, `serialdate`) ";
        
       String tech="INSERT INTO `db1`.`tech_window` (`serialdate`) ";
      String q3=" VALUES ('"+txt[1].getText()+txt[0].getText()+"')";
                                                       
        st.executeUpdate(tech+q3);
        st.executeUpdate(self+q2);
      
System.out.println("Successfully inserted");
//functions.savepop();
printingclass pc = new printingclass();
       pc.main1();
    }  
}
  catch(ClassNotFoundException | SQLException e)
  { 
      functions.savepoperror();
     
      System.out.println(e);
         System.out.println("need attention in save_sql");
  }
        
 
}

}  
