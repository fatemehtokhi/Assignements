import java.util.*; 
import java.io.*;

 class SortString{

    public static String ConvertChange(String word) {
        char [] chars = word.toCharArray();
        Arrays.sort(chars);
        // convert chars to string
        return String.valueOf(chars);
    }

    public static void main (String[] args) {  
        // keep this function call here  
        System.out.println("please input :");   
        Scanner s = new Scanner(System.in);
        System.out.println(ConvertChange(s.nextLine())); 
      }
}
