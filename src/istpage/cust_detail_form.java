package istpage;

import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

//in use
//2 page
//all functons of functions class called here
// this class includes cloverleaf address ,customer deatils, product details,and other control buttons using functions()
public class cust_detail_form {
final static String COMPANY_NAME="\t COMPANY NAME";;
final static String com_add="\t\tCOMPANY ADDRESS";

public final static String addd1="TechSys,";
public final static String addd2="support@tech.in";
cust_detail_form(GridPane grid){
Text clover = new Text(cloverleaf);
clover.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));
    grid.add(clover, 3, 0, 5, 5);

Text clover_add = new Text(cloverleaf_add);
clover_add.setFont(Font.font("Tahoma", FontWeight.NORMAL, 16));
grid.add(clover_add, 3, 4, 10, 5);
//......................................................................................
//...................................................................................
functions fn=new functions();
fn.istline(grid,0,11);
fn.customer_details(grid,2);
fn.product_detail(grid,2,14);
fn.accessories_detail(grid,4,14);
fn.issue_dia(grid,0 ,23);
fn.save(grid,6,35);
fn.backfn(grid,3,35);
buttons.statusbtn(grid, 2, 35);
//print btn
buttons bb= new buttons();
bb.printbtn(grid, 7, 35);
}

}

    
