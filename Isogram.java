import java.util.*;
import java.io.*;
class Isogram{
    public static boolean isogram ( String str) {
        char array[] = str.toCharArray();
        Arrays.sort(array);
        for(int i=0;i< str.length()-1;i++){
            if(array[i]==array[i+1])
                return false;
        }
       return true;
       
    }

    public static void main(final String[] args) {
        System.out.println("please input a word :");
         Scanner input = new Scanner(System.in);
        //String isoInput = input.nextLine();
        //System.out.println(isogram(isoInput));
        System.out.println(" Is an Isogram? ->" + isogram(input.nextLine()));
        
        
    }
}