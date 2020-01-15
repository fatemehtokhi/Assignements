import java.util.*;
class PrimeNumber{
    public static boolean isPrime(int n) {
        for (int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static List <Integer> findPN(int start,int end){
        List<Integer> prime = new ArrayList<>();
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                prime.add(i);
            }    
        }
        return prime;
    }
    public static void main(String[] args ) {
        System.out.println(findPN(2,20));    
    }
}