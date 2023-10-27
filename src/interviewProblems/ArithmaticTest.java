package interviewProblems;

import java.util.Arrays;
import java.util.List;

/*
 * To find the ratio of the +ve , -ve and 0 numbers in a list
 */

public class ArithmaticTest {

    public static void plusMinusRatio() {
        List<Integer> in = Arrays.asList(2,4,0,-1,-2);

        float plus = 0, minus = 0, zero = 0;

        for(int k = 0; k < in.size(); k++){
            if(in.get(k) > 0) {
                plus += 1;
            } else if (in.get(k) < 0) {
                minus += 1;
            } else {
                zero += 1;
            }
        }

        System.out.println("Plus ratio: "+ String.format("%.5f",(plus/in.size())));
        System.out.println("Minus ratio: "+ String.format("%.5f",(minus/in.size())));
        System.out.println("Zero ratio: "+ String.format("%.5f",(zero/in.size())));
    }

    public static void minMaxSumOfListOfNumbers() {
        List<Integer> in = Arrays.asList(7, 69, 2, 221, 8974);

        // arrange the numbers in ascending order
        int temp;

        for(int i = 0; i < in.size(); i++){
            for(int j = i+1; j < in.size(); j++){
                if(in.get(i)>in.get(j)){
                    temp = in.get(i);
                    in.set(i,in.get(j));
                    in.set(j,temp);
                }
            }
        }

        int minSum = 0;
        for(int k =0; k< 4; k++){
            minSum += in.get(k);
        }
        int maxSum = 0;
        for ( int k = in.size()-1 ; k>0; k-- ){
            maxSum += in.get(k);
        }

        System.out.print(minSum+" "+maxSum);

    }

    public static void main(String[] args){
//        plusMinusRatio();
        minMaxSumOfListOfNumbers();
    }
}
