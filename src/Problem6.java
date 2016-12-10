/**
 * Created by antonfluch on 2016-11-14.
 */
public class Problem6 {
    public static void main(String [] args) {
        long startTime = System.currentTimeMillis();

        int firstResult = 0;
        int number;
        for(int i = 1; i <= 100; i++){
            number = i * i;
            firstResult = firstResult + number;
        }

        int secondResult = 0;
        for(int x = 1; x <= 100; x++){
            secondResult = secondResult + x;
        }
        secondResult = secondResult * secondResult;

        System.out.println(secondResult - firstResult);

        float estimatedTime = System.currentTimeMillis() - startTime;
        float estSeconds = estimatedTime / 1000;
        System.out.println( "\n" + "It took: " + estimatedTime + "ms");
        System.out.println("Or in seconds: " + estSeconds + "s");
    }
}
