
package istpage;

import java.sql.SQLException;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class functions {
 
  public  static  TextField txt[]   = new TextField[37];
  public static TextArea txtarea[]= new TextArea[2];
  public  static  String lbltxt[] = new String[37];
  public static String lbltxtarea[] = new String[2];
  static int txtcount=0;
    
public void istline(GridPane grid,int k,int j)             {
    int i=k+1;
String istline_label_disp[]={"Date","Job No.","Token No.", "Case No.","Obligation","Time Com."};

int cline=istline_label_disp.length;

Label date=null,ser_no=null,token = null, caseno = null,obligation = null,commitment=null;
Label[] istlbl={date,ser_no,token,caseno,obligation,commitment} ;
for(int m=0; m<cline; m++)
 {  
     istlbl[m]=new Label(istline_label_disp[m]);
     grid.add(istlbl[m],i+m,j);
 }

TextField  datet=null,ser_not=null,tokent = null, casenot = null,obligationt = null,commitmentt=null;
TextField[] istlinetxt={datet,ser_not,tokent,casenot,obligationt,commitmentt} ;

for(int m=0;m<cline;m++)
 { istlinetxt[m]=new TextField("NA");
     grid.add(istlinetxt[m],i+m,j+1);
 }

 String ss=Dateandtime.date();
     System.out.println(ss);
     istlinetxt[0].setText(ss);

for(int m=0;m<cline;m++)
 {
 txt[txtcount]=istlinetxt[m];
 lbltxt[txtcount]=istline_label_disp[m];
 
txtcount++;
 
 }

System.out.println("\n"+txtcount+"static from istline");

}      
public void customer_details(GridPane grid,int k)          {
    int i=0,j=8+k;
Text scenetitle = new Text("\tCustomer Details");
scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
grid.add(scenetitle, 0,j+4 , 2, 1);


String cust_label_disp[]={"Customer Name", "Company Name","Address","Pin","Phone","Phone 2","Email"};
int ck=cust_label_disp.length;
Label   cName = null, conName = null,address = null,pin = null,phone = null,phone2 = null,email = null;
Label[] custlb={cName,conName,address,pin,phone,phone2,email} ;


for(int m=0;m<ck;m++)
 { custlb[m]=new Label(cust_label_disp[m]);
     grid.add(custlb[m],i+0,j+m+5);
 }

TextField cNamet = null, conNamet = null,addresst = null,pint = null,phonet = null,phone2t = null,emailt = null;

TextField[] txtfld={cNamet,conNamet,addresst,pint,phonet,phone2t,emailt} ;
for(int m=0;m<ck;m++)
{ txtfld[m]=new TextField("NA");
     grid.add(txtfld[m],i+1,j+m+5);
}

System.out.print( "\n ck "+ck);
System.out.print( "\ntxtcount "+txtcount);
System.out.print( "\ncustmor ");
int d=txtcount+ck;
System.out.print( "\nd "+d+"\n");

for(int m=0;m<ck;m++)   
 {  txt[txtcount]=txtfld[m];
  lbltxt[txtcount]=cust_label_disp[m];
 System.out.print(" "+m);
System.out.println("txt= "+txt[txtcount].getText());
 
  txtcount++;
}

System.out.println("\n"+txtcount+"static from customer");


}      
public void product_detail(GridPane grid, int i,int j)     {
Text scenetitle = new Text("\tProduct Details");
scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
grid.add(scenetitle, i, j, 2, 1);

String product_label_disp[]={"Model Number", "Product Number","Serial Number","Password","O.S.","Country of Purchase"};

int cp=product_label_disp.length;

Label   modno = null, prono = null,sno = null,password = null,os = null,cop = null;
Label[] prolb={modno,prono,sno,password,os,cop} ;

for(int m=0;m<cp;m++)
 {
     prolb[m]=new Label("\t"+product_label_disp[m]);
     grid.add(prolb[m],i+0,j+m+1);
 }

TextField   modnot = null, pronot = null,snot = null,passwordt = null,ost = null,copt = null;
TextField[] protxt={modnot,pronot,snot,passwordt,ost,copt} ;

for(int m=0;m<cp;m++)
 { protxt[m]=new TextField("NA" );
     grid.add(protxt[m],i+1,j+m+1);
 }


for(int m=0;m<cp;m++)   
 {  txt[txtcount]=protxt[m];
 lbltxt[txtcount]=product_label_disp[m]; 
 txtcount++;
}

}       
public void accessories_detail(GridPane grid, int i,int j) {
Text scenetitle = new Text("\tAccessories Details");
scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
grid.add(scenetitle, i, j, 1, 1);

String accessories_label_disp[]={"Ac Adapter", "Driver CD","Bag","HDD","Power Cord","Carry Case Belt","optical Drive","Fax Modem Card","Network Card","Cartridge/Toner","Memory Capacity","Tray","Battery Sr. No.","Stylus","Cradle","FDD","ITB","Wireless LAN"};

final int ca=accessories_label_disp.length;

Label   aca=null,dcd=null,bag=null,hdd=null,pc=null,ccb=null,od=null,fmc=null,nc=null,ct=null,mc=null,tray=null,battery=null,stylus=null,cradle=null,fdd=null,itb=null,wlan=null;
Label[]  accessories_label={aca,dcd,bag,hdd,pc,ccb,od,fmc,nc,ct,mc,tray,battery,stylus,cradle,fdd,itb,wlan} ;

for(int m=0;m<8;m++)
 {
     accessories_label[m]=new Label("\t"+accessories_label_disp[m]);
     grid.add(accessories_label[m],i+0,j+m+1);
 }
for(int m=9;m<ca;m++)
 {
     accessories_label[m]=new Label("\t"+accessories_label_disp[m]);
     grid.add(accessories_label[m],i+2,j+m-9);
 }

TextField   acat=null,dcdt=null,bagt=null,hddt=null,pct=null,ccbt=null,odt=null,fmct=null,nct=null,ctt=null,mct=null,trayt=null,batteryt=null,stylust=null,cradlet=null,fddt=null,itbt=null,wlant=null;
TextField[] accessoriestxt={acat,dcdt,bagt,hddt,pct,ccbt,odt,fmct,nct,ctt,mct,trayt,batteryt,stylust,cradlet,fddt,itbt,wlant} ;

for(int m=0;m<9;m++)
 { accessoriestxt[m]=new TextField("no"); 
     grid.add(accessoriestxt[m],i+1,j+m+1);
 }

for(int m=9;m<ca;m++)
 { accessoriestxt[m]=new TextField("no");
     grid.add(accessoriestxt[m],i+3,j+m+2-11);
 }


System.out.print( "\n ca     "+ca);
System.out.print( "\n #field "+accessories_label.length);

System.out.print( "\ntxtcount "+txtcount);
System.out.print( "\naccessories ");
int d=txtcount+ca;
System.out.print( "\nd "+d+"\n");

for(int m=0;m<ca;m++)    //for pasting textFields in txt[]
 { //System.out.println(accessoriestxt[m].getText());
txt[txtcount]=accessoriestxt[m];
lbltxt[txtcount]=accessories_label_disp[m];
System.out.print(txtcount+""); 
System.out.print(" "+m);
System.out.println("txt= "+txt[txtcount].getText());
 txtcount++;
}
//txtcount=txtcount+ck;
System.out.print("\n"+txtcount+""); 
System.out.println("\n"+txtcount+"static from accessories");


}        
public void issue_dia(GridPane grid,int i,int j)           {
Label ir=new Label("_Issue");
grid.add(ir,i, j+3);
ir.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));

Label dia=new Label("    \t_Diagnosis:");
dia.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
grid.add(dia,i+4, j+3,2,2);

TextArea irt = new TextArea("issue"+(1));
grid.add(irt,i+1, j,3,10);

TextArea dt = new TextArea("diagnosis");
grid.add(dt,i+5, j,3,10);
//int kkk=i+5;
//System.out.println(kkk+"dia "+j);
ir.setLabelFor(irt);
ir.setMnemonicParsing(true);
dia.setLabelFor(dt);
dia.setMnemonicParsing(true);
txtarea[0] = irt;
txtarea[1] = dt;
lbltxtarea[0] ="Issue";
lbltxtarea[1] ="Diagnosis";
}        
public void save(GridPane grid,int i,int j)                {   
    buttons btn=new buttons();
    btn.savebtn(grid,i,j,txt,txtarea);   
}     
public void backfn(GridPane grid,int i,int j)              {   buttons btn=new buttons();
    btn.backbtn(grid,i,j);
}          
public static void savepop()                               {
        Stage stage = new Stage();
        GridPane grid = new GridPane();
        Label lbl = new Label("\tSaved Successfully") ;
        grid.add(lbl, 40, 10);
        stage.setTitle("SAVED");
        grid.setPadding(new Insets(100, 100, 100, 10));
        lbl.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        Scene scene = new Scene(grid, 400, 200);
        stage.setScene(scene);
        stage.show();
        
          }
 static void savepoperror()                                {
        Stage stage = new Stage();
        GridPane grid = new GridPane();
        Label lbl ;
     lbl = new Label("Error");
        grid.add(lbl, 40, 10);
        stage.setTitle("  Error  ");
        grid.setPadding(new Insets(100, 100, 100, 10));
        lbl.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        Scene scene = new Scene(grid, 400, 200);
        stage.setScene(scene);
        stage.show();
        
          }

}
