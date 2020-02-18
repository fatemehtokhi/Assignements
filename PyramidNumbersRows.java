public class PyramidNumbersRows{
    public static void  mitRows (int n){
        
        int i,j;
        for (i=1;i<=n;++i){// i is a rows.
            for(j=1;j<=i;++j){// j is a columns.
                System.out.print(i + " ");
               
                }
               
                System.out.println();


        }
        
        
    }
     public static void main(String[] args) {
         int n=5;
         mitRows(n);
        
    }
}