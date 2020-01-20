

import java.util.ArrayList;
import java.util.Scanner;
class SumofMultiplay{
    public static int multiplay(int number) {
        ArrayList <Integer> x = new ArrayList<Integer>();
        ArrayList <Integer> y = new ArrayList<Integer>();
        int totalThree=0;
        int totalFive=0;
        int total = 0;
        for(int temp=0;temp<number;temp++){
            if(temp%3==0 ){
                x.add(temp);
                totalFive += temp;
            } else if(temp%5==0){
                y.add(temp);
                totalThree += temp;
            }
        }        
        return totalFive+totalThree;
    }
     public static void main(String[] args) {
         System.out.println("Please enter a number:");
         Scanner number2 = new Scanner(System.in);
         System.out.println(multiplay(number2.nextInt()));
        
    }
}