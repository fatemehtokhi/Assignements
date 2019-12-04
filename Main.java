import java.util.*; 
import java.io.*;

class Main {

  public static String LetterChanges(String str) {
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    String [] vowels = new String[]{"a", "e", "i","o","u"};
    List<String> list = Arrays.asList(vowels);
    String output = "";
    String match;
    char[] chars = str.toCharArray();
    for(int i=0; i<chars.length; i++){
      match=null;
      for(int j=0; j<alphabet.length; j++){
          if(chars[i] == alphabet[j]){
            
            if(list.contains(alphabet[j+1] + "")){
              match = (alphabet[j+1] + "").toUpperCase();
              break;
            }
            else{
             match = alphabet[j+1] + "";
             break;
            } 
          }
      }
      if(match != null){
        output += match;
      }
      else{
        output += chars[i] + "";
      }
   
    }
    
    return output;
  }

  public static void main (String[] args) {  
    // keep this function call here  
    System.out.println("please input :");   
    Scanner s = new Scanner(System.in);
    System.out.println(LetterChanges(s.nextLine())); 
  }

}