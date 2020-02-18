public class PyramidNumbersColumns{
    public static void  mitNumbersColumns (int n){
       
        int i,j;
        for (i=1;i<=n;++i){// i is a rows.
            for(j=1;j<=i;++j){// j is a columns.
                System.out.print(j+ " ");
                }
                System.out.println();


        }
        
        
    }
     public static void main(String[] args) {
         int n=5;
         mitNumbersColumns(n);
        
    }
}