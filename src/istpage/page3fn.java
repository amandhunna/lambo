
package istpage;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import static java.lang.Double.min;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.print.PageLayout;
import javafx.print.PrinterJob;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class page3fn {
   Label namelbl,jobnolbl,phonelbl, casenolbl;
   static JFXTextField name,jobno,phone, caseno;
             JFXButton namebtn,jobnobtn,phonebtn, casenobtn;
    Button backbtn,repair,pending,untouch;
    
    public void  page3fn(Stage stage3,GridPane grid3){
  grid3.setAlignment(Pos.TOP_LEFT);
  
namelbl= new Label("Name");
grid3.add(namelbl,0,0);
name= new JFXTextField(); //name.setPromptText("Name");
grid3.add(name,1,0);
namebtn = new  JFXButton("Enter");
namebtn.setStyle("-fx-background-color: #D3D3D3");
grid3.add(namebtn,2,0);
namebtn.setOnAction((ActionEvent e)-> { 
search s= new search(Istpage.window);
       });
  
phonelbl= new Label("Phone");
grid3.add(phonelbl,0,1);
phone= new JFXTextField();   //phone.setPromptText("Phone");
grid3.add(phone,1,1);
phonebtn = new  JFXButton("Enter");
phonebtn.setStyle("-fx-background-color: #D3D3D3");
 grid3.add( phonebtn,2,1);
phonebtn.setOnAction((ActionEvent e)-> { 
 search_phone s= new  search_phone(Istpage.window);
});

jobnolbl= new Label("Job No");
grid3.add(jobnolbl,0,2);
 jobno= new JFXTextField(); //jobno.setPromptText("Job Number");
 grid3.add(jobno,1,2);
 jobnobtn = new  JFXButton("Enter");
 jobnobtn.setStyle("-fx-background-color: #D3D3D3");
 grid3.add( jobnobtn,2,2);
 jobnobtn.setOnAction((ActionEvent e)-> { 
   search_job s= new search_job(Istpage.window);
});
 
 casenolbl= new Label("Case No");
grid3.add(casenolbl,0,3);
  caseno = new JFXTextField(); //caseno.setPromptText("Case No.");
  grid3.add(caseno,1,3);
 casenobtn = new  JFXButton("Enter");
 casenobtn.setStyle("-fx-background-color: #D3D3D3");
 grid3.add(casenobtn,2,3);
 casenobtn.setOnAction((ActionEvent e)-> { 
   search_case s= new search_case(Istpage.window);
       });;
    //.......................................................................
    
    
      backbtn = new  Button("Back");
      grid3.add( backbtn,0,5);
      backbtn.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent e) {
     Istpage.window.setScene(cust_entry.scene2);    
        }
  });
    
 repair = new  Button("Repair");
      grid3.add( repair,1,5);
      repair.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent e) {
         table1 tb =new table1(Istpage.window);
          System.out.println("hello table cons");
        }
  });
      
       pending = new  Button("Pending");
      grid3.add( pending,2,5);
       pending.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent e) {
         pendingclass p =new pendingclass(Istpage.window);
          System.out.println("hello pending cons");
        }
  });
       
         untouch = new  Button("Untouched");
      grid3.add( untouch,3,5);
       untouch.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent e) {
         untouchtable p =new untouchtable(Istpage.window);
          System.out.println("hello untouch cons");
        }
  });
    }//in garbage as backup
    public static void printing(TableView table_view){
        PrinterJob job = PrinterJob.createPrinterJob();
          if (job != null && job.showPrintDialog(null)) {
              //  WebView webView = getWebView();
                PageLayout pageLayout = job.getPrinter().getDefaultPageLayout();
                double scaleX = pageLayout.getPrintableWidth() /  table_view.getBoundsInParent().getWidth();
                double scaleY = pageLayout.getPrintableHeight()/ table_view.getBoundsInParent().getHeight();
                double minimumScale = min(scaleX, scaleY);
                Scale scale = new Scale(minimumScale, minimumScale);
System.out.println("Scale x y "+scaleX+" "+scaleY );
                try {
                  table_view.getTransforms().add(scale);

                 boolean success = job.printPage(table_view);
                    if (success)
                        job.endJob();

                } finally {
                    table_view.getTransforms().remove(scale);
                
                }}}
}