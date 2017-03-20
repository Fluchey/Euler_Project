/**
 * Created by antonfluch on 2016-11-14.
 */
public class Problem7 {
    public static void main(String [] args){
        long startTime = System.currentTimeMillis();

        int count = 0;
        for(int i = 1; i < 1000000000; i = i + 2){
            boolean isPrime = true;

            for(int x = 2; x < i; x++){
                if(i % x == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
//                primes[count] = i;
                count++;
                System.out.println(count + ": " + i);
            }
            if(count == 10001){
                break;
            }
        }

        float estimatedTime = System.currentTimeMillis() - startTime;
        float estSeconds = estimatedTime / 1000;
        System.out.println( "\n" + "It took: " + estimatedTime + "ms");
        System.out.println("Or in seconds: " + estSeconds + "s");
    }
}
