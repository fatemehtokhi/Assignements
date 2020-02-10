 import java.util.*;
    public class Pnumber{ 
    public static int check(int x){

        boolean flag = false;
        for(int i = 2; i <= x/2; ++i){
            if (x % i == 0)
            {
                flag = true;
                break;
            }

        }
        if(!flag)
            System.out.println( x +  " = \"is a prime number \"");
        else
            System.out.println( x +  " = \"is not a prime number\"" );
        
        return x;
    }    
     public static void main(String[] args) {
         System.out.println("enter a number");
         Scanner n = new Scanner(System.in);
         System.out.println(check(n.nextInt()));


        
    }
    
    

}