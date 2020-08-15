import java.text.*;
import java.time.*;
import java.util.*;
import java.time.format.*;
public class Pattern3 {
    public static void main(String[] args) {
        Date date=new Date();
        
        SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
        System.out.println(sdf.format(date));
        sdf=new SimpleDateFormat("dd MMM yyy hh:mm:ss");
        System.out.println(sdf.format(date));
    

        LocalDate curDate = LocalDate.now();
System.out.println(curDate.format(
DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
LocalTime curTime = LocalTime.now();
System.out.println(curTime.format(
DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
System.out.println(curDate.format(
DateTimeFormatter.ofPattern("MMMM d',' yyyy h':'mm a")));
    }
    
}