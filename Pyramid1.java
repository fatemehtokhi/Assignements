public class Pyramid1{
    public static void  mitalphabet (int n){
        char last ='E',alphabet = 'A';
        int i,j;
        for (i=1;i<=('E'-'A'+1);++i){// i is a rows.
            for(j=1;j<=i;++j){// j is a columns.
                System.out.print(alphabet + " ");
               
                }
                ++alphabet;
                System.out.println();


        }
        
        
    }
     public static void main(String[] args) {
         int n=5;
         mitalphabet(n);
        
    }
}