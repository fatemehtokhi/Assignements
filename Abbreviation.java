import java.util.Scanner;

public class Abbreviation {
    public static String Abbre(String str) {
       String charsArray[] = str.split(""); 
        int count=str.length()-2; 
       return charsArray[0]+count +charsArray[str.length()-1]; 

    }
    public static void main(String[] args) {
        System.out.println("Enter a sentece:");
        Scanner q = new Scanner(System.in);
        System.out.println(Abbre(q.nextLine()));
    }
}