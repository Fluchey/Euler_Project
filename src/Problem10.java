/**
 * Created by antonfluch on 2016-12-10.
 */

/**

 The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

 Find the sum of all the primes below two million.

 */
public class Problem10 {
    public static void main(String [] args){
        long startTime = System.currentTimeMillis();

        double count = 0;
        double [] primes = new double[2000000];
        for(int i = 1; i < 999999999; i = i + 2){
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
            if(count == 2000000){
                double result = 0;
                for(double z : primes){
                    result = result + z;
                }
                break;
            }
        }

        float estimatedTime = System.currentTimeMillis() - startTime;
        float estSeconds = estimatedTime / 1000;
        System.out.println( "\n" + "It took: " + estimatedTime + "ms");
        System.out.println("Or in seconds: " + estSeconds + "s");
    }
}
