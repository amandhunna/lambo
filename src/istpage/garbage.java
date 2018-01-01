/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package istpage;

/**
 *
 * @author Amanjot Singh
 */
public class garbage {
    /*
    public static void printing(TableView table_view){
        PrinterJob job = PrinterJob.createPrinterJob();
          if (job != null && job.showPrintDialog(null)) {
              //  WebView webView = getWebView();
                PageLayout pageLayout = job.getPrinter().getDefaultPageLayout();
                double scaleX = pageLayout.getPrintableWidth() /  table_view.getBoundsInParent().getWidth();
                double scaleY = pageLayout.getPrintableHeight()/ table_view.getBoundsInParent().getHeight();
                double minimumScale = min(scaleX, scaleY);
                Scale scale = new Scale(minimumScale, minimumScale);

                try {
                  table_view.getTransforms().add(scale);

                 boolean success = job.printPage(table_view);
                    if (success)
                        job.endJob();

                } finally {
                    table_view.getTransforms().remove(scale);
                
                }}}
    
    
    
    public void conn(String str1,String str2) throws ClassNotFoundException, SQLException {    
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/db1","root","root123");  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from emp");  
//ResultSet rs=stmt.executeQuery("insert into clientquerry comName,ConPerson,Address,PinCode,PhoneNo,EmailID) values(str1, str2, str3, int4,int5,str6)");
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
System.out.println("connected");
//con.close();  // create the java mysql update preparedstatement
//String query="INSERT INTO `client`.`clientquerry` (`ComName`, `ConPerson`, `Address`, `PinCode`, `PhoneNo`, `EmailID`) VALUES ('"+str1+"', '"+str2+"', '"+str3+"', '"+str4+"', '"+str5+"', '"+str6+"')";      
//String query="INSERT INTO `client`.`clientquerry` (`ComName`, `ConPerson`, `Address`, `PinCode`, `PhoneNo`, `EmailID`) VALUES ('1','2','3','4','5','6')";
//String query = "insert into clientquerry comName,ConPerson,Address,PinCode,PhoneNo,EmailID) values(str1, str2, str3, int4,int5,str6)";
  //    PreparedStatement preparedStmt = con.prepareStatement(query);
      //preparedStmt.setInt   (1, 6000);
      //preparedStmt.setString(2, "Fred");
      // execute the java preparedstatement
    //  preparedStmt.executeUpdate();
            con.close();
    }catch(Exception e){ System.out.println(e);}  
}  

}
     JFXButton statusenterbtn2;
   JFXButton statusenterbtn3;
   JFXButton statusenterbtn4;
    
     statusenterbtn2 = new  JFXButton("Enter");
        statusenterbtn2.setStyle("-fx-background-color: #D3D3D3");
       grid3.add(statusenterbtn2,1,1);
       statusenterbtn2.setOnAction((ActionEvent e)-> { 
           txtarea.clear();
     txtarea.setText(sqlconn.chkphoneenterdql(phone.getText()));
    
       });
    
       statusenterbtn3 = new  JFXButton("Enter");
        statusenterbtn3.setStyle("-fx-background-color: #D3D3D3");
       grid3.add(statusenterbtn3,1,2);
       statusenterbtn3.setOnAction((ActionEvent e)-> { 
           txtarea.clear();
   txtarea.setText(sqlconn.chkserialenterdql(m_serial.getText()));
       });
    
     statusenterbtn4 = new  JFXButton("Enter");
       statusenterbtn4.setStyle("-fx-background-color: #D3D3D3");
       grid3.add(statusenterbtn4,1,3);
       statusenterbtn4.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent e) {
          txtarea.clear();
          txtarea.setText(sqlconn.chkcaseenterdql(caseno.getText()));
      }
  });
    
    */
    
    
    
    
       
        
        
        
        
        
        
        
        
        
        
/*        String q=" INSERT INTO `db1`.`details` (`fdate`, ` serialno`, `token`, `caseno`, `obligation`, `commitment`, `cust_name`, `com_name`, `address`, `pin`, `phone1`, `phone2`, `email`, `mod_no`, `pro_no`, `serial_no`, `pass`, `os`, `cos`, `ac_adapter`, `driver_cd`, `bag`, `hdd`, `power_cord`, `cc_belt`, `optical_drive`, `fax_mc`, `toner`, `mem_cap`, `tray`, `battery`, `stylus`, `fdd`, `itb`, `wireless_lan`, `issues`, `diagnosis`) VALUES (?,?, ?, ?,?, ?,?, ?,?,?,?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?);";
        
        ptmt = con.prepareStatement(q);
        
        for(int ii=0;ii<txt.length;i++)
        {
            	ptmt.setString(ii+1, txt[ii].getText());
        }
        for(int ii=36;ii<txtarea.length+36;ii++)
        {
                ptmt.setString(ii+1, txtarea[ii].getText());
        }
        ptmt.executeUpdate();
      
System.out.println("Successfully inserted");
ptmt.close();
    }  
}
  catch(ClassNotFoundException | SQLException e)
  {
      System.out.println(e);
         System.out.println("need attention in save");
  }  
*/    
}


 /*         
       a11.setCellValueFactory(new MapValueFactory("a11"));
       a12.setCellValueFactory(new MapValueFactory("a12"));
       a13.setCellValueFactory(new MapValueFactory("a13"));
     
       a15.setCellValueFactory(new MapValueFactory("a15"));
       a16.setCellValueFactory(new MapValueFactory("a16"));
       a17.setCellValueFactory(new MapValueFactory("a17"));
       a18.setCellValueFactory(new MapValueFactory("a18"));
       a19.setCellValueFactory(new MapValueFactory("a19"));
       a20.setCellValueFactory(new MapValueFactory("a20"));
     /*  a21.setCellValueFactory(new MapValueFactory("a21"));
       a22.setCellValueFactory(new MapValueFactory("a21"));  
       a23.setCellValueFactory(new MapValueFactory("a23"));
       a24.setCellValueFactory(new MapValueFactory("a24"));
       a25.setCellValueFactory(new MapValueFactory("a25"));
       a26.setCellValueFactory(new MapValueFactory("a26"));
       a27.setCellValueFactory(new MapValueFactory("a27"));
       a28.setCellValueFactory(new MapValueFactory("a28")); 
       a29.setCellValueFactory(new MapValueFactory("a29"));
       a30.setCellValueFactory(new MapValueFactory("a30"));
       a31.setCellValueFactory(new MapValueFactory("a31"));
       a32.setCellValueFactory(new MapValueFactory("a32"));
       a33.setCellValueFactory(new MapValueFactory("a33"));
       a34.setCellValueFactory(new MapValueFactory("a34"));
       a35.setCellValueFactory(new MapValueFactory("a35"));
       a36.setCellValueFactory(new MapValueFactory("a36")); */



/* a37.setCellValueFactory(new MapValueFactory("a7"));
        a37.setMinWidth(130);
        a8.setCellValueFactory(new MapValueFactory("a8"));
        a8.setMinWidth(130);
        a9.setCellValueFactory(new MapValueFactory("a9"));
        a9.setMinWidth(130);
        a10.setCellValueFactory(new MapValueFactory("a10"));
        a10.setMinWidth(130);
     */ 




