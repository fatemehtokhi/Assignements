import java.util.Scanner;

public class Fibonacci{
    public static int numberF(int a){
        int f,b=1,c=1;
        f=0;
        System.out.print("1 , 1 , ");
        while(f<a){
            f=c+b;
            if(f>=a)
                break;
            System.out.print( f + " , ");
            c=b;
            b=f;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number:");
        System.out.println(numberF(number.nextInt()));
       
    }
}