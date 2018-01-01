/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package istpage;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.MapValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.util.StringConverter;
 
public class table1  {
Button ba= new Button("Back");
    Button pr= new Button("Print");

    
 table1(Stage stage){   
      
        System.out.println("hello table cons");
        Scene scene = new Scene(new Pane());
        stage.setTitle("Repaired Case Details");
        stage.setWidth(5500);
        stage.setHeight(2100);
       final Label label = new Label("Repaired Case Details");
        label.setFont(new Font("Arial", 20));
      
        TableColumn<Map, String> a1 = new TableColumn<>(functions.lbltxt[0]);
        TableColumn<Map, String> a2  = new TableColumn<>(functions.lbltxt[1]); 
        TableColumn<Map, String> a4  = new TableColumn<>(functions.lbltxt[3]); 
        TableColumn<Map, String> a7  = new TableColumn<>(functions.lbltxt[6]);
        TableColumn<Map, String> a14  = new TableColumn<>(functions.lbltxt[13]); 
       TableColumn<Map, String> a37  = new TableColumn<>(functions.lbltxtarea[0]); 
        TableColumn<Map, String>a38  = new TableColumn<>(functions.lbltxtarea[1]); 

        a1.setCellValueFactory(new MapValueFactory("a1"));
        a2.setCellValueFactory(new MapValueFactory("a2"));
        a4.setCellValueFactory(new MapValueFactory("a4"));
        a7.setCellValueFactory(new MapValueFactory("a7"));
       a14.setCellValueFactory(new MapValueFactory("a14"));
       a37.setCellValueFactory(new MapValueFactory("a37"));
       a38.setCellValueFactory(new MapValueFactory("a38"));
     
           int v=100;
           a1.setMinWidth(v);
           a2.setMinWidth(v);
           a4.setMinWidth(v);
           a7.setMinWidth(v);
           a14.setMinWidth(v); 
        a37.setMinWidth(v+100); 
         a38.setMinWidth(v+100);
       
        
        TableView table_view = new TableView<>(generateDataInMap());
 
        table_view.setEditable(true);
        table_view.setTableMenuButtonVisible(true);
        table_view.columnResizePolicyProperty();//columnResizePolicy. 
        table_view.getSelectionModel().setCellSelectionEnabled(true);
        table_view.getColumns().setAll(a1, a2, a4, a7 ,a14,a37,a38);
                                   //   a21,a22,a23,a24,a25,a26,a27,a28,a29,a30,
                                    //  a31,a32,a33,a34,a35);
        Callback< TableColumn<Map, String>, TableCell<Map, String> >
           cellFactoryForMap = new Callback<TableColumn<Map, String>,
                TableCell<Map, String>>() {
                     @Override
                       public TableCell call(TableColumn p) {
                         return new TextFieldTableCell(new StringConverter() {
                            @Override
                              public String toString(Object t) {
                                return t.toString();
                              }
                            @Override
                             public Object fromString(String string) {
                                return string;
                            }                                    
                        });
                    }
        };
ba.setCancelButton(true);
pr.setDefaultButton(true);
pr.setOnAction((javafx.event.ActionEvent e)  -> {
            page3fn.printing(table_view);
 });
 ba.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
                Istpage.window.setScene(buttons.query);
           }
    });
        a1.setCellFactory(cellFactoryForMap);
        a2.setCellFactory(cellFactoryForMap);
        a4.setCellFactory(cellFactoryForMap);
        a7.setCellFactory(cellFactoryForMap);
        a14.setCellFactory(cellFactoryForMap);
       a37.setCellFactory(cellFactoryForMap);
        a38.setCellFactory(cellFactoryForMap);
 
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 10, 10, 10));
        vbox.getChildren().addAll(label,ba,pr, table_view);
        ((Pane) scene.getRoot()).getChildren().addAll(vbox);
        stage.setScene(scene);
        stage.show();
    
    }
    private ObservableList<Map> generateDataInMap() {
       //.........................................
       try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","C@t143:)");  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("SELECT * FROM db1.details LEFT JOIN db1.tech_window ON db1.details.serialdate = db1.tech_window.serialdate where tech_window.macstatus='repaired' order by fdate desc;");
 ObservableList<Map> allData = FXCollections.observableArrayList();    

 while(rs.next()) {
       
   
            Map<String, String> dataRow = new HashMap<>();
            
          dataRow.put("a1",  rs.getString(1));
          dataRow.put("a2",  rs.getString(2));
          dataRow.put("a4",  rs.getString(4));
          dataRow.put("a7",  rs.getString(7));
          dataRow.put("a14", rs.getString(14));
          dataRow.put("a37",  rs.getString(37));
          dataRow.put("a38", rs.getString(38));
           allData.add(dataRow);
      
       }con.close();  System.out.println("while exit");
        return allData;}
    catch(Exception e){ System.out.println(e); return null;
    
    }}

   
}    
