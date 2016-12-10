import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by antonfluch on 2016-11-14.
 */
public class Problem4 {
    public static void main(String []args){
        long startTime = System.currentTimeMillis();
        int input = 0;
        int reversedNum = 0;
        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        for(int i = 100; i < 1000; i++){
            for(int x = 100; x < 1000; x++){
                input = i * x;
                char[] chars = ("" + input).toCharArray();
                int charCount = 0;
                char[] newChar = new char[chars.length];
                    for(int y = chars.length; y > 0; y--){
                        newChar[charCount] = chars[y -1];
                        charCount = charCount + 1;
                    }

                reversedNum = Integer.parseInt(String.valueOf(newChar));
                if(reversedNum == input){
                    listOfNumbers.add(reversedNum);
                }
            }
        }

        int t = Collections.max(listOfNumbers);
        System.out.println("The number is: " + t);
        long estimatedTime = System.currentTimeMillis() - startTime;
        double estSeconds = estimatedTime / 10000;
        System.out.println("It took: " + estimatedTime + "ms");
        System.out.println("Or in seconds: " + estSeconds);

    }
}
