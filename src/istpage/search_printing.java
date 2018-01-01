

//public class  {
    
package istpage;

    
import static istpage.page3fn.caseno;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 //prints individual details of a customer
public class search_printing implements Printable, ActionListener {
 
 
      public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
 

 try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","C@t143:)");  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("SELECT * FROM db1.details LEFT JOIN db1.tech_window ON "
        + "db1.details.serialdate= db1.tech_window.serialdate where caseno = '"+caseno.getText()+"' order by fdate desc;");
    

 while(rs.next()) 
 {
 int k=30,mf=12;      

 Font Fontbold = new Font("Courier", Font.BOLD  ,10);
 Font Fontnormal = new Font("Courier", Font.PLAIN | Font.PLAIN,8);
 Font Fontnormalbold = new Font("Courier", Font.BOLD,8);
 
 
   if (page > 0) { 
            return NO_SUCH_PAGE;
        }
 
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());
        Font Font1 = new Font("Courier", Font.BOLD ,14);
          g.setFont(Font1); 
          g.drawString("TechnoLand", 20, 50);
          g.drawString("Service Call Report", 200, 24);
        
      
      g.drawRect(k+100, 30,(6*60) ,30 );
          g.setFont(Fontbold);
          g.drawString(functions.lbltxt[1],30,24);
          g.setFont(Fontnormal);
          g.drawString(rs.getString(2),70,24);
       
      int km=0;
            for(int i=0;i<6;i++)
       {  g.setFont(Fontnormalbold);
           if (i==1) continue; 
          g.drawString(functions.lbltxt[i],k+110+(km*70),42);
           g.setFont(Fontnormal);
         if (i==1) continue; 
        g.drawString(rs.getString(i+1),k+110+(km*70),53);
       if (i==1) continue; km++;
      
       }
       
     
      
       //address
       Font address = new Font("Courier", Font.BOLD ,10);
       g.setFont(address); 
       g.drawString(cust_detail_form.cloverleaf_addd1, 150, 72);
       g.drawString(cust_detail_form.cloverleaf_addd2, 100, 84);
      
       
    //...customer.........................
       g.drawRect(15,k+85,(k+10+(6*90)) ,100 );
       g.setFont(Fontbold); 
       g.drawString("Customer Details",k+ 40,110);
       int cc=50,kac=6;
       for(int i=6;i<13;i++) 
           
       {  g.setFont(Fontnormalbold); if(i==8) continue;
         g.drawString(functions.lbltxt[i],       k+10,  cc+7+(kac*mf));
           g.setFont(Fontnormal);  if(i==8) continue;
         g.drawString(rs.getString(i+1),k+100, cc+7+(kac*mf));
           if(i==8) continue; kac++;
       }
       g.setFont(Fontnormalbold);
       g.drawString(functions.lbltxt[8],       k+10,  cc+11+(kac*mf));
       g.setFont(Fontnormal); 
       g.drawString(rs.getString(9),k+100, cc+11+(kac*mf));
           
        //..product details....................
        g.drawRect(300, k+85,(k+20+(6*90))/2,80);
        g.setFont(Fontbold);
        g.drawString("Product Details", k+300,110);
       for(int i=13;i<19;i++)
       { g.setFont(Fontnormalbold);
         g.drawString(functions.lbltxt[i],       k+280,cc+5+((i-7)*mf));
         g.setFont(Fontnormal);                                           //,cc+20+(kac*10)
         g.drawString(rs.getString(i+1),k+420, cc+5+((i-7)*mf));
       }
       
   
        //accessories details ....................
      int down=45;  
      g.setFont(Fontbold);
      g.drawString("Accessories Details", k+200,195+down);
      g.drawRect(15, 205+down,k+10+(6*90) ,115);
        
        //accessories details 1....................
       
      //i=27 missing network card from db
        int addy=-10;
       for(int i=19;i<27;i++)
       { g.setFont(Fontnormalbold);
         g.drawString(functions.lbltxt[i], k+10,down+addy+((i)*mf));
         g.setFont(Fontnormal);
         g.drawString(rs.getString(i+1),k+100,down+addy+((i)*mf));
    }
     
        //accessories details 2......................
      
        for(int i=28;i<37;i++)
       {   g.setFont(Fontnormalbold); 
           g.drawString(functions.lbltxt[i], k+250,down+((i-10)*mf));
           g.setFont(Fontnormal);
           g.drawString(rs.getString(i),k+340, down+((i-10)*mf));
       }
    
        //issue dia........................  
       int aa=400;
       int lenar = functions.lbltxtarea.length;
       for(int i=0;i<lenar;i++)
       { g.setFont(Fontbold);
        g.drawRect(15,k+aa-60+(i*100),(k+10+(6*90)) ,100 );
         g.drawString(functions.lbltxtarea[i],k+20,aa-15+(i*100));
         g.setFont(Fontnormal);
         g.drawString(rs.getString(i+37), k+90,aa-15+(i*100));  
       }                                             // k+160,aa+(i*100))
//.................Miscellaneous Comments...........................
String misc="Miscellaneous Comments";
g.setFont(Fontbold);
g.drawString(misc,20,k+555);
 int miscdown=14;
String mis[]={"Straches/Damages/Breakages","Others"};
    for(int i=0;i<mis.length;i++)
       { g.setFont(Fontnormalbold);
        g.drawRect(15,k+545+miscdown+(i*20),(k+10+(6*90)) ,20);
         g.drawString(mis[i],20,k+555+miscdown+(i*20));
        // g.setFont(Fontnormal);
        // g.drawString(functions.txtarea[i].getText(), k+90,aa-15+(i*50));  
       }                                             // k+160,aa+(i*100))
    //...................................................   
String note ="Note: ";
String notedes1 ="In case of Hard Disk failure or reinstallation of OS due to any reason, it may require formatting the Hard Disk. This may lead to loss of data. Hence, it is ";
String notedes2 = "advisable for the customer to backup important files / data & programs. Application software will not be installed apart from the recommended operating system,";
String notedes3 = "including drivers and patches. Kindly refer to warranty terms and Conditions for more information.";
g.setFont(Fontnormalbold);
g.drawString(note, 25,k+630);
g.setFont(Fontnormal);
g.drawString(notedes1, 50,k+630);
g.drawString(notedes2, 25,k+640);
g.drawString(notedes3, 25,k+650);



String ca = "Customer Authorization:";
String ca2= " I hereby authorize COMPANY Support Provider to provide the necessary repair service. I have taken backup of all important data program/application.";
String ca3= " in the  hard disks";
g.drawRect(15,k+660,(k+10+(6*90)) ,80 );
g.setFont(Fontnormalbold);
g.drawString(ca, 25,700);
g.setFont(Fontnormal);
g.drawString(ca2, 25,715);
//g.drawString(ca3, 25,735);
g.setFont(Fontnormalbold);
g.drawString("Customer Signature :",25,735);

         return 0;//PAGE_EXISTS;
       }
con.close(); 
       }
    catch(Exception e){ System.out.println(e);
    
    }
          
          return PAGE_EXISTS;
    }
 
    public void actionPerformed(ActionEvent e) {
         PrinterJob job = PrinterJob.getPrinterJob();
         job.setPrintable(this);
         boolean ok = job.printDialog();
         if (ok) {
             try {
                  job.print();
             } catch (PrinterException ex) {
              System.out.println(" The job did not successfully complete ");
             }
         }
    }
 
    public  void main1() {
  
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        JFrame f = new JFrame("Print Window");
        JButton printButton = new JButton("Print Details");
        printButton.addActionListener(new search_printing());
        f.add("Center", printButton);
       f.pack();
       f.setVisible(true);
    }
}


