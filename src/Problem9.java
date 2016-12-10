/**
 * Created by antonfluch on 2016-12-01.
 */
public class Problem9 {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();

        long a = 1;
        long producta = 0;

        long b = 1;
        long productb = 0;

        long c = 1;
        long productc = 0;


        long product = 0;

        for(int i = 2; i <= 333; i++){
            a = i;
            producta = i * i;
            for(int j = i + 1; j <= 498; j++){
                b = j;
                productb = j * j;
                for(int z = j + 1; z <= 998; z++){
                    c = z;
                    productc = z * z;
                    if((producta + productb) == productc && (a + b + c) == 1000){
                        System.out.println(a + " * " + a + " = " + producta + ", " +
                                b + " * " + b + " = " + productb + ", " +
                                c + " * " + c + " = " + productc);
                        System.out.println(a + " * " + b + " * " + c + " = " + a * b * c);
                    }
                }
            }
        }

        float estimatedTime = System.currentTimeMillis() - startTime;
        float estSeconds = estimatedTime / 1000;
        System.out.println( "\n" + "It took: " + estimatedTime + "ms");
        System.out.println("Or in seconds: " + estSeconds + "s");
    }
}
