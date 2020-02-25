import java.util.*; 
public class VowelsCount {

    public static int getCount(String str) {
       if(str == null || str.length() == 0) return 0;
        int vowelsCount = 0;
        String[] chars = str.split("");
        String[] vowels = new String[]{"a", "e", "i","o","u"};
        List<String> vowelsList = Arrays.asList(vowels);
        for(int i = 0;i<=chars.length-1;i++){
            System.out.println("originalchar :"+chars[i]);
            for(String s : vowelsList){
                System.out.println("vowelchar :"+s);
                if(s.contains(chars[i])) vowelsCount++;
                System.out.println("vowelCount :"+vowelsCount);
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