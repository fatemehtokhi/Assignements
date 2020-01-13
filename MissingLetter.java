import java.util.*;
import java.io.*; 
class MissingLetter{
    public static String findLetter(String str){
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String output ="";
        for(int i=0; i<chars.length; i++){
            String match=null;
            for(int j=0; j<alphabet.length; j++){
                if(chars[i] ==  alphabet[j] && chars[i] != alphabet[j+1]){ 
                     
                }
            }
        }
        return output;
    }
    public static void main(String[] args) {
        System.out.println("please enter data:");
        Scanner s = new Scanner(System.in);
        System.out.println(findLetter(s.nextLine()));

        
    } 
}
     
        

