import java.util.*;
public class CountingDuplicates {
  public static int duplicateCount(String text) {
    text = text.toLowerCase();
    char[] chars = text.toCharArray();
    Arrays.sort(chars);
    String dupl ="";
    int count = 0;
    for (int i = 0; i< chars.length-1;i++) {
      if(chars[i] == chars[i+1] && !dupl.contains(chars[i]+"")){
        count++;
        dupl = dupl+ chars[i];
      } 
        
    }
   return count; 
  }
}