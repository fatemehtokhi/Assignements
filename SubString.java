import java.util.*;
import java.io.*;
class SubString{
    public static String toJadenCase(final String phrase) {
        final String[] words = phrase.split(" ");
        for (int j = 0; j <= words.length - 1; j++) {
            words[j] = words[j].substring(0,1).toUpperCase()+words[j].substring(1,words[j].length());   
        }
        return String.join(" ", words);
    }
    public static void main(final String[] args) {
        System.out.println("please enter a sentence :");
        Scanner sent = new Scanner(System.in);
        System.out.println(toJadenCase(sent.nextLine()));
    }
}

