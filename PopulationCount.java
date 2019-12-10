class PopulationCount {
    
    public static int nbYear(int p0, double percent, int aug, int p) {

        int year =0;
        while(p0<=p){
          p0 = p0+(int)(p0*(percent/100))+aug;
          year++;
        }
        return year;    
    }
     public static void main(String[] args) {
         System.out.println("Population in year is :" +nbYear(1500, 5, 100, 5000));
         int output = nbYear(1500, 5, 100, 5000);
         System.out.println(output);
        
    }
}
    