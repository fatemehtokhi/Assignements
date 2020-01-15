import java.util.Arrays;
import java.io.*;

public class Line2 {
  public static String WhoIsNext(String[] names, int n) {
    int length = names.length;
    int[] counts = new int[length];
    Arrays.fill(counts, 1);
    for (int i = 0; ; counts[i] <<= 1, i = (i + 1) % length) {
      n -= counts[i];
      if (n <= 0) {
        return names[i];
      }
    }
  }
  public static void main(String[] args) {
      
      String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
      int n = 2;  
      System.out.println(WhoIsNext(names,n));
      
  
  }
}
