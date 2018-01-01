/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package istpage;


    
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.*;
 
public class queryprint implements Printable, ActionListener {
 
 
    public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
 int k=30;      

 Font Fontbold = new Font("Courier", Font.BOLD | Font.ITALIC ,20);
 Font Fontnormal = new Font("Courier", Font.PLAIN | Font.PLAIN,20);
 
 
   if (page > 0) { 
            return NO_SUCH_PAGE;
        }
 
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());
 
          g.setFont(Fontbold);    
    
        g.drawString(cust_detail_form.addd1, 150, 40);
        g.drawString(cust_detail_form.addd2, 100, 55);
     
       
   g.setFont(Fontbold);
       for(int i=0;i<6;i++)
       {
         g.drawString(functions.lbltxt[i],k+ 20+(i*80),100);
       }
       g.setFont(Fontnormal);
       for(int i=0;i<6;i++)
       { 
          g.drawString(functions.txt[i].getText(),k+25+(i*80),120);
       }
       //...customer...........................................
        
       g.setFont(Fontbold); 
       g.drawString("Customer Details",k+ 20,160);
       for(int i=6;i<13;i++)
       {          g.drawString(functions.lbltxt[i],k+ 20,100+(i*15));
       }
       
       g.setFont(Fontnormal);
       for(int i=6;i<13;i++)
       { 
           g.drawString(functions.txt[i].getText(),k+140, 100+(i*15));
       }
       
        //..product details.....................................
        g.setFont(Fontbold);
        g.drawString("Product Details", k+300,160);
       for(int i=13;i<19;i++)
       {          g.drawString(functions.lbltxt[i],k+ 250,100+((i-7)*15));
       }
       
       g.setFont(Fontnormal);
       for(int i=13;i<19;i++)
       { 
           g.drawString(functions.txt[i].getText(),k+420, 100+((i-7)*15));
       }
       
        //accessories details 1.....................................
        g.setFont(Fontbold);
        g.drawString("Accessories Details", k+100,320);
        
       for(int i=19;i<27;i++)
       {          g.drawString(functions.lbltxt[i], k+20,60+((i)*15));
       }
       g.setFont(Fontnormal);
       for(int i=19;i<27;i++)
       { 
           g.drawString(functions.txt[i].getText(),k+140, 60+((i)*15));
       }
        //accessories details 2.....................................
      g.setFont(Fontbold);
        for(int i=27;i<37;i++)
       {          g.drawString(functions.lbltxt[i], k+250,45+((i-7)*15));
       }
        g.setFont(Fontnormal);
       for(int i=27;i<37;i++)
       { 
           g.drawString(functions.txt[i].getText(),k+420, 45+((i-7)*15));
       }
      
       //issue diagnosis..............................................................................     
      g.setFont(Fontbold);
       int lenar = functions.lbltxtarea.length;
       for(int i=0;i<lenar;i++)
       { System.out.println(i +" i len area printer");
         g.drawString(functions.lbltxtarea[i],k+ 20,500+(i*100));
       }
     g.setFont(Fontnormal);
       for(int i=0;i<lenar;i++)
       { 
           System.out.println(i +" textarea i printer");
           g.drawString(functions.txtarea[i].getText(), k+160,500+(i*100));
       }
       
         g.drawString("Customer Signature", 400,750);
         return 0;//PAGE_EXISTS;
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
        //f.addWindowListener(new WindowAdapter() {
        //   public void windowClosing(WindowEvent e) {System.exit(0);}
       // });
        JButton printButton = new JButton("Print Details");
        printButton.addActionListener(new printingclass());
       // f.add("Center", printButton);
       f.pack();
       f.setVisible(true);
    }


}


