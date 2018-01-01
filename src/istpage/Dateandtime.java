
package istpage;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Dateandtime {
  
    public static String date(){
    
     String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", 
         "Oct", "Nov", "Dec"};
     
     GregorianCalendar gcalendar = new GregorianCalendar();
      
 String dates= months[gcalendar.get(Calendar.MONTH)]+ " " + gcalendar.get(Calendar.DATE) + " " +gcalendar.get(Calendar.YEAR);
 return dates;     
    }
    public static String time(){
    
     String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", 
         "Oct", "Nov", "Dec"};
 
     GregorianCalendar gcalendar = new GregorianCalendar();
     String time=gcalendar.get(Calendar.HOUR) + ":"+ gcalendar.get(Calendar.MINUTE) + ":"+ gcalendar.get(Calendar.SECOND);
 return time;     
    }
}