/**
 * Created by antonfluch on 2016-12-10.
 *
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */

import java.util.Arrays;

public class Problem10 {
    public static void main(String[] args) {
        float startTime = System.currentTimeMillis();

        // will contain true or false values for the first 2 000 000 integers
        boolean[] primes = new boolean[2000000];

        // assume all integers are prime.
        Arrays.fill(primes, true);

        // we know 0 and 1 are not prime.
        primes[0] = primes[1] = false;

        for (int i = 2; i < primes.length; i++) {
            //if the number is prime,
            //then go through all its multiples and make their values false.
            if (primes[i]) {
                for (int j = 2; i * j < primes.length; j++) {
                    primes[i * j] = false;
                }
            }
        }

        // Iterate over all numbers in the final array and add the primes to result
        double result = 0;
        for(int z = 0; z < primes.length; z++){
            if (!primes[z]) {
                continue;
            }
            result = result + z;
        }

        // Finally print out result
        System.out.print("Result: ");
        System.out.printf("%.0f", result);
        System.out.println();

        float estimatedTime = System.currentTimeMillis() - startTime;
        float estSeconds = estimatedTime / 1000;
        System.out.println("\n" + "It took: " + estimatedTime + "ms");
        System.out.println("Or in seconds: " + estSeconds + "s");
    }
}
