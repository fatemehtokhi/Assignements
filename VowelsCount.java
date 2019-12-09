import java.util.*; 
public class VowelsCount {

    public static int getCount(String str) {
       if(str == null || str.length() == 0) return 0;
        int vowelsCount = 0;
        String [] chars = str.split("");
        String[] vowels = new String[]{"a", "e", "i","o","u"};
        List<String> vowelsList = Arrays.asList(vowels);
        for(int i = 0;i<=chars.length-1;i++){
            for(String s : vowelsList){
                if(s.contains(chars[i])) vowelsCount++;
            }

        }
        return vowelsCount;
    }

    public static void main(String[] args) {
        System.out.println("please input a sentence: ");
        Scanner s= new Scanner(System.in);
        System.out.println("Vowels count in sentence is: " +getCount(s.nextLine()));
        
    }

}