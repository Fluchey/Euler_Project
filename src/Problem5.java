/**
 * Created by antonfluch on 2016-11-14.
 */
public class Problem5 {
    public static void main(String [] args){
        long startTime = System.currentTimeMillis();

        boolean breakMe = false;
        for(int i = 2; i <= 1000000000; i = i + 2){
            for(int x = 1; x <= 20; x++){
                if(i % x != 0){
                    break;
                }else if(x == 20){
                    System.out.println(i);
                    breakMe = true;
                    break;
                }
                if(breakMe){
                    break;
                }
            }
        }

        float estimatedTime = System.currentTimeMillis() - startTime;
        float estSeconds = estimatedTime / 1000;
        System.out.println( "\n" + "It took: " + estimatedTime + "ms");
        System.out.println("Or in seconds: " + estSeconds + "s");
    }
}
