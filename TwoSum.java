import java.util.Arrays;
public class TwoSum {
    public int[]returnIndex(int[] numbers, int target) {
        int tail = numbers.length-1;
        int[] n = new int[2];
        for (int i=0;i<tail;i++) {
            for(int j=i+1;j<tail;j++) {
                if(target ==(numbers[i]+numbers[j])) {
                    n[0] = i+1;
                    n[1] = j+1;
                }
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] s = {150,24,79,50,88,345,3};
        int value = 120;
        TwoSum r = new TwoSum();
        int[] a = r.returnIndex(s,value);
        System.out.println(Arrays.toString(a));
    }
}