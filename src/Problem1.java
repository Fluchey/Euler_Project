import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by antonfluch on 2016-10-27.
 */
public class Problem1 {
    public static void main (String[] args){
        long numberToCheck = 600851475143L;

        primeFactors(numberToCheck);

    }

    private static List<Integer> primeFactors(long number) {
        long n = number;
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        for(Integer i : factors){
            System.out.println(i);
        }
        return factors;
    }
}
