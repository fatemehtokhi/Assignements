import java.util.*; 
import java.io.*;
public class ReverseSentence {

    public static String spinWords(String sentence) {

        String[] words = sentence.split(" ");
        if (words.length == 1 && words[0].length() > 5)
            return new StringBuilder(words[0]).reverse().toString();
        for (int i = 0; i <= words.length - 1; i++) {
            if (words[i].length() > 5) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }

        }

        return String.join(" ", words);
    }

    public static void main(String[] args) {
        // keep this function call here
        System.out.println("please input :");
        Scanner s = new Scanner(System.in);
        System.out.println(spinWords(s.nextLine()));
      }

    
  }