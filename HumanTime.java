
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.*;

public class HumanTime {

    public static String makeReadable(int millis) {
        int hours = (int) TimeUnit.MILLISECONDS.toHours(millis);
        millis -= TimeUnit.HOURS.toMillis(hours);
        int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(millis);
        millis -= TimeUnit.MINUTES.toMillis(minutes);
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(millis);
      StringBuilder sb = new StringBuilder(64);
        
       
        sb.append(hours);
        sb.append(" Hours ");
        sb.append(minutes);
        sb.append(" Minutes ");
        sb.append(seconds);
        sb.append(" Seconds");

        return(sb.toString());
    }
      


 public static void main(String[] args) {
     System.out.println("please enter a number of seconds");
     Scanner s = new Scanner(System.in);
     System.out.println(makeReadable(s.nextInt()));
   
   
        
    }
}