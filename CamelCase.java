import java.util.*;
import java.io.*;

class CamelCase {
    public static String toCamelCase(String s) {
        String words[] = {};
        if (s.contains("_"))
            words = s.split("_"); 
        else if (s.contains("-"))
            words = s.split("-");
        else if (s.contains(" "));
            words = s.split(" ");
        for (int i = 0; i <= words.length - 1; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1, words[i].length());
        }
        return String.join("", words);
    }

    public static void main(String[] args) {
        System.out.println("please enter a sentence :");
        Scanner sent = new Scanner(System.in);
        System.out.println(toCamelCase(sent.nextLine()));

    }
}